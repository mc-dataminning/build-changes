import com.google.common.collect.ImmutableList;
import java.util.List;

public enum ebk {
   a {
      @Override
      public void a(ash $$0, ebl $$1, List<cko> $$2, int $$3, jh $$4) {
         jh $$5 = new jh(0, 128, 0);

         for (cko $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(ash $$0, ebl $$1, List<cko> $$2, int $$3, jh $$4) {
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
      public void a(ash $$0, ebl $$1, List<cko> $$2, int $$3, jh $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<ehy.a> $$8 = ehy.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               ehy.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cko $$11 : $$2) {
                     $$11.a(new jh($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (jh $$13 : jh.c(new jh($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new jh($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dha.a.b);
                  ejm $$14 = new ejm(true, ImmutableList.of($$10), new jh(0, 128, 0));
                  ego.K.a($$14, $$0, $$0.m().g(), bam.a(), new jh($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(ash $$0, ebl $$1, List<cko> $$2, int $$3, jh $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cko $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dA(), $$5.dC(), $$5.dG(), 6.0F, dha.a.a);
               $$5.at();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new jh(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cko $$6 : $$2) {
               $$6.a(new jh(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new jh(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(ash $$0, ebl $$1, List<cko> $$2, int $$3, jh $$4) {
      }
   };

   public abstract void a(ash var1, ebl var2, List<cko> var3, int var4, jh var5);
}
