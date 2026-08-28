public class cqa extends cpu {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cqf s;
   long t;
   public final bqn n = new brd(2) {
      @Override
      public void e() {
         cqa.this.a(this);
         super.e();
      }
   };
   private final crk u = new crk() {
      @Override
      public void e() {
         cqa.this.a(this);
         super.e();
      }
   };

   public cqa(int $$0, cmw $$1) {
      this($$0, $$1, cqf.a);
   }

   public cqa(int $$0, cmw $$1, final cqf $$2) {
      super(crb.x, $$0);
      this.s = $$2;
      this.a(new crp(this.n, 0, 15, 15) {
         @Override
         public boolean a(cup $$0) {
            return $$0.a(cus.rU);
         }
      });
      this.a(new crp(this.n, 1, 15, 52) {
         @Override
         public boolean a(cup $$0) {
            return $$0.a(cus.qO) || $$0.a(cus.uj) || $$0.a(cus.fT);
         }
      });
      this.a(new crp(this.u, 2, 145, 39) {
         @Override
         public boolean a(cup $$0) {
            return false;
         }

         @Override
         public void a(cmx $$0, cup $$1) {
            cqa.this.i.get(0).a(1);
            cqa.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dP(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqa.this.t != $$2xx) {
                  $$0x.a(null, $$1x, awa.Ar, awb.e, 1.0F, 1.0F);
                  cqa.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crp($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cmx $$0) {
      return a(this.s, $$0, dfb.nX);
   }

   @Override
   public void a(bqn $$0) {
      cup $$1 = this.n.a(0);
      cup $$2 = this.n.a(1);
      cup $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cup $$0, cup $$1, cup $$2) {
      this.s.a(($$3, $$4) -> {
         epk $$5 = cux.b($$0, $$3);
         if ($$5 != null) {
            cup $$6;
            if ($$1.a(cus.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(km.D, cxq.b);
               this.d();
            } else if ($$1.a(cus.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(km.D, cxq.a);
               this.d();
            } else {
               if (!$$1.a(cus.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cup.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cup $$0, crp $$1) {
      return $$1.c != this.u && super.a($$0, $$1);
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cup.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cus.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cup.l;
               }
            } else if (!$$4.a(cus.qO) && !$$4.a(cus.uj) && !$$4.a(cus.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cup.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cup.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cup.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cup.l;
         }

         if ($$4.e()) {
            $$3.e(cup.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cup.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cmx $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
