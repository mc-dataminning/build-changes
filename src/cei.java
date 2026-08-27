public class cei extends cec {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cen s;
   long t;
   public final bgh n = new bgv(2) {
      @Override
      public void e() {
         cei.this.a(this);
         super.e();
      }
   };
   private final cfp u = new cfp() {
      @Override
      public void e() {
         cei.this.a(this);
         super.e();
      }
   };

   public cei(int $$0, cbk $$1) {
      this($$0, $$1, cen.a);
   }

   public cei(int $$0, cbk $$1, final cen $$2) {
      super(cfh.w, $$0);
      this.s = $$2;
      this.a(new cfu(this.n, 0, 15, 15) {
         @Override
         public boolean a(ciw $$0) {
            return $$0.a(ciz.rf);
         }
      });
      this.a(new cfu(this.n, 1, 15, 52) {
         @Override
         public boolean a(ciw $$0) {
            return $$0.a(ciz.qa) || $$0.a(ciz.tp) || $$0.a(ciz.fx);
         }
      });
      this.a(new cfu(this.u, 2, 145, 39) {
         @Override
         public boolean a(ciw $$0) {
            return false;
         }

         @Override
         public void a(cbl $$0, ciw $$1) {
            cei.this.i.get(0).a(1);
            cei.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dK(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cei.this.t != $$2xx) {
                  $$0x.a(null, $$1x, aou.ys, aov.e, 1.0F, 1.0F);
                  cei.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfu($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cfu($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return a(this.s, $$0, csl.nX);
   }

   @Override
   public void a(bgh $$0) {
      ciw $$1 = this.n.a(0);
      ciw $$2 = this.n.a(1);
      ciw $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(ciw $$0, ciw $$1, ciw $$2) {
      this.s.a(($$3, $$4) -> {
         ebl $$5 = cjd.a($$0, $$3);
         if ($$5 != null) {
            ciw $$6;
            if ($$1.a(ciz.qa) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(ciz.fx) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(ciz.tp)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!ciw.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(ciw $$0, cfu $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public ciw a(cbl $$0, int $$1) {
      ciw $$2 = ciw.b;
      cfu $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciw $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dK(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return ciw.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(ciz.rf)) {
               if (!this.a($$4, 0, 1, false)) {
                  return ciw.b;
               }
            } else if (!$$4.a(ciz.qa) && !$$4.a(ciz.tp) && !$$4.a(ciz.fx)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return ciw.b;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return ciw.b;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return ciw.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return ciw.b;
         }

         if ($$4.b()) {
            $$3.d(ciw.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return ciw.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cbl $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
