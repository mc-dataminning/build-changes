import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqw extends eqv {
   public static final MapCodec<eqw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ala.a(lq.aU), eqi.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqw::new)
   );
   private final Either<ala<eqi>, eqi> j;

   private eqw(Either<ala<eqi>, eqi> $$0, int $$1, int $$2, List<etn> $$3, List<erq> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public equ a() {
      return eqr.d;
   }

   @Override
   public void a(Consumer<cuk> $$0, eqd $$1) {
      ((eqi)this.j.map($$1x -> $$1.a().a(lq.aU, $$1x).map(ji::a).orElse(eqi.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eqj $$0) {
      Optional<ala<eqi>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         ala<eqi> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((eqi)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static eqv.a<?> a(ala<eqi> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqw(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static eqv.a<?> a(eqi $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqw(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
