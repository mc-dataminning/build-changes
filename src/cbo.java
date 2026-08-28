import javax.annotation.Nullable;

public class cbo extends caz {
   private final dfy g;
   private final btp h;
   private int i;
   private static final int j = 20;

   public cbo(dfy $$0, btw $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean b() {
      if (!this.h.dO().ab().b(dcs.c)) {
         return false;
      } else if (this.c > 0) {
         this.c--;
         return false;
      } else if (this.n()) {
         this.c = b(20);
         return true;
      } else {
         this.c = this.a(this.a);
         return false;
      }
   }

   @Override
   public void e() {
      super.e();
      this.h.ac = 1.0F;
   }

   @Override
   public void d() {
      super.d();
      this.i = 0;
   }

   public void a(dcx $$0, jd $$1) {
   }

   public void a(dcw $$0, jd $$1) {
   }

   @Override
   public void a() {
      super.a();
      dcw $$0 = this.h.dO();
      jd $$1 = this.h.do();
      jd $$2 = this.a($$1, $$0);
      ayw $$3 = this.h.dR();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            exc $$4 = this.h.dr();
            this.h.n($$4.c, 0.3, $$4.e);
            if (!$$0.B) {
               double $$5 = 0.08;
               ((aqu)$$0)
                  .a(
                     new li(lm.S, new cuq(cut.qR)),
                     (double)$$2.u() + 0.5,
                     (double)$$2.v() + 0.7,
                     (double)$$2.w() + 0.5,
                     3,
                     ((double)$$3.i() - 0.5) * 0.08,
                     ((double)$$3.i() - 0.5) * 0.08,
                     ((double)$$3.i() - 0.5) * 0.08,
                     0.15F
                  );
            }
         }

         if (this.i % 2 == 0) {
            exc $$6 = this.h.dr();
            this.h.n($$6.c, -0.3, $$6.e);
            if (this.i % 6 == 0) {
               this.a((dcx)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.B) {
               for (int $$7 = 0; $$7 < 20; $$7++) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((aqu)$$0).a(lm.ab, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         this.i++;
      }
   }

   @Nullable
   private jd a(jd $$0, dcc $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         jd[] $$2 = new jd[]{$$0.e(), $$0.h(), $$0.i(), $$0.f(), $$0.g(), $$0.e().e()};

         for (jd $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(dcz $$0, jd $$1) {
      duy $$2 = $$0.a(kf.a($$1.u()), kf.a($$1.w()), dvz.n, false);
      return $$2 == null ? false : $$2.a_($$1).a(this.g) && $$2.a_($$1.d()).i() && $$2.a_($$1.b(2)).i();
   }
}
