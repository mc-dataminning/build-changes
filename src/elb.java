import com.mojang.serialization.MapCodec;

public class elb extends eku {
   public static final MapCodec<elb> b = dxo.a.fieldOf("state").xmap(dxn.a::b, dkd::m).xmap(elb::new, $$0 -> $$0.c);
   private final dkd c;

   public elb(dkd $$0) {
      this.c = $$0;
   }

   @Override
   protected ekv<?> a() {
      return ekv.f;
   }

   @Override
   public dxo a(bac $$0, jh $$1) {
      jm.a $$2 = jm.a.a($$0);
      return this.c.m().c(dqu.i, $$2);
   }
}
