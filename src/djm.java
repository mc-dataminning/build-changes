import com.google.common.collect.ImmutableList;
import java.util.List;

public enum djm {
   a {
      @Override
      public void a(alq $$0, djn $$1, List<byj> $$2, int $$3, ht $$4) {
         ht $$5 = new ht(0, 128, 0);

         for (byj $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(alq $$0, djn $$1, List<byj> $$2, int $$3, ht $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new ht(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(alq $$0, djn $$1, List<byj> $$2, int $$3, ht $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<dpy.a> $$8 = dpy.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               dpy.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (byj $$11 : $$2) {
                     $$11.a(new ht($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (ht $$13 : ht.a(new ht($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new ht($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, cqz.a.b);
                  drm $$14 = new drm(true, ImmutableList.of($$10), new ht(0, 128, 0));
                  doo.J.a($$14, $$0, $$0.k().g(), ate.a(), new ht($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(alq $$0, djn $$1, List<byj> $$2, int $$3, ht $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (byj $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dq(), $$5.ds(), $$5.dw(), 6.0F, cqz.a.a);
               $$5.ak();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new ht(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (byj $$6 : $$2) {
               $$6.a(new ht(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new ht(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(alq $$0, djn $$1, List<byj> $$2, int $$3, ht $$4) {
      }
   };

   public abstract void a(alq var1, djn var2, List<byj> var3, int var4, ht var5);
}
