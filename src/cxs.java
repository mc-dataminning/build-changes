import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxs extends cyo implements cyr {
   public static final MapCodec<cxs> a = b(cxs::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final eol e = cyo.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eol f = cyo.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eol g = cyo.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dmf h = dlv.aq;
   public static final dmd<dlr> i = dlv.bk;
   public static final dmf j = dlv.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<cxs> a() {
      return a;
   }

   public cxs(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dlr.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return true;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      eol $$4 = $$0.c(i) == dlr.c ? f : e;
      ens $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      ens $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dlf $$0, cut $$1, hz $$2) {
      return false;
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dlf $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(atz.at)) {
            if ($$2.a(cyq.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(cyq.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dlf $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cyq.mZ) ? this.o().a(h, $$4.c(h)) : cyq.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean e_(dlf $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return $$1.a_($$2.d()).a(atz.at);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ie.b && $$2.a(cyq.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         hz $$9 = $$2.b($$4);
         dlf $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dlf $$0, chh $$1, cut $$2, hz $$3) {
      return $$1.eT().d() instanceof cqk ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dlf $$0, cvn $$1, hz $$2, awo $$3, int $$4) {
      dlf $$5 = $$1.a_($$2.d());
      hz $$6 = $$2.c(2);
      dlf $$7 = $$1.a_($$6);
      dlr $$8 = dlr.a;
      if ($$4 >= 1) {
         if (!$$5.a(cyq.mZ) || $$5.c(i) == dlr.a) {
            $$8 = dlr.b;
         } else if ($$5.a(cyq.mZ) && $$5.c(i) != dlr.a) {
            $$8 = dlr.c;
            if ($$7.a(cyq.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dlr.b), 3);
               $$1.a($$6, $$7.a(i, dlr.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(cyq.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cut $$0, hz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cyq.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cut $$0, hz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cyq.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
