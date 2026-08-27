import com.mojang.serialization.MapCodec;

public class cxl extends cvj {
   public static final MapCodec<cxl> d = b(cxl::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<cxl> a() {
      return d;
   }

   public cxl(djg.d $$0) {
      super($$0, jd.c);
   }

   @Override
   public boolean d(djh $$0) {
      return false;
   }

   protected static boolean a(ctp $$0, cuo.c $$1) {
      if ($$1 == cuo.c.b) {
         return $$0.F_().i() < 0.05F;
      } else {
         return $$1 == cuo.c.c ? $$0.F_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cuo.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cuo.c.b) {
            $$1.b($$2, cws.fu.o());
            $$1.a(null, dnr.c, $$2);
         } else if ($$3 == cuo.c.c) {
            $$1.b($$2, cws.fw.o());
            $$1.a(null, dnr.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eeq $$0) {
      return true;
   }

   @Override
   protected void a(djh $$0, ctp $$1, hx $$2, eeq $$3) {
      if ($$3 == ees.c) {
         djh $$4 = cws.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dnr.c, $$2, dnr.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ees.e) {
         djh $$5 = cws.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dnr.c, $$2, dnr.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
