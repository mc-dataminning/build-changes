import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dwb {
   a {
      @Override
      public void a(aqk $$0, dwc $$1, List<chj> $$2, int $$3, ja $$4) {
         ja $$5 = new ja(0, 128, 0);

         for (chj $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(aqk $$0, dwc $$1, List<chj> $$2, int $$3, ja $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new ja(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(aqk $$0, dwc $$1, List<chj> $$2, int $$3, ja $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<eco.a> $$8 = eco.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               eco.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (chj $$11 : $$2) {
                     $$11.a(new ja($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (ja $$13 : ja.c(new ja($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new ja($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dcd.a.b);
                  eec $$14 = new eec(true, ImmutableList.of($$10), new ja(0, 128, 0));
                  ebe.J.a($$14, $$0, $$0.l().g(), aym.a(), new ja($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(aqk $$0, dwc $$1, List<chj> $$2, int $$3, ja $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (chj $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.du(), $$5.dw(), $$5.dA(), 6.0F, dcd.a.a);
               $$5.ao();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new ja(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (chj $$6 : $$2) {
               $$6.a(new ja(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new ja(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(aqk $$0, dwc $$1, List<chj> $$2, int $$3, ja $$4) {
      }
   };

   public abstract void a(aqk var1, dwc var2, List<chj> var3, int var4, ja var5);
}
