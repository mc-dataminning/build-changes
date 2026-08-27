public class cgs extends cgm {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cgx s;
   long t;
   public final biq n = new bje(2) {
      @Override
      public void e() {
         cgs.this.a(this);
         super.e();
      }
   };
   private final cic u = new cic() {
      @Override
      public void e() {
         cgs.this.a(this);
         super.e();
      }
   };

   public cgs(int $$0, cdt $$1) {
      this($$0, $$1, cgx.a);
   }

   public cgs(int $$0, cdt $$1, final cgx $$2) {
      super(cht.x, $$0);
      this.s = $$2;
      this.a(new cih(this.n, 0, 15, 15) {
         @Override
         public boolean a(clj $$0) {
            return $$0.a(clm.rR);
         }
      });
      this.a(new cih(this.n, 1, 15, 52) {
         @Override
         public boolean a(clj $$0) {
            return $$0.a(clm.qL) || $$0.a(clm.ub) || $$0.a(clm.fS);
         }
      });
      this.a(new cih(this.u, 2, 145, 39) {
         @Override
         public boolean a(clj $$0) {
            return false;
         }

         @Override
         public void a(cdu $$0, clj $$1) {
            cgs.this.i.get(0).a(1);
            cgs.this.i.get(1).a(1);
            $$1.d().b($$1, $$0.dN(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.W();
               if (cgs.this.t != $$2xx) {
                  $$0x.a(null, $$1x, aqr.zc, aqs.e, 1.0F, 1.0F);
                  cgs.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cih($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cih($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cdu $$0) {
      return a(this.s, $$0, cvc.nX);
   }

   @Override
   public void a(biq $$0) {
      clj $$1 = this.n.a(0);
      clj $$2 = this.n.a(1);
      clj $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(clj $$0, clj $$1, clj $$2) {
      this.s.a(($$3, $$4) -> {
         eec $$5 = clq.b($$0, $$3);
         if ($$5 != null) {
            clj $$6;
            if ($$1.a(clm.qL) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.w().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(clm.fS) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.w().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(clm.ub)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!clj.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(clj $$0, cih $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public clj a(cdu $$0, int $$1) {
      clj $$2 = clj.b;
      cih $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clj $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 == 2) {
            $$4.d().b($$4, $$0.dN(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return clj.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(clm.rR)) {
               if (!this.a($$4, 0, 1, false)) {
                  return clj.b;
               }
            } else if (!$$4.a(clm.qL) && !$$4.a(clm.ub) && !$$4.a(clm.fS)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return clj.b;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return clj.b;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return clj.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return clj.b;
         }

         if ($$4.b()) {
            $$3.e(clj.b);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return clj.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cdu $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
