import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dub {
   a {
      @Override
      public void a(aqh $$0, duc $$1, List<cgk> $$2, int $$3, in $$4) {
         in $$5 = new in(0, 128, 0);

         for (cgk $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(aqh $$0, duc $$1, List<cgk> $$2, int $$3, in $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new in(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(aqh $$0, duc $$1, List<cgk> $$2, int $$3, in $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<ean.a> $$8 = ean.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               ean.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cgk $$11 : $$2) {
                     $$11.a(new in($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (in $$13 : in.c(new in($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new in($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dad.a.b);
                  ecb $$14 = new ecb(true, ImmutableList.of($$10), new in(0, 128, 0));
                  dzd.J.a($$14, $$0, $$0.l().g(), ayg.a(), new in($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(aqh $$0, duc $$1, List<cgk> $$2, int $$3, in $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cgk $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.ds(), $$5.du(), $$5.dy(), 6.0F, dad.a.a);
               $$5.am();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new in(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cgk $$6 : $$2) {
               $$6.a(new in(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new in(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(aqh $$0, duc $$1, List<cgk> $$2, int $$3, in $$4) {
      }
   };

   public abstract void a(aqh var1, duc var2, List<cgk> var3, int var4, in var5);
}
