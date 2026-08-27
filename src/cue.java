import javax.annotation.Nullable;

public class cue extends crx {
   public static final dfy a = dfo.aT;
   public static final dfp b = dfo.p;
   protected static final ehy c = csk.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public cue(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return c;
   }

   @Override
   public boolean g_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(a);
   }

   private static void d(dey $$0, cpk $$1, gv $$2) {
      int $$3 = $$1.a(cpt.a, $$2) - $$1.v_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(b);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * aro.b($$4));
      }

      $$3 = aro.a($$3, 0, 15);
      if ($$0.c(a) != $$3) {
         $$1.a($$2, $$0.a(a, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$3.gc()) {
         if ($$1.B) {
            return bgo.a;
         } else {
            dey $$6 = $$0.a(b);
            $$1.a($$2, $$6, 4);
            $$1.a(dji.c, $$2, dji.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bgo.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return !$$0.B && $$0.x_().g() ? a($$2, dcm.q, cue::a) : null;
   }

   private static void a(cpk $$0, gv $$1, dey $$2, dcy $$3) {
      if ($$0.V() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }
}
