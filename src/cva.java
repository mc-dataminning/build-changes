import com.mojang.serialization.MapCodec;

public class cva extends cxa {
   public static final MapCodec<cva> a = b(cva::new);
   public static final int b = 3;
   public static final din c = did.as;
   private static final eks[] g = new eks[]{
      cvf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cva> a() {
      return a;
   }

   public cva(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected din b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cse d() {
      return clr.vd;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(csf $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return g[this.g($$0)];
   }
}
