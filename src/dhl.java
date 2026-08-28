import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dhl extends dhy {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final fab b = dhy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public dhl(dvc.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dhl> a();

   @Override
   public dvd a(czm $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dvd a(dea $$0, jg $$1) {
      jg $$2 = $$1.e();
      dvd $$3 = $$0.a_($$2);
      return dpj.o($$3) ? dia.cs.m() : ((dkx)dia.cr).b($$0, $$1);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.iU, awl.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      jg $$4 = $$2.e();
      dvd $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, jl.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(lq.X, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(lq.X, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(lq.X, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(lq.X, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(lq.X, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(lq.X, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(dvd var1);

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (!$$3.bj()) {
         $$3.h($$3.aG() + 1);
         if ($$3.aG() == 0) {
            $$3.d(8.0F);
         }
      }

      $$3.a($$1.ak().a(), this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<ese> $$5 = ese.a($$1, $$2, jl.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((dey)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dev $$0) {
      return $$0.ag() == dev.i || $$0.ag() == dev.j;
   }

   @Override
   protected void a(dev $$0, coh $$1, jg $$2, dvd $$3) {
   }

   @Override
   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      if (!$$0.y_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dev $$0, jg $$1, jl $$2) {
      dvd $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dey)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dev $$0, jg $$1, jl $$2) {
      if (!a($$0)) {
         return false;
      } else {
         jg.a $$3 = $$1.k();
         boolean $$4 = false;

         for (jl $$5 : jl.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dia.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jl.a $$6 = $$2.o().d() ? $$2.i().o() : jl.c.a.b($$0.A);
            return ese.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
