import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqa extends epz {
   public static final MapCodec<eqa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(akm.a(lf.aU), epm.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqa::new)
   );
   private final Either<akm<epm>, epm> j;

   private eqa(Either<akm<epm>, epm> $$0, int $$1, int $$2, List<esn> $$3, List<eqt> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public epy a() {
      return epv.d;
   }

   @Override
   public void a(Consumer<ctq> $$0, eph $$1) {
      ((epm)this.j.map($$1x -> $$1.a().a(lf.aU, $$1x).map(ix::a).orElse(epm.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(epn $$0) {
      Optional<akm<epm>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akm<epm> $$2 = $$1.get();
         if ($$0.a($$2)) {
            $$0.b("Table " + $$2.a() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j
         .ifLeft(
            $$1x -> $$0.a()
                  .a(lf.aU, $$1x)
                  .ifPresentOrElse($$2x -> ((epm)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static epz.a<?> a(akm<epm> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqa(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static epz.a<?> a(epm $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqa(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
