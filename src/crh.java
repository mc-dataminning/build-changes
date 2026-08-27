import javax.annotation.Nullable;

public class crh extends cpa {
   public static final ddb a = dcr.aT;
   public static final dcs b = dcr.p;
   protected static final efb c = cpn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public crh(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return c;
   }

   @Override
   public boolean g_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$0.c(a);
   }

   private static void d(dcb $$0, cmm $$1, gu $$2) {
      int $$3 = $$1.a(cmv.a, $$2) - $$1.v_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(b);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * apa.b($$4));
      }

      $$3 = apa.a($$3, 0, 15);
      if ($$0.c(a) != $$3) {
         $$1.a($$2, $$0.a(a, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$3.fZ()) {
         if ($$1.B) {
            return bdx.a;
         } else {
            dcb $$6 = $$0.a(b);
            $$1.a($$2, $$6, 4);
            $$1.a(dgl.c, $$2, dgl.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bdx.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public boolean f_(dcb $$0) {
      return true;
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dab($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return !$$0.B && $$0.x_().g() ? a($$2, czp.q, crh::a) : null;
   }

   private static void a(cmm $$0, gu $$1, dcb $$2, dab $$3) {
      if ($$0.V() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b);
   }
}
