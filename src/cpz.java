public class cpz extends cpt {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cqe s;
   long t;
   public final bqm n = new brc(2) {
      @Override
      public void e() {
         cpz.this.a(this);
         super.e();
      }
   };
   private final crj u = new crj() {
      @Override
      public void e() {
         cpz.this.a(this);
         super.e();
      }
   };

   public cpz(int $$0, cmv $$1) {
      this($$0, $$1, cqe.a);
   }

   public cpz(int $$0, cmv $$1, final cqe $$2) {
      super(cra.x, $$0);
      this.s = $$2;
      this.a(new cro(this.n, 0, 15, 15) {
         @Override
         public boolean a(cuo $$0) {
            return $$0.a(cur.rU);
         }
      });
      this.a(new cro(this.n, 1, 15, 52) {
         @Override
         public boolean a(cuo $$0) {
            return $$0.a(cur.qO) || $$0.a(cur.uj) || $$0.a(cur.fT);
         }
      });
      this.a(new cro(this.u, 2, 145, 39) {
         @Override
         public boolean a(cuo $$0) {
            return false;
         }

         @Override
         public void a(cmw $$0, cuo $$1) {
            cpz.this.i.get(0).a(1);
            cpz.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dP(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cpz.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avz.Ar, awa.e, 1.0F, 1.0F);
                  cpz.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cro($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cro($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cmw $$0) {
      return a(this.s, $$0, dfa.nX);
   }

   @Override
   public void a(bqm $$0) {
      cuo $$1 = this.n.a(0);
      cuo $$2 = this.n.a(1);
      cuo $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cuo $$0, cuo $$1, cuo $$2) {
      this.s.a(($$3, $$4) -> {
         epj $$5 = cuw.b($$0, $$3);
         if ($$5 != null) {
            cuo $$6;
            if ($$1.a(cur.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(km.D, cxp.b);
               this.d();
            } else if ($$1.a(cur.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(km.D, cxp.a);
               this.d();
            } else {
               if (!$$1.a(cur.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cuo.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cuo $$0, cro $$1) {
      return $$1.c != this.u && super.a($$0, $$1);
   }

   @Override
   public cuo a(cmw $$0, int $$1) {
      cuo $$2 = cuo.l;
      cro $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuo $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cuo.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cur.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cuo.l;
               }
            } else if (!$$4.a(cur.qO) && !$$4.a(cur.uj) && !$$4.a(cur.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cuo.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cuo.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cuo.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuo.l;
         }

         if ($$4.e()) {
            $$3.e(cuo.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cuo.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cmw $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
