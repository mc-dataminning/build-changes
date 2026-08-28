import com.google.common.collect.ImmutableList;
import java.util.List;

public enum eeg {
   a {
      @Override
      public void a(arq $$0, eeh $$1, List<clz> $$2, int $$3, iu $$4) {
         iu $$5 = new iu(0, 128, 0);

         for (clz $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(arq $$0, eeh $$1, List<clz> $$2, int $$3, iu $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new iu(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(arq $$0, eeh $$1, List<clz> $$2, int $$3, iu $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<ekw.a> $$8 = ekw.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               ekw.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (clz $$11 : $$2) {
                     $$11.a(new iu($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (iu $$13 : iu.c(new iu($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new iu($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dja.a.b);
                  emk $$14 = new emk(true, ImmutableList.of($$10), new iu(0, 128, 0));
                  ejm.K.a($$14, $$0, $$0.m().g(), azv.a(), new iu($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(arq $$0, eeh $$1, List<clz> $$2, int $$3, iu $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (clz $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dA(), $$5.dC(), $$5.dG(), 6.0F, dja.a.a);
               $$5.at();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new iu(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (clz $$6 : $$2) {
               $$6.a(new iu(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new iu(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(arq $$0, eeh $$1, List<clz> $$2, int $$3, iu $$4) {
      }
   };

   public abstract void a(arq var1, eeh var2, List<clz> var3, int var4, iu var5);
}
