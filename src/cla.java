public class cla extends cku {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final clf s;
   long t;
   public final bme n = new bmu(2) {
      @Override
      public void e() {
         cla.this.a(this);
         super.e();
      }
   };
   private final cmk u = new cmk() {
      @Override
      public void e() {
         cla.this.a(this);
         super.e();
      }
   };

   public cla(int $$0, chz $$1) {
      this($$0, $$1, clf.a);
   }

   public cla(int $$0, chz $$1, final clf $$2) {
      super(cmb.x, $$0);
      this.s = $$2;
      this.a(new cmp(this.n, 0, 15, 15) {
         @Override
         public boolean a(cpq $$0) {
            return $$0.a(cpt.rT);
         }
      });
      this.a(new cmp(this.n, 1, 15, 52) {
         @Override
         public boolean a(cpq $$0) {
            return $$0.a(cpt.qN) || $$0.a(cpt.uf) || $$0.a(cpt.fS);
         }
      });
      this.a(new cmp(this.u, 2, 145, 39) {
         @Override
         public boolean a(cpq $$0) {
            return false;
         }

         @Override
         public void a(cia $$0, cpq $$1) {
            cla.this.i.get(0).a(1);
            cla.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dJ(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (cla.this.t != $$2xx) {
                  $$0x.a(null, $$1x, atp.zN, atq.e, 1.0F, 1.0F);
                  cla.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cmp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cmp($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cia $$0) {
      return a(this.s, $$0, czh.nX);
   }

   @Override
   public void a(bme $$0) {
      cpq $$1 = this.n.a(0);
      cpq $$2 = this.n.a(1);
      cpq $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cpq $$0, cpq $$1, cpq $$2) {
      this.s.a(($$3, $$4) -> {
         ejc $$5 = cpx.b($$0, $$3);
         if ($$5 != null) {
            cpq $$6;
            if ($$1.a(cpt.qN) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.x().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cpt.fS) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.x().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cpt.uf)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cpq.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cpq $$0, cmp $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cpq a(cia $$0, int $$1) {
      cpq $$2 = cpq.h;
      cmp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpq $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dJ(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cpq.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cpt.rT)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cpq.h;
               }
            } else if (!$$4.a(cpt.qN) && !$$4.a(cpt.uf) && !$$4.a(cpt.fS)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cpq.h;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cpq.h;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cpq.h;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cpq.h;
         }

         if ($$4.b()) {
            $$3.e(cpq.h);
         }

         $$3.b();
         if ($$4.M() == $$2.M()) {
            return cpq.h;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cia $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
