import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class dyh implements dyo.c {
   public static final int a = 12;
   private static final int f = 24;
   private static final float[] g = ad.a(new float[13824], $$0 -> {
      for (int $$1 = 0; $$1 < 24; $$1++) {
         for (int $$2 = 0; $$2 < 24; $$2++) {
            for (int $$3 = 0; $$3 < 24; $$3++) {
               $$0[$$1 * 24 * 24 + $$2 * 24 + $$3] = (float)c($$2 - 12, $$3 - 12, $$1 - 12);
            }
         }
      }
   });
   private final ObjectListIterator<dyh.a> h;
   private final ObjectListIterator<ekv> i;

   public static dyh a(dct $$0, dbh $$1) {
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      ObjectList<dyh.a> $$4 = new ObjectArrayList(10);
      ObjectList<ekv> $$5 = new ObjectArrayList(32);
      $$0.a($$1, $$0x -> $$0x.e() != eke.a).forEach($$5x -> {
         eke $$6 = $$5x.h().e();

         for (ejx $$7 : $$5x.i()) {
            if ($$7.a($$1, 12)) {
               if ($$7 instanceof ejp) {
                  ejp $$8 = (ejp)$$7;
                  elc.a $$9 = $$8.b().e();
                  if ($$9 == elc.a.b) {
                     $$4.add(new dyh.a($$8.f(), $$6, $$8.d()));
                  }

                  for (ekv $$10 : $$8.e()) {
                     int $$11 = $$10.a();
                     int $$12 = $$10.c();
                     if ($$11 > $$2 - 12 && $$12 > $$3 - 12 && $$11 < $$2 + 15 + 12 && $$12 < $$3 + 15 + 12) {
                        $$5.add($$10);
                     }
                  }
               } else {
                  $$4.add(new dyh.a($$7.f(), $$6, 0));
               }
            }
         }
      });
      return new dyh($$4.iterator(), $$5.iterator());
   }

   @VisibleForTesting
   public dyh(ObjectListIterator<dyh.a> $$0, ObjectListIterator<ekv> $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public double a(dyn.b $$0) {
      int $$1 = $$0.a();
      int $$2 = $$0.b();
      int $$3 = $$0.c();
      double $$4 = 0.0;

      while (this.h.hasNext()) {
         dyh.a $$5 = (dyh.a)this.h.next();
         ejl $$6 = $$5.a();
         int $$7 = $$5.c();
         int $$8 = Math.max(0, Math.max($$6.h() - $$1, $$1 - $$6.k()));
         int $$9 = Math.max(0, Math.max($$6.j() - $$3, $$3 - $$6.m()));
         int $$10 = $$6.i() + $$7;
         int $$11 = $$2 - $$10;

         int $$12 = switch ($$5.b()) {
            case a -> 0;
            case b, d -> $$11;
            case c -> Math.max(0, Math.max($$6.i() - $$2, $$2 - $$6.l()));
            case e -> Math.max(0, Math.max($$10 - $$2, $$2 - $$6.l()));
         };

         $$4 += switch ($$5.b()) {
            case a -> 0.0;
            case b -> a($$8, $$12, $$9);
            case d, e -> a($$8, $$12, $$9, $$11) * 0.8;
            case c -> b($$8, $$12, $$9);
         };
      }

      this.h.back(Integer.MAX_VALUE);

      while (this.i.hasNext()) {
         ekv $$13 = (ekv)this.i.next();
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
      double $$3 = aym.g((double)$$0, (double)$$1 / 2.0, (double)$$2);
      return aym.a($$3, 0.0, 6.0, 1.0, 0.0);
   }

   private static double b(int $$0, int $$1, int $$2) {
      double $$3 = aym.g((double)$$0, (double)$$1, (double)$$2);
      return aym.a($$3, 0.0, 6.0, 1.0, 0.0);
   }

   private static double a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$0 + 12;
      int $$5 = $$1 + 12;
      int $$6 = $$2 + 12;
      if (a($$4) && a($$5) && a($$6)) {
         double $$7 = (double)$$3 + 0.5;
         double $$8 = aym.f((double)$$0, $$7, (double)$$2);
         double $$9 = -$$7 * aym.g($$8 / 2.0) / 2.0;
         return $$9 * (double)g[$$6 * 24 * 24 + $$4 * 24 + $$5];
      } else {
         return 0.0;
      }
   }

   private static boolean a(int $$0) {
      return $$0 >= 0 && $$0 < 24;
   }

   private static double c(int $$0, int $$1, int $$2) {
      return a($$0, (double)$$1 + 0.5, $$2);
   }

   private static double a(int $$0, double $$1, int $$2) {
      double $$3 = aym.f((double)$$0, $$1, (double)$$2);
      return Math.pow(Math.E, -$$3 / 16.0);
   }

   @VisibleForTesting
   public static record a(ejl a, eke b, int c) {
   }
}
