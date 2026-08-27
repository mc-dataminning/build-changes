import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class dls implements dlz.c {
   public static final int a = 12;
   private static final int f = 24;
   private static final float[] g = ac.a(new float[13824], $$0 -> {
      for (int $$1 = 0; $$1 < 24; $$1++) {
         for (int $$2 = 0; $$2 < 24; $$2++) {
            for (int $$3 = 0; $$3 < 24; $$3++) {
               $$0[$$1 * 24 * 24 + $$2 * 24 + $$3] = (float)b($$2 - 12, $$3 - 12, $$1 - 12);
            }
         }
      }
   });
   private final ObjectListIterator<dls.a> h;
   private final ObjectListIterator<dxx> i;

   public static dls a(csk $$0, cqz $$1) {
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      ObjectList<dls.a> $$4 = new ObjectArrayList(10);
      ObjectList<dxx> $$5 = new ObjectArrayList(32);
      $$0.a($$1, $$0x -> $$0x.d() != dxg.a).forEach($$5x -> {
         dxg $$6 = $$5x.h().d();

         for (dwz $$7 : $$5x.i()) {
            if ($$7.a($$1, 12)) {
               if ($$7 instanceof dwr) {
                  dwr $$8 = (dwr)$$7;
                  dye.a $$9 = $$8.b().e();
                  if ($$9 == dye.a.b) {
                     $$4.add(new dls.a($$8.f(), $$6, $$8.d()));
                  }

                  for (dxx $$10 : $$8.e()) {
                     int $$11 = $$10.a();
                     int $$12 = $$10.c();
                     if ($$11 > $$2 - 12 && $$12 > $$3 - 12 && $$11 < $$2 + 15 + 12 && $$12 < $$3 + 15 + 12) {
                        $$5.add($$10);
                     }
                  }
               } else {
                  $$4.add(new dls.a($$7.f(), $$6, 0));
               }
            }
         }
      });
      return new dls($$4.iterator(), $$5.iterator());
   }

   @VisibleForTesting
   public dls(ObjectListIterator<dls.a> $$0, ObjectListIterator<dxx> $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public double a(dly.b $$0) {
      int $$1 = $$0.a();
      int $$2 = $$0.b();
      int $$3 = $$0.c();
      double $$4 = 0.0;

      while (this.h.hasNext()) {
         dls.a $$5 = (dls.a)this.h.next();
         dwn $$6 = $$5.a();
         int $$7 = $$5.c();
         int $$8 = Math.max(0, Math.max($$6.g() - $$1, $$1 - $$6.j()));
         int $$9 = Math.max(0, Math.max($$6.i() - $$3, $$3 - $$6.l()));
         int $$10 = $$6.h() + $$7;
         int $$11 = $$2 - $$10;

         int $$12 = switch ($$5.b()) {
            case a -> 0;
            case b, c -> $$11;
            case d -> Math.max(0, Math.max($$10 - $$2, $$2 - $$6.k()));
         };

         $$4 += switch ($$5.b()) {
            case a -> 0.0;
            case b -> a($$8, $$12, $$9);
            case c, d -> a($$8, $$12, $$9, $$11) * 0.8;
         };
      }

      this.h.back(Integer.MAX_VALUE);

      while (this.i.hasNext()) {
         dxx $$13 = (dxx)this.i.next();
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

   private static double a(int $$0, int $$1, int $$2) {
      double $$3 = ati.g((double)$$0, (double)$$1 / 2.0, (double)$$2);
      return ati.a($$3, 0.0, 6.0, 1.0, 0.0);
   }

   private static double a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$0 + 12;
      int $$5 = $$1 + 12;
      int $$6 = $$2 + 12;
      if (a($$4) && a($$5) && a($$6)) {
         double $$7 = (double)$$3 + 0.5;
         double $$8 = ati.f((double)$$0, $$7, (double)$$2);
         double $$9 = -$$7 * ati.g($$8 / 2.0) / 2.0;
         return $$9 * (double)g[$$6 * 24 * 24 + $$4 * 24 + $$5];
      } else {
         return 0.0;
      }
   }

   private static boolean a(int $$0) {
      return $$0 >= 0 && $$0 < 24;
   }

   private static double b(int $$0, int $$1, int $$2) {
      return a($$0, (double)$$1 + 0.5, $$2);
   }

   private static double a(int $$0, double $$1, int $$2) {
      double $$3 = ati.f((double)$$0, $$1, (double)$$2);
      return Math.pow(Math.E, -$$3 / 16.0);
   }

   @VisibleForTesting
   public static record a(dwn a, dxg b, int c) {
   }
}
