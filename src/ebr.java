import com.google.common.collect.ImmutableList;
import java.util.List;

public enum ebr {
   a {
      @Override
      public void a(ash $$0, ebs $$1, List<cks> $$2, int $$3, jh $$4) {
         jh $$5 = new jh(0, 128, 0);

         for (cks $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(ash $$0, ebs $$1, List<cks> $$2, int $$3, jh $$4) {
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
      public void a(ash $$0, ebs $$1, List<cks> $$2, int $$3, jh $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<eif.a> $$8 = eif.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               eif.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cks $$11 : $$2) {
                     $$11.a(new jh($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (jh $$13 : jh.c(new jh($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new jh($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dhh.a.b);
                  ejt $$14 = new ejt(true, ImmutableList.of($$10), new jh(0, 128, 0));
                  egv.K.a($$14, $$0, $$0.m().g(), bam.a(), new jh($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(ash $$0, ebs $$1, List<cks> $$2, int $$3, jh $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cks $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dB(), $$5.dD(), $$5.dH(), 6.0F, dhh.a.a);
               $$5.at();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new jh(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cks $$6 : $$2) {
               $$6.a(new jh(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new jh(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(ash $$0, ebs $$1, List<cks> $$2, int $$3, jh $$4) {
      }
   };

   public abstract void a(ash var1, ebs var2, List<cks> var3, int var4, jh var5);
}
