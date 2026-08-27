import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clp extends clk implements cla {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bre> c = $$0 -> $$0.fn() || $$0.bO();

   public clp(bqr<? extends clp> $$0, czu $$1) {
      super($$0, $$1);
   }

   public clp(czu $$0, bre $$1) {
      super(bqr.aD, $$1, $$0);
   }

   public clp(czu $$0, double $$1, double $$2, double $$3) {
      super(bqr.aD, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cry r() {
      return csg.vo;
   }

   @Override
   protected double aW() {
      return 0.05;
   }

   @Override
   protected void a(etb $$0) {
      super.a($$0);
      if (!this.dN().B) {
         csd $$1 = this.p();
         ir $$2 = $$0.b();
         im $$3 = $$0.a();
         im $$4 = $$3.a($$2);
         cuc $$5 = $$1.a(jz.x, cuc.a);
         if ($$5.a(cud.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (ir $$6 : ir.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(etd $$0) {
      super.a($$0);
      if (!this.dN().B) {
         csd $$1 = this.p();
         cuc $$2 = $$1.a(jz.x, cuc.a);
         if ($$2.a(cud.a)) {
            this.v();
         } else if ($$2.d()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == etd.a.c ? ((etc)$$0).a() : null);
            }
         }

         int $$3 = $$2.f().isPresent() && $$2.f().get().a().b() ? 2007 : 2002;
         this.dN().c($$3, this.dn(), $$2.b());
         this.am();
      }
   }

   private void v() {
      eta $$0 = this.cI().c(4.0, 2.0, 4.0);

      for (bre $$2 : this.dN().a(bre.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fn()) {
               $$2.a(this.dO().c(this, this.u()), 1.0F);
            }

            if ($$2.bO() && $$2.bB()) {
               $$2.aF();
            }
         }
      }

      for (cef $$5 : this.dN().a(cef.class, $$0)) {
         $$5.r();
      }
   }

   private void a(Iterable<bpx> $$0, @Nullable bql $$1) {
      eta $$2 = this.cI().c(4.0, 2.0, 4.0);
      List<bre> $$3 = this.dN().a(bre.class, $$2);
      if (!$$3.isEmpty()) {
         bql $$4 = this.I();

         for (bre $$5 : $$3) {
            if ($$5.fE()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bpx $$9 : $$0) {
                     iv<bpv> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.u(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bpx $$12 = new bpx($$10, $$11, $$9.e(), $$9.f(), $$9.g());
                        if (!$$12.a(20)) {
                           $$5.b($$12, $$4);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(cuc $$0) {
      bqh $$1 = new bqh(this.dN(), this.ds(), this.du(), this.dy());
      if (this.u() instanceof bre $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.k());
      $$1.a($$0);
      this.dN().b($$1);
   }

   private boolean w() {
      return this.p().a(csg.vr);
   }

   private void a(im $$0) {
      dpy $$1 = this.dN().a_($$0);
      if ($$1.a(avo.aK)) {
         this.dN().a($$0, false, this);
      } else if (dbn.c($$1)) {
         dbn.a(null, $$1, this.dN(), $$0);
      } else if (ddj.g($$1)) {
         this.dN().a(null, 1009, $$0, 0);
         ddj.a(this.u(), this.dN(), $$0, $$1);
         this.dN().b($$0, $$1.a(ddj.c, Boolean.valueOf(false)));
      }
   }
}
