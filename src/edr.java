import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;

public class edr extends eca<efg> {
   private static final int a = 19;

   public edr(Codec<efg> $$0) {
      super($$0);
   }

   private static boolean d(dcg $$0, ir $$1) {
      return $$0.a($$1, $$0x -> $$0x.a(dfe.fX));
   }

   public static boolean b(dcg $$0, ir $$1) {
      return $$0.a($$1, $$0x -> $$0x.i() || $$0x.a(awe.O));
   }

   private static void b(dci $$0, ir $$1, dtc $$2) {
      $$0.a($$1, $$2, 19);
   }

   public static boolean c(dcg $$0, ir $$1) {
      return $$0.a($$1, $$0x -> $$0x.i() || $$0x.a(awe.cq));
   }

   private boolean a(dcv $$0, ayt $$1, ir $$2, BiConsumer<ir, dtc> $$3, BiConsumer<ir, dtc> $$4, efw.b $$5, efg $$6) {
      int $$7 = $$6.d.a($$1);
      int $$8 = $$6.f.a($$1, $$7, $$6);
      int $$9 = $$7 - $$8;
      int $$10 = $$6.f.a($$1, $$9);
      ir $$11 = $$6.g.<ir>map($$2x -> $$2x.a($$2, $$1)).orElse($$2);
      int $$12 = Math.min($$2.v(), $$11.v());
      int $$13 = Math.max($$2.v(), $$11.v()) + $$7 + 1;
      if ($$12 >= $$0.J_() + 1 && $$13 <= $$0.am()) {
         OptionalInt $$14 = $$6.h.c();
         int $$15 = this.a($$0, $$7, $$11, $$6);
         if ($$15 >= $$7 || !$$14.isEmpty() && $$15 >= $$14.getAsInt()) {
            if ($$6.g.isPresent() && !$$6.g.get().a($$0, $$3, $$1, $$2, $$11, $$6)) {
               return false;
            } else {
               List<efw.a> $$16 = $$6.d.a($$0, $$4, $$1, $$15, $$11, $$6);
               $$16.forEach($$7x -> $$6.f.a($$0, $$5, $$1, $$6, $$15, $$7x, $$8, $$10));
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int a(dcg $$0, int $$1, ir $$2, efg $$3) {
      ir.a $$4 = new ir.a();

      for (int $$5 = 0; $$5 <= $$1 + 1; $$5++) {
         int $$6 = $$3.h.a($$1, $$5);

         for (int $$7 = -$$6; $$7 <= $$6; $$7++) {
            for (int $$8 = -$$6; $$8 <= $$6; $$8++) {
               $$4.a($$2, $$7, $$5, $$8);
               if (!$$3.d.b($$0, $$4) || !$$3.j && d($$0, $$4)) {
                  return $$5 - 2;
               }
            }
         }
      }

      return $$1;
   }

   @Override
   protected void a(dci $$0, ir $$1, dtc $$2) {
      b($$0, $$1, $$2);
   }

   @Override
   public final boolean a(ecc<efg> $$0) {
      final dcv $$1 = $$0.b();
      ayt $$2 = $$0.d();
      ir $$3 = $$0.e();
      efg $$4 = $$0.f();
      Set<ir> $$5 = Sets.newHashSet();
      Set<ir> $$6 = Sets.newHashSet();
      final Set<ir> $$7 = Sets.newHashSet();
      Set<ir> $$8 = Sets.newHashSet();
      BiConsumer<ir, dtc> $$9 = ($$2x, $$3x) -> {
         $$5.add($$2x.i());
         $$1.a($$2x, $$3x, 19);
      };
      BiConsumer<ir, dtc> $$10 = ($$2x, $$3x) -> {
         $$6.add($$2x.i());
         $$1.a($$2x, $$3x, 19);
      };
      efw.b $$11 = new efw.b() {
         @Override
         public void a(ir $$0, dtc $$1x) {
            $$7.add($$0.i());
            $$1.a($$0, $$1, 19);
         }

         @Override
         public boolean a(ir $$0) {
            return $$7.contains($$0);
         }
      };
      BiConsumer<ir, dtc> $$12 = ($$2x, $$3x) -> {
         $$8.add($$2x.i());
         $$1.a($$2x, $$3x, 19);
      };
      boolean $$13 = this.a($$1, $$2, $$3, $$9, $$10, $$11, $$4);
      if ($$13 && (!$$6.isEmpty() || !$$7.isEmpty())) {
         if (!$$4.i.isEmpty()) {
            ehc.a $$14 = new ehc.a($$1, $$12, $$2, $$6, $$7, $$5);
            $$4.i.forEach($$1x -> $$1x.a($$14));
         }

         return ejl.a(Iterables.concat($$5, $$6, $$7, $$8)).map($$4x -> {
            exd $$5x = a($$1, $$4x, $$6, $$8, $$5);
            ent.a($$1, 3, $$5x, $$4x.h(), $$4x.i(), $$4x.j());
            return true;
         }).orElse(false);
      } else {
         return false;
      }
   }

   private static exd a(dcb $$0, ejl $$1, Set<ir> $$2, Set<ir> $$3, Set<ir> $$4) {
      exd $$5 = new ewx($$1.d(), $$1.e(), $$1.f());
      int $$6 = 7;
      List<Set<ir>> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < 7; $$8++) {
         $$7.add(Sets.newHashSet());
      }

      for (ir $$9 : Lists.newArrayList(Sets.union($$3, $$4))) {
         if ($$1.b($$9)) {
            $$5.c($$9.u() - $$1.h(), $$9.v() - $$1.i(), $$9.w() - $$1.j());
         }
      }

      ir.a $$10 = new ir.a();
      int $$11 = 0;
      $$7.get(0).addAll($$2);

      while (true) {
         while ($$11 >= 7 || !$$7.get($$11).isEmpty()) {
            if ($$11 >= 7) {
               return $$5;
            }

            Iterator<ir> $$12 = $$7.get($$11).iterator();
            ir $$13 = $$12.next();
            $$12.remove();
            if ($$1.b($$13)) {
               if ($$11 != 0) {
                  dtc $$14 = $$0.a_($$13);
                  b($$0, $$13, $$14.a(dts.aC, Integer.valueOf($$11)));
               }

               $$5.c($$13.u() - $$1.h(), $$13.v() - $$1.i(), $$13.w() - $$1.j());

               for (iw $$15 : iw.values()) {
                  $$10.a($$13, $$15);
                  if ($$1.b($$10)) {
                     int $$16 = $$10.u() - $$1.h();
                     int $$17 = $$10.v() - $$1.i();
                     int $$18 = $$10.w() - $$1.j();
                     if (!$$5.b($$16, $$17, $$18)) {
                        dtc $$19 = $$0.a_($$10);
                        OptionalInt $$20 = djq.n($$19);
                        if (!$$20.isEmpty()) {
                           int $$21 = Math.min($$20.getAsInt(), $$11 + 1);
                           if ($$21 < 7) {
                              $$7.get($$21).add($$10.i());
                              $$11 = Math.min($$11, $$21);
                           }
                        }
                     }
                  }
               }
            }
         }

         $$11++;
      }
   }
}
