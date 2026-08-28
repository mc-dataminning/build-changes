import com.mojang.serialization.MapCodec;

public class dje extends dhc {
   public static final MapCodec<dje> d = b(dje::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dje> a() {
      return d;
   }

   public dje(dvn.d $$0) {
      super($$0, kn.c);
   }

   @Override
   public boolean d(dvo $$0) {
      return false;
   }

   protected static boolean a(dff $$0, dgh.c $$1) {
      if ($$1 == dgh.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dgh.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, dgh.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dgh.c.b) {
            $$1.b($$2, dil.fu.m());
            $$1.a(null, eak.c, $$2);
         } else if ($$3 == dgh.c.c) {
            $$1.b($$2, dil.fw.m());
            $$1.a(null, eak.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ern $$0) {
      return true;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, ern $$3) {
      if ($$3 == erp.c) {
         dvo $$4 = dil.fu.m();
         $$1.b($$2, $$4);
         $$1.a(eak.c, $$2, eak.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == erp.e) {
         dvo $$5 = dil.fv.m();
         $$1.b($$2, $$5);
         $$1.a(eak.c, $$2, eak.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
