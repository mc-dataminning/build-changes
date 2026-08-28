public class crh extends cqz {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final crm u;
   long v;
   public final brl p = new brz(2) {
      @Override
      public void e() {
         crh.this.a(this);
         super.e();
      }
   };
   private final csr w = new csr() {
      @Override
      public void e() {
         crh.this.a(this);
         super.e();
      }
   };

   public crh(int $$0, cnw $$1) {
      this($$0, $$1, crm.a);
   }

   public crh(int $$0, cnw $$1, final crm $$2) {
      super(csi.x, $$0);
      this.u = $$2;
      this.a(new csw(this.p, 0, 15, 15) {
         @Override
         public boolean a(cvs $$0) {
            return $$0.a(cvw.rV);
         }
      });
      this.a(new csw(this.p, 1, 15, 52) {
         @Override
         public boolean a(cvs $$0) {
            return $$0.a(cvw.qP) || $$0.a(cvw.ul) || $$0.a(cvw.fT);
         }
      });
      this.a(new csw(this.w, 2, 145, 39) {
         @Override
         public boolean a(cvs $$0) {
            return false;
         }

         @Override
         public void a(cnx $$0, cvs $$1) {
            crh.this.k.get(0).a(1);
            crh.this.k.get(1).a(1);
            $$1.h().b($$1, $$0.dS(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (crh.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awg.AA, awh.e, 1.0F, 1.0F);
                  crh.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cnx $$0) {
      return a(this.u, $$0, dho.nX);
   }

   @Override
   public void a(brl $$0) {
      cvs $$1 = this.p.a(0);
      cvs $$2 = this.p.a(1);
      cvs $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cvs $$0, cvs $$1, cvs $$2) {
      this.u.a(($$3, $$4) -> {
         esn $$5 = cwf.b($$0, $$3);
         if ($$5 != null) {
            cvs $$6;
            if ($$1.a(cvw.qP) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(ks.I, cyt.b);
               this.d();
            } else if ($$1.a(cvw.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(ks.I, cyt.a);
               this.d();
            } else {
               if (!$$1.a(cvw.ul)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cvs.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cvs $$0, csw $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 2) {
            $$4.h().b($$4, $$0.dS(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cvs.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cvw.rV)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cvs.k;
               }
            } else if (!$$4.a(cvw.qP) && !$$4.a(cvw.ul) && !$$4.a(cvw.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cvs.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cvs.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cvs.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         }

         $$3.c();
         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cnx $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
