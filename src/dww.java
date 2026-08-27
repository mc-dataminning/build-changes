import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dww {
   a {
      @Override
      public void a(aqt $$0, dwx $$1, List<cgz> $$2, int $$3, ir $$4) {
         ir $$5 = new ir(0, 128, 0);

         for (cgz $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(aqt $$0, dwx $$1, List<cgz> $$2, int $$3, ir $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new ir(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(aqt $$0, dwx $$1, List<cgz> $$2, int $$3, ir $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<edp.a> $$8 = edp.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               edp.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cgz $$11 : $$2) {
                     $$11.a(new ir($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (ir $$13 : ir.c(new ir($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new ir($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dca.a.b);
                  efe $$14 = new efe(true, ImmutableList.of($$10), new ir(0, 128, 0));
                  eca.M.a($$14, $$0, $$0.l().g(), ayt.a(), new ir($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(aqt $$0, dwx $$1, List<cgz> $$2, int $$3, ir $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cgz $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dz(), $$5.dB(), $$5.dF(), 6.0F, dca.a.a);
               $$5.ao();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new ir(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cgz $$6 : $$2) {
               $$6.a(new ir(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new ir(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(aqt $$0, dwx $$1, List<cgz> $$2, int $$3, ir $$4) {
      }
   };

   public abstract void a(aqt var1, dwx var2, List<cgz> var3, int var4, ir var5);
}
