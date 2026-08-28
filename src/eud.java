import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayDeque;
import java.util.Deque;
import javax.annotation.Nullable;

public class eud extends eui {
   private final Deque<ji> b = new ArrayDeque<>();
   private final Deque<ji> c = new ArrayDeque<>();
   private final Object2IntMap<ji> d = new Object2IntLinkedOpenHashMap();

   public eud(dps $$0) {
      super($$0);
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, @Nullable eug $$3, boolean $$4) {
      eug $$5 = a($$0, $$3);
      this.a($$0, $$1, $$5);
      ObjectIterator<Entry<ji>> $$6 = this.d.object2IntEntrySet().iterator();

      for (boolean $$7 = true; $$6.hasNext(); $$7 = false) {
         Entry<ji> $$8 = (Entry<ji>)$$6.next();
         ji $$9 = (ji)$$8.getKey();
         int $$10 = $$8.getIntValue();
         int $$11 = b($$10);
         dww $$12 = $$0.a_($$9);
         if ($$12.a(this.a) && !$$12.c(dps.f).equals($$11)) {
            int $$13 = 2;
            if (!$$4 || !$$7) {
               $$13 |= 128;
            }

            $$0.a($$9, $$12.b(dps.f, Integer.valueOf($$11)), $$13);
         } else {
            $$6.remove();
         }
      }

      this.a($$0);
   }

   private void a(dgh $$0) {
      this.d.forEach(($$1, $$2) -> {
         eug $$3 = a($$2);
         dww $$4 = $$0.a_($$1);

         for (jn $$5 : $$3.f()) {
            if (a($$4, $$5)) {
               ji $$6 = $$1.a($$5);
               dww $$7 = $$0.a_($$6);
               eug $$8 = $$3.c($$5);
               $$0.a($$7, $$6, this.a, $$8, false);
               if ($$7.d($$0, $$6)) {
                  for (jn $$9 : $$8.f()) {
                     if ($$9 != $$5.g()) {
                        $$0.b($$6.a($$9), this.a, $$8.c($$9));
                     }
                  }
               }
            }
         }
      });
   }

   private static boolean a(dww $$0, jn $$1) {
      dxt<dya> $$2 = dps.g.get($$1);
      return $$2 == null ? $$1 == jn.a : $$0.c($$2).a();
   }

   private static eug a(dgh $$0, @Nullable eug $$1) {
      eug $$2;
      if ($$1 != null) {
         $$2 = $$1;
      } else {
         $$2 = eug.a($$0.A);
      }

      return $$2.a(jn.b).a(eug.a.a);
   }

   private void a(dgh $$0, ji $$1, eug $$2) {
      dww $$3 = $$0.a_($$1);
      if ($$3.a(this.a)) {
         this.a($$1, $$3.c(dps.f), $$2);
         this.b.add($$1);
      } else {
         this.a($$0, $$1, 0, $$2, true);
      }

      while (!this.b.isEmpty()) {
         ji $$4 = this.b.removeFirst();
         int $$5 = this.d.getInt($$4);
         eug $$6 = a($$5);
         int $$7 = b($$5);
         int $$8 = this.a($$0, $$4);
         int $$9 = this.b($$0, $$4);
         int $$10 = Math.max($$8, $$9);
         int $$11;
         if ($$10 < $$7) {
            if ($$8 > 0 && !this.c.contains($$4)) {
               this.c.add($$4);
            }

            $$11 = 0;
         } else {
            $$11 = $$10;
         }

         if ($$11 != $$7) {
            this.a($$4, $$11, $$6);
         }

         this.a($$0, $$4, $$11, $$6, $$7 > $$10);
      }

      while (!this.c.isEmpty()) {
         ji $$13 = this.c.removeFirst();
         int $$14 = this.d.getInt($$13);
         int $$15 = b($$14);
         int $$16 = this.a($$0, $$13);
         int $$17 = this.b($$0, $$13);
         int $$18 = Math.max($$16, $$17);
         eug $$19 = a($$14);
         if ($$18 > $$15) {
            this.a($$13, $$18, $$19);
         } else if ($$18 < $$15) {
            throw new IllegalStateException("Turning off wire while trying to turn it on. Should not happen.");
         }

         this.a($$0, $$13, $$18, $$19, false);
      }
   }

   private static int a(eug $$0, int $$1) {
      return $$0.i() << 4 | $$1;
   }

   private static eug a(int $$0) {
      return eug.a($$0 >> 4);
   }

   private static int b(int $$0) {
      return $$0 & 15;
   }

   private void a(ji $$0, int $$1, eug $$2) {
      this.d.compute($$0, ($$2x, $$3) -> $$3 == null ? a($$2, $$1) : a(a($$3), $$1));
   }

   private void a(dgh $$0, ji $$1, int $$2, eug $$3, boolean $$4) {
      for (jn $$5 : $$3.g()) {
         ji $$6 = $$1.a($$5);
         this.b($$0, $$6, $$2, $$3.b($$5), $$4);
      }

      for (jn $$7 : $$3.h()) {
         ji $$8 = $$1.a($$7);
         boolean $$9 = $$0.a_($$8).d($$0, $$8);

         for (jn $$10 : $$3.g()) {
            ji $$11 = $$1.a($$10);
            if ($$7 == jn.b && !$$9) {
               ji $$12 = $$8.a($$10);
               this.b($$0, $$12, $$2, $$3.b($$10), $$4);
            } else if ($$7 == jn.a && !$$0.a_($$11).d($$0, $$11)) {
               ji $$13 = $$8.a($$10);
               this.b($$0, $$13, $$2, $$3.b($$10), $$4);
            }
         }
      }
   }

   private void b(dgh $$0, ji $$1, int $$2, eug $$3, boolean $$4) {
      dww $$5 = $$0.a_($$1);
      if ($$5.a(this.a)) {
         int $$6 = this.a($$1, $$5);
         if ($$6 < $$2 - 1 && !this.c.contains($$1)) {
            this.c.add($$1);
            this.a($$1, $$6, $$3);
         }

         if ($$4 && $$6 > $$2 && !this.b.contains($$1)) {
            this.b.add($$1);
            this.a($$1, $$6, $$3);
         }
      }
   }

   @Override
   protected int a(ji $$0, dww $$1) {
      int $$2 = this.d.getOrDefault($$0, -1);
      return $$2 != -1 ? b($$2) : super.a($$0, $$1);
   }
}
