import javax.annotation.Nullable;

public class cbm extends cax {
   private final dfw g;
   private final btn h;
   private int i;
   private static final int j = 20;

   public cbm(dfw $$0, btu $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean b() {
      if (!this.h.dQ().ab().b(dcq.c)) {
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

   public void a(dcv $$0, jd $$1) {
   }

   public void a(dcu $$0, jd $$1) {
   }

   @Override
   public void a() {
      super.a();
      dcu $$0 = this.h.dQ();
      jd $$1 = this.h.dq();
      jd $$2 = this.a($$1, $$0);
      ayv $$3 = this.h.dT();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            eww $$4 = this.h.dt();
            this.h.n($$4.c, 0.3, $$4.e);
            if (!$$0.B) {
               double $$5 = 0.08;
               ((aqt)$$0)
                  .a(
                     new li(lm.S, new cuo(cur.qR)),
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
            eww $$6 = this.h.dt();
            this.h.n($$6.c, -0.3, $$6.e);
            if (this.i % 6 == 0) {
               this.a((dcv)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.B) {
               for (int $$7 = 0; $$7 < 20; $$7++) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((aqt)$$0).a(lm.ab, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         this.i++;
      }
   }

   @Nullable
   private jd a(jd $$0, dca $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         jd[] $$2 = new jd[]{$$0.d(), $$0.g(), $$0.h(), $$0.e(), $$0.f(), $$0.d().d()};

         for (jd $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(dcx $$0, jd $$1) {
      duw $$2 = $$0.a(kf.a($$1.u()), kf.a($$1.w()), dvx.n, false);
      return $$2 == null ? false : $$2.a_($$1).a(this.g) && $$2.a_($$1.c()).i() && $$2.a_($$1.b(2)).i();
   }
}
