import com.mojang.serialization.MapCodec;

public class dol extends dmh {
   public static final MapCodec<dol> c = b(dol::new);
   private static final float d = 0.05F;
   private static final float e = 0.1F;

   @Override
   public MapCodec<dol> a() {
      return c;
   }

   public dol(ebp.d $$0) {
      super($$0, kd.c);
   }

   @Override
   public boolean d(ebq $$0) {
      return false;
   }

   protected static boolean a(dkj $$0, dlm.c $$1) {
      if ($$1 == dlm.c.b) {
         return $$0.G_().i() < 0.05F;
      } else {
         return $$1 == dlm.c.c ? $$0.G_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, dlm.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dlm.c.b) {
            $$1.b($$2, dnq.fT.m());
            $$1.a(null, egq.c, $$2);
         } else if ($$3 == dlm.c.c) {
            $$1.b($$2, dnq.fV.m());
            $$1.a(null, egq.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(exz $$0) {
      return true;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, exz $$3) {
      if ($$3 == eyb.c) {
         ebq $$4 = dnq.fT.m();
         $$1.b($$2, $$4);
         $$1.a(egq.c, $$2, egq.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eyb.e) {
         ebq $$5 = dnq.fU.m();
         $$1.b($$2, $$5);
         $$1.a(egq.c, $$2, egq.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
