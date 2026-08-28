public class cwa extends cvs {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final cwf u;
   long v;
   public final bum p = new bva(2) {
      @Override
      public void e() {
         cwa.this.a(this);
         super.e();
      }
   };
   private final cxk w = new cxk() {
      @Override
      public void e() {
         cwa.this.a(this);
         super.e();
      }
   };

   public cwa(int $$0, cry $$1) {
      this($$0, $$1, cwf.a);
   }

   public cwa(int $$0, cry $$1, final cwf $$2) {
      super(cxb.x, $$0);
      this.u = $$2;
      this.a(new cxp(this.p, 0, 15, 15) {
         @Override
         public boolean a(daa $$0) {
            return $$0.c(kl.M);
         }
      });
      this.a(new cxp(this.p, 1, 15, 52) {
         @Override
         public boolean a(daa $$0) {
            return $$0.a(dae.rE) || $$0.a(dae.vt) || $$0.a(dae.gp);
         }
      });
      this.a(new cxp(this.w, 2, 145, 39) {
         @Override
         public boolean a(daa $$0) {
            return false;
         }

         @Override
         public void a(crz $$0, daa $$1) {
            cwa.this.k.get(0).a(1);
            cwa.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cwa.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awr.By, aws.e, 1.0F, 1.0F);
                  cwa.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crz $$0) {
      return a(this.u, $$0, dng.oD);
   }

   @Override
   public void a(bum $$0) {
      daa $$1 = this.p.a(0);
      daa $$2 = this.p.a(1);
      daa $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(daa $$0, daa $$1, daa $$2) {
      this.u.a(($$3, $$4) -> {
         ezl $$5 = dan.b($$0, $$3);
         if ($$5 != null) {
            daa $$6;
            if ($$1.a(dae.rE) && !$$5.i && $$5.g < 4) {
               $$6 = $$0.c(1);
               $$6.b(kl.O, dcx.b);
               this.d();
            } else if ($$1.a(dae.gp) && !$$5.i) {
               $$6 = $$0.c(1);
               $$6.b(kl.O, dcx.a);
               this.d();
            } else {
               if (!$$1.a(dae.vt)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!daa.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(daa $$0, cxp $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return daa.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.c(kl.M)) {
               if (!this.a($$4, 0, 1, false)) {
                  return daa.k;
               }
            } else if (!$$4.a(dae.rE) && !$$4.a(dae.vt) && !$$4.a(dae.gp)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return daa.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return daa.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return daa.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return daa.k;
         }

         if ($$4.f()) {
            $$3.e(daa.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return daa.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(crz $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
