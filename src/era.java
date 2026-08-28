import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class era extends eqz {
   public static final MapCodec<era> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ald.a(lq.aU), eqm.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, era::new)
   );
   private final Either<ald<eqm>, eqm> j;

   private era(Either<ald<eqm>, eqm> $$0, int $$1, int $$2, List<etr> $$3, List<eru> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eqy a() {
      return eqv.d;
   }

   @Override
   public void a(Consumer<cuo> $$0, eqh $$1) {
      ((eqm)this.j.map($$1x -> $$1.a().a(lq.aU, $$1x).map(ji::a).orElse(eqm.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eqn $$0) {
      Optional<ald<eqm>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         ald<eqm> $$2 = $$1.get();
         if ($$0.a($$2)) {
            $$0.b("Table " + $$2.a() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j
         .ifLeft(
            $$1x -> $$0.a()
                  .a(lq.aU, $$1x)
                  .ifPresentOrElse($$2x -> ((eqm)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static eqz.a<?> a(ald<eqm> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new era(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static eqz.a<?> a(eqm $$0) {
      return a(($$1, $$2, $$3, $$4) -> new era(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
