public class cgk extends cge {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cgp s;
   long t;
   public final bij n = new bix(2) {
      @Override
      public void e() {
         cgk.this.a(this);
         super.e();
      }
   };
   private final chu u = new chu() {
      @Override
      public void e() {
         cgk.this.a(this);
         super.e();
      }
   };

   public cgk(int $$0, cdl $$1) {
      this($$0, $$1, cgp.a);
   }

   public cgk(int $$0, cdl $$1, final cgp $$2) {
      super(chl.x, $$0);
      this.s = $$2;
      this.a(new chz(this.n, 0, 15, 15) {
         @Override
         public boolean a(clb $$0) {
            return $$0.a(cle.rg);
         }
      });
      this.a(new chz(this.n, 1, 15, 52) {
         @Override
         public boolean a(clb $$0) {
            return $$0.a(cle.qa) || $$0.a(cle.tq) || $$0.a(cle.fx);
         }
      });
      this.a(new chz(this.u, 2, 145, 39) {
         @Override
         public boolean a(clb $$0) {
            return false;
         }

         @Override
         public void a(cdm $$0, clb $$1) {
            cgk.this.i.get(0).a(1);
            cgk.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dL(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cgk.this.t != $$2xx) {
                  $$0x.a(null, $$1x, aqn.yB, aqo.e, 1.0F, 1.0F);
                  cgk.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new chz($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new chz($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return a(this.s, $$0, cuv.nX);
   }

   @Override
   public void a(bij $$0) {
      clb $$1 = this.n.a(0);
      clb $$2 = this.n.a(1);
      clb $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(clb $$0, clb $$1, clb $$2) {
      this.s.a(($$3, $$4) -> {
         edq $$5 = cli.b($$0, $$3);
         if ($$5 != null) {
            clb $$6;
            if ($$1.a(cle.qa) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cle.fx) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cle.tq)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!clb.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(clb $$0, chz $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public clb a(cdm $$0, int $$1) {
      clb $$2 = clb.b;
      chz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clb $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return clb.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cle.rg)) {
               if (!this.a($$4, 0, 1, false)) {
                  return clb.b;
               }
            } else if (!$$4.a(cle.qa) && !$$4.a(cle.tq) && !$$4.a(cle.fx)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return clb.b;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return clb.b;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return clb.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return clb.b;
         }

         if ($$4.b()) {
            $$3.e(clb.b);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return clb.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cdm $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
