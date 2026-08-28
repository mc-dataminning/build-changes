public class cre extends cqw {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final crj u;
   long v;
   public final bri p = new brw(2) {
      @Override
      public void e() {
         cre.this.a(this);
         super.e();
      }
   };
   private final cso w = new cso() {
      @Override
      public void e() {
         cre.this.a(this);
         super.e();
      }
   };

   public cre(int $$0, cnt $$1) {
      this($$0, $$1, crj.a);
   }

   public cre(int $$0, cnt $$1, final crj $$2) {
      super(csf.x, $$0);
      this.u = $$2;
      this.a(new cst(this.p, 0, 15, 15) {
         @Override
         public boolean a(cvp $$0) {
            return $$0.a(cvt.rV);
         }
      });
      this.a(new cst(this.p, 1, 15, 52) {
         @Override
         public boolean a(cvp $$0) {
            return $$0.a(cvt.qP) || $$0.a(cvt.ul) || $$0.a(cvt.fT);
         }
      });
      this.a(new cst(this.w, 2, 145, 39) {
         @Override
         public boolean a(cvp $$0) {
            return false;
         }

         @Override
         public void a(cnu $$0, cvp $$1) {
            cre.this.k.get(0).a(1);
            cre.this.k.get(1).a(1);
            $$1.h().b($$1, $$0.dS(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (cre.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awe.AA, awf.e, 1.0F, 1.0F);
                  cre.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cnu $$0) {
      return a(this.u, $$0, dhl.nX);
   }

   @Override
   public void a(bri $$0) {
      cvp $$1 = this.p.a(0);
      cvp $$2 = this.p.a(1);
      cvp $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cvp $$0, cvp $$1, cvp $$2) {
      this.u.a(($$3, $$4) -> {
         esj $$5 = cwc.b($$0, $$3);
         if ($$5 != null) {
            cvp $$6;
            if ($$1.a(cvt.qP) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kr.I, cyq.b);
               this.d();
            } else if ($$1.a(cvt.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kr.I, cyq.a);
               this.d();
            } else {
               if (!$$1.a(cvt.ul)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cvp.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cvp $$0, cst $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 2) {
            $$4.h().b($$4, $$0.dS(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cvp.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cvt.rV)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cvp.k;
               }
            } else if (!$$4.a(cvt.qP) && !$$4.a(cvt.ul) && !$$4.a(cvt.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cvp.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cvp.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cvp.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.e(cvp.k);
         }

         $$3.c();
         if ($$4.J() == $$2.J()) {
            return cvp.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cnu $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
