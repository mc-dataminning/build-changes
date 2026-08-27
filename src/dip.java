import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dip {
   a {
      @Override
      public void a(akn $$0, diq $$1, List<bxb> $$2, int $$3, gw $$4) {
         gw $$5 = new gw(0, 128, 0);

         for (bxb $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(akn $$0, diq $$1, List<bxb> $$2, int $$3, gw $$4) {
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
      public void a(akn $$0, diq $$1, List<bxb> $$2, int $$3, gw $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<dpb.a> $$8 = dpb.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               dpb.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (bxb $$11 : $$2) {
                     $$11.a(new gw($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (gw $$13 : gw.a(new gw($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new gw($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, cpq.a.b);
                  dqp $$14 = new dqp(true, ImmutableList.of($$10), new gw(0, 128, 0));
                  dnr.J.a($$14, $$0, $$0.k().g(), arx.a(), new gw($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(akn $$0, diq $$1, List<bxb> $$2, int $$3, gw $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (bxb $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dp(), $$5.dr(), $$5.dv(), 6.0F, cpq.a.a);
               $$5.ak();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new gw(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (bxb $$6 : $$2) {
               $$6.a(new gw(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new gw(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(akn $$0, diq $$1, List<bxb> $$2, int $$3, gw $$4) {
      }
   };

   public abstract void a(akn var1, diq var2, List<bxb> var3, int var4, gw var5);
}
