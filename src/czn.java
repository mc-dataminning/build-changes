import com.mojang.serialization.MapCodec;

public class czn extends cxl {
   public static final MapCodec<czn> d = b(czn::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<czn> a() {
      return d;
   }

   public czn(dli.d $$0) {
      super($$0, jf.c);
   }

   @Override
   public boolean d(dlj $$0) {
      return false;
   }

   protected static boolean a(cvr $$0, cwq.c $$1) {
      if ($$1 == cwq.c.b) {
         return $$0.F_().i() < 0.05F;
      } else {
         return $$1 == cwq.c.c ? $$0.F_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, cwq.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cwq.c.b) {
            $$1.b($$2, cyu.fu.o());
            $$1.a(null, dpw.c, $$2);
         } else if ($$3 == cwq.c.c) {
            $$1.b($$2, cyu.fw.o());
            $$1.a(null, dpw.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(egv $$0) {
      return true;
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, egv $$3) {
      if ($$3 == egx.c) {
         dlj $$4 = cyu.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dpw.c, $$2, dpw.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == egx.e) {
         dlj $$5 = cyu.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dpw.c, $$2, dpw.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
