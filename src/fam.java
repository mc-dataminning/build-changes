import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class fam extends fal {
   public static final MapCodec<fam> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ezy.a, ezy.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fam::new)
   );
   private final Either<alf<ezy>, ezy> j;

   private fam(Either<alf<ezy>, ezy> $$0, int $$1, int $$2, List<fdc> $$3, List<fbh> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fak a() {
      return fah.d;
   }

   @Override
   public void a(Consumer<czn> $$0, ezt $$1) {
      ((ezy)this.j.map($$1x -> $$1.a().c($$1x).map(jf::a).orElse(ezy.f), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(ezz $$0) {
      Optional<alf<ezy>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alf<ezy> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((ezy)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static fal.a<?> a(alf<ezy> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fam(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static fal.a<?> a(ezy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fam(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
