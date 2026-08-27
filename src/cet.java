public class cet extends cen {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cey s;
   long t;
   public final bgt n = new bhh(2) {
      @Override
      public void e() {
         cet.this.a(this);
         super.e();
      }
   };
   private final cga u = new cga() {
      @Override
      public void e() {
         cet.this.a(this);
         super.e();
      }
   };

   public cet(int $$0, cbv $$1) {
      this($$0, $$1, cey.a);
   }

   public cet(int $$0, cbv $$1, final cey $$2) {
      super(cfs.w, $$0);
      this.s = $$2;
      this.a(new cgf(this.n, 0, 15, 15) {
         @Override
         public boolean a(cjh $$0) {
            return $$0.a(cjk.rf);
         }
      });
      this.a(new cgf(this.n, 1, 15, 52) {
         @Override
         public boolean a(cjh $$0) {
            return $$0.a(cjk.qa) || $$0.a(cjk.tp) || $$0.a(cjk.fx);
         }
      });
      this.a(new cgf(this.u, 2, 145, 39) {
         @Override
         public boolean a(cjh $$0) {
            return false;
         }

         @Override
         public void a(cbw $$0, cjh $$1) {
            cet.this.i.get(0).a(1);
            cet.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dL(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cet.this.t != $$2xx) {
                  $$0x.a(null, $$1x, apf.yx, apg.e, 1.0F, 1.0F);
                  cet.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgf($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cgf($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cbw $$0) {
      return a(this.s, $$0, csy.nX);
   }

   @Override
   public void a(bgt $$0) {
      cjh $$1 = this.n.a(0);
      cjh $$2 = this.n.a(1);
      cjh $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cjh $$0, cjh $$1, cjh $$2) {
      this.s.a(($$3, $$4) -> {
         eby $$5 = cjo.a($$0, $$3);
         if ($$5 != null) {
            cjh $$6;
            if ($$1.a(cjk.qa) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cjk.fx) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cjk.tp)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cjh.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cjh $$0, cgf $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cjh a(cbw $$0, int $$1) {
      cjh $$2 = cjh.b;
      cgf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjh $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cjh.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cjk.rf)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cjh.b;
               }
            } else if (!$$4.a(cjk.qa) && !$$4.a(cjk.tp) && !$$4.a(cjk.fx)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cjh.b;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cjh.b;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cjh.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cjh.b;
         }

         if ($$4.b()) {
            $$3.d(cjh.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return cjh.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cbw $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
