import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfb(czr d, kl e, Optional<jq<ecr>> f) implements deq {
   public static final MapCodec<dfb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czr.b.fieldOf("properties").forGetter(dfb::b),
               kl.g.optionalFieldOf("offset", kl.h).forGetter(dfb::c),
               ecr.aj.optionalFieldOf("trigger_game_event").forGetter(dfb::d)
            )
            .apply($$0, dfb::new)
   );

   public dfb(czr $$0) {
      this($$0, kl.h, Optional.of(ecr.c));
   }

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.e);
      dxv $$6 = $$3.dW().a_($$5);
      dxv $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dW().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public czr b() {
      return this.d;
   }

   public kl c() {
      return this.e;
   }

   public Optional<jq<ecr>> d() {
      return this.f;
   }
}
