import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgs(dbd d, jz e, Optional<je<efh>> f) implements dgh {
   public static final MapCodec<dgs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbd.b.fieldOf("properties").forGetter(dgs::b),
               jz.g.optionalFieldOf("offset", jz.i).forGetter(dgs::c),
               efh.aj.optionalFieldOf("trigger_game_event").forGetter(dgs::d)
            )
            .apply($$0, dgs::new)
   );

   public dgs(dbd $$0) {
      this($$0, jz.i, Optional.of(efh.c));
   }

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      iu $$5 = iu.a((jo)$$4).a(this.e);
      eah $$6 = $$3.dV().a_($$5);
      eah $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   public dbd b() {
      return this.d;
   }

   public jz c() {
      return this.e;
   }

   public Optional<je<efh>> d() {
      return this.f;
   }
}
