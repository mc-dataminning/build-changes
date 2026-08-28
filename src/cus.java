public class cus extends cuk {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final cux u;
   long v;
   public final btr p = new buf(2) {
      @Override
      public void e() {
         cus.this.a(this);
         super.e();
      }
   };
   private final cwc w = new cwc() {
      @Override
      public void e() {
         cus.this.a(this);
         super.e();
      }
   };

   public cus(int $$0, cqr $$1) {
      this($$0, $$1, cux.a);
   }

   public cus(int $$0, cqr $$1, final cux $$2) {
      super(cvt.x, $$0);
      this.u = $$2;
      this.a(new cwh(this.p, 0, 15, 15) {
         @Override
         public boolean a(cys $$0) {
            return $$0.c(kj.M);
         }
      });
      this.a(new cwh(this.p, 1, 15, 52) {
         @Override
         public boolean a(cys $$0) {
            return $$0.a(cyw.rz) || $$0.a(cyw.vm) || $$0.a(cyw.gk);
         }
      });
      this.a(new cwh(this.w, 2, 145, 39) {
         @Override
         public boolean a(cys $$0) {
            return false;
         }

         @Override
         public void a(cqs $$0, cys $$1) {
            cus.this.k.get(0).a(1);
            cus.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cus.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awl.Bs, awm.e, 1.0F, 1.0F);
                  cus.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cqs $$0) {
      return a(this.u, $$0, dlw.oz);
   }

   @Override
   public void a(btr $$0) {
      cys $$1 = this.p.a(0);
      cys $$2 = this.p.a(1);
      cys $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cys $$0, cys $$1, cys $$2) {
      this.u.a(($$3, $$4) -> {
         exp $$5 = czf.b($$0, $$3);
         if ($$5 != null) {
            cys $$6;
            if ($$1.a(cyw.rz) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kj.O, dbp.b);
               this.d();
            } else if ($$1.a(cyw.gk) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kj.O, dbp.a);
               this.d();
            } else {
               if (!$$1.a(cyw.vm)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cys.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cys $$0, cwh $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.c(kj.M)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cys.k;
               }
            } else if (!$$4.a(cyw.rz) && !$$4.a(cyw.vm) && !$$4.a(cyw.gk)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cys.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cys.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cys.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
