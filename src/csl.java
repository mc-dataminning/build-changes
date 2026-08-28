public class csl extends csd {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final csq u;
   long v;
   public final bse p = new bss(2) {
      @Override
      public void e() {
         csl.this.a(this);
         super.e();
      }
   };
   private final ctv w = new ctv() {
      @Override
      public void e() {
         csl.this.a(this);
         super.e();
      }
   };

   public csl(int $$0, cox $$1) {
      this($$0, $$1, csq.a);
   }

   public csl(int $$0, cox $$1, final csq $$2) {
      super(ctm.x, $$0);
      this.u = $$2;
      this.a(new cua(this.p, 0, 15, 15) {
         @Override
         public boolean a(cwq $$0) {
            return $$0.b(kv.L);
         }
      });
      this.a(new cua(this.p, 1, 15, 52) {
         @Override
         public boolean a(cwq $$0) {
            return $$0.a(cwu.rv) || $$0.a(cwu.vi) || $$0.a(cwu.gi);
         }
      });
      this.a(new cua(this.w, 2, 145, 39) {
         @Override
         public boolean a(cwq $$0) {
            return false;
         }

         @Override
         public void a(coy $$0, cwq $$1) {
            csl.this.k.get(0).a(1);
            csl.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ad();
               if (csl.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awa.Bi, awb.e, 1.0F, 1.0F);
                  csl.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(coy $$0) {
      return a(this.u, $$0, djp.oz);
   }

   @Override
   public void a(bse $$0) {
      cwq $$1 = this.p.a(0);
      cwq $$2 = this.p.a(1);
      cwq $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cwq $$0, cwq $$1, cwq $$2) {
      this.u.a(($$3, $$4) -> {
         euu $$5 = cxd.b($$0, $$3);
         if ($$5 != null) {
            cwq $$6;
            if ($$1.a(cwu.rv) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kv.N, czn.b);
               this.d();
            } else if ($$1.a(cwu.gi) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kv.N, czn.a);
               this.d();
            } else {
               if (!$$1.a(cwu.vi)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cwq.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cwq $$0, cua $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cwq.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(kv.L)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwq.j;
               }
            } else if (!$$4.a(cwu.rv) && !$$4.a(cwu.vi) && !$$4.a(cwu.gi)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cwq.j;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cwq.j;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cwq.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         }

         $$3.c();
         if ($$4.M() == $$2.M()) {
            return cwq.j;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
