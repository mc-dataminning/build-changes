public class cvd extends cuv {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final cvi u;
   long v;
   public final btw p = new buk(2) {
      @Override
      public void e() {
         cvd.this.a(this);
         super.e();
      }
   };
   private final cwn w = new cwn() {
      @Override
      public void e() {
         cvd.this.a(this);
         super.e();
      }
   };

   public cvd(int $$0, crb $$1) {
      this($$0, $$1, cvi.a);
   }

   public cvd(int $$0, crb $$1, final cvi $$2) {
      super(cwe.x, $$0);
      this.u = $$2;
      this.a(new cws(this.p, 0, 15, 15) {
         @Override
         public boolean a(czd $$0) {
            return $$0.c(kj.M);
         }
      });
      this.a(new cws(this.p, 1, 15, 52) {
         @Override
         public boolean a(czd $$0) {
            return $$0.a(czh.rE) || $$0.a(czh.vt) || $$0.a(czh.gp);
         }
      });
      this.a(new cws(this.w, 2, 145, 39) {
         @Override
         public boolean a(czd $$0) {
            return false;
         }

         @Override
         public void a(crc $$0, czd $$1) {
            cvd.this.k.get(0).a(1);
            cvd.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cvd.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awn.By, awo.e, 1.0F, 1.0F);
                  cvd.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crc $$0) {
      return a(this.u, $$0, dmh.oD);
   }

   @Override
   public void a(btw $$0) {
      czd $$1 = this.p.a(0);
      czd $$2 = this.p.a(1);
      czd $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(czd $$0, czd $$1, czd $$2) {
      this.u.a(($$3, $$4) -> {
         eyj $$5 = czq.b($$0, $$3);
         if ($$5 != null) {
            czd $$6;
            if ($$1.a(czh.rE) && !$$5.i && $$5.g < 4) {
               $$6 = $$0.c(1);
               $$6.b(kj.O, dca.b);
               this.d();
            } else if ($$1.a(czh.gp) && !$$5.i) {
               $$6 = $$0.c(1);
               $$6.b(kj.O, dca.a);
               this.d();
            } else {
               if (!$$1.a(czh.vt)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!czd.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(czd $$0, cws $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return czd.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.c(kj.M)) {
               if (!this.a($$4, 0, 1, false)) {
                  return czd.k;
               }
            } else if (!$$4.a(czh.rE) && !$$4.a(czh.vt) && !$$4.a(czh.gp)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return czd.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return czd.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return czd.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return czd.k;
         }

         if ($$4.f()) {
            $$3.e(czd.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return czd.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(crc $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
