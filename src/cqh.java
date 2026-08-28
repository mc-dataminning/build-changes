import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cqh extends cpi {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bqa s = new cqz();
   final bqa t = new bqq(2) {
      @Override
      public void e() {
         super.e();
         cqh.this.a(this);
      }
   };
   private final cpu u;

   public cqh(int $$0, cmk $$1) {
      this($$0, $$1, cpu.a);
   }

   public cqh(int $$0, cmk $$1, final cpu $$2) {
      super(cqq.p, $$0);
      this.u = $$2;
      this.a(new cre(this.t, 0, 49, 19) {
         @Override
         public boolean a(cud $$0) {
            return $$0.l() || czo.c($$0);
         }
      });
      this.a(new cre(this.t, 1, 49, 40) {
         @Override
         public boolean a(cud $$0) {
            return $$0.l() || czo.c($$0);
         }
      });
      this.a(new cre(this.s, 2, 129, 34) {
         @Override
         public boolean a(cud $$0) {
            return false;
         }

         @Override
         public void a(cml $$0, cud $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aqm) {
                  bss.a((aqm)$$0x, ewh.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cqh.this.t.a(0, cud.l);
            cqh.this.t.a(1, cud.l);
         }

         private int a(dcg $$0) {
            int $$1 = 0;
            $$1 += this.g(cqh.this.t.a(0));
            $$1 += this.g(cqh.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cud $$0) {
            int $$1 = 0;
            czs $$2 = czo.b($$0);

            for (Entry<jj<czm>> $$3 : $$2.b()) {
               jj<czm> $$4 = (jj<czm>)$$3.getKey();
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
            this.a(new cre($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cre($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bqa $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private cud a(cud $$0, cud $$1) {
      boolean $$2 = !$$0.e() || !$$1.e();
      if (!$$2) {
         return cud.l;
      } else if ($$0.H() <= 1 && $$1.H() <= 1) {
         boolean $$3 = !$$0.e() && !$$1.e();
         if (!$$3) {
            cud $$4 = !$$0.e() ? $$0 : $$1;
            return !czo.c($$4) ? cud.l : this.c($$4.s());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cud.l;
      }
   }

   private cud b(cud $$0, cud $$1) {
      if (!$$0.a($$1.g())) {
         return cud.l;
      } else {
         int $$2 = Math.max($$0.o(), $$1.o());
         int $$3 = $$0.o() - $$0.n();
         int $$4 = $$1.o() - $$1.n();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.l()) {
            if ($$0.j() < 2 || !cud.a($$0, $$1)) {
               return cud.l;
            }

            $$6 = 2;
         }

         cud $$7 = $$0.c($$6);
         if ($$7.l()) {
            $$7.b(kn.d, Integer.valueOf($$2));
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cud $$0, cud $$1) {
      czo.a($$0, $$1x -> {
         czs $$2 = czo.b($$1);

         for (Entry<jj<czm>> $$3 : $$2.b()) {
            jj<czm> $$4 = (jj<czm>)$$3.getKey();
            if (!$$4.a(avz.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cud c(cud $$0) {
      czs $$1 = czo.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(avz.o)));
      if ($$0.a(cug.uw) && $$1.d()) {
         $$0 = $$0.a((dcf)cug.qP);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cpk.e($$2);
      }

      $$0.b(kn.r, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void a(cml $$0) {
      super.a($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean b(cml $$0) {
      return a(this.u, $$0, dfk.nZ);
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         cud $$5 = this.t.a(0);
         cud $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cud.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.e() && !$$6.e()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cud.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cud.l;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cud.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cud.l;
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cud.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
