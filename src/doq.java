import com.google.common.collect.ImmutableList;
import java.util.List;

public enum doq {
   a {
      @Override
      public void a(aov $$0, dor $$1, List<ccl> $$2, int $$3, hz $$4) {
         hz $$5 = new hz(0, 128, 0);

         for (ccl $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(aov $$0, dor $$1, List<ccl> $$2, int $$3, hz $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new hz(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(aov $$0, dor $$1, List<ccl> $$2, int $$3, hz $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<dvc.a> $$8 = dvc.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               dvc.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (ccl $$11 : $$2) {
                     $$11.a(new hz($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (hz $$13 : hz.a(new hz($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new hz($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, cvn.a.b);
                  dwq $$14 = new dwq(true, ImmutableList.of($$10), new hz(0, 128, 0));
                  dts.J.a($$14, $$0, $$0.l().g(), awo.a(), new hz($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(aov $$0, dor $$1, List<ccl> $$2, int $$3, hz $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (ccl $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dr(), $$5.dt(), $$5.dx(), 6.0F, cvn.a.a);
               $$5.am();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new hz(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (ccl $$6 : $$2) {
               $$6.a(new hz(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new hz(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(aov $$0, dor $$1, List<ccl> $$2, int $$3, hz $$4) {
      }
   };

   public abstract void a(aov var1, dor var2, List<ccl> var3, int var4, hz var5);
}
