import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dlh extends dlu {
   private static final int b = 8;
   private static final int c = 1;
   private static final int d = 3;
   private final float e;
   protected static final feq a = dlu.b(16.0, 0.0, 1.0);

   public dlh(dzn.d $$0, float $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dlh> a();

   @Override
   public dzo a(dcl $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dzo a(dhv $$0, iu $$1) {
      iu $$2 = $$1.e();
      dzo $$3 = $$0.a_($$2);
      return dtl.o($$3) ? dlw.cz.m() : ((dov)dlw.cy).b($$0, $$1);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return a;
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.jt, awm.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      iu $$4 = $$2.e();
      dzo $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, ja.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(lx.aa, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(lx.aa, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(lx.aa, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(lx.aa, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(lx.aa, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(lx.aa, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(dzo var1);

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if (!$$3.bi()) {
         if ($$3.aG() < 0) {
            $$3.h($$3.aG() + 1);
         } else if ($$3 instanceof arp) {
            int $$4 = $$1.C_().b(1, 3);
            $$3.h($$3.aG() + $$4);
         }

         if ($$3.aG() >= 0) {
            $$3.e(8.0F);
         }
      }

      $$3.a($$1.al().a(), this.e);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<ewu> $$5 = ewu.a((diq)$$1, $$2, ja.a.a);
            if ($$5.isPresent()) {
               $$5.get().a($$1);
               return;
            }
         }

         if (!$$0.a((dis)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dip $$0) {
      return $$0.aj() == dip.i || $$0.aj() == dip.j;
   }

   @Override
   protected void a(dip $$0, cqs $$1, iu $$2, dzo $$3) {
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      if (!$$0.w_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dip $$0, iu $$1, ja $$2) {
      dzo $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dis)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dip $$0, iu $$1, ja $$2) {
      if (!a($$0)) {
         return false;
      } else {
         iu.a $$3 = $$1.k();
         boolean $$4 = false;

         for (ja $$5 : ja.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dlw.cv)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            ja.a $$6 = $$2.o().d() ? $$2.i().o() : ja.c.a.b($$0.A);
            return ewu.a((diq)$$0, $$1, $$6).isPresent();
         }
      }
   }
}
