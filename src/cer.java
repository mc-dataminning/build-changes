public class cer extends cel {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cew s;
   long t;
   public final bgr n = new bhf(2) {
      @Override
      public void e() {
         cer.this.a(this);
         super.e();
      }
   };
   private final cfy u = new cfy() {
      @Override
      public void e() {
         cer.this.a(this);
         super.e();
      }
   };

   public cer(int $$0, cbt $$1) {
      this($$0, $$1, cew.a);
   }

   public cer(int $$0, cbt $$1, final cew $$2) {
      super(cfq.w, $$0);
      this.s = $$2;
      this.a(new cgd(this.n, 0, 15, 15) {
         @Override
         public boolean a(cjf $$0) {
            return $$0.a(cji.rf);
         }
      });
      this.a(new cgd(this.n, 1, 15, 52) {
         @Override
         public boolean a(cjf $$0) {
            return $$0.a(cji.qa) || $$0.a(cji.tp) || $$0.a(cji.fx);
         }
      });
      this.a(new cgd(this.u, 2, 145, 39) {
         @Override
         public boolean a(cjf $$0) {
            return false;
         }

         @Override
         public void a(cbu $$0, cjf $$1) {
            cer.this.i.get(0).a(1);
            cer.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dL(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cer.this.t != $$2xx) {
                  $$0x.a(null, $$1x, ape.yx, apf.e, 1.0F, 1.0F);
                  cer.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cgd($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return a(this.s, $$0, csw.nX);
   }

   @Override
   public void a(bgr $$0) {
      cjf $$1 = this.n.a(0);
      cjf $$2 = this.n.a(1);
      cjf $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cjf $$0, cjf $$1, cjf $$2) {
      this.s.a(($$3, $$4) -> {
         ebw $$5 = cjm.a($$0, $$3);
         if ($$5 != null) {
            cjf $$6;
            if ($$1.a(cji.qa) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cji.fx) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cji.tp)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cjf.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cjf $$0, cgd $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cjf a(cbu $$0, int $$1) {
      cjf $$2 = cjf.b;
      cgd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjf $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cjf.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cji.rf)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cjf.b;
               }
            } else if (!$$4.a(cji.qa) && !$$4.a(cji.tp) && !$$4.a(cji.fx)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cjf.b;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cjf.b;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cjf.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cjf.b;
         }

         if ($$4.b()) {
            $$3.d(cjf.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return cjf.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cbu $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
