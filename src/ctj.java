public class ctj extends ctb {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final cto u;
   long v;
   public final btb p = new btp(2) {
      @Override
      public void e() {
         ctj.this.a(this);
         super.e();
      }
   };
   private final cut w = new cut() {
      @Override
      public void e() {
         ctj.this.a(this);
         super.e();
      }
   };

   public ctj(int $$0, cpv $$1) {
      this($$0, $$1, cto.a);
   }

   public ctj(int $$0, cpv $$1, final cto $$2) {
      super(cuk.x, $$0);
      this.u = $$2;
      this.a(new cuy(this.p, 0, 15, 15) {
         @Override
         public boolean a(cxo $$0) {
            return $$0.b(ku.L);
         }
      });
      this.a(new cuy(this.p, 1, 15, 52) {
         @Override
         public boolean a(cxo $$0) {
            return $$0.a(cxs.rm) || $$0.a(cxs.uZ) || $$0.a(cxs.gg);
         }
      });
      this.a(new cuy(this.w, 2, 145, 39) {
         @Override
         public boolean a(cxo $$0) {
            return false;
         }

         @Override
         public void a(cpw $$0, cxo $$1) {
            ctj.this.k.get(0).a(1);
            ctj.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ac();
               if (ctj.this.v != $$2xx) {
                  $$0x.a(null, $$1x, axf.AT, axg.e, 1.0F, 1.0F);
                  ctj.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cpw $$0) {
      return a(this.u, $$0, dkn.os);
   }

   @Override
   public void a(btb $$0) {
      cxo $$1 = this.p.a(0);
      cxo $$2 = this.p.a(1);
      cxo $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cxo $$0, cxo $$1, cxo $$2) {
      this.u.a(($$3, $$4) -> {
         evq $$5 = cyb.b($$0, $$3);
         if ($$5 != null) {
            cxo $$6;
            if ($$1.a(cxs.rm) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, dal.b);
               this.d();
            } else if ($$1.a(cxs.gg) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, dal.a);
               this.d();
            } else {
               if (!$$1.a(cxs.uZ)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cxo.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cxo $$0, cuy $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cxo b(cpw $$0, int $$1) {
      cxo $$2 = cxo.k;
      cuy $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cxo.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(ku.L)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cxo.k;
               }
            } else if (!$$4.a(cxs.rm) && !$$4.a(cxs.uZ) && !$$4.a(cxs.gg)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxo.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxo.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cxo.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxo.k;
         }

         if ($$4.f()) {
            $$3.e(cxo.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cxo.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cpw $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
