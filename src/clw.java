public class clw extends clq {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cmb s;
   long t;
   public final bmw n = new bnm(2) {
      @Override
      public void e() {
         clw.this.a(this);
         super.e();
      }
   };
   private final cng u = new cng() {
      @Override
      public void e() {
         clw.this.a(this);
         super.e();
      }
   };

   public clw(int $$0, cit $$1) {
      this($$0, $$1, cmb.a);
   }

   public clw(int $$0, cit $$1, final cmb $$2) {
      super(cmx.x, $$0);
      this.s = $$2;
      this.a(new cnl(this.n, 0, 15, 15) {
         @Override
         public boolean a(cqm $$0) {
            return $$0.a(cqp.rT);
         }
      });
      this.a(new cnl(this.n, 1, 15, 52) {
         @Override
         public boolean a(cqm $$0) {
            return $$0.a(cqp.qN) || $$0.a(cqp.uh) || $$0.a(cqp.fS);
         }
      });
      this.a(new cnl(this.u, 2, 145, 39) {
         @Override
         public boolean a(cqm $$0) {
            return false;
         }

         @Override
         public void a(ciu $$0, cqm $$1) {
            clw.this.i.get(0).a(1);
            clw.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dM(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (clw.this.t != $$2xx) {
                  $$0x.a(null, $$1x, aty.zV, atz.e, 1.0F, 1.0F);
                  clw.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cnl($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cnl($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return a(this.s, $$0, dae.nX);
   }

   @Override
   public void a(bmw $$0) {
      cqm $$1 = this.n.a(0);
      cqm $$2 = this.n.a(1);
      cqm $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cqm $$0, cqm $$1, cqm $$2) {
      this.s.a(($$3, $$4) -> {
         eka $$5 = cqt.b($$0, $$3);
         if ($$5 != null) {
            cqm $$6;
            if ($$1.a(cqp.qN) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.x().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cqp.fS) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.x().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cqp.uh)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cqm.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cqm $$0, cnl $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cqm.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cqp.rT)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cqm.h;
               }
            } else if (!$$4.a(cqp.qN) && !$$4.a(cqp.uh) && !$$4.a(cqp.fS)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cqm.h;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cqm.h;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cqm.h;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cqm.h;
         }

         if ($$4.b()) {
            $$3.e(cqm.h);
         }

         $$3.b();
         if ($$4.M() == $$2.M()) {
            return cqm.h;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(ciu $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
