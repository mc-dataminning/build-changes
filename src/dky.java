import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dky extends dlu implements dlx {
   public static final MapCodec<dky> a = b(dky::new);
   private static final feq C = dlu.b(6.0, 0.0, 16.0);
   private static final feq Q = dlu.b(10.0, 0.0, 16.0);
   private static final feq R = dlu.b(3.0, 0.0, 16.0);
   public static final eao b = eae.at;
   public static final eam<eaa> c = eae.bn;
   public static final eao d = eae.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   public dky(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, eaa.a).b(d, Integer.valueOf(0)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(dzo $$0) {
      return true;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      feq $$4 = $$0.c(c) == eaa.c ? Q : C;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return R.a($$0.a($$2));
   }

   @Override
   protected boolean a_(dzo $$0, dhv $$1, iu $$2) {
      return false;
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dzo $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axa.ax)) {
            if ($$2.a(dlw.nA)) {
               return this.m().b(b, Integer.valueOf(0));
            } else if ($$2.a(dlw.nB)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, Integer.valueOf($$3));
            } else {
               dzo $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dlw.nB) ? this.m().b(b, $$4.c(b)) : dlw.nA.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dzo $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$0.c(d) == 0) {
         if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return $$1.a_($$2.e()).a(axa.ax);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == ja.b && $$6.a(dlw.nB) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iu $$9 = $$2.b($$4);
         dzo $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.v($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(dzo $$0, dip $$1, iu $$2, azt $$3, int $$4) {
      dzo $$5 = $$1.a_($$2.e());
      iu $$6 = $$2.c(2);
      dzo $$7 = $$1.a_($$6);
      eaa $$8 = eaa.a;
      if ($$4 >= 1) {
         if (!$$5.a(dlw.nB) || $$5.c(c) == eaa.a) {
            $$8 = eaa.b;
         } else if ($$5.a(dlw.nB) && $$5.c(c) != eaa.a) {
            $$8 = eaa.c;
            if ($$7.a(dlw.nB)) {
               $$1.a($$2.e(), $$5.b(c, eaa.b), 3);
               $$1.a($$6, $$7.b(c, eaa.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dlw.nB) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, Integer.valueOf($$9)).b(c, $$8).b(d, Integer.valueOf($$10)), 3);
   }

   protected int a(dhv $$0, iu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dlw.nB)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dhv $$0, iu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dlw.nB)) {
         $$2++;
      }

      return $$2;
   }
}
