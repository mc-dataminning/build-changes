import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class faa extends ezz {
   public static final MapCodec<faa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(alf.a(mg.bq), ezm.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, faa::new)
   );
   private final Either<alf<ezm>, ezm> j;

   private faa(Either<alf<ezm>, ezm> $$0, int $$1, int $$2, List<fcq> $$3, List<fav> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ezy a() {
      return ezv.d;
   }

   @Override
   public void a(Consumer<czd> $$0, ezh $$1) {
      ((ezm)this.j.map($$1x -> $$1.a().c($$1x).map(je::a).orElse(ezm.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(ezn $$0) {
      Optional<alf<ezm>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alf<ezm> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((ezm)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static ezz.a<?> a(alf<ezm> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new faa(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static ezz.a<?> a(ezm $$0) {
      return a(($$1, $$2, $$3, $$4) -> new faa(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
