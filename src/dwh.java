import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dwh {
   a {
      @Override
      public void a(aqm $$0, dwi $$1, List<chm> $$2, int $$3, ja $$4) {
         ja $$5 = new ja(0, 128, 0);

         for (chm $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(aqm $$0, dwi $$1, List<chm> $$2, int $$3, ja $$4) {
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
      public void a(aqm $$0, dwi $$1, List<chm> $$2, int $$3, ja $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<ecu.a> $$8 = ecu.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               ecu.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (chm $$11 : $$2) {
                     $$11.a(new ja($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (ja $$13 : ja.c(new ja($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new ja($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dcf.a.b);
                  eei $$14 = new eei(true, ImmutableList.of($$10), new ja(0, 128, 0));
                  ebk.J.a($$14, $$0, $$0.l().g(), ayo.a(), new ja($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(aqm $$0, dwi $$1, List<chm> $$2, int $$3, ja $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (chm $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dv(), $$5.dx(), $$5.dB(), 6.0F, dcf.a.a);
               $$5.ap();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new ja(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (chm $$6 : $$2) {
               $$6.a(new ja(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new ja(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(aqm $$0, dwi $$1, List<chm> $$2, int $$3, ja $$4) {
      }
   };

   public abstract void a(aqm var1, dwi var2, List<chm> var3, int var4, ja var5);
}
