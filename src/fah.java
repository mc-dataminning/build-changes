import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class fah extends fag {
   public static final MapCodec<fah> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ezt.a, ezt.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fah::new)
   );
   private final Either<alf<ezt>, ezt> j;

   private fah(Either<alf<ezt>, ezt> $$0, int $$1, int $$2, List<fcx> $$3, List<fbc> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public faf a() {
      return fac.d;
   }

   @Override
   public void a(Consumer<czk> $$0, ezo $$1) {
      ((ezt)this.j.map($$1x -> $$1.a().c($$1x).map(jf::a).orElse(ezt.f), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(ezu $$0) {
      Optional<alf<ezt>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alf<ezt> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((ezt)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static fag.a<?> a(alf<ezt> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fah(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static fag.a<?> a(ezt $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fah(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
