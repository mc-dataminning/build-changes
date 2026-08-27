public class coz extends cot {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cpe s;
   long t;
   public final bpn n = new bqd(2) {
      @Override
      public void e() {
         coz.this.a(this);
         super.e();
      }
   };
   private final cqj u = new cqj() {
      @Override
      public void e() {
         coz.this.a(this);
         super.e();
      }
   };

   public coz(int $$0, clv $$1) {
      this($$0, $$1, cpe.a);
   }

   public coz(int $$0, clv $$1, final cpe $$2) {
      super(cqa.x, $$0);
      this.s = $$2;
      this.a(new cqo(this.n, 0, 15, 15) {
         @Override
         public boolean a(cto $$0) {
            return $$0.a(ctr.rU);
         }
      });
      this.a(new cqo(this.n, 1, 15, 52) {
         @Override
         public boolean a(cto $$0) {
            return $$0.a(ctr.qO) || $$0.a(ctr.uj) || $$0.a(ctr.fT);
         }
      });
      this.a(new cqo(this.u, 2, 145, 39) {
         @Override
         public boolean a(cto $$0) {
            return false;
         }

         @Override
         public void a(clw $$0, cto $$1) {
            coz.this.i.get(0).a(1);
            coz.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dP(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (coz.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avh.Ar, avi.e, 1.0F, 1.0F);
                  coz.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cqo($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cqo($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(clw $$0) {
      return a(this.s, $$0, dea.nX);
   }

   @Override
   public void a(bpn $$0) {
      cto $$1 = this.n.a(0);
      cto $$2 = this.n.a(1);
      cto $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cto $$0, cto $$1, cto $$2) {
      this.s.a(($$3, $$4) -> {
         eoj $$5 = ctw.b($$0, $$3);
         if ($$5 != null) {
            cto $$6;
            if ($$1.a(ctr.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kb.C, cwp.b);
               this.d();
            } else if ($$1.a(ctr.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kb.C, cwp.a);
               this.d();
            } else {
               if (!$$1.a(ctr.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cto.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cto $$0, cqo $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cto a(clw $$0, int $$1) {
      cto $$2 = cto.i;
      cqo $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cto $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cto.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(ctr.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cto.i;
               }
            } else if (!$$4.a(ctr.qO) && !$$4.a(ctr.uj) && !$$4.a(ctr.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cto.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cto.i;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cto.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cto.i;
         }

         if ($$4.e()) {
            $$3.e(cto.i);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cto.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(clw $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
