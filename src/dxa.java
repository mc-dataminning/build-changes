import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dxa {
   a {
      @Override
      public void a(aqu $$0, dxb $$1, List<chz> $$2, int $$3, jd $$4) {
         jd $$5 = new jd(0, 128, 0);

         for (chz $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(aqu $$0, dxb $$1, List<chz> $$2, int $$3, jd $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new jd(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(aqu $$0, dxb $$1, List<chz> $$2, int $$3, jd $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<edn.a> $$8 = edn.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               edn.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (chz $$11 : $$2) {
                     $$11.a(new jd($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (jd $$13 : jd.c(new jd($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new jd($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dcw.a.b);
                  efb $$14 = new efb(true, ImmutableList.of($$10), new jd(0, 128, 0));
                  ecd.J.a($$14, $$0, $$0.l().g(), ayw.a(), new jd($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(aqu $$0, dxb $$1, List<chz> $$2, int $$3, jd $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (chz $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.du(), $$5.dw(), $$5.dA(), 6.0F, dcw.a.a);
               $$5.aq();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new jd(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (chz $$6 : $$2) {
               $$6.a(new jd(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new jd(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(aqu $$0, dxb $$1, List<chz> $$2, int $$3, jd $$4) {
      }
   };

   public abstract void a(aqu var1, dxb var2, List<chz> var3, int var4, jd var5);
}
