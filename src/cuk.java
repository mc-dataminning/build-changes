import javax.annotation.Nullable;

public class cuk extends csd {
   public static final dge a = dfu.aT;
   public static final dfv b = dfu.p;
   protected static final eib c = csq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public cuk(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return c;
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(a);
   }

   private static void d(dfe $$0, cpq $$1, gw $$2) {
      int $$3 = $$1.a(cpz.a, $$2) - $$1.v_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(b);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ars.b($$4));
      }

      $$3 = ars.a($$3, 0, 15);
      if ($$0.c(a) != $$3) {
         $$1.a($$2, $$0.a(a, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$3.gc()) {
         if ($$1.B) {
            return bgt.a;
         } else {
            dfe $$6 = $$0.a(b);
            $$1.a($$2, $$6, 4);
            $$1.a(djo.c, $$2, djo.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bgt.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dde($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return !$$0.B && $$0.x_().g() ? a($$2, dcs.q, cuk::a) : null;
   }

   private static void a(cpq $$0, gw $$1, dfe $$2, dde $$3) {
      if ($$0.V() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }
}
