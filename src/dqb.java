import com.mojang.serialization.MapCodec;

public class dqb extends dip {
   public static final MapCodec<dqb> n = b(dqb::new);

   @Override
   public MapCodec<dqb> a() {
      return n;
   }

   public dqb(dur.d $$0) {
      super(() -> drx.c, $$0);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dtq($$0, $$1);
   }

   @Override
   protected awn<ale> c() {
      return awq.i.b(awq.ai);
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return azf.a(dsc.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$3 == jk.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
