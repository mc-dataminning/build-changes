import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cqt extends cpu {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bqk s = new crl();
   final bqk t = new bra(2) {
      @Override
      public void e() {
         super.e();
         cqt.this.a(this);
      }
   };
   private final cqg u;

   public cqt(int $$0, cmw $$1) {
      this($$0, $$1, cqg.a);
   }

   public cqt(int $$0, cmw $$1, final cqg $$2) {
      super(crc.p, $$0);
      this.u = $$2;
      this.a(new crq(this.t, 0, 49, 19) {
         @Override
         public boolean a(cuq $$0) {
            return $$0.l() || dae.c($$0);
         }
      });
      this.a(new crq(this.t, 1, 49, 40) {
         @Override
         public boolean a(cuq $$0) {
            return $$0.l() || dae.c($$0);
         }
      });
      this.a(new crq(this.s, 2, 129, 34) {
         @Override
         public boolean a(cuq $$0) {
            return false;
         }

         @Override
         public void a(cmx $$0, cuq $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aqu) {
                  btc.a((aqu)$$0x, exa.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cqt.this.t.a(0, cuq.l);
            cqt.this.t.a(1, cuq.l);
         }

         private int a(dcw $$0) {
            int $$1 = 0;
            $$1 += this.g(cqt.this.t.a(0));
            $$1 += this.g(cqt.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cuq $$0) {
            int $$1 = 0;
            dai $$2 = dae.b($$0);

            for (Entry<jm<dac>> $$3 : $$2.b()) {
               jm<dac> $$4 = (jm<dac>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(awh.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
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
   public void a(bqk $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private cuq a(cuq $$0, cuq $$1) {
      boolean $$2 = !$$0.e() || !$$1.e();
      if (!$$2) {
         return cuq.l;
      } else if ($$0.H() <= 1 && $$1.H() <= 1) {
         boolean $$3 = !$$0.e() && !$$1.e();
         if (!$$3) {
            cuq $$4 = !$$0.e() ? $$0 : $$1;
            return !dae.c($$4) ? cuq.l : this.c($$4.s());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cuq.l;
      }
   }

   private cuq b(cuq $$0, cuq $$1) {
      if (!$$0.a($$1.g())) {
         return cuq.l;
      } else {
         int $$2 = Math.max($$0.o(), $$1.o());
         int $$3 = $$0.o() - $$0.n();
         int $$4 = $$1.o() - $$1.n();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.l()) {
            if ($$0.j() < 2 || !cuq.a($$0, $$1)) {
               return cuq.l;
            }

            $$6 = 2;
         }

         cuq $$7 = $$0.c($$6);
         if ($$7.l()) {
            $$7.b(kq.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cuq $$0, cuq $$1) {
      dae.a($$0, $$1x -> {
         dai $$2 = dae.b($$1);

         for (Entry<jm<dac>> $$3 : $$2.b()) {
            jm<dac> $$4 = (jm<dac>)$$3.getKey();
            if (!$$4.a(awh.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cuq c(cuq $$0) {
      dai $$1 = dae.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(awh.o)));
      if ($$0.a(cut.uw) && $$1.d()) {
         $$0 = $$0.a((dcv)cut.qP);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cpw.e($$2);
      }

      $$0.b(kq.r, $$2);
      return $$0;
   }

   @Override
   public void a(cmx $$0) {
      super.a($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean b(cmx $$0) {
      return a(this.u, $$0, dga.nZ);
   }

   @Override
   public cuq b(cmx $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         cuq $$5 = this.t.a(0);
         cuq $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cuq.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.e() && !$$6.e()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cuq.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cuq.l;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cuq.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuq.l;
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuq.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
