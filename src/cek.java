public class cek extends cee {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cep s;
   long t;
   public final bgj n = new bgx(2) {
      @Override
      public void e() {
         cek.this.a(this);
         super.e();
      }
   };
   private final cfr u = new cfr() {
      @Override
      public void e() {
         cek.this.a(this);
         super.e();
      }
   };

   public cek(int $$0, cbm $$1) {
      this($$0, $$1, cep.a);
   }

   public cek(int $$0, cbm $$1, final cep $$2) {
      super(cfj.w, $$0);
      this.s = $$2;
      this.a(new cfw(this.n, 0, 15, 15) {
         @Override
         public boolean a(ciy $$0) {
            return $$0.a(cjb.rf);
         }
      });
      this.a(new cfw(this.n, 1, 15, 52) {
         @Override
         public boolean a(ciy $$0) {
            return $$0.a(cjb.qa) || $$0.a(cjb.tp) || $$0.a(cjb.fx);
         }
      });
      this.a(new cfw(this.u, 2, 145, 39) {
         @Override
         public boolean a(ciy $$0) {
            return false;
         }

         @Override
         public void a(cbn $$0, ciy $$1) {
            cek.this.i.get(0).a(1);
            cek.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dK(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cek.this.t != $$2xx) {
                  $$0x.a(null, $$1x, aow.ys, aox.e, 1.0F, 1.0F);
                  cek.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfw($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cfw($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cbn $$0) {
      return a(this.s, $$0, csn.nX);
   }

   @Override
   public void a(bgj $$0) {
      ciy $$1 = this.n.a(0);
      ciy $$2 = this.n.a(1);
      ciy $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(ciy $$0, ciy $$1, ciy $$2) {
      this.s.a(($$3, $$4) -> {
         ebn $$5 = cjf.a($$0, $$3);
         if ($$5 != null) {
            ciy $$6;
            if ($$1.a(cjb.qa) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cjb.fx) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cjb.tp)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!ciy.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(ciy $$0, cfw $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public ciy a(cbn $$0, int $$1) {
      ciy $$2 = ciy.b;
      cfw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciy $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dK(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return ciy.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cjb.rf)) {
               if (!this.a($$4, 0, 1, false)) {
                  return ciy.b;
               }
            } else if (!$$4.a(cjb.qa) && !$$4.a(cjb.tp) && !$$4.a(cjb.fx)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return ciy.b;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return ciy.b;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return ciy.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return ciy.b;
         }

         if ($$4.b()) {
            $$3.d(ciy.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return ciy.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cbn $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
