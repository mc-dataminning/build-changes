import com.mojang.serialization.Codec;

public class dzy extends dyu<ebp> {
   public dzy(Codec<ebp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebp> $$0) {
      dap $$1 = $$0.b();
      im $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         ebp $$3 = $$0.f();
         ayd $$4 = $$0.d();
         djq $$5 = djq.b();
         int $$6 = $$3.f() + $$3.d();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            for (int $$8 = 0; $$8 < $$3.a(); $$8++) {
               $$5.a($$2, $$3.b());
            }

            boolean $$9 = $$7 < $$3.f();

            for (int $$10 = 0; $$10 < $$3.c(); $$10++) {
               $$5.a($$1, $$2, $$4, $$9);
            }

            $$5.j();
         }

         im $$11 = $$2.d();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).r($$1, $$11)) {
            $$1.a($$2, dcx.qU.n(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            im $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).i() && $$1.a_($$14.d()).d($$1, $$14.d(), ir.b)) {
               $$1.a($$14, dcx.qV.n().a(djp.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(czv $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      if ($$2.b() instanceof djl) {
         return true;
      } else {
         return !$$2.i() && (!$$2.a(dcx.G) || !$$2.u().b()) ? false : ir.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).r($$0, $$1x));
      }
   }
}
