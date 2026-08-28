import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class ddb implements dda {
   public static final Codec<ddb> a = lp.ab.q().dispatchStable(ddb::a, Function.identity());
   private final Supplier<Set<ji<dcx>>> b = Suppliers.memoize(() -> this.b().distinct().collect(ImmutableSet.toImmutableSet()));

   protected ddb() {
   }

   protected abstract MapCodec<? extends ddb> a();

   protected abstract Stream<ji<dcx>> b();

   public Set<ji<dcx>> c() {
      return this.b.get();
   }

   public Set<ji<dcx>> a(int $$0, int $$1, int $$2, int $$3, ddg.f $$4) {
      int $$5 = jt.a($$0 - $$3);
      int $$6 = jt.a($$1 - $$3);
      int $$7 = jt.a($$2 - $$3);
      int $$8 = jt.a($$0 + $$3);
      int $$9 = jt.a($$1 + $$3);
      int $$10 = jt.a($$2 + $$3);
      int $$11 = $$8 - $$5 + 1;
      int $$12 = $$9 - $$6 + 1;
      int $$13 = $$10 - $$7 + 1;
      Set<ji<dcx>> $$14 = Sets.newHashSet();

      for (int $$15 = 0; $$15 < $$13; $$15++) {
         for (int $$16 = 0; $$16 < $$11; $$16++) {
            for (int $$17 = 0; $$17 < $$12; $$17++) {
               int $$18 = $$5 + $$16;
               int $$19 = $$6 + $$17;
               int $$20 = $$7 + $$15;
               $$14.add(this.getNoiseBiome($$18, $$19, $$20, $$4));
            }
         }
      }

      return $$14;
   }

   @Nullable
   public Pair<iz, ji<dcx>> a(int $$0, int $$1, int $$2, int $$3, Predicate<ji<dcx>> $$4, azh $$5, ddg.f $$6) {
      return this.a($$0, $$1, $$2, $$3, 1, $$4, $$5, false, $$6);
   }

   @Nullable
   public Pair<iz, ji<dcx>> a(iz $$0, int $$1, int $$2, int $$3, Predicate<ji<dcx>> $$4, ddg.f $$5, dcb $$6) {
      Set<ji<dcx>> $$7 = this.c().stream().filter($$4).collect(Collectors.toUnmodifiableSet());
      if ($$7.isEmpty()) {
         return null;
      } else {
         int $$8 = Math.floorDiv($$1, $$2);
         int[] $$9 = ayz.a($$0.v(), $$6.I_() + 1, $$6.am(), $$3).toArray();

         for (iz.a $$10 : iz.a(iz.c, $$8, je.f, je.d)) {
            int $$11 = $$0.u() + $$10.u() * $$2;
            int $$12 = $$0.w() + $$10.w() * $$2;
            int $$13 = jt.a($$11);
            int $$14 = jt.a($$12);

            for (int $$15 : $$9) {
               int $$16 = jt.a($$15);
               ji<dcx> $$17 = this.getNoiseBiome($$13, $$16, $$14, $$5);
               if ($$7.contains($$17)) {
                  return Pair.of(new iz($$11, $$15, $$12), $$17);
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public Pair<iz, ji<dcx>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ji<dcx>> $$5, azh $$6, boolean $$7, ddg.f $$8) {
      int $$9 = jt.a($$0);
      int $$10 = jt.a($$2);
      int $$11 = jt.a($$3);
      int $$12 = jt.a($$1);
      Pair<iz, ji<dcx>> $$13 = null;
      int $$14 = 0;
      int $$15 = $$7 ? 0 : $$11;
      int $$16 = $$15;

      while ($$16 <= $$11) {
         for (int $$17 = aa.as ? 0 : -$$16; $$17 <= $$16; $$17 += $$4) {
            boolean $$18 = Math.abs($$17) == $$16;

            for (int $$19 = -$$16; $$19 <= $$16; $$19 += $$4) {
               if ($$7) {
                  boolean $$20 = Math.abs($$19) == $$16;
                  if (!$$20 && !$$18) {
                     continue;
                  }
               }

               int $$21 = $$9 + $$19;
               int $$22 = $$10 + $$17;
               ji<dcx> $$23 = this.getNoiseBiome($$21, $$12, $$22, $$8);
               if ($$5.test($$23)) {
                  if ($$13 == null || $$6.a($$14 + 1) == 0) {
                     iz $$24 = new iz(jt.c($$21), $$1, jt.c($$22));
                     if ($$7) {
                        return Pair.of($$24, $$23);
                     }

                     $$13 = Pair.of($$24, $$23);
                  }

                  $$14++;
               }
            }
         }

         $$16 += $$4;
      }

      return $$13;
   }

   @Override
   public abstract ji<dcx> getNoiseBiome(int var1, int var2, int var3, ddg.f var4);

   public void a(List<String> $$0, iz $$1, ddg.f $$2) {
   }
}
