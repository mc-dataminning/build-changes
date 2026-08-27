import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class crx extends ctl {
   private static final int a = ayf.f(0.4F, 0.4F, 1.0F);
   private static final int b = 64;

   public crx(ctl.a $$0) {
      super($$0);
   }

   public static float d(ctq $$0) {
      cwd $$1 = $$0.a(kb.E, cwd.a);
      return $$1.c().floatValue();
   }

   @Override
   public boolean a(ctq $$0, cqq $$1, cpd $$2, cly $$3) {
      if ($$2 != cpd.b) {
         return false;
      } else {
         cwd $$4 = $$0.a(kb.E);
         if ($$4 == null) {
            return false;
         } else {
            ctq $$5 = $$1.g();
            cwd.a $$6 = new cwd.a($$4);
            if ($$5.e()) {
               this.a($$3);
               ctq $$7 = $$6.a();
               if ($$7 != null) {
                  ctq $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.g().an_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(kb.E, $$6.c());
            return true;
         }
      }
   }

   @Override
   public boolean a(ctq $$0, ctq $$1, cqq $$2, cpd $$3, cly $$4, bti $$5) {
      if ($$3 == cpd.b && $$2.b($$4)) {
         cwd $$6 = $$0.a(kb.E);
         if ($$6 == null) {
            return false;
         } else {
            cwd.a $$7 = new cwd.a($$6);
            if ($$1.e()) {
               ctq $$8 = $$7.a();
               if ($$8 != null) {
                  this.a($$4);
                  $$5.a($$8);
               }
            } else {
               int $$9 = $$7.a($$1);
               if ($$9 > 0) {
                  this.b($$4);
               }
            }

            $$0.b(kb.E, $$7.c());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(avs.c.b(this));
         return bpx.a($$3, $$0.x_());
      } else {
         return bpx.d($$3);
      }
   }

   @Override
   public boolean e(ctq $$0) {
      cwd $$1 = $$0.a(kb.E, cwd.a);
      return $$1.c().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int f(ctq $$0) {
      cwd $$1 = $$0.a(kb.E, cwd.a);
      return Math.min(1 + ayf.a($$1.c(), 12), 13);
   }

   @Override
   public int g(ctq $$0) {
      return a;
   }

   private static boolean a(ctq $$0, cly $$1) {
      cwd $$2 = $$0.a(kb.E);
      if ($$2 != null && !$$2.d()) {
         $$0.b(kb.E, cwd.a);
         if ($$1 instanceof aqo) {
            $$2.a().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cra> h(ctq $$0) {
      return !$$0.b(kb.p) && !$$0.b(kb.o) ? Optional.ofNullable($$0.a(kb.E)).map(cqz::new) : Optional.empty();
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      cwd $$4 = $$0.a(kb.E);
      if ($$4 != null) {
         int $$5 = ayf.a($$4.c(), 64);
         $$2.add(wx.a("item.minecraft.bundle.fullness", $$5, 64).a(n.h));
      }
   }

   @Override
   public void a(cii $$0) {
      cwd $$1 = $$0.p().a(kb.E);
      if ($$1 != null) {
         $$0.p().b(kb.E, cwd.a);
         cts.a($$0, $$1.a());
      }
   }

   private void a(brw $$0) {
      $$0.a(avi.dq, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void b(brw $$0) {
      $$0.a(avi.dp, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }

   private void c(brw $$0) {
      $$0.a(avi.do, 0.8F, 0.8F + $$0.dP().E_().i() * 0.4F);
   }
}
