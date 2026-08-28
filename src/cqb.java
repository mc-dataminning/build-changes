public class cqb extends cpu {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cqg s;
   long t;
   public final bqk n = new bra(2) {
      @Override
      public void e() {
         cqb.this.a(this);
         super.e();
      }
   };
   private final crl u = new crl() {
      @Override
      public void e() {
         cqb.this.a(this);
         super.e();
      }
   };

   public cqb(int $$0, cmw $$1) {
      this($$0, $$1, cqg.a);
   }

   public cqb(int $$0, cmw $$1, final cqg $$2) {
      super(crc.x, $$0);
      this.s = $$2;
      this.a(new crq(this.n, 0, 15, 15) {
         @Override
         public boolean a(cuq $$0) {
            return $$0.a(cut.rU);
         }
      });
      this.a(new crq(this.n, 1, 15, 52) {
         @Override
         public boolean a(cuq $$0) {
            return $$0.a(cut.qO) || $$0.a(cut.uj) || $$0.a(cut.fT);
         }
      });
      this.a(new crq(this.u, 2, 145, 39) {
         @Override
         public boolean a(cuq $$0) {
            return false;
         }

         @Override
         public void a(cmx $$0, cuq $$1) {
            cqb.this.i.get(0).a(1);
            cqb.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dO(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqb.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avp.Au, avq.e, 1.0F, 1.0F);
                  cqb.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crq($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crq($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean b(cmx $$0) {
      return a(this.s, $$0, dga.nX);
   }

   @Override
   public void a(bqk $$0) {
      cuq $$1 = this.n.a(0);
      cuq $$2 = this.n.a(1);
      cuq $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cuq $$0, cuq $$1, cuq $$2) {
      this.s.a(($$3, $$4) -> {
         eqt $$5 = cvc.b($$0, $$3);
         if ($$5 != null) {
            cuq $$6;
            if ($$1.a(cut.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kq.D, cxt.b);
               this.d();
            } else if ($$1.a(cut.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kq.D, cxt.a);
               this.d();
            } else {
               if (!$$1.a(cut.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cuq.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cuq $$0, crq $$1) {
      return $$1.c != this.u && super.a($$0, $$1);
   }

   @Override
   public cuq b(cmx $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dO(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cuq.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cut.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cuq.l;
               }
            } else if (!$$4.a(cut.qO) && !$$4.a(cut.uj) && !$$4.a(cut.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cuq.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cuq.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cuq.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuq.l;
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         }

         $$3.c();
         if ($$4.H() == $$2.H()) {
            return cuq.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cmx $$0) {
      super.a($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
