import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record cpc(cpb a, LongSet b, ir c, int d) {
   private static final iw[] e = iw.values();

   @Nullable
   public static cpc a(dca $$0, ir $$1, iw $$2) {
      Long2ObjectMap<dtc> $$3 = new Long2ObjectOpenHashMap();
      LongArrayFIFOQueue $$4 = new LongArrayFIFOQueue();
      $$3.put($$1.a(), $$0.a_($$1));
      $$4.enqueue($$1.a());
      int $$5 = $$1.u();
      int $$6 = $$1.v();
      int $$7 = $$1.w();
      int $$8 = $$1.u();
      int $$9 = $$1.v();
      int $$10 = $$1.w();
      ir.a $$11 = new ir.a();
      ir.a $$12 = new ir.a();
      int $$13 = $$0.ab().c(dbw.A);

      while (!$$4.isEmpty()) {
         long $$14 = $$4.dequeueLastLong();
         $$11.f($$14);
         dtc $$15 = (dtc)$$3.get($$14);
         $$5 = Math.min($$5, $$11.u());
         $$6 = Math.min($$6, $$11.v());
         $$7 = Math.min($$7, $$11.w());
         $$8 = Math.max($$8, $$11.u());
         $$9 = Math.max($$9, $$11.v());
         $$10 = Math.max($$10, $$11.w());
         if ($$8 - $$5 + 1 > $$13 || $$9 - $$6 + 1 > $$13 || $$10 - $$7 + 1 > $$13) {
            return null;
         }

         exn $$16 = $$15.j($$0, $$11);

         for (iw $$17 : e) {
            $$12.a($$11, $$17);
            long $$18 = $$12.a();
            if (!$$3.containsKey($$18)) {
               dtc $$19 = $$0.a_($$12);
               exn $$20 = $$19.j($$0, $$12);
               boolean $$21 = $$17 == $$2 && !$$19.r();
               if ($$21 || a($$17, $$16, $$20, $$15, $$19)) {
                  $$4.enqueue($$18);
                  $$3.put($$18, $$19);
               }
            }
         }
      }

      int $$22 = $$8 - $$5 + 1;
      int $$23 = $$9 - $$6 + 1;
      int $$24 = $$10 - $$7 + 1;
      cpb $$25 = new cpb($$22, $$23, $$24);
      int $$26 = 0;
      ObjectIterator var31 = Long2ObjectMaps.fastIterable($$3).iterator();

      while (var31.hasNext()) {
         Entry<dtc> $$27 = (Entry<dtc>)var31.next();
         $$11.f($$27.getLongKey());
         dtc $$28 = ((dtc)$$27.getValue()).b(dts.C, Boolean.valueOf(false));
         if ($$28.a(dfe.R) && $$28.c(dih.b) == $$2 && $$28.c(dih.c)) {
            $$26++;
         }

         if ($$28.b() instanceof coy) {
            $$25.a(new ir($$11.u() - $$5, $$11.v() - $$6, $$11.w() - $$7));
         }

         if (!$$28.t()) {
            $$25.a($$11.u() - $$5, $$11.v() - $$6, $$11.w() - $$7, $$28);
         }
      }

      return new cpc($$25, new LongOpenHashSet($$3.keySet()), new ir($$5, $$6, $$7), $$26);
   }

   private static boolean a(iw $$0, exn $$1, exn $$2, dtc $$3, dtc $$4) {
      if (b($$3, $$0) || b($$4, $$0.g())) {
         return true;
      } else {
         return !a($$0, $$1, $$2) ? false : !a($$3, $$0) && !a($$4, $$0.g());
      }
   }

   private static boolean a(iw $$0, exn $$1, exn $$2) {
      if ($$1 != exk.a() && $$2 != exk.a()) {
         exn $$3 = exk.a($$1, $$0);
         exn $$4 = exk.a($$2, $$0.g());
         return $$3 == exk.b() && $$4 == exk.b() ? true : exk.c($$3, $$4, ewy.i);
      } else {
         return false;
      }
   }

   private static boolean a(dtc $$0, iw $$1) {
      return $$0.a(dfe.R) && $$0.c(dih.b) != $$1;
   }

   private static boolean b(dtc $$0, iw $$1) {
      if (!$$0.a(dfe.iP) && !$$0.a(dfe.qr)) {
         return $$0.a(dfe.cb) && $$0.c(dsv.a) == $$1 ? true : $$0.a(dfe.R) && $$0.c(dih.b) == $$1;
      } else {
         return true;
      }
   }

   public void a(dca $$0) {
      this.a($$1 -> {
         dtc $$2 = $$0.a_($$1);
         if ($$2.t()) {
            $$0.b($$1, true);
         } else {
            epe $$3 = $$2.u();
            dtc $$4 = $$3.g();
            $$0.a($$1, $$4, 18);
         }
      });
      this.a($$1 -> $$0.b($$1, $$0.a_($$1).b()));
   }

   private void a(Consumer<ir> $$0) {
      ir.a $$1 = new ir.a();
      LongIterator $$2 = this.b.longIterator();

      while ($$2.hasNext()) {
         $$1.f($$2.nextLong());
         $$0.accept($$1);
      }
   }
}
