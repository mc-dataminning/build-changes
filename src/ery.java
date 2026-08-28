import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayDeque;
import java.util.Deque;
import javax.annotation.Nullable;

public class ery extends esd {
   private final Deque<jf> b = new ArrayDeque<>();
   private final Deque<jf> c = new ArrayDeque<>();
   private final Object2IntMap<jf> d = new Object2IntLinkedOpenHashMap();

   public ery(dnp $$0) {
      super($$0);
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, @Nullable esb $$3, boolean $$4) {
      esb $$5 = a($$0, $$3);
      this.a($$0, $$1, $$5);
      ObjectIterator<Entry<jf>> $$6 = this.d.object2IntEntrySet().iterator();

      for (boolean $$7 = true; $$6.hasNext(); $$7 = false) {
         Entry<jf> $$8 = (Entry<jf>)$$6.next();
         jf $$9 = (jf)$$8.getKey();
         int $$10 = $$8.getIntValue();
         int $$11 = b($$10);
         dus $$12 = $$0.a_($$9);
         if ($$12.a(this.a) && !$$12.c(dnp.f).equals($$11)) {
            int $$13 = 2;
            if (!$$4 || !$$7) {
               $$13 |= 128;
            }

            $$0.a($$9, $$12.b(dnp.f, Integer.valueOf($$11)), $$13);
         } else {
            $$6.remove();
         }
      }

      this.a($$0);
   }

   private void a(dej $$0) {
      this.d.forEach(($$1, $$2) -> {
         esb $$3 = a($$2);
         dus $$4 = $$0.a_($$1);

         for (jk $$5 : $$3.f()) {
            if (a($$4, $$5)) {
               jf $$6 = $$1.a($$5);
               dus $$7 = $$0.a_($$6);
               esb $$8 = $$3.c($$5);
               $$0.a($$7, $$6, this.a, $$8, false);
               if ($$7.d($$0, $$6)) {
                  for (jk $$9 : $$8.f()) {
                     if ($$9 != $$5.g()) {
                        $$0.b($$6.a($$9), this.a, $$8.c($$9));
                     }
                  }
               }
            }
         }
      });
   }

   private static boolean a(dus $$0, jk $$1) {
      dvq<dvx> $$2 = dnp.g.get($$1);
      return $$2 == null ? $$1 == jk.a : $$0.c($$2).a();
   }

   private static esb a(dej $$0, @Nullable esb $$1) {
      esb $$2;
      if ($$1 != null) {
         $$2 = $$1;
      } else {
         $$2 = esb.a($$0.z);
      }

      return $$2.a(jk.b).a(esb.a.a);
   }

   private void a(dej $$0, jf $$1, esb $$2) {
      dus $$3 = $$0.a_($$1);
      if ($$3.a(this.a)) {
         this.a($$1, $$3.c(dnp.f), $$2);
         this.b.add($$1);
      } else {
         this.a($$0, $$1, 0, $$2, true);
      }

      while (!this.b.isEmpty()) {
         jf $$4 = this.b.removeFirst();
         int $$5 = this.d.getInt($$4);
         esb $$6 = a($$5);
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
         jf $$13 = this.c.removeFirst();
         int $$14 = this.d.getInt($$13);
         int $$15 = b($$14);
         int $$16 = this.a($$0, $$13);
         int $$17 = this.b($$0, $$13);
         int $$18 = Math.max($$16, $$17);
         esb $$19 = a($$14);
         if ($$18 > $$15) {
            this.a($$13, $$18, $$19);
         } else if ($$18 < $$15) {
            throw new IllegalStateException("Turning off wire while trying to turn it on. Should not happen.");
         }

         this.a($$0, $$13, $$18, $$19, false);
      }
   }

   private static int a(esb $$0, int $$1) {
      return $$0.i() << 4 | $$1;
   }

   private static esb a(int $$0) {
      return esb.a($$0 >> 4);
   }

   private static int b(int $$0) {
      return $$0 & 15;
   }

   private void a(jf $$0, int $$1, esb $$2) {
      this.d.compute($$0, ($$2x, $$3) -> $$3 == null ? a($$2, $$1) : a(a($$3), $$1));
   }

   private void a(dej $$0, jf $$1, int $$2, esb $$3, boolean $$4) {
      for (jk $$5 : $$3.g()) {
         jf $$6 = $$1.a($$5);
         this.b($$0, $$6, $$2, $$3.b($$5), $$4);
      }

      for (jk $$7 : $$3.h()) {
         jf $$8 = $$1.a($$7);
         boolean $$9 = $$0.a_($$8).d($$0, $$8);

         for (jk $$10 : $$3.g()) {
            jf $$11 = $$1.a($$10);
            if ($$7 == jk.b && !$$9) {
               jf $$12 = $$8.a($$10);
               this.b($$0, $$12, $$2, $$3.b($$10), $$4);
            } else if ($$7 == jk.a && !$$0.a_($$11).d($$0, $$11)) {
               jf $$13 = $$8.a($$10);
               this.b($$0, $$13, $$2, $$3.b($$10), $$4);
            }
         }
      }
   }

   private void b(dej $$0, jf $$1, int $$2, esb $$3, boolean $$4) {
      dus $$5 = $$0.a_($$1);
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
   protected int a(jf $$0, dus $$1) {
      int $$2 = this.d.getOrDefault($$0, -1);
      return $$2 != -1 ? b($$2) : super.a($$0, $$1);
   }
}
