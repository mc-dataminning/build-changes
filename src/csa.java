public class csa extends crs {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final csf u;
   long v;
   public final bsa p = new bso(2) {
      @Override
      public void e() {
         csa.this.a(this);
         super.e();
      }
   };
   private final ctk w = new ctk() {
      @Override
      public void e() {
         csa.this.a(this);
         super.e();
      }
   };

   public csa(int $$0, coq $$1) {
      this($$0, $$1, csf.a);
   }

   public csa(int $$0, coq $$1, final csf $$2) {
      super(ctb.x, $$0);
      this.u = $$2;
      this.a(new ctp(this.p, 0, 15, 15) {
         @Override
         public boolean a(cwf $$0) {
            return $$0.b(ku.L);
         }
      });
      this.a(new ctp(this.p, 1, 15, 52) {
         @Override
         public boolean a(cwf $$0) {
            return $$0.a(cwj.qP) || $$0.a(cwj.uB) || $$0.a(cwj.fT);
         }
      });
      this.a(new ctp(this.w, 2, 145, 39) {
         @Override
         public boolean a(cwf $$0) {
            return false;
         }

         @Override
         public void a(cor $$0, cwf $$1) {
            csa.this.k.get(0).a(1);
            csa.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dY(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (csa.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awo.Ay, awp.e, 1.0F, 1.0F);
                  csa.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cor $$0) {
      return a(this.u, $$0, dil.nX);
   }

   @Override
   public void a(bsa $$0) {
      cwf $$1 = this.p.a(0);
      cwf $$2 = this.p.a(1);
      cwf $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cwf $$0, cwf $$1, cwf $$2) {
      this.u.a(($$3, $$4) -> {
         eti $$5 = cws.b($$0, $$3);
         if ($$5 != null) {
            cwf $$6;
            if ($$1.a(cwj.qP) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, czc.b);
               this.d();
            } else if ($$1.a(cwj.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, czc.a);
               this.d();
            } else {
               if (!$$1.a(cwj.uB)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cwf.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cwf $$0, ctp $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dY(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cwf.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(ku.L)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwf.k;
               }
            } else if (!$$4.a(cwj.qP) && !$$4.a(cwj.uB) && !$$4.a(cwj.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cwf.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cwf.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cwf.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cwf.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cor $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
