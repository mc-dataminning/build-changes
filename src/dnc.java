import com.mojang.serialization.MapCodec;

public class dnc extends dky {
   public static final MapCodec<dnc> c = b(dnc::new);
   private static final float d = 0.05F;
   private static final float e = 0.1F;

   @Override
   public MapCodec<dnc> a() {
      return c;
   }

   public dnc(eag.d $$0) {
      super($$0, kb.c);
   }

   @Override
   public boolean d(eah $$0) {
      return false;
   }

   protected static boolean a(dja $$0, dkd.c $$1) {
      if ($$1 == dkd.c.b) {
         return $$0.C_().i() < 0.05F;
      } else {
         return $$1 == dkd.c.c ? $$0.C_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, dkd.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dkd.c.b) {
            $$1.b($$2, dmh.fT.m());
            $$1.a(null, efh.c, $$2);
         } else if ($$3 == dkd.c.c) {
            $$1.b($$2, dmh.fV.m());
            $$1.a(null, efh.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ewn $$0) {
      return true;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, ewn $$3) {
      if ($$3 == ewp.c) {
         eah $$4 = dmh.fT.m();
         $$1.b($$2, $$4);
         $$1.a(efh.c, $$2, efh.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ewp.e) {
         eah $$5 = dmh.fU.m();
         $$1.b($$2, $$5);
         $$1.a(efh.c, $$2, efh.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
