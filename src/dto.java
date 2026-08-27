import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;

public class dto extends dsc<dvc> {
   private static final int a = 19;

   public dto(Codec<dvc> $$0) {
      super($$0);
   }

   private static boolean d(cud $$0, hx $$1) {
      return $$0.a($$1, $$0x -> $$0x.a(cxa.ff));
   }

   public static boolean b(cud $$0, hx $$1) {
      return $$0.a($$1, $$0x -> $$0x.i() || $$0x.a(asi.O));
   }

   private static void b(cuf $$0, hx $$1, djp $$2) {
      $$0.a($$1, $$2, 19);
   }

   public static boolean c(cud $$0, hx $$1) {
      return $$0.a($$1, $$0x -> $$0x.i() || $$0x.a(asi.cf));
   }

   private boolean a(cus $$0, auw $$1, hx $$2, BiConsumer<hx, djp> $$3, BiConsumer<hx, djp> $$4, dvs.b $$5, dvc $$6) {
      int $$7 = $$6.d.a($$1);
      int $$8 = $$6.f.a($$1, $$7, $$6);
      int $$9 = $$7 - $$8;
      int $$10 = $$6.f.a($$1, $$9);
      hx $$11 = $$6.g.<hx>map($$2x -> $$2x.a($$2, $$1)).orElse($$2);
      int $$12 = Math.min($$2.v(), $$11.v());
      int $$13 = Math.max($$2.v(), $$11.v()) + $$7 + 1;
      if ($$12 >= $$0.J_() + 1 && $$13 <= $$0.al()) {
         OptionalInt $$14 = $$6.h.c();
         int $$15 = this.a($$0, $$7, $$11, $$6);
         if ($$15 >= $$7 || !$$14.isEmpty() && $$15 >= $$14.getAsInt()) {
            if ($$6.g.isPresent() && !$$6.g.get().a($$0, $$3, $$1, $$2, $$11, $$6)) {
               return false;
            } else {
               List<dvs.a> $$16 = $$6.d.a($$0, $$4, $$1, $$15, $$11, $$6);
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

   private int a(cud $$0, int $$1, hx $$2, dvc $$3) {
      hx.a $$4 = new hx.a();

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
   protected void a(cuf $$0, hx $$1, djp $$2) {
      b($$0, $$1, $$2);
   }

   @Override
   public final boolean a(dse<dvc> $$0) {
      final cus $$1 = $$0.b();
      auw $$2 = $$0.d();
      hx $$3 = $$0.e();
      dvc $$4 = $$0.f();
      Set<hx> $$5 = Sets.newHashSet();
      Set<hx> $$6 = Sets.newHashSet();
      final Set<hx> $$7 = Sets.newHashSet();
      Set<hx> $$8 = Sets.newHashSet();
      BiConsumer<hx, djp> $$9 = ($$2x, $$3x) -> {
         $$5.add($$2x.i());
         $$1.a($$2x, $$3x, 19);
      };
      BiConsumer<hx, djp> $$10 = ($$2x, $$3x) -> {
         $$6.add($$2x.i());
         $$1.a($$2x, $$3x, 19);
      };
      dvs.b $$11 = new dvs.b() {
         @Override
         public void a(hx $$0, djp $$1x) {
            $$7.add($$0.i());
            $$1.a($$0, $$1, 19);
         }

         @Override
         public boolean a(hx $$0) {
            return $$7.contains($$0);
         }
      };
      BiConsumer<hx, djp> $$12 = ($$2x, $$3x) -> {
         $$8.add($$2x.i());
         $$1.a($$2x, $$3x, 19);
      };
      boolean $$13 = this.a($$1, $$2, $$3, $$9, $$10, $$11, $$4);
      if ($$13 && (!$$6.isEmpty() || !$$7.isEmpty())) {
         if (!$$4.i.isEmpty()) {
            dwy.a $$14 = new dwy.a($$1, $$12, $$2, $$6, $$7, $$5);
            $$4.i.forEach($$1x -> $$1x.a($$14));
         }

         return dzg.a(Iterables.concat($$5, $$6, $$7, $$8)).map($$4x -> {
            eml $$5x = a($$1, $$4x, $$6, $$8, $$5);
            edo.a($$1, 3, $$5x, $$4x.h(), $$4x.i(), $$4x.j());
            return true;
         }).orElse(false);
      } else {
         return false;
      }
   }

   private static eml a(cty $$0, dzg $$1, Set<hx> $$2, Set<hx> $$3, Set<hx> $$4) {
      eml $$5 = new emf($$1.d(), $$1.e(), $$1.f());
      int $$6 = 7;
      List<Set<hx>> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < 7; $$8++) {
         $$7.add(Sets.newHashSet());
      }

      for (hx $$9 : Lists.newArrayList(Sets.union($$3, $$4))) {
         if ($$1.b($$9)) {
            $$5.c($$9.u() - $$1.h(), $$9.v() - $$1.i(), $$9.w() - $$1.j());
         }
      }

      hx.a $$10 = new hx.a();
      int $$11 = 0;
      $$7.get(0).addAll($$2);

      while (true) {
         while ($$11 >= 7 || !$$7.get($$11).isEmpty()) {
            if ($$11 >= 7) {
               return $$5;
            }

            Iterator<hx> $$12 = $$7.get($$11).iterator();
            hx $$13 = $$12.next();
            $$12.remove();
            if ($$1.b($$13)) {
               if ($$11 != 0) {
                  djp $$14 = $$0.a_($$13);
                  b($$0, $$13, $$14.a(dkf.aC, Integer.valueOf($$11)));
               }

               $$5.c($$13.u() - $$1.h(), $$13.v() - $$1.i(), $$13.w() - $$1.j());

               for (ic $$15 : ic.values()) {
                  $$10.a($$13, $$15);
                  if ($$1.b($$10)) {
                     int $$16 = $$10.u() - $$1.h();
                     int $$17 = $$10.v() - $$1.i();
                     int $$18 = $$10.w() - $$1.j();
                     if (!$$5.b($$16, $$17, $$18)) {
                        djp $$19 = $$0.a_($$10);
                        OptionalInt $$20 = dbh.n($$19);
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
