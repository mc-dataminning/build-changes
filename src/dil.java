import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dil {
   a {
      @Override
      public void a(akk $$0, dim $$1, List<bwz> $$2, int $$3, gu $$4) {
         gu $$5 = new gu(0, 128, 0);

         for (bwz $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(akk $$0, dim $$1, List<bwz> $$2, int $$3, gu $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new gu(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(akk $$0, dim $$1, List<bwz> $$2, int $$3, gu $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<dox.a> $$8 = dox.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               dox.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (bwz $$11 : $$2) {
                     $$11.a(new gu($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (gu $$13 : gu.a(new gu($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new gu($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, cpm.a.b);
                  dql $$14 = new dql(true, ImmutableList.of($$10), new gu(0, 128, 0));
                  dnn.J.a($$14, $$0, $$0.k().g(), aru.a(), new gu($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(akk $$0, dim $$1, List<bwz> $$2, int $$3, gu $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (bwz $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dp(), $$5.dr(), $$5.dv(), 6.0F, cpm.a.a);
               $$5.ak();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new gu(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (bwz $$6 : $$2) {
               $$6.a(new gu(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new gu(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(akk $$0, dim $$1, List<bwz> $$2, int $$3, gu $$4) {
      }
   };

   public abstract void a(akk var1, dim var2, List<bwz> var3, int var4, gu var5);
}
