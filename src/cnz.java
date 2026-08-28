import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnz extends cnu implements cnk {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<btl> c = $$0 -> $$0.fm() || $$0.bR();

   public cnz(bsw<? extends cnz> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnz(dcu $$0, btl $$1) {
      super(bsw.aE, $$1, $$0);
   }

   public cnz(dcu $$0, double $$1, double $$2, double $$3) {
      super(bsw.aE, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuj t() {
      return cur.vo;
   }

   @Override
   protected double aZ() {
      return 0.05;
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         cuo $$1 = this.p();
         ji $$2 = $$0.b();
         jd $$3 = $$0.a();
         jd $$4 = $$3.a($$2);
         cws $$5 = $$1.a(kq.G, cws.a);
         if ($$5.a(cwt.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (ji $$6 : ji.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         cuo $$1 = this.p();
         cws $$2 = $$1.a(kq.G, cws.a);
         if ($$2.a(cwt.a)) {
            this.v();
         } else if ($$2.c()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == ewu.a.c ? ((ewt)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().b() ? 2007 : 2002;
         this.dQ().c($$3, this.dq(), $$2.b());
         this.aq();
      }
   }

   private void v() {
      ewr $$0 = this.cL().c(4.0, 2.0, 4.0);

      for (btl $$2 : this.dQ().a(btl.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fm()) {
               $$2.a(this.dR().c(this, this.s()), 1.0F);
            }

            if ($$2.bR() && $$2.bE()) {
               $$2.aI();
            }
         }
      }

      for (cgo $$5 : this.dQ().a(cgo.class, $$0)) {
         $$5.s();
      }
   }

   private void a(Iterable<bry> $$0, @Nullable bsq $$1) {
      ewr $$2 = this.cL().c(4.0, 2.0, 4.0);
      List<btl> $$3 = this.dQ().a(btl.class, $$2);
      if (!$$3.isEmpty()) {
         bsq $$4 = this.J();

         for (btl $$5 : $$3) {
            if ($$5.fD()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bry $$9 : $$0) {
                     jm<brw> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bry $$12 = new bry($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cws $$0) {
      bsm $$1 = new bsm(this.dQ(), this.dv(), this.dx(), this.dB());
      if (this.s() instanceof btl $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.j());
      $$1.a($$0);
      this.dQ().b($$1);
   }

   private boolean w() {
      return this.p().a(cur.vr);
   }

   private void a(jd $$0) {
      dta $$1 = this.dQ().a_($$0);
      if ($$1.a(awd.aK)) {
         this.dQ().a($$0, false, this);
      } else if (deo.c($$1)) {
         deo.a(null, $$1, this.dQ(), $$0);
      } else if (dgk.g($$1)) {
         this.dQ().a(null, 1009, $$0, 0);
         dgk.a(this.s(), this.dQ(), $$0, $$1);
         this.dQ().b($$0, $$1.a(dgk.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(btl $$0, brj $$1) {
      double $$2 = $$0.do().c - this.do().c;
      double $$3 = $$0.do().e - this.do().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
