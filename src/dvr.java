import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dvr {
   a {
      @Override
      public void a(arb $$0, dvs $$1, List<chv> $$2, int $$3, iz $$4) {
         iz $$5 = new iz(0, 128, 0);

         for (chv $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(arb $$0, dvs $$1, List<chv> $$2, int $$3, iz $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new iz(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(arb $$0, dvs $$1, List<chv> $$2, int $$3, iz $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<ecd.a> $$8 = ecd.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               ecd.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (chv $$11 : $$2) {
                     $$11.a(new iz($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (iz $$13 : iz.c(new iz($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new iz($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dbt.a.b);
                  edr $$14 = new edr(true, ImmutableList.of($$10), new iz(0, 128, 0));
                  eat.J.a($$14, $$0, $$0.l().g(), azc.a(), new iz($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(arb $$0, dvs $$1, List<chv> $$2, int $$3, iz $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (chv $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.du(), $$5.dw(), $$5.dA(), 6.0F, dbt.a.a);
               $$5.ao();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new iz(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (chv $$6 : $$2) {
               $$6.a(new iz(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new iz(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(arb $$0, dvs $$1, List<chv> $$2, int $$3, iz $$4) {
      }
   };

   public abstract void a(arb var1, dvs var2, List<chv> var3, int var4, iz var5);
}
