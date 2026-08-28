public class ctv extends ctn {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final cua u;
   long v;
   public final btj p = new btx(2) {
      @Override
      public void e() {
         ctv.this.a(this);
         super.e();
      }
   };
   private final cvf w = new cvf() {
      @Override
      public void e() {
         ctv.this.a(this);
         super.e();
      }
   };

   public ctv(int $$0, cqh $$1) {
      this($$0, $$1, cua.a);
   }

   public ctv(int $$0, cqh $$1, final cua $$2) {
      super(cuw.x, $$0);
      this.u = $$2;
      this.a(new cvk(this.p, 0, 15, 15) {
         @Override
         public boolean a(cxy $$0) {
            return $$0.c(kx.M);
         }
      });
      this.a(new cvk(this.p, 1, 15, 52) {
         @Override
         public boolean a(cxy $$0) {
            return $$0.a(cyc.rz) || $$0.a(cyc.vm) || $$0.a(cyc.gk);
         }
      });
      this.a(new cvk(this.w, 2, 145, 39) {
         @Override
         public boolean a(cxy $$0) {
            return false;
         }

         @Override
         public void a(cqi $$0, cxy $$1) {
            ctv.this.k.get(0).a(1);
            ctv.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (ctv.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awk.Bs, awl.e, 1.0F, 1.0F);
                  ctv.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cqi $$0) {
      return a(this.u, $$0, dkw.oz);
   }

   @Override
   public void a(btj $$0) {
      cxy $$1 = this.p.a(0);
      cxy $$2 = this.p.a(1);
      cxy $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cxy $$0, cxy $$1, cxy $$2) {
      this.u.a(($$3, $$4) -> {
         ewn $$5 = cyl.b($$0, $$3);
         if ($$5 != null) {
            cxy $$6;
            if ($$1.a(cyc.rz) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kx.O, das.b);
               this.d();
            } else if ($$1.a(cyc.gk) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kx.O, das.a);
               this.d();
            } else {
               if (!$$1.a(cyc.vm)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cxy.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cxy $$0, cvk $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cxy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.c(kx.M)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cxy.k;
               }
            } else if (!$$4.a(cyc.rz) && !$$4.a(cyc.vm) && !$$4.a(cyc.gk)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxy.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxy.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cxy.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxy.k;
         }

         if ($$4.f()) {
            $$3.e(cxy.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return cxy.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cqi $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
