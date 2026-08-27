import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class ddn extends dea {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final evf b = dea.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public ddn(drc.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ddn> a();

   @Override
   public drd a(cxb $$0) {
      return a($$0.q(), $$0.a());
   }

   public static drd a(daf $$0, io $$1) {
      io $$2 = $$1.d();
      drd $$3 = $$0.a_($$2);
      return dll.m($$3) ? dec.cs.n() : ((dha)dec.cr).b($$0, $$1);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avi.iT, avj.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      io $$4 = $$2.d();
      drd $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, it.b)) {
         if (this.f($$1.a_($$2.g()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(ky.X, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.h()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(ky.X, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.e()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(ky.X, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.f()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(ky.X, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.c()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(ky.X, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(ky.X, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean f(drd var1);

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (!$$3.bd()) {
         $$3.i($$3.aB() + 1);
         if ($$3.aB() == 0) {
            $$3.g(8);
         }
      }

      $$3.a($$1.ai().a(), this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<enw> $$5 = enw.a($$1, $$2, it.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((dbc)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(daz $$0) {
      return $$0.ae() == daz.h || $$0.ae() == daz.i;
   }

   @Override
   protected void a(daz $$0, cly $$1, io $$2, drd $$3) {
   }

   @Override
   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      if (!$$0.x_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(daz $$0, io $$1, it $$2) {
      drd $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((dbc)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(daz $$0, io $$1, it $$2) {
      if (!a($$0)) {
         return false;
      } else {
         io.a $$3 = $$1.j();
         boolean $$4 = false;

         for (it $$5 : it.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dec.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            it.a $$6 = $$2.o().d() ? $$2.i().o() : it.c.a.b($$0.z);
            return enw.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
