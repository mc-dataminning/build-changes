import com.mojang.serialization.MapCodec;

public class dal extends cvo {
   public static final MapCodec<dal> a = b(dal::new);
   public static final int b = 3;
   public static final din c = did.as;
   private static final eks[] d = new eks[]{
      cvf.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   protected dal(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(cvh.dW);
   }

   @Override
   public boolean e_(dhn $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(clr.sg);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }
}
