public class cmv extends cmp {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cna s;
   long t;
   public final bnt n = new boj(2) {
      @Override
      public void e() {
         cmv.this.a(this);
         super.e();
      }
   };
   private final cof u = new cof() {
      @Override
      public void e() {
         cmv.this.a(this);
         super.e();
      }
   };

   public cmv(int $$0, cjs $$1) {
      this($$0, $$1, cna.a);
   }

   public cmv(int $$0, cjs $$1, final cna $$2) {
      super(cnw.x, $$0);
      this.s = $$2;
      this.a(new cok(this.n, 0, 15, 15) {
         @Override
         public boolean a(crj $$0) {
            return $$0.a(crm.rT);
         }
      });
      this.a(new cok(this.n, 1, 15, 52) {
         @Override
         public boolean a(crj $$0) {
            return $$0.a(crm.qN) || $$0.a(crm.uh) || $$0.a(crm.fS);
         }
      });
      this.a(new cok(this.u, 2, 145, 39) {
         @Override
         public boolean a(crj $$0) {
            return false;
         }

         @Override
         public void a(cjt $$0, crj $$1) {
            cmv.this.i.get(0).a(1);
            cmv.this.i.get(1).a(1);
            $$1.f().b($$1, $$0.dM(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (cmv.this.t != $$2xx) {
                  $$0x.a(null, $$1x, aum.zY, aun.e, 1.0F, 1.0F);
                  cmv.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cok($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cok($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return a(this.s, $$0, dca.nX);
   }

   @Override
   public void a(bnt $$0) {
      crj $$1 = this.n.a(0);
      crj $$2 = this.n.a(1);
      crj $$3 = this.u.a(2);
      if ($$3.d() || !$$1.d() && !$$2.d()) {
         if (!$$1.d() && !$$2.d()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(crj $$0, crj $$1, crj $$2) {
      this.s.a(($$3, $$4) -> {
         emf $$5 = crq.b($$0, $$3);
         if ($$5 != null) {
            crj $$6;
            if ($$1.a(crm.qN) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(jp.u, cuf.b);
               this.d();
            } else if ($$1.a(crm.fS) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(jp.u, cuf.a);
               this.d();
            } else {
               if (!$$1.a(crm.uh)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!crj.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(crj $$0, cok $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 2) {
            $$4.f().b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return crj.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(crm.rT)) {
               if (!this.a($$4, 0, 1, false)) {
                  return crj.i;
               }
            } else if (!$$4.a(crm.qN) && !$$4.a(crm.uh) && !$$4.a(crm.fS)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return crj.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return crj.i;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return crj.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         }

         $$3.b();
         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
