import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dml {
   a {
      @Override
      public void a(amz $$0, dmm $$1, List<cah> $$2, int $$3, hx $$4) {
         hx $$5 = new hx(0, 128, 0);

         for (cah $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(amz $$0, dmm $$1, List<cah> $$2, int $$3, hx $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new hx(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(amz $$0, dmm $$1, List<cah> $$2, int $$3, hx $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<dsx.a> $$8 = dsx.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               dsx.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cah $$11 : $$2) {
                     $$11.a(new hx($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (hx $$13 : hx.a(new hx($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new hx($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, cti.a.b);
                  dul $$14 = new dul(true, ImmutableList.of($$10), new hx(0, 128, 0));
                  drn.J.a($$14, $$0, $$0.l().g(), aup.a(), new hx($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(amz $$0, dmm $$1, List<cah> $$2, int $$3, hx $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cah $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dr(), $$5.dt(), $$5.dx(), 6.0F, cti.a.a);
               $$5.am();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new hx(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cah $$6 : $$2) {
               $$6.a(new hx(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new hx(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(amz $$0, dmm $$1, List<cah> $$2, int $$3, hx $$4) {
      }
   };

   public abstract void a(amz var1, dmm var2, List<cah> var3, int var4, hx var5);
}
