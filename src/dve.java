import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;

public class dve extends dts<dws> {
   private static final int a = 19;

   public dve(Codec<dws> $$0) {
      super($$0);
   }

   private static boolean d(cvt $$0, hz $$1) {
      return $$0.a($$1, $$0x -> $$0x.a(cyq.ff));
   }

   public static boolean b(cvt $$0, hz $$1) {
      return $$0.a($$1, $$0x -> $$0x.i() || $$0x.a(atz.O));
   }

   private static void b(cvv $$0, hz $$1, dlf $$2) {
      $$0.a($$1, $$2, 19);
   }

   public static boolean c(cvt $$0, hz $$1) {
      return $$0.a($$1, $$0x -> $$0x.i() || $$0x.a(atz.cg));
   }

   private boolean a(cwi $$0, awo $$1, hz $$2, BiConsumer<hz, dlf> $$3, BiConsumer<hz, dlf> $$4, dxi.b $$5, dws $$6) {
      int $$7 = $$6.d.a($$1);
      int $$8 = $$6.f.a($$1, $$7, $$6);
      int $$9 = $$7 - $$8;
      int $$10 = $$6.f.a($$1, $$9);
      hz $$11 = $$6.g.<hz>map($$2x -> $$2x.a($$2, $$1)).orElse($$2);
      int $$12 = Math.min($$2.v(), $$11.v());
      int $$13 = Math.max($$2.v(), $$11.v()) + $$7 + 1;
      if ($$12 >= $$0.J_() + 1 && $$13 <= $$0.al()) {
         OptionalInt $$14 = $$6.h.c();
         int $$15 = this.a($$0, $$7, $$11, $$6);
         if ($$15 >= $$7 || !$$14.isEmpty() && $$15 >= $$14.getAsInt()) {
            if ($$6.g.isPresent() && !$$6.g.get().a($$0, $$3, $$1, $$2, $$11, $$6)) {
               return false;
            } else {
               List<dxi.a> $$16 = $$6.d.a($$0, $$4, $$1, $$15, $$11, $$6);
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

   private int a(cvt $$0, int $$1, hz $$2, dws $$3) {
      hz.a $$4 = new hz.a();

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
   protected void a(cvv $$0, hz $$1, dlf $$2) {
      b($$0, $$1, $$2);
   }

   @Override
   public final boolean a(dtu<dws> $$0) {
      final cwi $$1 = $$0.b();
      awo $$2 = $$0.d();
      hz $$3 = $$0.e();
      dws $$4 = $$0.f();
      Set<hz> $$5 = Sets.newHashSet();
      Set<hz> $$6 = Sets.newHashSet();
      final Set<hz> $$7 = Sets.newHashSet();
      Set<hz> $$8 = Sets.newHashSet();
      BiConsumer<hz, dlf> $$9 = ($$2x, $$3x) -> {
         $$5.add($$2x.i());
         $$1.a($$2x, $$3x, 19);
      };
      BiConsumer<hz, dlf> $$10 = ($$2x, $$3x) -> {
         $$6.add($$2x.i());
         $$1.a($$2x, $$3x, 19);
      };
      dxi.b $$11 = new dxi.b() {
         @Override
         public void a(hz $$0, dlf $$1x) {
            $$7.add($$0.i());
            $$1.a($$0, $$1, 19);
         }

         @Override
         public boolean a(hz $$0) {
            return $$7.contains($$0);
         }
      };
      BiConsumer<hz, dlf> $$12 = ($$2x, $$3x) -> {
         $$8.add($$2x.i());
         $$1.a($$2x, $$3x, 19);
      };
      boolean $$13 = this.a($$1, $$2, $$3, $$9, $$10, $$11, $$4);
      if ($$13 && (!$$6.isEmpty() || !$$7.isEmpty())) {
         if (!$$4.i.isEmpty()) {
            dyo.a $$14 = new dyo.a($$1, $$12, $$2, $$6, $$7, $$5);
            $$4.i.forEach($$1x -> $$1x.a($$14));
         }

         return eaw.a(Iterables.concat($$5, $$6, $$7, $$8)).map($$4x -> {
            eob $$5x = a($$1, $$4x, $$6, $$8, $$5);
            efe.a($$1, 3, $$5x, $$4x.h(), $$4x.i(), $$4x.j());
            return true;
         }).orElse(false);
      } else {
         return false;
      }
   }

   private static eob a(cvo $$0, eaw $$1, Set<hz> $$2, Set<hz> $$3, Set<hz> $$4) {
      eob $$5 = new env($$1.d(), $$1.e(), $$1.f());
      int $$6 = 7;
      List<Set<hz>> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < 7; $$8++) {
         $$7.add(Sets.newHashSet());
      }

      for (hz $$9 : Lists.newArrayList(Sets.union($$3, $$4))) {
         if ($$1.b($$9)) {
            $$5.c($$9.u() - $$1.h(), $$9.v() - $$1.i(), $$9.w() - $$1.j());
         }
      }

      hz.a $$10 = new hz.a();
      int $$11 = 0;
      $$7.get(0).addAll($$2);

      while (true) {
         while ($$11 >= 7 || !$$7.get($$11).isEmpty()) {
            if ($$11 >= 7) {
               return $$5;
            }

            Iterator<hz> $$12 = $$7.get($$11).iterator();
            hz $$13 = $$12.next();
            $$12.remove();
            if ($$1.b($$13)) {
               if ($$11 != 0) {
                  dlf $$14 = $$0.a_($$13);
                  b($$0, $$13, $$14.a(dlv.aC, Integer.valueOf($$11)));
               }

               $$5.c($$13.u() - $$1.h(), $$13.v() - $$1.i(), $$13.w() - $$1.j());

               for (ie $$15 : ie.values()) {
                  $$10.a($$13, $$15);
                  if ($$1.b($$10)) {
                     int $$16 = $$10.u() - $$1.h();
                     int $$17 = $$10.v() - $$1.i();
                     int $$18 = $$10.w() - $$1.j();
                     if (!$$5.b($$16, $$17, $$18)) {
                        dlf $$19 = $$0.a_($$10);
                        OptionalInt $$20 = dcx.n($$19);
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
