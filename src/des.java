import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class des extends dff {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final ews b = dff.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public des(dsg.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends des> a();

   @Override
   public dsh a(cxk $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dsh a(dbj $$0, ja $$1) {
      ja $$2 = $$1.d();
      dsh $$3 = $$0.a_($$2);
      return dmq.m($$3) ? dfh.cs.o() : ((dif)dfh.cr).b($$0, $$1);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avf.iT, avg.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      ja $$4 = $$2.d();
      dsh $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, jf.b)) {
         if (this.f($$1.a_($$2.g()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(lj.X, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.h()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(lj.X, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.e()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(lj.X, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.f()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(lj.X, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.c()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(lj.X, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(lj.X, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean f(dsh var1);

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if (!$$3.bd()) {
         $$3.h($$3.aB() + 1);
         if ($$3.aB() == 0) {
            $$3.d(8.0F);
         }
      }

      $$3.a($$1.aj().a(), this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<epb> $$5 = epb.a($$1, $$2, jf.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((dcg)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dcd $$0) {
      return $$0.af() == dcd.h || $$0.af() == dcd.i;
   }

   @Override
   protected void a(dcd $$0, cmh $$1, ja $$2, dsh $$3) {
   }

   @Override
   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      if (!$$0.x_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dcd $$0, ja $$1, jf $$2) {
      dsh $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((dcg)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dcd $$0, ja $$1, jf $$2) {
      if (!a($$0)) {
         return false;
      } else {
         ja.a $$3 = $$1.j();
         boolean $$4 = false;

         for (jf $$5 : jf.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dfh.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jf.a $$6 = $$2.o().d() ? $$2.i().o() : jf.c.a.b($$0.z);
            return epb.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
