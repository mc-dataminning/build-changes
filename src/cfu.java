import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfu extends cfp implements cfg {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<blv> c = $$0 -> $$0.fh() || $$0.bN();

   public cfu(blj<? extends cfu> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cfu(csy $$0, blv $$1) {
      super(blj.aB, $$1, $$0);
   }

   public cfu(csy $$0, double $$1, double $$2, double $$3) {
      super(blj.aB, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cmc s() {
      return cmk.vh;
   }

   @Override
   protected float x() {
      return 0.05F;
   }

   @Override
   protected void a(ekx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cmh $$1 = this.q();
         coe $$2 = cog.d($$1);
         List<bks> $$3 = cog.a($$1);
         boolean $$4 = $$2 == coh.c && $$3.isEmpty();
         ia $$5 = $$0.b();
         hv $$6 = $$0.a();
         hv $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (ia $$8 : ia.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(ekz $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cmh $$1 = this.q();
         coe $$2 = cog.d($$1);
         List<bks> $$3 = cog.a($$1);
         boolean $$4 = $$2 == coh.c && $$3.isEmpty();
         if ($$4) {
            this.y();
         } else if (!$$3.isEmpty()) {
            if (this.z()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == ekz.a.c ? ((eky)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dM().c($$5, this.dm(), cog.c($$1));
         this.am();
      }
   }

   private void y() {
      ekw $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (blv $$2 : this.dM().a(blv.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.fh()) {
               $$2.a(this.dN().c(this, this.w()), 1.0F);
            }

            if ($$2.bN() && $$2.bx()) {
               $$2.aF();
            }
         }
      }

      for (byp $$5 : this.dM().a(byp.class, $$0)) {
         $$5.u();
      }
   }

   private void a(List<bks> $$0, @Nullable blf $$1) {
      ekw $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<blv> $$3 = this.dM().a(blv.class, $$2);
      if (!$$3.isEmpty()) {
         blf $$4 = this.J();

         for (blv $$5 : $$3) {
            if ($$5.fy()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bks $$9 : $$0) {
                     bkq $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.w(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bks $$12 = new bks($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cmh $$0, coe $$1) {
      blc $$2 = new blc(this.dM(), this.dr(), this.dt(), this.dx());
      blf $$3 = this.w();
      if ($$3 instanceof blv) {
         $$2.a((blv)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bks $$4 : cog.b($$0)) {
         $$2.a(new bks($$4));
      }

      sj $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dM().b($$2);
   }

   private boolean z() {
      return this.q().a(cmk.vk);
   }

   private void a(hv $$0) {
      dip $$1 = this.dM().a_($$0);
      if ($$1.a(arr.aJ)) {
         this.dM().a($$0, false, this);
      } else if (cur.c($$1)) {
         cur.a(null, $$1, this.dM(), $$0);
      } else if (cwn.g($$1)) {
         this.dM().a(null, 1009, $$0, 0);
         cwn.a(this.w(), this.dM(), $$0, $$1);
         this.dM().b($$0, $$1.a(cwn.c, Boolean.valueOf(false)));
      }
   }
}
