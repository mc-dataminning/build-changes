public class cpm extends cpg {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cpr s;
   long t;
   public final bpt n = new bqj(2) {
      @Override
      public void e() {
         cpm.this.a(this);
         super.e();
      }
   };
   private final cqz u = new cqz() {
      @Override
      public void e() {
         cpm.this.a(this);
         super.e();
      }
   };

   public cpm(int $$0, clx $$1) {
      this($$0, $$1, cpr.a);
   }

   public cpm(int $$0, clx $$1, final cpr $$2) {
      super(cqo.y, $$0);
      this.s = $$2;
      this.a(new cre(this.n, 0, 15, 15) {
         @Override
         public boolean a(cuh $$0) {
            return $$0.a(cuk.tr);
         }
      });
      this.a(new cre(this.n, 1, 15, 52) {
         @Override
         public boolean a(cuh $$0) {
            return $$0.a(cuk.sl) || $$0.a(cuk.vU) || $$0.a(cuk.hg);
         }
      });
      this.a(new cre(this.u, 2, 145, 39) {
         @Override
         public boolean a(cuh $$0) {
            return false;
         }

         @Override
         public void a(cly $$0, cuh $$1) {
            cpm.this.i.get(0).a(1);
            cpm.this.i.get(1).a(1);
            $$1.f().b($$1, $$0.dU(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cpm.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avo.AP, avq.e, 1.0F, 1.0F);
                  cpm.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cre($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cre($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.s, $$0, dfe.oV);
   }

   @Override
   public void a(bpt $$0) {
      cuh $$1 = this.n.a(0);
      cuh $$2 = this.n.a(1);
      cuh $$3 = this.u.a(2);
      if ($$3.d() || !$$1.d() && !$$2.d()) {
         if (!$$1.d() && !$$2.d()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cuh $$0, cuh $$1, cuh $$2) {
      this.s.a(($$3, $$4) -> {
         eqt $$5 = cuq.b($$0, $$3);
         if ($$5 != null) {
            cuh $$6;
            if ($$1.a(cuk.sl) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(ke.B, cxr.b);
               this.d();
            } else if ($$1.a(cuk.hg) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(ke.B, cxr.a);
               this.d();
            } else {
               if (!$$1.a(cuk.vU)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cuh.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cuh $$0, cre $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 2) {
            $$4.f().b($$4, $$0.dU(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cuh.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cuk.tr)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cuh.i;
               }
            } else if (!$$4.a(cuk.sl) && !$$4.a(cuk.vU) && !$$4.a(cuk.hg)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cuh.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cuh.i;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cuh.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuh.i;
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         }

         $$3.b();
         if ($$4.G() == $$2.G()) {
            return cuh.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
