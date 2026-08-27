import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cez extends ced {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bgj s = new cfq();
   final bgj t = new bgx(2) {
      @Override
      public void e() {
         super.e();
         cez.this.a(this);
      }
   };
   private final ceo u;

   public cez(int $$0, cbl $$1) {
      this($$0, $$1, ceo.a);
   }

   public cez(int $$0, cbl $$1, final ceo $$2) {
      super(cfi.o, $$0);
      this.u = $$2;
      this.a(new cfv(this.t, 0, 49, 19) {
         @Override
         public boolean a(cix $$0) {
            return $$0.i() || $$0.a(cja.tC) || $$0.E();
         }
      });
      this.a(new cfv(this.t, 1, 49, 40) {
         @Override
         public boolean a(cix $$0) {
            return $$0.i() || $$0.a(cja.tC) || $$0.E();
         }
      });
      this.a(new cfv(this.s, 2, 129, 34) {
         @Override
         public boolean a(cix $$0) {
            return false;
         }

         @Override
         public void a(cbm $$0, cix $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof akk) {
                  bio.a((akk)$$0x, ehd.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cez.this.t.a(0, cix.b);
            cez.this.t.a(1, cix.b);
         }

         private int a(cpl $$0) {
            int $$1 = 0;
            $$1 += this.g(cez.this.t.a(0));
            $$1 += this.g(cez.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cix $$0) {
            int $$1 = 0;
            Map<cne, Integer> $$2 = cng.a($$0);

            for (Entry<cne, Integer> $$3 : $$2.entrySet()) {
               cne $$4 = $$3.getKey();
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
            this.a(new cfv($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cfv($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bgj $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      cix $$0 = this.t.a(0);
      cix $$1 = this.t.a(1);
      boolean $$2 = !$$0.b() || !$$1.b();
      boolean $$3 = !$$0.b() && !$$1.b();
      if (!$$2) {
         this.s.a(0, cix.b);
      } else {
         boolean $$4 = !$$0.b() && !$$0.a(cja.tC) && !$$0.E() || !$$1.b() && !$$1.a(cja.tC) && !$$1.E();
         if ($$0.L() > 1 || $$1.L() > 1 || !$$3 && $$4) {
            this.s.a(0, cix.b);
            this.d();
            return;
         }

         int $$5 = 1;
         int $$10;
         cix $$11;
         if ($$3) {
            if (!$$0.a($$1.d())) {
               this.s.a(0, cix.b);
               this.d();
               return;
            }

            cis $$6 = $$0.d();
            int $$7 = $$6.n() - $$0.k();
            int $$8 = $$6.n() - $$1.k();
            int $$9 = $$7 + $$8 + $$6.n() * 5 / 100;
            $$10 = Math.max($$6.n() - $$9, 0);
            $$11 = this.a($$0, $$1);
            if (!$$11.i()) {
               if (!cix.a($$0, $$1)) {
                  this.s.a(0, cix.b);
                  this.d();
                  return;
               }

               $$5 = 2;
            }
         } else {
            boolean $$12 = !$$0.b();
            $$10 = $$12 ? $$0.k() : $$1.k();
            $$11 = $$12 ? $$0 : $$1;
         }

         this.s.a(0, this.a($$11, $$10, $$5));
      }

      this.d();
   }

   private cix a(cix $$0, cix $$1) {
      cix $$2 = $$0.p();
      Map<cne, Integer> $$3 = cng.a($$1);

      for (Entry<cne, Integer> $$4 : $$3.entrySet()) {
         cne $$5 = $$4.getKey();
         if (!$$5.c() || cng.a($$5, $$2) == 0) {
            $$2.a($$5, $$4.getValue());
         }
      }

      return $$2;
   }

   private cix a(cix $$0, int $$1, int $$2) {
      cix $$3 = $$0.c($$2);
      $$3.c("Enchantments");
      $$3.c("StoredEnchantments");
      if ($$1 > 0) {
         $$3.b($$1);
      } else {
         $$3.c("Damage");
      }

      Map<cne, Integer> $$4 = cng.a($$0).entrySet().stream().filter($$0x -> ((cne)$$0x.getKey()).c()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
      cng.a($$4, $$3);
      $$3.d(0);
      if ($$3.a(cja.tC) && $$4.size() == 0) {
         $$3 = new cix(cja.qb);
         if ($$0.A()) {
            $$3.a($$0.y());
         }
      }

      for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
         $$3.d(cef.e($$3.I()));
      }

      return $$3;
   }

   @Override
   public void b(cbm $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(cbm $$0) {
      return a(this.u, $$0, csm.nZ);
   }

   @Override
   public cix a(cbm $$0, int $$1) {
      cix $$2 = cix.b;
      cfv $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cix $$4 = $$3.e();
         $$2 = $$4.p();
         cix $$5 = this.t.a(0);
         cix $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cix.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.b() && !$$6.b()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cix.b;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cix.b;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cix.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cix.b;
         }

         if ($$4.b()) {
            $$3.d(cix.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cix.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
