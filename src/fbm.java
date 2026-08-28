import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class fbm extends fbl {
   public static final MapCodec<fbm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(fay.a, fay.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fbm::new)
   );
   private final Either<alq<fay>, fay> j;

   private fbm(Either<alq<fay>, fay> $$0, int $$1, int $$2, List<fec> $$3, List<fch> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fbk a() {
      return fbh.d;
   }

   @Override
   public void a(Consumer<dak> $$0, fat $$1) {
      ((fay)this.j.map($$1x -> $$1.a().c($$1x).map(jg::a).orElse(fay.f), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(faz $$0) {
      Optional<alq<fay>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alq<fay> $$2 = $$1.get();
         if (!$$0.b()) {
            $$0.b("Uses reference to " + $$2.a() + ", but references are not allowed");
            return;
         }

         if ($$0.a($$2)) {
            $$0.b("Table " + $$2.a() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j
         .ifLeft(
            $$1x -> $$0.a()
                  .c($$1x)
                  .ifPresentOrElse($$2x -> ((fay)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static fbl.a<?> a(alq<fay> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbm(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static fbl.a<?> a(fay $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbm(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
