public class ctb extends cst {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final ctg u;
   long v;
   public final bst p = new bth(2) {
      @Override
      public void e() {
         ctb.this.a(this);
         super.e();
      }
   };
   private final cul w = new cul() {
      @Override
      public void e() {
         ctb.this.a(this);
         super.e();
      }
   };

   public ctb(int $$0, cpn $$1) {
      this($$0, $$1, ctg.a);
   }

   public ctb(int $$0, cpn $$1, final ctg $$2) {
      super(cuc.x, $$0);
      this.u = $$2;
      this.a(new cuq(this.p, 0, 15, 15) {
         @Override
         public boolean a(cxg $$0) {
            return $$0.b(ku.L);
         }
      });
      this.a(new cuq(this.p, 1, 15, 52) {
         @Override
         public boolean a(cxg $$0) {
            return $$0.a(cxk.rv) || $$0.a(cxk.vi) || $$0.a(cxk.gi);
         }
      });
      this.a(new cuq(this.w, 2, 145, 39) {
         @Override
         public boolean a(cxg $$0) {
            return false;
         }

         @Override
         public void a(cpo $$0, cxg $$1) {
            ctb.this.k.get(0).a(1);
            ctb.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dW(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ad();
               if (ctb.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awv.Bj, aww.e, 1.0F, 1.0F);
                  ctb.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cpo $$0) {
      return a(this.u, $$0, dkf.oz);
   }

   @Override
   public void a(bst $$0) {
      cxg $$1 = this.p.a(0);
      cxg $$2 = this.p.a(1);
      cxg $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cxg $$0, cxg $$1, cxg $$2) {
      this.u.a(($$3, $$4) -> {
         evk $$5 = cxt.b($$0, $$3);
         if ($$5 != null) {
            cxg $$6;
            if ($$1.a(cxk.rv) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, dad.b);
               this.d();
            } else if ($$1.a(cxk.gi) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, dad.a);
               this.d();
            } else {
               if (!$$1.a(cxk.vi)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cxg.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cxg $$0, cuq $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dW(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(ku.L)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cxg.j;
               }
            } else if (!$$4.a(cxk.rv) && !$$4.a(cxk.vi) && !$$4.a(cxk.gi)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxg.j;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxg.j;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cxg.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         }

         $$3.c();
         if ($$4.M() == $$2.M()) {
            return cxg.j;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
