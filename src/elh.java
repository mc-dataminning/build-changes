import com.mojang.serialization.MapCodec;

public class elh extends ela {
   public static final MapCodec<elh> b = dxu.a.fieldOf("state").xmap(dxt.a::b, dkl::m).xmap(elh::new, $$0 -> $$0.c);
   private final dkl c;

   public elh(dkl $$0) {
      this.c = $$0;
   }

   @Override
   protected elb<?> a() {
      return elb.f;
   }

   @Override
   public dxu a(bam $$0, jh $$1) {
      jm.a $$2 = jm.a.a($$0);
      return this.c.m().c(dra.i, $$2);
   }
}
