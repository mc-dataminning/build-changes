import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cmm extends clo {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bmv s = new cne();
   final bmv t = new bnl(2) {
      @Override
      public void e() {
         super.e();
         cmm.this.a(this);
      }
   };
   private final clz u;

   public cmm(int $$0, cir $$1) {
      this($$0, $$1, clz.a);
   }

   public cmm(int $$0, cir $$1, final clz $$2) {
      super(cmv.p, $$0);
      this.u = $$2;
      this.a(new cnj(this.t, 0, 49, 19) {
         @Override
         public boolean a(cqk $$0) {
            return $$0.i() || $$0.a(cqn.ut) || $$0.F();
         }
      });
      this.a(new cnj(this.t, 1, 49, 40) {
         @Override
         public boolean a(cqk $$0) {
            return $$0.i() || $$0.a(cqn.ut) || $$0.F();
         }
      });
      this.a(new cnj(this.s, 2, 129, 34) {
         @Override
         public boolean a(cqk $$0) {
            return false;
         }

         @Override
         public void a(cis $$0, cqk $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof apf) {
                  bpe.a((apf)$$0x, epr.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cmm.this.t.a(0, cqk.h);
            cmm.this.t.a(1, cqk.h);
         }

         private int a(cwz $$0) {
            int $$1 = 0;
            $$1 += this.g(cmm.this.t.a(0));
            $$1 += this.g(cmm.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cqk $$0) {
            int $$1 = 0;
            Map<cuu, Integer> $$2 = cuv.a($$0);

            for (Entry<cuu, Integer> $$3 : $$2.entrySet()) {
               cuu $$4 = $$3.getKey();
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
            this.a(new cnj($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cnj($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bmv $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      cqk $$0 = this.t.a(0);
      cqk $$1 = this.t.a(1);
      boolean $$2 = !$$0.b() || !$$1.b();
      boolean $$3 = !$$0.b() && !$$1.b();
      if (!$$2) {
         this.s.a(0, cqk.h);
      } else {
         boolean $$4 = !$$0.b() && !$$0.a(cqn.ut) && !$$0.F() || !$$1.b() && !$$1.a(cqn.ut) && !$$1.F();
         if ($$0.M() > 1 || $$1.M() > 1 || !$$3 && $$4) {
            this.s.a(0, cqk.h);
            this.d();
            return;
         }

         int $$5 = 1;
         int $$10;
         cqk $$11;
         if ($$3) {
            if (!$$0.a($$1.d())) {
               this.s.a(0, cqk.h);
               this.d();
               return;
            }

            cqf $$6 = $$0.d();
            int $$7 = $$6.o() - $$0.l();
            int $$8 = $$6.o() - $$1.l();
            int $$9 = $$7 + $$8 + $$6.o() * 5 / 100;
            $$10 = Math.max($$6.o() - $$9, 0);
            $$11 = this.a($$0, $$1);
            if (!$$11.i()) {
               if (!cqk.a($$0, $$1)) {
                  this.s.a(0, cqk.h);
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

   private cqk a(cqk $$0, cqk $$1) {
      cqk $$2 = $$0.q();
      Map<cuu, Integer> $$3 = cuv.a($$1);

      for (Entry<cuu, Integer> $$4 : $$3.entrySet()) {
         cuu $$5 = $$4.getKey();
         if (!$$5.c() || cuv.a($$5, $$2) == 0) {
            $$2.a($$5, $$4.getValue());
         }
      }

      return $$2;
   }

   private cqk a(cqk $$0, int $$1, int $$2) {
      cqk $$3 = $$0.c($$2);
      $$3.d("Enchantments");
      $$3.d("StoredEnchantments");
      if ($$1 > 0) {
         $$3.b($$1);
      } else {
         $$3.d("Damage");
      }

      Map<cuu, Integer> $$4 = cuv.a($$0).entrySet().stream().filter($$0x -> ((cuu)$$0x.getKey()).c()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
      cuv.a($$4, $$3);
      $$3.d(0);
      if ($$3.a(cqn.ut) && $$4.size() == 0) {
         $$3 = new cqk(cqn.qO);
         if ($$0.B()) {
            $$3.a($$0.z());
         }
      }

      for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
         $$3.d(clq.e($$3.J()));
      }

      return $$3;
   }

   @Override
   public void b(cis $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(cis $$0) {
      return a(this.u, $$0, dac.nZ);
   }

   @Override
   public cqk a(cis $$0, int $$1) {
      cqk $$2 = cqk.h;
      cnj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqk $$4 = $$3.g();
         $$2 = $$4.q();
         cqk $$5 = this.t.a(0);
         cqk $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cqk.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.b() && !$$6.b()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cqk.h;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cqk.h;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cqk.h;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cqk.h;
         }

         if ($$4.b()) {
            $$3.e(cqk.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqk.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
