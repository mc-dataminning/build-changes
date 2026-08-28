import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfz extends dgv implements dgy {
   public static final MapCodec<dfz> a = b(dfz::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final eyx e = dgv.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eyx f = dgv.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eyx g = dgv.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dva h = duq.aq;
   public static final duy<dum> i = duq.bk;
   public static final dva j = duq.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   public dfz(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(h, Integer.valueOf(0)).b(i, dum.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(dua $$0) {
      return true;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      eyx $$4 = $$0.c(i) == dum.c ? f : e;
      eye $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      eye $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(dua $$0, dcx $$1, je $$2) {
      return false;
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dua $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(aws.av)) {
            if ($$2.a(dgx.mY)) {
               return this.o().b(h, Integer.valueOf(0));
            } else if ($$2.a(dgx.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().b(h, Integer.valueOf($$3));
            } else {
               dua $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dgx.mZ) ? this.o().b(h, $$4.c(h)) : dgx.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dua $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return $$1.a_($$2.e()).a(aws.av);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == jj.b && $$2.a(dgx.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         je $$9 = $$2.b($$4);
         dua $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dua $$0, cnp $$1, dcx $$2, je $$3) {
      return $$1.eW().h() instanceof cxb ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dua $$0, dds $$1, je $$2, azk $$3, int $$4) {
      dua $$5 = $$1.a_($$2.e());
      je $$6 = $$2.c(2);
      dua $$7 = $$1.a_($$6);
      dum $$8 = dum.a;
      if ($$4 >= 1) {
         if (!$$5.a(dgx.mZ) || $$5.c(i) == dum.a) {
            $$8 = dum.b;
         } else if ($$5.a(dgx.mZ) && $$5.c(i) != dum.a) {
            $$8 = dum.c;
            if ($$7.a(dgx.mZ)) {
               $$1.a($$2.e(), $$5.b(i, dum.b), 3);
               $$1.a($$6, $$7.b(i, dum.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dgx.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.o().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dcx $$0, je $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dgx.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dcx $$0, je $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dgx.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
