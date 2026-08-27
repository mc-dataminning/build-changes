import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cml extends cmg implements clw {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bsa> c = $$0 -> $$0.fn() || $$0.bO();

   public cml(brn<? extends cml> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cml(dad $$0, bsa $$1) {
      super(brn.aD, $$1, $$0);
   }

   public cml(dad $$0, double $$1, double $$2, double $$3) {
      super(brn.aD, $$1, $$2, $$3, $$0);
   }

   @Override
   protected csu r() {
      return ctc.vo;
   }

   @Override
   protected double aW() {
      return 0.05;
   }

   @Override
   protected void a(etl $$0) {
      super.a($$0);
      if (!this.dN().B) {
         csz $$1 = this.p();
         is $$2 = $$0.b();
         in $$3 = $$0.a();
         in $$4 = $$3.a($$2);
         cuy $$5 = $$1.a(ka.E, cuy.a);
         if ($$5.a(cuz.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (is $$6 : is.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(etn $$0) {
      super.a($$0);
      if (!this.dN().B) {
         csz $$1 = this.p();
         cuy $$2 = $$1.a(ka.E, cuy.a);
         if ($$2.a(cuz.a)) {
            this.v();
         } else if ($$2.d()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == etn.a.c ? ((etm)$$0).a() : null);
            }
         }

         int $$3 = $$2.f().isPresent() && $$2.f().get().a().b() ? 2007 : 2002;
         this.dN().c($$3, this.dn(), $$2.b());
         this.am();
      }
   }

   private void v() {
      etk $$0 = this.cI().c(4.0, 2.0, 4.0);

      for (bsa $$2 : this.dN().a(bsa.class, $$0, c)) {
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

      for (cfb $$5 : this.dN().a(cfb.class, $$0)) {
         $$5.r();
      }
   }

   private void a(Iterable<bqt> $$0, @Nullable brh $$1) {
      etk $$2 = this.cI().c(4.0, 2.0, 4.0);
      List<bsa> $$3 = this.dN().a(bsa.class, $$2);
      if (!$$3.isEmpty()) {
         brh $$4 = this.I();

         for (bsa $$5 : $$3) {
            if ($$5.fE()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bqt $$9 : $$0) {
                     iw<bqr> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.u(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bqt $$12 = new bqt($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cuy $$0) {
      brd $$1 = new brd(this.dN(), this.ds(), this.du(), this.dy());
      if (this.u() instanceof bsa $$2) {
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
      return this.p().a(ctc.vr);
   }

   private void a(in $$0) {
      dqh $$1 = this.dN().a_($$0);
      if ($$1.a(avr.aK)) {
         this.dN().a($$0, false, this);
      } else if (dbw.c($$1)) {
         dbw.a(null, $$1, this.dN(), $$0);
      } else if (dds.g($$1)) {
         this.dN().a(null, 1009, $$0, 0);
         dds.a(this.u(), this.dN(), $$0, $$1);
         this.dN().b($$0, $$1.a(dds.c, Boolean.valueOf(false)));
      }
   }
}
