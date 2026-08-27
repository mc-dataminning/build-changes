import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dkt {
   a {
      @Override
      public void a(ame $$0, dku $$1, List<bzg> $$2, int $$3, ht $$4) {
         ht $$5 = new ht(0, 128, 0);

         for (bzg $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(ame $$0, dku $$1, List<bzg> $$2, int $$3, ht $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new ht(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(ame $$0, dku $$1, List<bzg> $$2, int $$3, ht $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<drf.a> $$8 = drf.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               drf.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (bzg $$11 : $$2) {
                     $$11.a(new ht($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (ht $$13 : ht.a(new ht($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new ht($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, csa.a.b);
                  dst $$14 = new dst(true, ImmutableList.of($$10), new ht(0, 128, 0));
                  dpv.J.a($$14, $$0, $$0.k().g(), ats.a(), new ht($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(ame $$0, dku $$1, List<bzg> $$2, int $$3, ht $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (bzg $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.ds(), $$5.du(), $$5.dy(), 6.0F, csa.a.a);
               $$5.am();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new ht(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (bzg $$6 : $$2) {
               $$6.a(new ht(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new ht(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(ame $$0, dku $$1, List<bzg> $$2, int $$3, ht $$4) {
      }
   };

   public abstract void a(ame var1, dku var2, List<bzg> var3, int var4, ht var5);
}
