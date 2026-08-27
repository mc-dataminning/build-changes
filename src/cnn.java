public class cnn extends cnh {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cns s;
   long t;
   public final boj n = new boz(2) {
      @Override
      public void e() {
         cnn.this.a(this);
         super.e();
      }
   };
   private final coy u = new coy() {
      @Override
      public void e() {
         cnn.this.a(this);
         super.e();
      }
   };

   public cnn(int $$0, ckk $$1) {
      this($$0, $$1, cns.a);
   }

   public cnn(int $$0, ckk $$1, final cns $$2) {
      super(cop.x, $$0);
      this.s = $$2;
      this.a(new cpd(this.n, 0, 15, 15) {
         @Override
         public boolean a(csd $$0) {
            return $$0.a(csg.rU);
         }
      });
      this.a(new cpd(this.n, 1, 15, 52) {
         @Override
         public boolean a(csd $$0) {
            return $$0.a(csg.qO) || $$0.a(csg.uj) || $$0.a(csg.fT);
         }
      });
      this.a(new cpd(this.u, 2, 145, 39) {
         @Override
         public boolean a(csd $$0) {
            return false;
         }

         @Override
         public void a(ckl $$0, csd $$1) {
            cnn.this.i.get(0).a(1);
            cnn.this.i.get(1).a(1);
            $$1.f().b($$1, $$0.dN(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (cnn.this.t != $$2xx) {
                  $$0x.a(null, $$1x, auz.Af, ava.e, 1.0F, 1.0F);
                  cnn.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cpd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cpd($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return a(this.s, $$0, dcx.nX);
   }

   @Override
   public void a(boj $$0) {
      csd $$1 = this.n.a(0);
      csd $$2 = this.n.a(1);
      csd $$3 = this.u.a(2);
      if ($$3.d() || !$$1.d() && !$$2.d()) {
         if (!$$1.d() && !$$2.d()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(csd $$0, csd $$1, csd $$2) {
      this.s.a(($$3, $$4) -> {
         ene $$5 = csl.b($$0, $$3);
         if ($$5 != null) {
            csd $$6;
            if ($$1.a(csg.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(jz.u, cvc.b);
               this.d();
            } else if ($$1.a(csg.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(jz.u, cvc.a);
               this.d();
            } else {
               if (!$$1.a(csg.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!csd.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(csd $$0, cpd $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public csd a(ckl $$0, int $$1) {
      csd $$2 = csd.i;
      cpd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csd $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 2) {
            $$4.f().b($$4, $$0.dN(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return csd.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(csg.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return csd.i;
               }
            } else if (!$$4.a(csg.qO) && !$$4.a(csg.uj) && !$$4.a(csg.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return csd.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return csd.i;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return csd.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return csd.i;
         }

         if ($$4.d()) {
            $$3.e(csd.i);
         }

         $$3.b();
         if ($$4.G() == $$2.G()) {
            return csd.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(ckl $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
