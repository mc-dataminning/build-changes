import javax.annotation.Nullable;

public class cos extends cpn implements cpp {
   protected static final float a = 3.0F;
   protected static final float b = 5.0F;
   protected static final float c = 1.5F;
   protected static final efb d = cpn.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final efb e = cpn.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final efb f = cpn.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final ddb g = dcr.aq;
   public static final dcz<dcn> h = dcr.bk;
   public static final ddb i = dcr.aU;
   public static final int j = 16;
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 0;
   public static final int n = 1;

   public cos(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(g, Integer.valueOf(0)).a(h, dcn.a).a(i, Integer.valueOf(0)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(g, h, i);
   }

   @Override
   public boolean c(dcb $$0, cls $$1, gu $$2) {
      return true;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      efb $$4 = $$0.c(h) == dcn.c ? e : d;
      eei $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   @Override
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      eei $$4 = $$0.n($$1, $$2);
      return f.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a_(dcb $$0, cls $$1, gu $$2) {
      return false;
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dxe $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dcb $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(amw.as)) {
            if ($$2.a(cpo.mY)) {
               return this.n().a(g, Integer.valueOf(0));
            } else if ($$2.a(cpo.mZ)) {
               int $$3 = $$2.c(g) > 0 ? 1 : 0;
               return this.n().a(g, Integer.valueOf($$3));
            } else {
               dcb $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cpo.mZ) ? this.n().a(g, $$4.c(g)) : cpo.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dcb $$0) {
      return $$0.c(i) == 0;
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$0.c(i) == 0) {
         if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return $$1.a_($$2.d()).a(amw.as);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ha.b && $$2.a(cpo.mZ) && $$2.c(g) > $$0.c(g)) {
         $$3.a($$4, $$0.a(g), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      int $$4 = this.a($$0, $$1);
      int $$5 = this.b($$0, $$1);
      return $$4 + $$5 + 1 < 16 && $$0.a_($$1.b($$4)).c(i) != 1;
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         gu $$9 = $$2.b($$4);
         dcb $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(i) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dcb $$0, byo $$1, cls $$2, gu $$3) {
      return $$1.eO().d() instanceof chk ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dcb $$0, cmm $$1, gu $$2, apf $$3, int $$4) {
      dcb $$5 = $$1.a_($$2.d());
      gu $$6 = $$2.c(2);
      dcb $$7 = $$1.a_($$6);
      dcn $$8 = dcn.a;
      if ($$4 >= 1) {
         if (!$$5.a(cpo.mZ) || $$5.c(h) == dcn.a) {
            $$8 = dcn.b;
         } else if ($$5.a(cpo.mZ) && $$5.c(h) != dcn.a) {
            $$8 = dcn.c;
            if ($$7.a(cpo.mZ)) {
               $$1.a($$2.d(), $$5.a(h, dcn.b), 3);
               $$1.a($$6, $$7.a(h, dcn.a), 3);
            }
         }
      }

      int $$9 = $$0.c(g) != 1 && !$$7.a(cpo.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(g, Integer.valueOf($$9)).a(h, $$8).a(i, Integer.valueOf($$10)), 3);
   }

   protected int a(cls $$0, gu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cpo.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cls $$0, gu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cpo.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
