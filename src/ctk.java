public class ctk extends ctc {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final ctp u;
   long v;
   public final btc p = new btq(2) {
      @Override
      public void e() {
         ctk.this.a(this);
         super.e();
      }
   };
   private final cuu w = new cuu() {
      @Override
      public void e() {
         ctk.this.a(this);
         super.e();
      }
   };

   public ctk(int $$0, cpw $$1) {
      this($$0, $$1, ctp.a);
   }

   public ctk(int $$0, cpw $$1, final ctp $$2) {
      super(cul.x, $$0);
      this.u = $$2;
      this.a(new cuz(this.p, 0, 15, 15) {
         @Override
         public boolean a(cxp $$0) {
            return $$0.b(ku.L);
         }
      });
      this.a(new cuz(this.p, 1, 15, 52) {
         @Override
         public boolean a(cxp $$0) {
            return $$0.a(cxt.rm) || $$0.a(cxt.uZ) || $$0.a(cxt.gg);
         }
      });
      this.a(new cuz(this.w, 2, 145, 39) {
         @Override
         public boolean a(cxp $$0) {
            return false;
         }

         @Override
         public void a(cpx $$0, cxp $$1) {
            ctk.this.k.get(0).a(1);
            ctk.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dW(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ac();
               if (ctk.this.v != $$2xx) {
                  $$0x.a(null, $$1x, axf.AT, axg.e, 1.0F, 1.0F);
                  ctk.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cpx $$0) {
      return a(this.u, $$0, dko.os);
   }

   @Override
   public void a(btc $$0) {
      cxp $$1 = this.p.a(0);
      cxp $$2 = this.p.a(1);
      cxp $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cxp $$0, cxp $$1, cxp $$2) {
      this.u.a(($$3, $$4) -> {
         evr $$5 = cyc.b($$0, $$3);
         if ($$5 != null) {
            cxp $$6;
            if ($$1.a(cxt.rm) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, dam.b);
               this.d();
            } else if ($$1.a(cxt.gg) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, dam.a);
               this.d();
            } else {
               if (!$$1.a(cxt.uZ)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cxp.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cxp $$0, cuz $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dW(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cxp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(ku.L)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cxp.j;
               }
            } else if (!$$4.a(cxt.rm) && !$$4.a(cxt.uZ) && !$$4.a(cxt.gg)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxp.j;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxp.j;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cxp.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxp.j;
         }

         if ($$4.f()) {
            $$3.e(cxp.j);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cxp.j;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cpx $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
