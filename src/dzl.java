import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dzl {
   a {
      @Override
      public void a(arq $$0, dzm $$1, List<cjr> $$2, int $$3, jh $$4) {
         jh $$5 = new jh(0, 128, 0);

         for (cjr $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(arq $$0, dzm $$1, List<cjr> $$2, int $$3, jh $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new jh(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(arq $$0, dzm $$1, List<cjr> $$2, int $$3, jh $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<efz.a> $$8 = efz.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               efz.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cjr $$11 : $$2) {
                     $$11.a(new jh($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (jh $$13 : jh.c(new jh($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new jh($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dff.a.b);
                  ehn $$14 = new ehn(true, ImmutableList.of($$10), new jh(0, 128, 0));
                  eep.K.a($$14, $$0, $$0.l().g(), azv.a(), new jh($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(arq $$0, dzm $$1, List<cjr> $$2, int $$3, jh $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cjr $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dD(), $$5.dF(), $$5.dJ(), 6.0F, dff.a.a);
               $$5.av();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new jh(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cjr $$6 : $$2) {
               $$6.a(new jh(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new jh(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(arq $$0, dzm $$1, List<cjr> $$2, int $$3, jh $$4) {
      }
   };

   public abstract void a(arq var1, dzm var2, List<cjr> var3, int var4, jh var5);
}
