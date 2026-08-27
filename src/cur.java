import javax.annotation.Nullable;

public class cur extends csk {
   public static final dgl a = dgb.aT;
   public static final dgc b = dgb.p;
   protected static final eii c = csx.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public cur(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return c;
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(a);
   }

   private static void d(dfl $$0, cpx $$1, gw $$2) {
      int $$3 = $$1.a(cqg.a, $$2) - $$1.A_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(b);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ary.b($$4));
      }

      $$3 = ary.a($$3, 0, 15);
      if ($$0.c(a) != $$3) {
         $$1.a($$2, $$0.a(a, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$3.gd()) {
         if ($$1.B) {
            return bha.a;
         } else {
            dfl $$6 = $$0.a(b);
            $$1.a($$2, $$6, 2);
            $$1.a(djv.c, $$2, djv.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bha.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return !$$0.B && $$0.C_().g() ? a($$2, dcz.q, cur::a) : null;
   }

   private static void a(cpx $$0, gw $$1, dfl $$2, ddl $$3) {
      if ($$0.V() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b);
   }
}
