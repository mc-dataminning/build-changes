public class cih extends cib {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cim s;
   long t;
   public final bju n = new bkj(2) {
      @Override
      public void e() {
         cih.this.a(this);
         super.e();
      }
   };
   private final cjr u = new cjr() {
      @Override
      public void e() {
         cih.this.a(this);
         super.e();
      }
   };

   public cih(int $$0, cfh $$1) {
      this($$0, $$1, cim.a);
   }

   public cih(int $$0, cfh $$1, final cim $$2) {
      super(cji.x, $$0);
      this.s = $$2;
      this.a(new cjw(this.n, 0, 15, 15) {
         @Override
         public boolean a(cmy $$0) {
            return $$0.a(cnb.rR);
         }
      });
      this.a(new cjw(this.n, 1, 15, 52) {
         @Override
         public boolean a(cmy $$0) {
            return $$0.a(cnb.qL) || $$0.a(cnb.uc) || $$0.a(cnb.fS);
         }
      });
      this.a(new cjw(this.u, 2, 145, 39) {
         @Override
         public boolean a(cmy $$0) {
            return false;
         }

         @Override
         public void a(cfi $$0, cmy $$1) {
            cih.this.i.get(0).a(1);
            cih.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dM(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (cih.this.t != $$2xx) {
                  $$0x.a(null, $$1x, ars.zx, art.e, 1.0F, 1.0F);
                  cih.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjw($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjw($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return a(this.s, $$0, cws.nX);
   }

   @Override
   public void a(bju $$0) {
      cmy $$1 = this.n.a(0);
      cmy $$2 = this.n.a(1);
      cmy $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cmy $$0, cmy $$1, cmy $$2) {
      this.s.a(($$3, $$4) -> {
         egb $$5 = cnf.b($$0, $$3);
         if ($$5 != null) {
            cmy $$6;
            if ($$1.a(cnb.qL) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cnb.fS) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cnb.uc)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cmy.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cmy $$0, cjw $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cmy a(cfi $$0, int $$1) {
      cmy $$2 = cmy.f;
      cjw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmy $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cmy.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cnb.rR)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cmy.f;
               }
            } else if (!$$4.a(cnb.qL) && !$$4.a(cnb.uc) && !$$4.a(cnb.fS)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cmy.f;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cmy.f;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cmy.f;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cmy.f;
         }

         if ($$4.b()) {
            $$3.e(cmy.f);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return cmy.f;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cfi $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
