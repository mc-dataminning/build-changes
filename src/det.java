import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record det(czm d, kl e, Optional<jq<ecj>> f) implements dei {
   public static final MapCodec<det> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czm.b.fieldOf("properties").forGetter(det::b),
               kl.f.optionalFieldOf("offset", kl.g).forGetter(det::c),
               ecj.aj.optionalFieldOf("trigger_game_event").forGetter(det::d)
            )
            .apply($$0, det::new)
   );

   public det(czm $$0) {
      this($$0, kl.g, Optional.of(ecj.c));
   }

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.e);
      dxn $$6 = $$3.dV().a_($$5);
      dxn $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public czm b() {
      return this.d;
   }

   public kl c() {
      return this.e;
   }

   public Optional<jq<ecj>> d() {
      return this.f;
   }
}
