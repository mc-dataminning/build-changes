import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class did extends diq {
   private static final int c = 8;
   private static final int d = 1;
   private static final int e = 3;
   private final float f;
   protected static final float a = 1.0F;
   protected static final fas b = diq.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public did(dvu.d $$0, float $$1) {
      super($$0);
      this.f = $$1;
   }

   @Override
   protected abstract MapCodec<? extends did> a();

   @Override
   public dvv a(dad $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dvv a(der $$0, jh $$1) {
      jh $$2 = $$1.e();
      dvv $$3 = $$0.a_($$2);
      return dqb.o($$3) ? dis.cs.m() : ((dlp)dis.cr).b($$0, $$1);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.iU, awo.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      jh $$4 = $$2.e();
      dvv $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, jm.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(ls.X, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(ls.X, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(ls.X, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(ls.X, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(ls.X, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(ls.X, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(dvv var1);

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if (!$$3.bi()) {
         if ($$3.aG() >= 0) {
            if ($$3 instanceof arq) {
               int $$4 = $$1.G_().b(1, 3);
               $$3.h($$3.aG() + $$4);
            }

            $$3.d(8.0F);
         } else {
            $$3.h($$3.aG() + 1);
         }
      }

      $$3.a($$1.ai().a(), this.f);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<esv> $$5 = esv.a((dfn)$$1, $$2, jm.a.a);
            if ($$5.isPresent()) {
               $$5.get().a($$1);
               return;
            }
         }

         if (!$$0.a((dfp)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dfm $$0) {
      return $$0.ag() == dfm.i || $$0.ag() == dfm.j;
   }

   @Override
   protected void a(dfm $$0, cou $$1, jh $$2, dvv $$3) {
   }

   @Override
   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      if (!$$0.A_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dfm $$0, jh $$1, jm $$2) {
      dvv $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dfp)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dfm $$0, jh $$1, jm $$2) {
      if (!a($$0)) {
         return false;
      } else {
         jh.a $$3 = $$1.k();
         boolean $$4 = false;

         for (jm $$5 : jm.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dis.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jm.a $$6 = $$2.o().d() ? $$2.i().o() : jm.c.a.b($$0.A);
            return esv.a((dfn)$$0, $$1, $$6).isPresent();
         }
      }
   }
}
