public class cqc extends cpw {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cqh s;
   long t;
   public final bqp n = new brf(2) {
      @Override
      public void e() {
         cqc.this.a(this);
         super.e();
      }
   };
   private final crm u = new crm() {
      @Override
      public void e() {
         cqc.this.a(this);
         super.e();
      }
   };

   public cqc(int $$0, cmy $$1) {
      this($$0, $$1, cqh.a);
   }

   public cqc(int $$0, cmy $$1, final cqh $$2) {
      super(crd.x, $$0);
      this.s = $$2;
      this.a(new crr(this.n, 0, 15, 15) {
         @Override
         public boolean a(cur $$0) {
            return $$0.a(cuu.rU);
         }
      });
      this.a(new crr(this.n, 1, 15, 52) {
         @Override
         public boolean a(cur $$0) {
            return $$0.a(cuu.qO) || $$0.a(cuu.uj) || $$0.a(cuu.fT);
         }
      });
      this.a(new crr(this.u, 2, 145, 39) {
         @Override
         public boolean a(cur $$0) {
            return false;
         }

         @Override
         public void a(cmz $$0, cur $$1) {
            cqc.this.i.get(0).a(1);
            cqc.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dP(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqc.this.t != $$2xx) {
                  $$0x.a(null, $$1x, awa.Ar, awb.e, 1.0F, 1.0F);
                  cqc.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crr($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crr($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cmz $$0) {
      return a(this.s, $$0, dfd.nX);
   }

   @Override
   public void a(bqp $$0) {
      cur $$1 = this.n.a(0);
      cur $$2 = this.n.a(1);
      cur $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cur $$0, cur $$1, cur $$2) {
      this.s.a(($$3, $$4) -> {
         epm $$5 = cuz.b($$0, $$3);
         if ($$5 != null) {
            cur $$6;
            if ($$1.a(cuu.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(km.D, cxs.b);
               this.d();
            } else if ($$1.a(cuu.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(km.D, cxs.a);
               this.d();
            } else {
               if (!$$1.a(cuu.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cur.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cur $$0, crr $$1) {
      return $$1.c != this.u && super.a($$0, $$1);
   }

   @Override
   public cur a(cmz $$0, int $$1) {
      cur $$2 = cur.l;
      crr $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cur $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cur.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cuu.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cur.l;
               }
            } else if (!$$4.a(cuu.qO) && !$$4.a(cuu.uj) && !$$4.a(cuu.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cur.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cur.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cur.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cur.l;
         }

         if ($$4.e()) {
            $$3.e(cur.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cur.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cmz $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
