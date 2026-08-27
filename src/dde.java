import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dde extends dea implements ded {
   public static final MapCodec<dde> a = b(dde::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final evf e = dea.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final evf f = dea.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final evf g = dea.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dsd h = drt.aq;
   public static final dsb<drp> i = drt.bk;
   public static final dsd j = drt.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dde> a() {
      return a;
   }

   public dde(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, drp.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return true;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      evf $$4 = $$0.c(i) == drp.c ? f : e;
      eum $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      eum $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(drd $$0, daf $$1, io $$2) {
      return false;
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         drd $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(avx.au)) {
            if ($$2.a(dec.mY)) {
               return this.n().a(h, Integer.valueOf(0));
            } else if ($$2.a(dec.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.n().a(h, Integer.valueOf($$3));
            } else {
               drd $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dec.mZ) ? this.n().a(h, $$4.c(h)) : dec.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(drd $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
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
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return $$1.a_($$2.d()).a(avx.au);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == it.b && $$2.a(dec.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         io $$9 = $$2.b($$4);
         drd $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(drd $$0, cly $$1, daf $$2, io $$3) {
      return $$1.eX().g() instanceof cvd ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(drd $$0, daz $$1, io $$2, aym $$3, int $$4) {
      drd $$5 = $$1.a_($$2.d());
      io $$6 = $$2.c(2);
      drd $$7 = $$1.a_($$6);
      drp $$8 = drp.a;
      if ($$4 >= 1) {
         if (!$$5.a(dec.mZ) || $$5.c(i) == drp.a) {
            $$8 = drp.b;
         } else if ($$5.a(dec.mZ) && $$5.c(i) != drp.a) {
            $$8 = drp.c;
            if ($$7.a(dec.mZ)) {
               $$1.a($$2.d(), $$5.a(i, drp.b), 3);
               $$1.a($$6, $$7.a(i, drp.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dec.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(daf $$0, io $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dec.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(daf $$0, io $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dec.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
