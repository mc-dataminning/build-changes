public class cpb extends cov {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cpg s;
   long t;
   public final bpp n = new bqf(2) {
      @Override
      public void e() {
         cpb.this.a(this);
         super.e();
      }
   };
   private final cql u = new cql() {
      @Override
      public void e() {
         cpb.this.a(this);
         super.e();
      }
   };

   public cpb(int $$0, clx $$1) {
      this($$0, $$1, cpg.a);
   }

   public cpb(int $$0, clx $$1, final cpg $$2) {
      super(cqc.x, $$0);
      this.s = $$2;
      this.a(new cqq(this.n, 0, 15, 15) {
         @Override
         public boolean a(ctq $$0) {
            return $$0.a(ctt.rU);
         }
      });
      this.a(new cqq(this.n, 1, 15, 52) {
         @Override
         public boolean a(ctq $$0) {
            return $$0.a(ctt.qO) || $$0.a(ctt.uj) || $$0.a(ctt.fT);
         }
      });
      this.a(new cqq(this.u, 2, 145, 39) {
         @Override
         public boolean a(ctq $$0) {
            return false;
         }

         @Override
         public void a(cly $$0, ctq $$1) {
            cpb.this.i.get(0).a(1);
            cpb.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dP(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (cpb.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avi.Ar, avj.e, 1.0F, 1.0F);
                  cpb.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cqq($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cqq($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.s, $$0, dec.nX);
   }

   @Override
   public void a(bpp $$0) {
      ctq $$1 = this.n.a(0);
      ctq $$2 = this.n.a(1);
      ctq $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(ctq $$0, ctq $$1, ctq $$2) {
      this.s.a(($$3, $$4) -> {
         eol $$5 = cty.b($$0, $$3);
         if ($$5 != null) {
            ctq $$6;
            if ($$1.a(ctt.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kb.C, cwr.b);
               this.d();
            } else if ($$1.a(ctt.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kb.C, cwr.a);
               this.d();
            } else {
               if (!$$1.a(ctt.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!ctq.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(ctq $$0, cqq $$1) {
      return $$1.c != this.u && super.a($$0, $$1);
   }

   @Override
   public ctq a(cly $$0, int $$1) {
      ctq $$2 = ctq.i;
      cqq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         ctq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return ctq.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(ctt.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return ctq.i;
               }
            } else if (!$$4.a(ctt.qO) && !$$4.a(ctt.uj) && !$$4.a(ctt.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return ctq.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return ctq.i;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return ctq.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return ctq.i;
         }

         if ($$4.e()) {
            $$3.e(ctq.i);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return ctq.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
