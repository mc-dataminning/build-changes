public class cpy extends cps {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cqd s;
   long t;
   public final bql n = new brb(2) {
      @Override
      public void e() {
         cpy.this.a(this);
         super.e();
      }
   };
   private final cri u = new cri() {
      @Override
      public void e() {
         cpy.this.a(this);
         super.e();
      }
   };

   public cpy(int $$0, cmu $$1) {
      this($$0, $$1, cqd.a);
   }

   public cpy(int $$0, cmu $$1, final cqd $$2) {
      super(cqz.x, $$0);
      this.s = $$2;
      this.a(new crn(this.n, 0, 15, 15) {
         @Override
         public boolean a(cun $$0) {
            return $$0.a(cuq.rU);
         }
      });
      this.a(new crn(this.n, 1, 15, 52) {
         @Override
         public boolean a(cun $$0) {
            return $$0.a(cuq.qO) || $$0.a(cuq.uj) || $$0.a(cuq.fT);
         }
      });
      this.a(new crn(this.u, 2, 145, 39) {
         @Override
         public boolean a(cun $$0) {
            return false;
         }

         @Override
         public void a(cmv $$0, cun $$1) {
            cpy.this.i.get(0).a(1);
            cpy.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dP(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cpy.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avz.Ar, awa.e, 1.0F, 1.0F);
                  cpy.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crn($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crn($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return a(this.s, $$0, dez.nX);
   }

   @Override
   public void a(bql $$0) {
      cun $$1 = this.n.a(0);
      cun $$2 = this.n.a(1);
      cun $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cun $$0, cun $$1, cun $$2) {
      this.s.a(($$3, $$4) -> {
         epi $$5 = cuv.b($$0, $$3);
         if ($$5 != null) {
            cun $$6;
            if ($$1.a(cuq.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(km.C, cxo.b);
               this.d();
            } else if ($$1.a(cuq.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(km.C, cxo.a);
               this.d();
            } else {
               if (!$$1.a(cuq.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cun.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cun $$0, crn $$1) {
      return $$1.c != this.u && super.a($$0, $$1);
   }

   @Override
   public cun a(cmv $$0, int $$1) {
      cun $$2 = cun.l;
      crn $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cun $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cun.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cuq.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cun.l;
               }
            } else if (!$$4.a(cuq.qO) && !$$4.a(cuq.uj) && !$$4.a(cuq.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cun.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cun.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cun.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cun.l;
         }

         if ($$4.e()) {
            $$3.e(cun.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cun.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cmv $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
