import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cls extends cku {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bme s = new cmk();
   final bme t = new bmu(2) {
      @Override
      public void e() {
         super.e();
         cls.this.a(this);
      }
   };
   private final clf u;

   public cls(int $$0, chz $$1) {
      this($$0, $$1, clf.a);
   }

   public cls(int $$0, chz $$1, final clf $$2) {
      super(cmb.p, $$0);
      this.u = $$2;
      this.a(new cmp(this.t, 0, 49, 19) {
         @Override
         public boolean a(cpq $$0) {
            return $$0.i() || $$0.a(cpt.us) || $$0.F();
         }
      });
      this.a(new cmp(this.t, 1, 49, 40) {
         @Override
         public boolean a(cpq $$0) {
            return $$0.i() || $$0.a(cpt.us) || $$0.F();
         }
      });
      this.a(new cmp(this.s, 2, 129, 34) {
         @Override
         public boolean a(cpq $$0) {
            return false;
         }

         @Override
         public void a(cia $$0, cpq $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof apa) {
                  bon.a((apa)$$0x, eov.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cls.this.t.a(0, cpq.h);
            cls.this.t.a(1, cpq.h);
         }

         private int a(cwe $$0) {
            int $$1 = 0;
            $$1 += this.g(cls.this.t.a(0));
            $$1 += this.g(cls.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cpq $$0) {
            int $$1 = 0;
            Map<ctz, Integer> $$2 = cua.a($$0);

            for (Entry<ctz, Integer> $$3 : $$2.entrySet()) {
               ctz $$4 = $$3.getKey();
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
            this.a(new cmp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cmp($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bme $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      cpq $$0 = this.t.a(0);
      cpq $$1 = this.t.a(1);
      boolean $$2 = !$$0.b() || !$$1.b();
      boolean $$3 = !$$0.b() && !$$1.b();
      if (!$$2) {
         this.s.a(0, cpq.h);
      } else {
         boolean $$4 = !$$0.b() && !$$0.a(cpt.us) && !$$0.F() || !$$1.b() && !$$1.a(cpt.us) && !$$1.F();
         if ($$0.M() > 1 || $$1.M() > 1 || !$$3 && $$4) {
            this.s.a(0, cpq.h);
            this.d();
            return;
         }

         int $$5 = 1;
         int $$10;
         cpq $$11;
         if ($$3) {
            if (!$$0.a($$1.d())) {
               this.s.a(0, cpq.h);
               this.d();
               return;
            }

            cpl $$6 = $$0.d();
            int $$7 = $$6.o() - $$0.l();
            int $$8 = $$6.o() - $$1.l();
            int $$9 = $$7 + $$8 + $$6.o() * 5 / 100;
            $$10 = Math.max($$6.o() - $$9, 0);
            $$11 = this.a($$0, $$1);
            if (!$$11.i()) {
               if (!cpq.a($$0, $$1)) {
                  this.s.a(0, cpq.h);
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

   private cpq a(cpq $$0, cpq $$1) {
      cpq $$2 = $$0.q();
      Map<ctz, Integer> $$3 = cua.a($$1);

      for (Entry<ctz, Integer> $$4 : $$3.entrySet()) {
         ctz $$5 = $$4.getKey();
         if (!$$5.c() || cua.a($$5, $$2) == 0) {
            $$2.a($$5, $$4.getValue());
         }
      }

      return $$2;
   }

   private cpq a(cpq $$0, int $$1, int $$2) {
      cpq $$3 = $$0.c($$2);
      $$3.d("Enchantments");
      $$3.d("StoredEnchantments");
      if ($$1 > 0) {
         $$3.b($$1);
      } else {
         $$3.d("Damage");
      }

      Map<ctz, Integer> $$4 = cua.a($$0).entrySet().stream().filter($$0x -> ((ctz)$$0x.getKey()).c()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
      cua.a($$4, $$3);
      $$3.d(0);
      if ($$3.a(cpt.us) && $$4.size() == 0) {
         $$3 = new cpq(cpt.qO);
         if ($$0.B()) {
            $$3.a($$0.z());
         }
      }

      for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
         $$3.d(ckw.e($$3.J()));
      }

      return $$3;
   }

   @Override
   public void b(cia $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(cia $$0) {
      return a(this.u, $$0, czh.nZ);
   }

   @Override
   public cpq a(cia $$0, int $$1) {
      cpq $$2 = cpq.h;
      cmp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpq $$4 = $$3.g();
         $$2 = $$4.q();
         cpq $$5 = this.t.a(0);
         cpq $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cpq.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.b() && !$$6.b()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cpq.h;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cpq.h;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cpq.h;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cpq.h;
         }

         if ($$4.b()) {
            $$3.e(cpq.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cpq.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
