public class csh extends crz {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final csm u;
   long v;
   public final bsd p = new bsr(2) {
      @Override
      public void e() {
         csh.this.a(this);
         super.e();
      }
   };
   private final ctr w = new ctr() {
      @Override
      public void e() {
         csh.this.a(this);
         super.e();
      }
   };

   public csh(int $$0, cot $$1) {
      this($$0, $$1, csm.a);
   }

   public csh(int $$0, cot $$1, final csm $$2) {
      super(cti.x, $$0);
      this.u = $$2;
      this.a(new ctw(this.p, 0, 15, 15) {
         @Override
         public boolean a(cwm $$0) {
            return $$0.b(ku.L);
         }
      });
      this.a(new ctw(this.p, 1, 15, 52) {
         @Override
         public boolean a(cwm $$0) {
            return $$0.a(cwq.qP) || $$0.a(cwq.uB) || $$0.a(cwq.fT);
         }
      });
      this.a(new ctw(this.w, 2, 145, 39) {
         @Override
         public boolean a(cwm $$0) {
            return false;
         }

         @Override
         public void a(cou $$0, cwm $$1) {
            csh.this.k.get(0).a(1);
            csh.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ab();
               if (csh.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awn.Ay, awo.e, 1.0F, 1.0F);
                  csh.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cou $$0) {
      return a(this.u, $$0, dis.nX);
   }

   @Override
   public void a(bsd $$0) {
      cwm $$1 = this.p.a(0);
      cwm $$2 = this.p.a(1);
      cwm $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cwm $$0, cwm $$1, cwm $$2) {
      this.u.a(($$3, $$4) -> {
         etp $$5 = cwz.b($$0, $$3);
         if ($$5 != null) {
            cwm $$6;
            if ($$1.a(cwq.qP) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, czj.b);
               this.d();
            } else if ($$1.a(cwq.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, czj.a);
               this.d();
            } else {
               if (!$$1.a(cwq.uB)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cwm.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cwm $$0, ctw $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cwm.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(ku.L)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwm.k;
               }
            } else if (!$$4.a(cwq.qP) && !$$4.a(cwq.uB) && !$$4.a(cwq.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cwm.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cwm.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cwm.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
