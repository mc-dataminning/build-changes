import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class den extends dfa {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final ewl b = dfa.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public den(dsc.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends den> a();

   @Override
   public dsd a(cyb $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dsd a(dbf $$0, iz $$1) {
      iz $$2 = $$1.d();
      dsd $$3 = $$0.a_($$2);
      return dml.m($$3) ? dfc.cs.o() : ((dia)dfc.cr).b($$0, $$1);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.iT, awb.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      iz $$4 = $$2.d();
      dsd $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, je.b)) {
         if (this.f($$1.a_($$2.g()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(li.X, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.h()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(li.X, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.e()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(li.X, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.f()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(li.X, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.c()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(li.X, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(li.X, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean f(dsd var1);

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if (!$$3.bd()) {
         $$3.i($$3.aB() + 1);
         if ($$3.aB() == 0) {
            $$3.g(8);
         }
      }

      $$3.a($$1.aj().a(), this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<eow> $$5 = eow.a($$1, $$2, je.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((dcc)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dbz $$0) {
      return $$0.af() == dbz.h || $$0.af() == dbz.i;
   }

   @Override
   protected void a(dbz $$0, cmy $$1, iz $$2, dsd $$3) {
   }

   @Override
   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      if (!$$0.x_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dbz $$0, iz $$1, je $$2) {
      dsd $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((dcc)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dbz $$0, iz $$1, je $$2) {
      if (!a($$0)) {
         return false;
      } else {
         iz.a $$3 = $$1.j();
         boolean $$4 = false;

         for (je $$5 : je.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dfc.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            je.a $$6 = $$2.o().d() ? $$2.i().o() : je.c.a.b($$0.z);
            return eow.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
