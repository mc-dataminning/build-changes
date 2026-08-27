import com.google.common.collect.ImmutableList;
import java.util.List;

public enum diu {
   a {
      @Override
      public void a(akr $$0, div $$1, List<bxg> $$2, int $$3, gw $$4) {
         gw $$5 = new gw(0, 128, 0);

         for (bxg $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(akr $$0, div $$1, List<bxg> $$2, int $$3, gw $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new gw(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(akr $$0, div $$1, List<bxg> $$2, int $$3, gw $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<dpg.a> $$8 = dpg.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               dpg.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (bxg $$11 : $$2) {
                     $$11.a(new gw($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (gw $$13 : gw.a(new gw($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new gw($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, cpv.a.b);
                  dqu $$14 = new dqu(true, ImmutableList.of($$10), new gw(0, 128, 0));
                  dnw.J.a($$14, $$0, $$0.k().g(), asc.a(), new gw($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(akr $$0, div $$1, List<bxg> $$2, int $$3, gw $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (bxg $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dq(), $$5.ds(), $$5.dw(), 6.0F, cpv.a.a);
               $$5.ak();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new gw(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (bxg $$6 : $$2) {
               $$6.a(new gw(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new gw(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(akr $$0, div $$1, List<bxg> $$2, int $$3, gw $$4) {
      }
   };

   public abstract void a(akr var1, div var2, List<bxg> var3, int var4, gw var5);
}
