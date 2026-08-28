import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djy extends dku implements dkx {
   public static final MapCodec<djy> a = b(djy::new);
   private static final fdo C = dku.b(6.0, 0.0, 16.0);
   private static final fdo Q = dku.b(10.0, 0.0, 16.0);
   private static final fdo R = dku.b(3.0, 0.0, 16.0);
   public static final dzm b = dzc.at;
   public static final dzk<dyy> c = dzc.bn;
   public static final dzm d = dzc.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, dyy.a).b(d, Integer.valueOf(0)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(dym $$0) {
      return true;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      fdo $$4 = $$0.c(c) == dyy.c ? Q : C;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return R.a($$0.a($$2));
   }

   @Override
   protected boolean a_(dym $$0, dgv $$1, jj $$2) {
      return false;
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dym $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(awz.ax)) {
            if ($$2.a(dkw.nA)) {
               return this.m().b(b, Integer.valueOf(0));
            } else if ($$2.a(dkw.nB)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, Integer.valueOf($$3));
            } else {
               dym $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dkw.nB) ? this.m().b(b, $$4.c(b)) : dkw.nA.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dym $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$0.c(d) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return $$1.a_($$2.e()).a(awz.ax);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jo.b && $$6.a(dkw.nB) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jj $$9 = $$2.b($$4);
         dym $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(dym $$0, dhp $$1, jj $$2, azs $$3, int $$4) {
      dym $$5 = $$1.a_($$2.e());
      jj $$6 = $$2.c(2);
      dym $$7 = $$1.a_($$6);
      dyy $$8 = dyy.a;
      if ($$4 >= 1) {
         if (!$$5.a(dkw.nB) || $$5.c(c) == dyy.a) {
            $$8 = dyy.b;
         } else if ($$5.a(dkw.nB) && $$5.c(c) != dyy.a) {
            $$8 = dyy.c;
            if ($$7.a(dkw.nB)) {
               $$1.a($$2.e(), $$5.b(c, dyy.b), 3);
               $$1.a($$6, $$7.b(c, dyy.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dkw.nB) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, Integer.valueOf($$9)).b(c, $$8).b(d, Integer.valueOf($$10)), 3);
   }

   protected int a(dgv $$0, jj $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dkw.nB)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dgv $$0, jj $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dkw.nB)) {
         $$2++;
      }

      return $$2;
   }
}
