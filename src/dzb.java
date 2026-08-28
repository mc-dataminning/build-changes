import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dzb {
   a {
      @Override
      public void a(arm $$0, dzc $$1, List<cji> $$2, int $$3, jg $$4) {
         jg $$5 = new jg(0, 128, 0);

         for (cji $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(arm $$0, dzc $$1, List<cji> $$2, int $$3, jg $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new jg(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(arm $$0, dzc $$1, List<cji> $$2, int $$3, jg $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<efp.a> $$8 = efp.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               efp.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cji $$11 : $$2) {
                     $$11.a(new jg($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (jg $$13 : jg.c(new jg($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new jg($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dev.a.b);
                  ehd $$14 = new ehd(true, ImmutableList.of($$10), new jg(0, 128, 0));
                  eef.K.a($$14, $$0, $$0.l().g(), azr.a(), new jg($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(arm $$0, dzc $$1, List<cji> $$2, int $$3, jg $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cji $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dC(), $$5.dE(), $$5.dI(), 6.0F, dev.a.a);
               $$5.au();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new jg(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cji $$6 : $$2) {
               $$6.a(new jg(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new jg(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(arm $$0, dzc $$1, List<cji> $$2, int $$3, jg $$4) {
      }
   };

   public abstract void a(arm var1, dzc var2, List<cji> var3, int var4, jg var5);
}
