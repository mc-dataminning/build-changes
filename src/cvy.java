public class cvy extends cvq {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final cwd u;
   long v;
   public final buk p = new buy(2) {
      @Override
      public void e() {
         cvy.this.a(this);
         super.e();
      }
   };
   private final cxi w = new cxi() {
      @Override
      public void e() {
         cvy.this.a(this);
         super.e();
      }
   };

   public cvy(int $$0, crw $$1) {
      this($$0, $$1, cwd.a);
   }

   public cvy(int $$0, crw $$1, final cwd $$2) {
      super(cwz.x, $$0);
      this.u = $$2;
      this.a(new cxn(this.p, 0, 15, 15) {
         @Override
         public boolean a(czy $$0) {
            return $$0.c(kk.M);
         }
      });
      this.a(new cxn(this.p, 1, 15, 52) {
         @Override
         public boolean a(czy $$0) {
            return $$0.a(dac.rE) || $$0.a(dac.vt) || $$0.a(dac.gp);
         }
      });
      this.a(new cxn(this.w, 2, 145, 39) {
         @Override
         public boolean a(czy $$0) {
            return false;
         }

         @Override
         public void a(crx $$0, czy $$1) {
            cvy.this.k.get(0).a(1);
            cvy.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cvy.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awp.By, awq.e, 1.0F, 1.0F);
                  cvy.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crx $$0) {
      return a(this.u, $$0, dne.oD);
   }

   @Override
   public void a(buk $$0) {
      czy $$1 = this.p.a(0);
      czy $$2 = this.p.a(1);
      czy $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(czy $$0, czy $$1, czy $$2) {
      this.u.a(($$3, $$4) -> {
         ezj $$5 = dal.b($$0, $$3);
         if ($$5 != null) {
            czy $$6;
            if ($$1.a(dac.rE) && !$$5.i && $$5.g < 4) {
               $$6 = $$0.c(1);
               $$6.b(kk.O, dcv.b);
               this.d();
            } else if ($$1.a(dac.gp) && !$$5.i) {
               $$6 = $$0.c(1);
               $$6.b(kk.O, dcv.a);
               this.d();
            } else {
               if (!$$1.a(dac.vt)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!czy.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(czy $$0, cxn $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return czy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.c(kk.M)) {
               if (!this.a($$4, 0, 1, false)) {
                  return czy.k;
               }
            } else if (!$$4.a(dac.rE) && !$$4.a(dac.vt) && !$$4.a(dac.gp)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return czy.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return czy.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return czy.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(crx $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
