public class cvk extends cvc {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final cvp u;
   long v;
   public final btz p = new bun(2) {
      @Override
      public void e() {
         cvk.this.a(this);
         super.e();
      }
   };
   private final cwu w = new cwu() {
      @Override
      public void e() {
         cvk.this.a(this);
         super.e();
      }
   };

   public cvk(int $$0, cri $$1) {
      this($$0, $$1, cvp.a);
   }

   public cvk(int $$0, cri $$1, final cvp $$2) {
      super(cwl.x, $$0);
      this.u = $$2;
      this.a(new cwz(this.p, 0, 15, 15) {
         @Override
         public boolean a(czk $$0) {
            return $$0.c(kk.M);
         }
      });
      this.a(new cwz(this.p, 1, 15, 52) {
         @Override
         public boolean a(czk $$0) {
            return $$0.a(czo.rE) || $$0.a(czo.vt) || $$0.a(czo.gp);
         }
      });
      this.a(new cwz(this.w, 2, 145, 39) {
         @Override
         public boolean a(czk $$0) {
            return false;
         }

         @Override
         public void a(crj $$0, czk $$1) {
            cvk.this.k.get(0).a(1);
            cvk.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dU(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cvk.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awn.By, awo.e, 1.0F, 1.0F);
                  cvk.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crj $$0) {
      return a(this.u, $$0, dmo.oD);
   }

   @Override
   public void a(btz $$0) {
      czk $$1 = this.p.a(0);
      czk $$2 = this.p.a(1);
      czk $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(czk $$0, czk $$1, czk $$2) {
      this.u.a(($$3, $$4) -> {
         eyq $$5 = czx.b($$0, $$3);
         if ($$5 != null) {
            czk $$6;
            if ($$1.a(czo.rE) && !$$5.i && $$5.g < 4) {
               $$6 = $$0.c(1);
               $$6.b(kk.O, dch.b);
               this.d();
            } else if ($$1.a(czo.gp) && !$$5.i) {
               $$6 = $$0.c(1);
               $$6.b(kk.O, dch.a);
               this.d();
            } else {
               if (!$$1.a(czo.vt)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!czk.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(czk $$0, cwz $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dU(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return czk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.c(kk.M)) {
               if (!this.a($$4, 0, 1, false)) {
                  return czk.k;
               }
            } else if (!$$4.a(czo.rE) && !$$4.a(czo.vt) && !$$4.a(czo.gp)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return czk.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return czk.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return czk.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return czk.k;
         }

         if ($$4.f()) {
            $$3.e(czk.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return czk.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(crj $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
