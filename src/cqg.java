import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cqg extends cph {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bpz s = new cqy();
   final bpz t = new bqp(2) {
      @Override
      public void e() {
         super.e();
         cqg.this.a(this);
      }
   };
   private final cpt u;

   public cqg(int $$0, cmj $$1) {
      this($$0, $$1, cpt.a);
   }

   public cqg(int $$0, cmj $$1, final cpt $$2) {
      super(cqp.p, $$0);
      this.u = $$2;
      this.a(new crd(this.t, 0, 49, 19) {
         @Override
         public boolean a(cuc $$0) {
            return $$0.l() || czn.c($$0);
         }
      });
      this.a(new crd(this.t, 1, 49, 40) {
         @Override
         public boolean a(cuc $$0) {
            return $$0.l() || czn.c($$0);
         }
      });
      this.a(new crd(this.s, 2, 129, 34) {
         @Override
         public boolean a(cuc $$0) {
            return false;
         }

         @Override
         public void a(cmk $$0, cuc $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aqm) {
                  bsr.a((aqm)$$0x, ewf.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cqg.this.t.a(0, cuc.l);
            cqg.this.t.a(1, cuc.l);
         }

         private int a(dcf $$0) {
            int $$1 = 0;
            $$1 += this.g(cqg.this.t.a(0));
            $$1 += this.g(cqg.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cuc $$0) {
            int $$1 = 0;
            czr $$2 = czn.b($$0);

            for (Entry<jj<czl>> $$3 : $$2.b()) {
               jj<czl> $$4 = (jj<czl>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(avz.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
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
   public void a(bpz $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private cuc a(cuc $$0, cuc $$1) {
      boolean $$2 = !$$0.e() || !$$1.e();
      if (!$$2) {
         return cuc.l;
      } else if ($$0.H() <= 1 && $$1.H() <= 1) {
         boolean $$3 = !$$0.e() && !$$1.e();
         if (!$$3) {
            cuc $$4 = !$$0.e() ? $$0 : $$1;
            return !czn.c($$4) ? cuc.l : this.c($$4.s());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cuc.l;
      }
   }

   private cuc b(cuc $$0, cuc $$1) {
      if (!$$0.a($$1.g())) {
         return cuc.l;
      } else {
         int $$2 = Math.max($$0.o(), $$1.o());
         int $$3 = $$0.o() - $$0.n();
         int $$4 = $$1.o() - $$1.n();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.l()) {
            if ($$0.j() < 2 || !cuc.a($$0, $$1)) {
               return cuc.l;
            }

            $$6 = 2;
         }

         cuc $$7 = $$0.c($$6);
         if ($$7.l()) {
            $$7.b(kn.d, Integer.valueOf($$2));
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cuc $$0, cuc $$1) {
      czn.a($$0, $$1x -> {
         czr $$2 = czn.b($$1);

         for (Entry<jj<czl>> $$3 : $$2.b()) {
            jj<czl> $$4 = (jj<czl>)$$3.getKey();
            if (!$$4.a(avz.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cuc c(cuc $$0) {
      czr $$1 = czn.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(avz.o)));
      if ($$0.a(cuf.uw) && $$1.d()) {
         $$0 = $$0.a((dce)cuf.qP);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cpj.e($$2);
      }

      $$0.b(kn.r, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void a(cmk $$0) {
      super.a($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean b(cmk $$0) {
      return a(this.u, $$0, dfj.nZ);
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         cuc $$5 = this.t.a(0);
         cuc $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cuc.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.e() && !$$6.e()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cuc.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cuc.l;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cuc.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.e(cuc.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuc.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
