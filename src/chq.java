public class chq extends chk {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final chv s;
   long t;
   public final bje n = new bjt(2) {
      @Override
      public void e() {
         chq.this.a(this);
         super.e();
      }
   };
   private final cja u = new cja() {
      @Override
      public void e() {
         chq.this.a(this);
         super.e();
      }
   };

   public chq(int $$0, ceq $$1) {
      this($$0, $$1, chv.a);
   }

   public chq(int $$0, ceq $$1, final chv $$2) {
      super(cir.x, $$0);
      this.s = $$2;
      this.a(new cjf(this.n, 0, 15, 15) {
         @Override
         public boolean a(cmh $$0) {
            return $$0.a(cmk.rR);
         }
      });
      this.a(new cjf(this.n, 1, 15, 52) {
         @Override
         public boolean a(cmh $$0) {
            return $$0.a(cmk.qL) || $$0.a(cmk.uc) || $$0.a(cmk.fS);
         }
      });
      this.a(new cjf(this.u, 2, 145, 39) {
         @Override
         public boolean a(cmh $$0) {
            return false;
         }

         @Override
         public void a(cer $$0, cmh $$1) {
            chq.this.i.get(0).a(1);
            chq.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dM(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.W();
               if (chq.this.t != $$2xx) {
                  $$0x.a(null, $$1x, arc.zx, ard.e, 1.0F, 1.0F);
                  chq.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjf($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjf($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cer $$0) {
      return a(this.s, $$0, cwb.nX);
   }

   @Override
   public void a(bje $$0) {
      cmh $$1 = this.n.a(0);
      cmh $$2 = this.n.a(1);
      cmh $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cmh $$0, cmh $$1, cmh $$2) {
      this.s.a(($$3, $$4) -> {
         efj $$5 = cmo.b($$0, $$3);
         if ($$5 != null) {
            cmh $$6;
            if ($$1.a(cmk.qL) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(cmk.fS) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(cmk.uc)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cmh.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cmh $$0, cjf $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cmh a(cer $$0, int $$1) {
      cmh $$2 = cmh.f;
      cjf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmh $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cmh.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cmk.rR)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cmh.f;
               }
            } else if (!$$4.a(cmk.qL) && !$$4.a(cmk.uc) && !$$4.a(cmk.fS)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cmh.f;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cmh.f;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cmh.f;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cmh.f;
         }

         if ($$4.b()) {
            $$3.e(cmh.f);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return cmh.f;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cer $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
