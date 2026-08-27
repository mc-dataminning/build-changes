public class cnc extends cmw {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cnh s;
   long t;
   public final bny n = new boo(2) {
      @Override
      public void e() {
         cnc.this.a(this);
         super.e();
      }
   };
   private final com u = new com() {
      @Override
      public void e() {
         cnc.this.a(this);
         super.e();
      }
   };

   public cnc(int $$0, cjz $$1) {
      this($$0, $$1, cnh.a);
   }

   public cnc(int $$0, cjz $$1, final cnh $$2) {
      super(cod.x, $$0);
      this.s = $$2;
      this.a(new cos(this.n, 0, 15, 15) {
         @Override
         public boolean a(crs $$0) {
            return $$0.a(crv.rT);
         }
      });
      this.a(new cos(this.n, 1, 15, 52) {
         @Override
         public boolean a(crs $$0) {
            return $$0.a(crv.qN) || $$0.a(crv.uh) || $$0.a(crv.fS);
         }
      });
      this.a(new cos(this.u, 2, 145, 39) {
         @Override
         public boolean a(crs $$0) {
            return false;
         }

         @Override
         public void a(cka $$0, crs $$1) {
            cnc.this.i.get(0).a(1);
            cnc.this.i.get(1).a(1);
            $$1.f().b($$1, $$0.dM(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (cnc.this.t != $$2xx) {
                  $$0x.a(null, $$1x, auo.zY, aup.e, 1.0F, 1.0F);
                  cnc.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cos($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cos($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cka $$0) {
      return a(this.s, $$0, dcj.nX);
   }

   @Override
   public void a(bny $$0) {
      crs $$1 = this.n.a(0);
      crs $$2 = this.n.a(1);
      crs $$3 = this.u.a(2);
      if ($$3.d() || !$$1.d() && !$$2.d()) {
         if (!$$1.d() && !$$2.d()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(crs $$0, crs $$1, crs $$2) {
      this.s.a(($$3, $$4) -> {
         emo $$5 = crz.b($$0, $$3);
         if ($$5 != null) {
            crs $$6;
            if ($$1.a(crv.qN) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(jr.u, cuo.b);
               this.d();
            } else if ($$1.a(crv.fS) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(jr.u, cuo.a);
               this.d();
            } else {
               if (!$$1.a(crv.uh)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!crs.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(crs $$0, cos $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crs $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 2) {
            $$4.f().b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return crs.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(crv.rT)) {
               if (!this.a($$4, 0, 1, false)) {
                  return crs.i;
               }
            } else if (!$$4.a(crv.qN) && !$$4.a(crv.uh) && !$$4.a(crv.fS)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return crs.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return crs.i;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return crs.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return crs.i;
         }

         if ($$4.d()) {
            $$3.e(crs.i);
         }

         $$3.b();
         if ($$4.G() == $$2.G()) {
            return crs.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cka $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
