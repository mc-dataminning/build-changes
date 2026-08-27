import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cld extends ckf {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final blp s = new clv();
   final blp t = new bmf(2) {
      @Override
      public void e() {
         super.e();
         cld.this.a(this);
      }
   };
   private final ckq u;

   public cld(int $$0, chk $$1) {
      this($$0, $$1, ckq.a);
   }

   public cld(int $$0, chk $$1, final ckq $$2) {
      super(clm.p, $$0);
      this.u = $$2;
      this.a(new cma(this.t, 0, 49, 19) {
         @Override
         public boolean a(cpd $$0) {
            return $$0.i() || $$0.a(cpg.us) || $$0.F();
         }
      });
      this.a(new cma(this.t, 1, 49, 40) {
         @Override
         public boolean a(cpd $$0) {
            return $$0.i() || $$0.a(cpg.us) || $$0.F();
         }
      });
      this.a(new cma(this.s, 2, 129, 34) {
         @Override
         public boolean a(cpd $$0) {
            return false;
         }

         @Override
         public void a(chl $$0, cpd $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aow) {
                  bny.a((aow)$$0x, enz.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cld.this.t.a(0, cpd.h);
            cld.this.t.a(1, cpd.h);
         }

         private int a(cvr $$0) {
            int $$1 = 0;
            $$1 += this.g(cld.this.t.a(0));
            $$1 += this.g(cld.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cpd $$0) {
            int $$1 = 0;
            Map<ctm, Integer> $$2 = ctn.a($$0);

            for (Entry<ctm, Integer> $$3 : $$2.entrySet()) {
               ctm $$4 = $$3.getKey();
               Integer $$5 = $$3.getValue();
               if (!$$4.c()) {
                  $$1 += $$4.a($$5);
               }
            }

            return $$1;
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cma($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cma($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(blp $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      cpd $$0 = this.t.a(0);
      cpd $$1 = this.t.a(1);
      boolean $$2 = !$$0.b() || !$$1.b();
      boolean $$3 = !$$0.b() && !$$1.b();
      if (!$$2) {
         this.s.a(0, cpd.h);
      } else {
         boolean $$4 = !$$0.b() && !$$0.a(cpg.us) && !$$0.F() || !$$1.b() && !$$1.a(cpg.us) && !$$1.F();
         if ($$0.M() > 1 || $$1.M() > 1 || !$$3 && $$4) {
            this.s.a(0, cpd.h);
            this.d();
            return;
         }

         int $$5 = 1;
         int $$10;
         cpd $$11;
         if ($$3) {
            if (!$$0.a($$1.d())) {
               this.s.a(0, cpd.h);
               this.d();
               return;
            }

            coy $$6 = $$0.d();
            int $$7 = $$6.l() - $$0.l();
            int $$8 = $$6.l() - $$1.l();
            int $$9 = $$7 + $$8 + $$6.l() * 5 / 100;
            $$10 = Math.max($$6.l() - $$9, 0);
            $$11 = this.a($$0, $$1);
            if (!$$11.i()) {
               if (!cpd.a($$0, $$1)) {
                  this.s.a(0, cpd.h);
                  this.d();
                  return;
               }

               $$5 = 2;
            }
         } else {
            boolean $$12 = !$$0.b();
            $$10 = $$12 ? $$0.l() : $$1.l();
            $$11 = $$12 ? $$0 : $$1;
         }

         this.s.a(0, this.a($$11, $$10, $$5));
      }

      this.d();
   }

   private cpd a(cpd $$0, cpd $$1) {
      cpd $$2 = $$0.q();
      Map<ctm, Integer> $$3 = ctn.a($$1);

      for (Entry<ctm, Integer> $$4 : $$3.entrySet()) {
         ctm $$5 = $$4.getKey();
         if (!$$5.c() || ctn.a($$5, $$2) == 0) {
            $$2.a($$5, $$4.getValue());
         }
      }

      return $$2;
   }

   private cpd a(cpd $$0, int $$1, int $$2) {
      cpd $$3 = $$0.c($$2);
      $$3.c("Enchantments");
      $$3.c("StoredEnchantments");
      if ($$1 > 0) {
         $$3.b($$1);
      } else {
         $$3.c("Damage");
      }

      Map<ctm, Integer> $$4 = ctn.a($$0).entrySet().stream().filter($$0x -> ((ctm)$$0x.getKey()).c()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
      ctn.a($$4, $$3);
      $$3.d(0);
      if ($$3.a(cpg.us) && $$4.size() == 0) {
         $$3 = new cpd(cpg.qO);
         if ($$0.B()) {
            $$3.a($$0.z());
         }
      }

      for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
         $$3.d(ckh.e($$3.J()));
      }

      return $$3;
   }

   @Override
   public void b(chl $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(chl $$0) {
      return a(this.u, $$0, cyu.nZ);
   }

   @Override
   public cpd a(chl $$0, int $$1) {
      cpd $$2 = cpd.h;
      cma $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpd $$4 = $$3.g();
         $$2 = $$4.q();
         cpd $$5 = this.t.a(0);
         cpd $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cpd.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.b() && !$$6.b()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cpd.h;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cpd.h;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cpd.h;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cpd.h;
         }

         if ($$4.b()) {
            $$3.e(cpd.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cpd.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
