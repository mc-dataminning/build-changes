import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dts {
   a {
      @Override
      public void a(aqe $$0, dtt $$1, List<cfo> $$2, int $$3, im $$4) {
         im $$5 = new im(0, 128, 0);

         for (cfo $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(aqe $$0, dtt $$1, List<cfo> $$2, int $$3, im $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new im(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(aqe $$0, dtt $$1, List<cfo> $$2, int $$3, im $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<eae.a> $$8 = eae.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               eae.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cfo $$11 : $$2) {
                     $$11.a(new im($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (im $$13 : im.c(new im($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new im($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, czu.a.b);
                  ebs $$14 = new ebs(true, ImmutableList.of($$10), new im(0, 128, 0));
                  dyu.J.a($$14, $$0, $$0.l().g(), ayd.a(), new im($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(aqe $$0, dtt $$1, List<cfo> $$2, int $$3, im $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cfo $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.ds(), $$5.du(), $$5.dy(), 6.0F, czu.a.a);
               $$5.am();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new im(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cfo $$6 : $$2) {
               $$6.a(new im(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new im(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(aqe $$0, dtt $$1, List<cfo> $$2, int $$3, im $$4) {
      }
   };

   public abstract void a(aqe var1, dtt var2, List<cfo> var3, int var4, im var5);
}
