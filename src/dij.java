import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dij {
   a {
      @Override
      public void a(aki $$0, dik $$1, List<bwx> $$2, int $$3, gv $$4) {
         gv $$5 = new gv(0, 128, 0);

         for (bwx $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(aki $$0, dik $$1, List<bwx> $$2, int $$3, gv $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new gv(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(aki $$0, dik $$1, List<bwx> $$2, int $$3, gv $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<dov.a> $$8 = dov.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               dov.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (bwx $$11 : $$2) {
                     $$11.a(new gv($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (gv $$13 : gv.a(new gv($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new gv($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, cpk.a.b);
                  dqj $$14 = new dqj(true, ImmutableList.of($$10), new gv(0, 128, 0));
                  dnl.J.a($$14, $$0, $$0.k().g(), art.a(), new gv($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(aki $$0, dik $$1, List<bwx> $$2, int $$3, gv $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (bwx $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dp(), $$5.dr(), $$5.dv(), 6.0F, cpk.a.a);
               $$5.ak();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new gv(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (bwx $$6 : $$2) {
               $$6.a(new gv(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new gv(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(aki $$0, dik $$1, List<bwx> $$2, int $$3, gv $$4) {
      }
   };

   public abstract void a(aki var1, dik var2, List<bwx> var3, int var4, gv var5);
}
