import com.google.common.collect.ImmutableList;
import java.util.List;

public enum ecl {
   a {
      @Override
      public void a(arn $$0, ecm $$1, List<clf> $$2, int $$3, jj $$4) {
         jj $$5 = new jj(0, 128, 0);

         for (clf $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(arn $$0, ecm $$1, List<clf> $$2, int $$3, jj $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new jj(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(arn $$0, ecm $$1, List<clf> $$2, int $$3, jj $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<ejb.a> $$8 = ejb.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               ejb.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (clf $$11 : $$2) {
                     $$11.a(new jj($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (jj $$13 : jj.c(new jj($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new jj($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dhp.a.b);
                  ekp $$14 = new ekp(true, ImmutableList.of($$10), new jj(0, 128, 0));
                  ehr.K.a($$14, $$0, $$0.m().g(), azs.a(), new jj($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(arn $$0, ecm $$1, List<clf> $$2, int $$3, jj $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (clf $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dA(), $$5.dC(), $$5.dG(), 6.0F, dhp.a.a);
               $$5.at();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new jj(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (clf $$6 : $$2) {
               $$6.a(new jj(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new jj(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(arn $$0, ecm $$1, List<clf> $$2, int $$3, jj $$4) {
      }
   };

   public abstract void a(arn var1, ecm var2, List<clf> var3, int var4, jj var5);
}
