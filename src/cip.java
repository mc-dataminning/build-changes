public class cip extends cij {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final ciu s;
   long t;
   public final bjv n = new bkl(2) {
      @Override
      public void e() {
         cip.this.a(this);
         super.e();
      }
   };
   private final cjz u = new cjz() {
      @Override
      public void e() {
         cip.this.a(this);
         super.e();
      }
   };

   public cip(int $$0, cfp $$1) {
      this($$0, $$1, ciu.a);
   }

   public cip(int $$0, cfp $$1, final ciu $$2) {
      super(cjq.x, $$0);
      this.s = $$2;
      this.a(new cke(this.n, 0, 15, 15) {
         @Override
         public boolean a(cng $$0) {
            return $$0.a(cnj.rT);
         }
      });
      this.a(new cke(this.n, 1, 15, 52) {
         @Override
         public boolean a(cng $$0) {
            return $$0.a(cnj.qN) || $$0.a(cnj.uf) || $$0.a(cnj.fS);
         }
      });
      this.a(new cke(this.u, 2, 145, 39) {
         @Override
         public boolean a(cng $$0) {
            return false;
         }

         @Override
         public void a(cfq $$0, cng $$1) {
            cip.this.i.get(0).a(1);
            cip.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dL(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (cip.this.t != $$2xx) {
                  $$0x.a(null, $$1x, art.zM, aru.e, 1.0F, 1.0F);
                  cip.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cke($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cke($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return a(this.s, $$0, cxa.nX);
   }

   @Override
   public void a(bjv $$0) {
      cng $$1 = this.n.a(0);
      cng $$2 = this.n.a(1);
      cng $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cng $$0, cng $$1, cng $$2) {
      this.s.a(($$3, $$4) -> {
         egj $$5 = cnn.b($$0, $$3);
         if ($$5 != null) {
            cng $$6;
            if ($$1.a(cnj.qN) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cnj.fS) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cnj.uf)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cng.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cng $$0, cke $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cng a(cfq $$0, int $$1) {
      cng $$2 = cng.f;
      cke $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cng $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cng.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cnj.rT)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cng.f;
               }
            } else if (!$$4.a(cnj.qN) && !$$4.a(cnj.uf) && !$$4.a(cnj.fS)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cng.f;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cng.f;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cng.f;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cng.f;
         }

         if ($$4.b()) {
            $$3.e(cng.f);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return cng.f;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cfq $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
