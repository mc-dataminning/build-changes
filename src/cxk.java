import com.mojang.serialization.MapCodec;

public class cxk extends cvi {
   public static final MapCodec<cxk> d = b(cxk::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<cxk> a() {
      return d;
   }

   public cxk(djf.d $$0) {
      super($$0, jd.c);
   }

   @Override
   public boolean d(djg $$0) {
      return false;
   }

   protected static boolean a(cto $$0, cun.c $$1) {
      if ($$1 == cun.c.b) {
         return $$0.F_().i() < 0.05F;
      } else {
         return $$1 == cun.c.c ? $$0.F_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cun.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cun.c.b) {
            $$1.b($$2, cwr.fu.o());
            $$1.a(null, dnq.c, $$2);
         } else if ($$3 == cun.c.c) {
            $$1.b($$2, cwr.fw.o());
            $$1.a(null, dnq.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eep $$0) {
      return true;
   }

   @Override
   protected void a(djg $$0, cto $$1, hx $$2, eep $$3) {
      if ($$3 == eer.c) {
         djg $$4 = cwr.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dnq.c, $$2, dnq.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eer.e) {
         djg $$5 = cwr.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dnq.c, $$2, dnq.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
