public class crr extends crj {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final crw u;
   long v;
   public final brr p = new bsf(2) {
      @Override
      public void e() {
         crr.this.a(this);
         super.e();
      }
   };
   private final ctb w = new ctb() {
      @Override
      public void e() {
         crr.this.a(this);
         super.e();
      }
   };

   public crr(int $$0, cog $$1) {
      this($$0, $$1, crw.a);
   }

   public crr(int $$0, cog $$1, final crw $$2) {
      super(css.x, $$0);
      this.u = $$2;
      this.a(new ctg(this.p, 0, 15, 15) {
         @Override
         public boolean a(cvx $$0) {
            return $$0.a(cwb.rV);
         }
      });
      this.a(new ctg(this.p, 1, 15, 52) {
         @Override
         public boolean a(cvx $$0) {
            return $$0.a(cwb.qP) || $$0.a(cwb.ul) || $$0.a(cwb.fT);
         }
      });
      this.a(new ctg(this.w, 2, 145, 39) {
         @Override
         public boolean a(cvx $$0) {
            return false;
         }

         @Override
         public void a(coh $$0, cvx $$1) {
            crr.this.k.get(0).a(1);
            crr.this.k.get(1).a(1);
            $$1.h().b($$1, $$0.dX(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (crr.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awk.Ay, awl.e, 1.0F, 1.0F);
                  crr.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(coh $$0) {
      return a(this.u, $$0, dia.nX);
   }

   @Override
   public void a(brr $$0) {
      cvx $$1 = this.p.a(0);
      cvx $$2 = this.p.a(1);
      cvx $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cvx $$0, cvx $$1, cvx $$2) {
      this.u.a(($$3, $$4) -> {
         esy $$5 = cwk.b($$0, $$3);
         if ($$5 != null) {
            cvx $$6;
            if ($$1.a(cwb.qP) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kt.M, cys.b);
               this.d();
            } else if ($$1.a(cwb.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kt.M, cys.a);
               this.d();
            } else {
               if (!$$1.a(cwb.ul)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cvx.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cvx $$0, ctg $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().b($$4, $$0.dX(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cvx.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cwb.rV)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cvx.k;
               }
            } else if (!$$4.a(cwb.qP) && !$$4.a(cwb.ul) && !$$4.a(cwb.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cvx.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cvx.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cvx.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvx.k;
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cvx.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(coh $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
