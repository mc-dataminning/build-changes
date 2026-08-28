import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record det(czh d, km e, Optional<jr<ecp>> f) implements dei {
   public static final MapCodec<det> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czh.b.fieldOf("properties").forGetter(det::b),
               km.g.optionalFieldOf("offset", km.h).forGetter(det::c),
               ecp.aj.optionalFieldOf("trigger_game_event").forGetter(det::d)
            )
            .apply($$0, det::new)
   );

   public det(czh $$0) {
      this($$0, km.h, Optional.of(ecp.c));
   }

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.e);
      dxq $$6 = $$3.dU().a_($$5);
      dxq $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.dU().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public czh b() {
      return this.d;
   }

   public km c() {
      return this.e;
   }

   public Optional<jr<ecp>> d() {
      return this.f;
   }
}
