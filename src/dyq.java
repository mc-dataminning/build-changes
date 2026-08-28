import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dyq {
   a {
      @Override
      public void a(arj $$0, dyr $$1, List<ciz> $$2, int $$3, jf $$4) {
         jf $$5 = new jf(0, 128, 0);

         for (ciz $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(arj $$0, dyr $$1, List<ciz> $$2, int $$3, jf $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new jf(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(arj $$0, dyr $$1, List<ciz> $$2, int $$3, jf $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<efe.a> $$8 = efe.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               efe.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (ciz $$11 : $$2) {
                     $$11.a(new jf($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (jf $$13 : jf.c(new jf($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new jf($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dej.a.b);
                  egs $$14 = new egs(true, ImmutableList.of($$10), new jf(0, 128, 0));
                  edu.K.a($$14, $$0, $$0.l().g(), azn.a(), new jf($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(arj $$0, dyr $$1, List<ciz> $$2, int $$3, jf $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (ciz $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dx(), $$5.dz(), $$5.dD(), 6.0F, dej.a.a);
               $$5.as();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new jf(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (ciz $$6 : $$2) {
               $$6.a(new jf(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new jf(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(arj $$0, dyr $$1, List<ciz> $$2, int $$3, jf $$4) {
      }
   };

   public abstract void a(arj var1, dyr var2, List<ciz> var3, int var4, jf var5);
}
