import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cpt extends cov {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bpp s = new cql();
   final bpp t = new bqf(2) {
      @Override
      public void e() {
         super.e();
         cpt.this.a(this);
      }
   };
   private final cpg u;

   public cpt(int $$0, clx $$1) {
      this($$0, $$1, cpg.a);
   }

   public cpt(int $$0, clx $$1, final cpg $$2) {
      super(cqc.p, $$0);
      this.u = $$2;
      this.a(new cqq(this.t, 0, 49, 19) {
         @Override
         public boolean a(ctq $$0) {
            return $$0.l() || czc.c($$0);
         }
      });
      this.a(new cqq(this.t, 1, 49, 40) {
         @Override
         public boolean a(ctq $$0) {
            return $$0.l() || czc.c($$0);
         }
      });
      this.a(new cqq(this.s, 2, 129, 34) {
         @Override
         public boolean a(ctq $$0) {
            return false;
         }

         @Override
         public void a(cly $$0, ctq $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aqn) {
                  bsg.a((aqn)$$0x, eum.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cpt.this.t.a(0, ctq.i);
            cpt.this.t.a(1, ctq.i);
         }

         private int a(daz $$0) {
            int $$1 = 0;
            $$1 += this.g(cpt.this.t.a(0));
            $$1 += this.g(cpt.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(ctq $$0) {
            int $$1 = 0;
            czg $$2 = czc.b($$0);

            for (Entry<ix<czb>> $$3 : $$2.b()) {
               czb $$4 = (czb)((ix)$$3.getKey()).a();
               int $$5 = $$3.getIntValue();
               if (!$$4.b()) {
                  $$1 += $$4.c($$5);
               }
            }

            return $$1;
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
   public void a(bpp $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private ctq a(ctq $$0, ctq $$1) {
      boolean $$2 = !$$0.e() || !$$1.e();
      if (!$$2) {
         return ctq.i;
      } else if ($$0.I() <= 1 && $$1.I() <= 1) {
         boolean $$3 = !$$0.e() && !$$1.e();
         if (!$$3) {
            ctq $$4 = !$$0.e() ? $$0 : $$1;
            return !czc.c($$4) ? ctq.i : this.c($$4.s());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return ctq.i;
      }
   }

   private ctq b(ctq $$0, ctq $$1) {
      if (!$$0.a($$1.g())) {
         return ctq.i;
      } else {
         int $$2 = Math.max($$0.o(), $$1.o());
         int $$3 = $$0.o() - $$0.n();
         int $$4 = $$1.o() - $$1.n();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.l()) {
            if ($$0.j() < 2 || !ctq.a($$0, $$1)) {
               return ctq.i;
            }

            $$6 = 2;
         }

         ctq $$7 = $$0.c($$6);
         if ($$7.l()) {
            $$7.b(kb.c, Integer.valueOf($$2));
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(ctq $$0, ctq $$1) {
      czc.a($$0, $$1x -> {
         czg $$2 = czc.b($$1);

         for (Entry<ix<czb>> $$3 : $$2.b()) {
            czb $$4 = (czb)((ix)$$3.getKey()).a();
            if (!$$4.b() || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private ctq c(ctq $$0) {
      czg $$1 = czc.a($$0, $$0x -> $$0x.a($$0xx -> !((czb)$$0xx.a()).b()));
      if ($$0.a(ctt.uw) && $$1.d()) {
         $$0 = $$0.a(ctt.qP, $$0.I());
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cox.e($$2);
      }

      $$0.b(kb.q, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.u, $$0, dec.nZ);
   }

   @Override
   public ctq a(cly $$0, int $$1) {
      ctq $$2 = ctq.i;
      cqq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         ctq $$4 = $$3.g();
         $$2 = $$4.s();
         ctq $$5 = this.t.a(0);
         ctq $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return ctq.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.e() && !$$6.e()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return ctq.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return ctq.i;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return ctq.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return ctq.i;
         }

         if ($$4.e()) {
            $$3.e(ctq.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return ctq.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
