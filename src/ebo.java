import com.google.common.collect.ImmutableList;
import java.util.List;

public enum ebo {
   a {
      @Override
      public void a(ard $$0, ebp $$1, List<cko> $$2, int $$3, ji $$4) {
         ji $$5 = new ji(0, 128, 0);

         for (cko $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(ard $$0, ebp $$1, List<cko> $$2, int $$3, ji $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new ji(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(ard $$0, ebp $$1, List<cko> $$2, int $$3, ji $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<eie.a> $$8 = eie.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               eie.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cko $$11 : $$2) {
                     $$11.a(new ji($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (ji $$13 : ji.c(new ji($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new ji($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dgz.a.b);
                  ejs $$14 = new ejs(true, ImmutableList.of($$10), new ji(0, 128, 0));
                  egu.K.a($$14, $$0, $$0.m().g(), azh.a(), new ji($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(ard $$0, ebp $$1, List<cko> $$2, int $$3, ji $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cko $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dz(), $$5.dB(), $$5.dF(), 6.0F, dgz.a.a);
               $$5.at();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new ji(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cko $$6 : $$2) {
               $$6.a(new ji(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new ji(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(ard $$0, ebp $$1, List<cko> $$2, int $$3, ji $$4) {
      }
   };

   public abstract void a(ard var1, ebp var2, List<cko> var3, int var4, ji var5);
}
