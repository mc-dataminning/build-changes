public class cex extends cer {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cfc s;
   long t;
   public final bgx n = new bhl(2) {
      @Override
      public void e() {
         cex.this.a(this);
         super.e();
      }
   };
   private final cge u = new cge() {
      @Override
      public void e() {
         cex.this.a(this);
         super.e();
      }
   };

   public cex(int $$0, cbz $$1) {
      this($$0, $$1, cfc.a);
   }

   public cex(int $$0, cbz $$1, final cfc $$2) {
      super(cfw.w, $$0);
      this.s = $$2;
      this.a(new cgj(this.n, 0, 15, 15) {
         @Override
         public boolean a(cjl $$0) {
            return $$0.a(cjo.rf);
         }
      });
      this.a(new cgj(this.n, 1, 15, 52) {
         @Override
         public boolean a(cjl $$0) {
            return $$0.a(cjo.qa) || $$0.a(cjo.tp) || $$0.a(cjo.fx);
         }
      });
      this.a(new cgj(this.u, 2, 145, 39) {
         @Override
         public boolean a(cjl $$0) {
            return false;
         }

         @Override
         public void a(cca $$0, cjl $$1) {
            cex.this.i.get(0).a(1);
            cex.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dL(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cex.this.t != $$2xx) {
                  $$0x.a(null, $$1x, apg.yx, aph.e, 1.0F, 1.0F);
                  cex.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgj($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cgj($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cca $$0) {
      return a(this.s, $$0, cte.nX);
   }

   @Override
   public void a(bgx $$0) {
      cjl $$1 = this.n.a(0);
      cjl $$2 = this.n.a(1);
      cjl $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cjl $$0, cjl $$1, cjl $$2) {
      this.s.a(($$3, $$4) -> {
         ebq $$5 = cjs.a($$0, $$3);
         if ($$5 != null) {
            cjl $$6;
            if ($$1.a(cjo.qa) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cjo.fx) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cjo.tp)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cjl.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cjl $$0, cgj $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cjl a(cca $$0, int $$1) {
      cjl $$2 = cjl.b;
      cgj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjl $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cjl.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cjo.rf)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cjl.b;
               }
            } else if (!$$4.a(cjo.qa) && !$$4.a(cjo.tp) && !$$4.a(cjo.fx)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cjl.b;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cjl.b;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cjl.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cjl.b;
         }

         if ($$4.b()) {
            $$3.d(cjl.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return cjl.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cca $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
