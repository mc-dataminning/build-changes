public class cig extends cia {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cil s;
   long t;
   public final bjt n = new bki(2) {
      @Override
      public void e() {
         cig.this.a(this);
         super.e();
      }
   };
   private final cjq u = new cjq() {
      @Override
      public void e() {
         cig.this.a(this);
         super.e();
      }
   };

   public cig(int $$0, cfg $$1) {
      this($$0, $$1, cil.a);
   }

   public cig(int $$0, cfg $$1, final cil $$2) {
      super(cjh.x, $$0);
      this.s = $$2;
      this.a(new cjv(this.n, 0, 15, 15) {
         @Override
         public boolean a(cmx $$0) {
            return $$0.a(cna.rR);
         }
      });
      this.a(new cjv(this.n, 1, 15, 52) {
         @Override
         public boolean a(cmx $$0) {
            return $$0.a(cna.qL) || $$0.a(cna.uc) || $$0.a(cna.fS);
         }
      });
      this.a(new cjv(this.u, 2, 145, 39) {
         @Override
         public boolean a(cmx $$0) {
            return false;
         }

         @Override
         public void a(cfh $$0, cmx $$1) {
            cig.this.i.get(0).a(1);
            cig.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dM(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (cig.this.t != $$2xx) {
                  $$0x.a(null, $$1x, arr.zx, ars.e, 1.0F, 1.0F);
                  cig.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjv($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjv($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cfh $$0) {
      return a(this.s, $$0, cwr.nX);
   }

   @Override
   public void a(bjt $$0) {
      cmx $$1 = this.n.a(0);
      cmx $$2 = this.n.a(1);
      cmx $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cmx $$0, cmx $$1, cmx $$2) {
      this.s.a(($$3, $$4) -> {
         ega $$5 = cne.b($$0, $$3);
         if ($$5 != null) {
            cmx $$6;
            if ($$1.a(cna.qL) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cna.fS) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cna.uc)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cmx.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cmx $$0, cjv $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cmx a(cfh $$0, int $$1) {
      cmx $$2 = cmx.f;
      cjv $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmx $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cmx.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cna.rR)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cmx.f;
               }
            } else if (!$$4.a(cna.qL) && !$$4.a(cna.uc) && !$$4.a(cna.fS)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cmx.f;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cmx.f;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cmx.f;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cmx.f;
         }

         if ($$4.b()) {
            $$3.e(cmx.f);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return cmx.f;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cfh $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
