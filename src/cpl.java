public class cpl extends cpe {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cpq s;
   long t;
   public final bpw n = new bqm(2) {
      @Override
      public void e() {
         cpl.this.a(this);
         super.e();
      }
   };
   private final cqv u = new cqv() {
      @Override
      public void e() {
         cpl.this.a(this);
         super.e();
      }
   };

   public cpl(int $$0, cmg $$1) {
      this($$0, $$1, cpq.a);
   }

   public cpl(int $$0, cmg $$1, final cpq $$2) {
      super(cqm.x, $$0);
      this.s = $$2;
      this.a(new cra(this.n, 0, 15, 15) {
         @Override
         public boolean a(cua $$0) {
            return $$0.a(cud.rU);
         }
      });
      this.a(new cra(this.n, 1, 15, 52) {
         @Override
         public boolean a(cua $$0) {
            return $$0.a(cud.qO) || $$0.a(cud.uj) || $$0.a(cud.fT);
         }
      });
      this.a(new cra(this.u, 2, 145, 39) {
         @Override
         public boolean a(cua $$0) {
            return false;
         }

         @Override
         public void a(cmh $$0, cua $$1) {
            cpl.this.i.get(0).a(1);
            cpl.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dP(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cpl.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avf.Au, avg.e, 1.0F, 1.0F);
                  cpl.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cra($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cra($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean b(cmh $$0) {
      return a(this.s, $$0, dfh.nX);
   }

   @Override
   public void a(bpw $$0) {
      cua $$1 = this.n.a(0);
      cua $$2 = this.n.a(1);
      cua $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cua $$0, cua $$1, cua $$2) {
      this.s.a(($$3, $$4) -> {
         epq $$5 = cui.b($$0, $$3);
         if ($$5 != null) {
            cua $$6;
            if ($$1.a(cud.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kn.D, cxa.b);
               this.d();
            } else if ($$1.a(cud.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kn.D, cxa.a);
               this.d();
            } else {
               if (!$$1.a(cud.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cua.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cua $$0, cra $$1) {
      return $$1.c != this.u && super.a($$0, $$1);
   }

   @Override
   public cua b(cmh $$0, int $$1) {
      cua $$2 = cua.l;
      cra $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cua $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cua.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cud.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cua.l;
               }
            } else if (!$$4.a(cud.qO) && !$$4.a(cud.uj) && !$$4.a(cud.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cua.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cua.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cua.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cua.l;
         }

         if ($$4.e()) {
            $$3.e(cua.l);
         }

         $$3.c();
         if ($$4.H() == $$2.H()) {
            return cua.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cmh $$0) {
      super.a($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
