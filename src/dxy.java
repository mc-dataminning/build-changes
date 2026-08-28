import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dxy {
   a {
      @Override
      public void a(arg $$0, dxz $$1, List<cir> $$2, int $$3, je $$4) {
         je $$5 = new je(0, 128, 0);

         for (cir $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(arg $$0, dxz $$1, List<cir> $$2, int $$3, je $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new je(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(arg $$0, dxz $$1, List<cir> $$2, int $$3, je $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<eem.a> $$8 = eem.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               eem.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cir $$11 : $$2) {
                     $$11.a(new je($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (je $$13 : je.c(new je($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new je($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dds.a.b);
                  ega $$14 = new ega(true, ImmutableList.of($$10), new je(0, 128, 0));
                  edc.K.a($$14, $$0, $$0.l().g(), azk.a(), new je($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(arg $$0, dxz $$1, List<cir> $$2, int $$3, je $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cir $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dx(), $$5.dz(), $$5.dD(), 6.0F, dds.a.a);
               $$5.as();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new je(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cir $$6 : $$2) {
               $$6.a(new je(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new je(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(arg $$0, dxz $$1, List<cir> $$2, int $$3, je $$4) {
      }
   };

   public abstract void a(arg var1, dxz var2, List<cir> var3, int var4, je var5);
}
