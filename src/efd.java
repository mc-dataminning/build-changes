import com.google.common.collect.ImmutableList;
import java.util.List;

public enum efd {
   a {
      @Override
      public void a(ars $$0, efe $$1, List<cmu> $$2, int $$3, iv $$4) {
         iv $$5 = new iv(0, 128, 0);

         for (cmu $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(ars $$0, efe $$1, List<cmu> $$2, int $$3, iv $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new iv(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(ars $$0, efe $$1, List<cmu> $$2, int $$3, iv $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<elu.a> $$8 = elu.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               elu.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cmu $$11 : $$2) {
                     $$11.a(new iv($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (iv $$13 : iv.c(new iv($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new iv($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, djx.a.b);
                  enj $$14 = new enj(true, ImmutableList.of($$10), new iv(0, 128, 0));
                  ekk.L.a($$14, $$0, $$0.m().g(), azx.a(), new iv($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(ars $$0, efe $$1, List<cmu> $$2, int $$3, iv $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cmu $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dA(), $$5.dC(), $$5.dG(), 6.0F, djx.a.a);
               $$5.aq();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new iv(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cmu $$6 : $$2) {
               $$6.a(new iv(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new iv(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(ars $$0, efe $$1, List<cmu> $$2, int $$3, iv $$4) {
      }
   };

   public abstract void a(ars var1, efe var2, List<cmu> var3, int var4, iv var5);
}
