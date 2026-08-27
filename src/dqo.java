import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dqo {
   a {
      @Override
      public void a(apf $$0, dqp $$1, List<cdw> $$2, int $$3, ib $$4) {
         ib $$5 = new ib(0, 128, 0);

         for (cdw $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(apf $$0, dqp $$1, List<cdw> $$2, int $$3, ib $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new ib(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(apf $$0, dqp $$1, List<cdw> $$2, int $$3, ib $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<dxa.a> $$8 = dxa.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               dxa.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cdw $$11 : $$2) {
                     $$11.a(new ib($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (ib $$13 : ib.a(new ib($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new ib($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, cwz.a.b);
                  dyo $$14 = new dyo(true, ImmutableList.of($$10), new ib(0, 128, 0));
                  dvq.J.a($$14, $$0, $$0.l().g(), axd.a(), new ib($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(apf $$0, dqp $$1, List<cdw> $$2, int $$3, ib $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cdw $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dr(), $$5.dt(), $$5.dx(), 6.0F, cwz.a.a);
               $$5.am();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new ib(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cdw $$6 : $$2) {
               $$6.a(new ib(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new ib(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(apf $$0, dqp $$1, List<cdw> $$2, int $$3, ib $$4) {
      }
   };

   public abstract void a(apf var1, dqp var2, List<cdw> var3, int var4, ib var5);
}
