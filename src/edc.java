import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class edc implements edj.c {
   public static final int a = 12;
   private static final int f = 24;
   private static final float[] g = ae.a(new float[13824], $$0 -> {
      for (int $$1 = 0; $$1 < 24; $$1++) {
         for (int $$2 = 0; $$2 < 24; $$2++) {
            for (int $$3 = 0; $$3 < 24; $$3++) {
               $$0[$$1 * 24 * 24 + $$2 * 24 + $$3] = (float)a($$2 - 12, $$3 - 12, $$1 - 12);
            }
         }
      }
   });
   private final ObjectListIterator<edc.a> h;
   private final ObjectListIterator<epm> i;

   public static edc a(did $$0, dgn $$1) {
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      ObjectList<edc.a> $$4 = new ObjectArrayList(10);
      ObjectList<epm> $$5 = new ObjectArrayList(32);
      $$0.a($$1, $$0x -> $$0x.d() != eou.a).forEach($$5x -> {
         eou $$6 = $$5x.h().d();

         for (eon $$7 : $$5x.i()) {
            if ($$7.a($$1, 12)) {
               if ($$7 instanceof eof) {
                  eof $$8 = (eof)$$7;
                  ept.a $$9 = $$8.b().f();
                  if ($$9 == ept.a.b) {
                     $$4.add(new edc.a($$8.f(), $$6, $$8.d()));
                  }

                  for (epm $$10 : $$8.e()) {
                     int $$11 = $$10.a();
                     int $$12 = $$10.c();
                     if ($$11 > $$2 - 12 && $$12 > $$3 - 12 && $$11 < $$2 + 15 + 12 && $$12 < $$3 + 15 + 12) {
                        $$5.add($$10);
                     }
                  }
               } else {
                  $$4.add(new edc.a($$7.f(), $$6, 0));
               }
            }
         }
      });
      return new edc($$4.iterator(), $$5.iterator());
   }

   @VisibleForTesting
   public edc(ObjectListIterator<edc.a> $$0, ObjectListIterator<epm> $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public double a(edi.b $$0) {
      int $$1 = $$0.a();
      int $$2 = $$0.b();
      int $$3 = $$0.c();
      double $$4 = 0.0;

      while (this.h.hasNext()) {
         edc.a $$5 = (edc.a)this.h.next();
         eob $$6 = $$5.a();
         int $$7 = $$5.c();
         int $$8 = Math.max(0, Math.max($$6.h() - $$1, $$1 - $$6.k()));
         int $$9 = Math.max(0, Math.max($$6.j() - $$3, $$3 - $$6.m()));
         int $$10 = $$6.i() + $$7;
         int $$11 = $$2 - $$10;

         int $$12 = switch ($$5.b()) {
            case a -> 0;
            case b, c -> $$11;
            case d -> Math.max(0, Math.max($$10 - $$2, $$2 - $$6.l()));
            case e -> Math.max(0, Math.max($$6.i() - $$2, $$2 - $$6.l()));
         };

         $$4 += switch ($$5.b()) {
            case a -> 0.0;
            case b -> a((double)$$8, (double)$$12 / 2.0, (double)$$9);
            case c, d -> a($$8, $$12, $$9, $$11) * 0.8;
            case e -> a((double)$$8 / 2.0, (double)$$12 / 2.0, (double)$$9 / 2.0) * 0.8;
         };
      }

      this.h.back(Integer.MAX_VALUE);

      while (this.i.hasNext()) {
         epm $$13 = (epm)this.i.next();
         int $$14 = $$1 - $$13.a();
         int $$15 = $$2 - $$13.b();
         int $$16 = $$3 - $$13.c();
         $$4 += a($$14, $$15, $$16, $$15) * 0.4;
      }

      this.i.back(Integer.MAX_VALUE);
      return $$4;
   }

   @Override
   public double a() {
      return Double.NEGATIVE_INFINITY;
   }

   @Override
   public double b() {
      return Double.POSITIVE_INFINITY;
   }

   private static double a(double $$0, double $$1, double $$2) {
      double $$3 = bae.g($$0, $$1, $$2);
      return bae.a($$3, 0.0, 6.0, 1.0, 0.0);
   }

   private static double a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$0 + 12;
      int $$5 = $$1 + 12;
      int $$6 = $$2 + 12;
      if (a($$4) && a($$5) && a($$6)) {
         double $$7 = (double)$$3 + 0.5;
         double $$8 = bae.f((double)$$0, $$7, (double)$$2);
         double $$9 = -$$7 * bae.g($$8 / 2.0) / 2.0;
         return $$9 * (double)g[$$6 * 24 * 24 + $$4 * 24 + $$5];
      } else {
         return 0.0;
      }
   }

   private static boolean a(int $$0) {
      return $$0 >= 0 && $$0 < 24;
   }

   private static double a(int $$0, int $$1, int $$2) {
      return a($$0, (double)$$1 + 0.5, $$2);
   }

   private static double a(int $$0, double $$1, int $$2) {
      double $$3 = bae.f((double)$$0, $$1, (double)$$2);
      return Math.pow(Math.E, -$$3 / 16.0);
   }

   @VisibleForTesting
   public static record a(eob a, eou b, int c) {
   }
}
