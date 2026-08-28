public class cqy extends cqq {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final crd u;
   long v;
   public final brd p = new brr(2) {
      @Override
      public void e() {
         cqy.this.a(this);
         super.e();
      }
   };
   private final csi w = new csi() {
      @Override
      public void e() {
         cqy.this.a(this);
         super.e();
      }
   };

   public cqy(int $$0, cno $$1) {
      this($$0, $$1, crd.a);
   }

   public cqy(int $$0, cno $$1, final crd $$2) {
      super(crz.x, $$0);
      this.u = $$2;
      this.a(new csn(this.p, 0, 15, 15) {
         @Override
         public boolean a(cvl $$0) {
            return $$0.a(cvo.rV);
         }
      });
      this.a(new csn(this.p, 1, 15, 52) {
         @Override
         public boolean a(cvl $$0) {
            return $$0.a(cvo.qP) || $$0.a(cvo.ul) || $$0.a(cvo.fT);
         }
      });
      this.a(new csn(this.w, 2, 145, 39) {
         @Override
         public boolean a(cvl $$0) {
            return false;
         }

         @Override
         public void a(cnp $$0, cvl $$1) {
            cqy.this.k.get(0).a(1);
            cqy.this.k.get(1).a(1);
            $$1.h().b($$1, $$0.dS(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (cqy.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awd.AA, awe.e, 1.0F, 1.0F);
                  cqy.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cnp $$0) {
      return a(this.u, $$0, dgx.nX);
   }

   @Override
   public void a(brd $$0) {
      cvl $$1 = this.p.a(0);
      cvl $$2 = this.p.a(1);
      cvl $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cvl $$0, cvl $$1, cvl $$2) {
      this.u.a(($$3, $$4) -> {
         erv $$5 = cvx.b($$0, $$3);
         if ($$5 != null) {
            cvl $$6;
            if ($$1.a(cvo.qP) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kr.F, cym.b);
               this.d();
            } else if ($$1.a(cvo.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kr.F, cym.a);
               this.d();
            } else {
               if (!$$1.a(cvo.ul)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cvl.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cvl $$0, csn $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 2) {
            $$4.h().b($$4, $$0.dS(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cvl.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cvo.rV)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cvl.k;
               }
            } else if (!$$4.a(cvo.qP) && !$$4.a(cvo.ul) && !$$4.a(cvo.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cvl.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cvl.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cvl.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         }

         $$3.c();
         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cnp $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
