public class cia extends chu {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cif s;
   long t;
   public final bjo n = new bkd(2) {
      @Override
      public void e() {
         cia.this.a(this);
         super.e();
      }
   };
   private final cjk u = new cjk() {
      @Override
      public void e() {
         cia.this.a(this);
         super.e();
      }
   };

   public cia(int $$0, cfa $$1) {
      this($$0, $$1, cif.a);
   }

   public cia(int $$0, cfa $$1, final cif $$2) {
      super(cjb.x, $$0);
      this.s = $$2;
      this.a(new cjp(this.n, 0, 15, 15) {
         @Override
         public boolean a(cmr $$0) {
            return $$0.a(cmu.rR);
         }
      });
      this.a(new cjp(this.n, 1, 15, 52) {
         @Override
         public boolean a(cmr $$0) {
            return $$0.a(cmu.qL) || $$0.a(cmu.uc) || $$0.a(cmu.fS);
         }
      });
      this.a(new cjp(this.u, 2, 145, 39) {
         @Override
         public boolean a(cmr $$0) {
            return false;
         }

         @Override
         public void a(cfb $$0, cmr $$1) {
            cia.this.i.get(0).a(1);
            cia.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dM(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (cia.this.t != $$2xx) {
                  $$0x.a(null, $$1x, arm.zx, arn.e, 1.0F, 1.0F);
                  cia.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjp($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return a(this.s, $$0, cwl.nX);
   }

   @Override
   public void a(bjo $$0) {
      cmr $$1 = this.n.a(0);
      cmr $$2 = this.n.a(1);
      cmr $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cmr $$0, cmr $$1, cmr $$2) {
      this.s.a(($$3, $$4) -> {
         efu $$5 = cmy.b($$0, $$3);
         if ($$5 != null) {
            cmr $$6;
            if ($$1.a(cmu.qL) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cmu.fS) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cmu.uc)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cmr.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cmr $$0, cjp $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cmr a(cfb $$0, int $$1) {
      cmr $$2 = cmr.f;
      cjp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmr $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cmr.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cmu.rR)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cmr.f;
               }
            } else if (!$$4.a(cmu.qL) && !$$4.a(cmu.uc) && !$$4.a(cmu.fS)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cmr.f;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cmr.f;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cmr.f;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cmr.f;
         }

         if ($$4.b()) {
            $$3.e(cmr.f);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return cmr.f;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cfb $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
