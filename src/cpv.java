public class cpv extends cpp {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cqa s;
   long t;
   public final bqi n = new bqy(2) {
      @Override
      public void e() {
         cpv.this.a(this);
         super.e();
      }
   };
   private final crf u = new crf() {
      @Override
      public void e() {
         cpv.this.a(this);
         super.e();
      }
   };

   public cpv(int $$0, cmr $$1) {
      this($$0, $$1, cqa.a);
   }

   public cpv(int $$0, cmr $$1, final cqa $$2) {
      super(cqw.x, $$0);
      this.s = $$2;
      this.a(new crk(this.n, 0, 15, 15) {
         @Override
         public boolean a(cuk $$0) {
            return $$0.a(cun.rU);
         }
      });
      this.a(new crk(this.n, 1, 15, 52) {
         @Override
         public boolean a(cuk $$0) {
            return $$0.a(cun.qO) || $$0.a(cun.uj) || $$0.a(cun.fT);
         }
      });
      this.a(new crk(this.u, 2, 145, 39) {
         @Override
         public boolean a(cuk $$0) {
            return false;
         }

         @Override
         public void a(cms $$0, cuk $$1) {
            cpv.this.i.get(0).a(1);
            cpv.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dP(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cpv.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avw.Ar, avx.e, 1.0F, 1.0F);
                  cpv.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crk($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crk($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cms $$0) {
      return a(this.s, $$0, dew.nX);
   }

   @Override
   public void a(bqi $$0) {
      cuk $$1 = this.n.a(0);
      cuk $$2 = this.n.a(1);
      cuk $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cuk $$0, cuk $$1, cuk $$2) {
      this.s.a(($$3, $$4) -> {
         epf $$5 = cus.b($$0, $$3);
         if ($$5 != null) {
            cuk $$6;
            if ($$1.a(cun.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(km.C, cxl.b);
               this.d();
            } else if ($$1.a(cun.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(km.C, cxl.a);
               this.d();
            } else {
               if (!$$1.a(cun.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cuk.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cuk $$0, crk $$1) {
      return $$1.c != this.u && super.a($$0, $$1);
   }

   @Override
   public cuk a(cms $$0, int $$1) {
      cuk $$2 = cuk.l;
      crk $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuk $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cuk.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cun.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cuk.l;
               }
            } else if (!$$4.a(cun.qO) && !$$4.a(cun.uj) && !$$4.a(cun.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cuk.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cuk.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cuk.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuk.l;
         }

         if ($$4.e()) {
            $$3.e(cuk.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cuk.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cms $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
