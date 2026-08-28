public class cwj extends cwb {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final cwo u;
   long v;
   public final buv p = new bvj(2) {
      @Override
      public void e() {
         cwj.this.a(this);
         super.e();
      }
   };
   private final cxu w = new cxu() {
      @Override
      public void e() {
         cwj.this.a(this);
         super.e();
      }
   };

   public cwj(int $$0, csh $$1) {
      this($$0, $$1, cwo.a);
   }

   public cwj(int $$0, csh $$1, final cwo $$2) {
      super(cxk.x, $$0);
      this.u = $$2;
      this.a(new cxz(this.p, 0, 15, 15) {
         @Override
         public boolean a(dak $$0) {
            return $$0.c(kl.M);
         }
      });
      this.a(new cxz(this.p, 1, 15, 52) {
         @Override
         public boolean a(dak $$0) {
            return $$0.a(dao.rE) || $$0.a(dao.vt) || $$0.a(dao.gp);
         }
      });
      this.a(new cxz(this.w, 2, 145, 39) {
         @Override
         public boolean a(dak $$0) {
            return false;
         }

         @Override
         public void a(csi $$0, dak $$1) {
            cwj.this.k.get(0).a(1);
            cwj.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cwj.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awy.By, awz.e, 1.0F, 1.0F);
                  cwj.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(csi $$0) {
      return a(this.u, $$0, dnq.oD);
   }

   @Override
   public void a(buv $$0) {
      dak $$1 = this.p.a(0);
      dak $$2 = this.p.a(1);
      dak $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(dak $$0, dak $$1, dak $$2) {
      this.u.a(($$3, $$4) -> {
         ezv $$5 = dax.b($$0, $$3);
         if ($$5 != null) {
            dak $$6;
            if ($$1.a(dao.rE) && !$$5.i && $$5.g < 4) {
               $$6 = $$0.c(1);
               $$6.b(kl.O, ddh.b);
               this.d();
            } else if ($$1.a(dao.gp) && !$$5.i) {
               $$6 = $$0.c(1);
               $$6.b(kl.O, ddh.a);
               this.d();
            } else {
               if (!$$1.a(dao.vt)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!dak.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(dak $$0, cxz $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return dak.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.c(kl.M)) {
               if (!this.a($$4, 0, 1, false)) {
                  return dak.l;
               }
            } else if (!$$4.a(dao.rE) && !$$4.a(dao.vt) && !$$4.a(dao.gp)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return dak.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return dak.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return dak.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return dak.l;
         }

         if ($$4.f()) {
            $$3.e(dak.l);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return dak.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(csi $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
