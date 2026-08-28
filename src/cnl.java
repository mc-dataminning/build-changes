import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnl extends cng implements cmw {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bsy> c = $$0 -> $$0.fl() || $$0.bQ();

   public cnl(bsj<? extends cnl> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cnl(dcd $$0, bsy $$1) {
      super(bsj.aE, $$1, $$0);
   }

   public cnl(dcd $$0, double $$1, double $$2, double $$3) {
      super(bsj.aE, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ctv u() {
      return cud.vo;
   }

   @Override
   protected double aY() {
      return 0.05;
   }

   @Override
   protected void a(evv $$0) {
      super.a($$0);
      if (!this.dP().B) {
         cua $$1 = this.p();
         jf $$2 = $$0.b();
         ja $$3 = $$0.a();
         ja $$4 = $$3.a($$2);
         cwb $$5 = $$1.a(kn.G, cwb.a);
         if ($$5.a(cwc.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jf $$6 : jf.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(evx $$0) {
      super.a($$0);
      if (!this.dP().B) {
         cua $$1 = this.p();
         cwb $$2 = $$1.a(kn.G, cwb.a);
         if ($$2.a(cwc.a)) {
            this.v();
         } else if ($$2.c()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == evx.a.c ? ((evw)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().b() ? 2007 : 2002;
         this.dP().c($$3, this.dp(), $$2.b());
         this.ao();
      }
   }

   private void v() {
      evu $$0 = this.cK().c(4.0, 2.0, 4.0);

      for (bsy $$2 : this.dP().a(bsy.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fl()) {
               $$2.a(this.dQ().c(this, this.s()), 1.0F);
            }

            if ($$2.bQ() && $$2.bD()) {
               $$2.aH();
            }
         }
      }

      for (cga $$5 : this.dP().a(cga.class, $$0)) {
         $$5.s();
      }
   }

   private void a(Iterable<brl> $$0, @Nullable bsd $$1) {
      evu $$2 = this.cK().c(4.0, 2.0, 4.0);
      List<bsy> $$3 = this.dP().a(bsy.class, $$2);
      if (!$$3.isEmpty()) {
         bsd $$4 = this.I();

         for (bsy $$5 : $$3) {
            if ($$5.fC()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (brl $$9 : $$0) {
                     jj<brj> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        brl $$12 = new brl($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cwb $$0) {
      brz $$1 = new brz(this.dP(), this.du(), this.dw(), this.dA());
      if (this.s() instanceof bsy $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.j());
      $$1.a($$0);
      this.dP().b($$1);
   }

   private boolean w() {
      return this.p().a(cud.vr);
   }

   private void a(ja $$0) {
      dsh $$1 = this.dP().a_($$0);
      if ($$1.a(avu.aK)) {
         this.dP().a($$0, false, this);
      } else if (ddx.c($$1)) {
         ddx.a(null, $$1, this.dP(), $$0);
      } else if (dft.g($$1)) {
         this.dP().a(null, 1009, $$0, 0);
         dft.a(this.s(), this.dP(), $$0, $$1);
         this.dP().b($$0, $$1.a(dft.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bsy $$0, bqw $$1) {
      double $$2 = $$0.dn().c - this.dn().c;
      double $$3 = $$0.dn().e - this.dn().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
