public class ctf extends csx {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final ctk u;
   long v;
   public final bsx p = new btl(2) {
      @Override
      public void e() {
         ctf.this.a(this);
         super.e();
      }
   };
   private final cup w = new cup() {
      @Override
      public void e() {
         ctf.this.a(this);
         super.e();
      }
   };

   public ctf(int $$0, cpr $$1) {
      this($$0, $$1, ctk.a);
   }

   public ctf(int $$0, cpr $$1, final ctk $$2) {
      super(cug.x, $$0);
      this.u = $$2;
      this.a(new cuu(this.p, 0, 15, 15) {
         @Override
         public boolean a(cxk $$0) {
            return $$0.b(ku.L);
         }
      });
      this.a(new cuu(this.p, 1, 15, 52) {
         @Override
         public boolean a(cxk $$0) {
            return $$0.a(cxo.rm) || $$0.a(cxo.uZ) || $$0.a(cxo.gg);
         }
      });
      this.a(new cuu(this.w, 2, 145, 39) {
         @Override
         public boolean a(cxk $$0) {
            return false;
         }

         @Override
         public void a(cps $$0, cxk $$1) {
            ctf.this.k.get(0).a(1);
            ctf.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ac();
               if (ctf.this.v != $$2xx) {
                  $$0x.a(null, $$1x, axf.AS, axg.e, 1.0F, 1.0F);
                  ctf.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cps $$0) {
      return a(this.u, $$0, dkg.os);
   }

   @Override
   public void a(bsx $$0) {
      cxk $$1 = this.p.a(0);
      cxk $$2 = this.p.a(1);
      cxk $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cxk $$0, cxk $$1, cxk $$2) {
      this.u.a(($$3, $$4) -> {
         evj $$5 = cxx.b($$0, $$3);
         if ($$5 != null) {
            cxk $$6;
            if ($$1.a(cxo.rm) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, dah.b);
               this.d();
            } else if ($$1.a(cxo.gg) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, dah.a);
               this.d();
            } else {
               if (!$$1.a(cxo.uZ)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cxk.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cxk $$0, cuu $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cxk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(ku.L)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cxk.k;
               }
            } else if (!$$4.a(cxo.rm) && !$$4.a(cxo.uZ) && !$$4.a(cxo.gg)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxk.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxk.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cxk.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxk.k;
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cxk.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cps $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
