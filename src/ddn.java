import com.mojang.serialization.MapCodec;

public class ddn extends cwd {
   public static final MapCodec<ddn> n = b(ddn::new);

   @Override
   public MapCodec<ddn> a() {
      return n;
   }

   public ddn(dhh.d $$0) {
      super($$0, () -> dff.c);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgv($$0, $$1);
   }

   @Override
   protected aqy<agi> c() {
      return arb.i.b(arb.ai);
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return atm.a(dfk.a($$1, $$2), 0, 15);
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$3 == hx.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
