import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record des(czi d, kl e, Optional<jq<eck>> f) implements deh {
   public static final MapCodec<des> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czi.b.fieldOf("properties").forGetter(des::b),
               kl.g.optionalFieldOf("offset", kl.h).forGetter(des::c),
               eck.aj.optionalFieldOf("trigger_game_event").forGetter(des::d)
            )
            .apply($$0, des::new)
   );

   public des(czi $$0) {
      this($$0, kl.h, Optional.of(eck.c));
   }

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.e);
      dxo $$6 = $$3.dW().a_($$5);
      dxo $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dW().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public czi b() {
      return this.d;
   }

   public kl c() {
      return this.e;
   }

   public Optional<jq<eck>> d() {
      return this.f;
   }
}
