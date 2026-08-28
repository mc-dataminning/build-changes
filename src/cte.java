public class cte extends csw {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final ctj u;
   long v;
   public final bsr p = new btf(2) {
      @Override
      public void e() {
         cte.this.a(this);
         super.e();
      }
   };
   private final cuo w = new cuo() {
      @Override
      public void e() {
         cte.this.a(this);
         super.e();
      }
   };

   public cte(int $$0, cpq $$1) {
      this($$0, $$1, ctj.a);
   }

   public cte(int $$0, cpq $$1, final ctj $$2) {
      super(cuf.x, $$0);
      this.u = $$2;
      this.a(new cut(this.p, 0, 15, 15) {
         @Override
         public boolean a(cxh $$0) {
            return $$0.b(kv.M);
         }
      });
      this.a(new cut(this.p, 1, 15, 52) {
         @Override
         public boolean a(cxh $$0) {
            return $$0.a(cxl.rx) || $$0.a(cxl.vk) || $$0.a(cxl.gk);
         }
      });
      this.a(new cut(this.w, 2, 145, 39) {
         @Override
         public boolean a(cxh $$0) {
            return false;
         }

         @Override
         public void a(cpr $$0, cxh $$1) {
            cte.this.k.get(0).a(1);
            cte.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dU(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cte.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awa.Bs, awb.e, 1.0F, 1.0F);
                  cte.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cpr $$0) {
      return a(this.u, $$0, dkg.oz);
   }

   @Override
   public void a(bsr $$0) {
      cxh $$1 = this.p.a(0);
      cxh $$2 = this.p.a(1);
      cxh $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cxh $$0, cxh $$1, cxh $$2) {
      this.u.a(($$3, $$4) -> {
         evq $$5 = cxu.b($$0, $$3);
         if ($$5 != null) {
            cxh $$6;
            if ($$1.a(cxl.rx) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kv.O, dac.b);
               this.d();
            } else if ($$1.a(cxl.gk) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kv.O, dac.a);
               this.d();
            } else {
               if (!$$1.a(cxl.vk)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cxh.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cxh $$0, cut $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dU(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cxh.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(kv.M)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cxh.k;
               }
            } else if (!$$4.a(cxl.rx) && !$$4.a(cxl.vk) && !$$4.a(cxl.gk)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxh.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxh.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cxh.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxh.k;
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         }

         $$3.c();
         if ($$4.M() == $$2.M()) {
            return cxh.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
