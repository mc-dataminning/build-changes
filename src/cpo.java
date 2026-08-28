public class cpo extends cph {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cpt s;
   long t;
   public final bpz n = new bqp(2) {
      @Override
      public void e() {
         cpo.this.a(this);
         super.e();
      }
   };
   private final cqy u = new cqy() {
      @Override
      public void e() {
         cpo.this.a(this);
         super.e();
      }
   };

   public cpo(int $$0, cmj $$1) {
      this($$0, $$1, cpt.a);
   }

   public cpo(int $$0, cmj $$1, final cpt $$2) {
      super(cqp.x, $$0);
      this.s = $$2;
      this.a(new crd(this.n, 0, 15, 15) {
         @Override
         public boolean a(cuc $$0) {
            return $$0.a(cuf.rU);
         }
      });
      this.a(new crd(this.n, 1, 15, 52) {
         @Override
         public boolean a(cuc $$0) {
            return $$0.a(cuf.qO) || $$0.a(cuf.uj) || $$0.a(cuf.fT);
         }
      });
      this.a(new crd(this.u, 2, 145, 39) {
         @Override
         public boolean a(cuc $$0) {
            return false;
         }

         @Override
         public void a(cmk $$0, cuc $$1) {
            cpo.this.i.get(0).a(1);
            cpo.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dQ(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cpo.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avh.Au, avi.e, 1.0F, 1.0F);
                  cpo.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crd($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean b(cmk $$0) {
      return a(this.s, $$0, dfj.nX);
   }

   @Override
   public void a(bpz $$0) {
      cuc $$1 = this.n.a(0);
      cuc $$2 = this.n.a(1);
      cuc $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cuc $$0, cuc $$1, cuc $$2) {
      this.s.a(($$3, $$4) -> {
         epw $$5 = cuk.b($$0, $$3);
         if ($$5 != null) {
            cuc $$6;
            if ($$1.a(cuf.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kn.D, cxc.b);
               this.d();
            } else if ($$1.a(cuf.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kn.D, cxc.a);
               this.d();
            } else {
               if (!$$1.a(cuf.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cuc.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cuc $$0, crd $$1) {
      return $$1.c != this.u && super.a($$0, $$1);
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dQ(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cuc.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cuf.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cuc.l;
               }
            } else if (!$$4.a(cuf.qO) && !$$4.a(cuf.uj) && !$$4.a(cuf.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cuc.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cuc.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cuc.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.e(cuc.l);
         }

         $$3.c();
         if ($$4.H() == $$2.H()) {
            return cuc.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cmk $$0) {
      super.a($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
