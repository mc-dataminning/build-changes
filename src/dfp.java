import com.mojang.serialization.MapCodec;

public class dfp extends ddn {
   public static final MapCodec<dfp> d = b(dfp::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dfp> a() {
      return d;
   }

   public dfp(drw.d $$0) {
      super($$0, kf.c);
   }

   @Override
   public boolean d(drx $$0) {
      return false;
   }

   protected static boolean a(dbt $$0, dcs.c $$1) {
      if ($$1 == dcs.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dcs.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, dcs.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dcs.c.b) {
            $$1.b($$2, dew.fu.n());
            $$1.a(null, dwq.c, $$2);
         } else if ($$3 == dcs.c.c) {
            $$1.b($$2, dew.fw.n());
            $$1.a(null, dwq.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(enp $$0) {
      return true;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, enp $$3) {
      if ($$3 == enr.c) {
         drx $$4 = dew.fu.n();
         $$1.b($$2, $$4);
         $$1.a(dwq.c, $$2, dwq.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == enr.e) {
         drx $$5 = dew.fv.n();
         $$1.b($$2, $$5);
         $$1.a(dwq.c, $$2, dwq.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
