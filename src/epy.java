import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class epy extends epx {
   public static final MapCodec<epy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(akl.a(lf.aU), epk.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, epy::new)
   );
   private final Either<akl<epk>, epk> j;

   private epy(Either<akl<epk>, epk> $$0, int $$1, int $$2, List<esl> $$3, List<eqr> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public epw a() {
      return ept.d;
   }

   @Override
   public void a(Consumer<cto> $$0, epf $$1) {
      ((epk)this.j.map($$1x -> $$1.a().a(lf.aU, $$1x).map(ix::a).orElse(epk.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(epl $$0) {
      Optional<akl<epk>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akl<epk> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((epk)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static epx.a<?> a(akl<epk> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new epy(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static epx.a<?> a(epk $$0) {
      return a(($$1, $$2, $$3, $$4) -> new epy(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
