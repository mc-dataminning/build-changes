import com.google.common.collect.ImmutableList;
import java.util.List;

public enum dwx {
   a {
      @Override
      public void a(aqt $$0, dwy $$1, List<chx> $$2, int $$3, jd $$4) {
         jd $$5 = new jd(0, 128, 0);

         for (chx $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(aqt $$0, dwy $$1, List<chx> $$2, int $$3, jd $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new jd(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(aqt $$0, dwy $$1, List<chx> $$2, int $$3, jd $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<edk.a> $$8 = edk.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               edk.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (chx $$11 : $$2) {
                     $$11.a(new jd($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (jd $$13 : jd.c(new jd($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new jd($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, dcu.a.b);
                  eey $$14 = new eey(true, ImmutableList.of($$10), new jd(0, 128, 0));
                  eca.J.a($$14, $$0, $$0.l().g(), ayv.a(), new jd($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(aqt $$0, dwy $$1, List<chx> $$2, int $$3, jd $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (chx $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dv(), $$5.dx(), $$5.dB(), 6.0F, dcu.a.a);
               $$5.aq();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new jd(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (chx $$6 : $$2) {
               $$6.a(new jd(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new jd(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(aqt $$0, dwy $$1, List<chx> $$2, int $$3, jd $$4) {
      }
   };

   public abstract void a(aqt var1, dwy var2, List<chx> var3, int var4, jd var5);
}
