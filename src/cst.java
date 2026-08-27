import java.util.List;
import javax.annotation.Nullable;

public class cst extends cry {
   private static final int a = 32;

   public cst(cry.a $$0) {
      super($$0);
   }

   @Override
   public csd x() {
      csd $$0 = super.x();
      $$0.b(jz.x, new cuc(cud.a));
      return $$0;
   }

   @Override
   public csd a(csd $$0, czu $$1, bre $$2) {
      ckl $$3 = $$2 instanceof ckl ? (ckl)$$2 : null;
      if ($$3 instanceof aqf) {
         am.A.a((aqf)$$3, $$0);
      }

      if (!$$1.B) {
         cuc $$4 = $$0.a(jz.x, cuc.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(avj.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fN()) {
         if ($$0.d()) {
            return new csd(csg.sl);
         }

         if ($$3 != null) {
            $$3.ga().e(new csd(csg.sl));
         }
      }

      $$2.a(dur.l);
      return $$0;
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      ckl $$3 = $$0.o();
      csd $$4 = $$0.n();
      cuc $$5 = $$4.a(jz.x, cuc.a);
      dpy $$6 = $$1.a_($$2);
      if ($$0.k() != ir.a && $$6.a(avo.cc) && $$5.a(cud.a)) {
         $$1.a(null, $$2, auz.kd, ava.e, 1.0F, 1.0F);
         $$3.a($$0.p(), csf.a($$4, $$3, new csd(csg.sl)));
         $$3.b(avj.c.b($$4.f()));
         if (!$$1.B) {
            aqe $$7 = (aqe)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(kw.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, auz.cB, ava.e, 1.0F, 1.0F);
         $$1.a(null, dur.z, $$2);
         $$1.b($$2, dcx.sI.n());
         return boq.a($$1.B);
      } else {
         return boq.d;
      }
   }

   @Override
   public int b(csd $$0) {
      return 32;
   }

   @Override
   public ctw c(csd $$0) {
      return ctw.c;
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      return csf.a($$0, $$1, $$2);
   }

   @Override
   public String i(csd $$0) {
      return cua.a($$0.a(jz.x, cuc.a).f(), this.a() + ".effect.");
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      cuc $$4 = $$0.a(jz.x);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }
}
