import com.mojang.serialization.MapCodec;

public class eli extends elb {
   public static final MapCodec<eli> b = dxv.a.fieldOf("state").xmap(dxu.a::b, dkm::m).xmap(eli::new, $$0 -> $$0.c);
   private final dkm c;

   public eli(dkm $$0) {
      this.c = $$0;
   }

   @Override
   protected elc<?> a() {
      return elc.f;
   }

   @Override
   public dxv a(bam $$0, jh $$1) {
      jm.a $$2 = jm.a.a($$0);
      return this.c.m().c(drb.i, $$2);
   }
}
