import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongList;

public class cpe {
   private final LongList a;
   private final ir b;

   private cpe(LongList $$0, ir $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static cpe a(cpb $$0, iw $$1) {
      LongList $$2 = new LongArrayList();
      ir.a $$3 = new ir.a();
      iw $$4 = $$1.g();

      for (ir $$5 : b($$0, $$1)) {
         $$3.g($$5);
         boolean $$6 = false;
         int $$7 = $$1.o().a($$0.a(), $$0.b(), $$0.c());

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            dtc $$9 = $$0.b($$3);
            if (a($$9)) {
               if (!$$6) {
                  $$2.add($$3.a());
               }

               $$6 = true;
            } else {
               $$6 = false;
            }

            $$3.d($$4);
         }
      }

      return new cpe($$2, new ir($$0.a(), $$0.b(), $$0.c()));
   }

   private static Iterable<ir> b(cpb $$0, iw $$1) {
      ir $$2 = new ir(Math.max($$1.j(), 0) * ($$0.a() - 1), Math.max($$1.k(), 0) * ($$0.b() - 1), Math.max($$1.l(), 0) * ($$0.c() - 1));
      ir $$3 = $$2.b($$1.o() == iw.a.a ? 0 : $$0.a() - 1, $$1.o() == iw.a.b ? 0 : $$0.b() - 1, $$1.o() == iw.a.c ? 0 : $$0.c() - 1);
      return ir.c($$2, $$3);
   }

   public boolean a(dca $$0, ir $$1) {
      int $$2 = $$1.v();
      int $$3 = $$2 + this.b.v() - 1;
      if ($$2 >= $$0.J_() && $$3 < $$0.am()) {
         ir.a $$4 = new ir.a();
         LongIterator $$5 = this.a.longIterator();

         while ($$5.hasNext()) {
            $$4.f($$5.nextLong());
            $$4.h($$1);
            if (a($$0.a_($$4))) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private static boolean a(dtc $$0) {
      return !$$0.r();
   }
}
