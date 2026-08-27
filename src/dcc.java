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

public abstract class dcc implements dcb {
   public static final Codec<dcc> a = le.ab.q().dispatchStable(dcc::a, Function.identity());
   private final Supplier<Set<ix<dby>>> b = Suppliers.memoize(() -> this.b().distinct().collect(ImmutableSet.toImmutableSet()));

   protected dcc() {
   }

   protected abstract MapCodec<? extends dcc> a();

   protected abstract Stream<ix<dby>> b();

   public Set<ix<dby>> c() {
      return this.b.get();
   }

   public Set<ix<dby>> a(int $$0, int $$1, int $$2, int $$3, dch.f $$4) {
      int $$5 = ji.a($$0 - $$3);
      int $$6 = ji.a($$1 - $$3);
      int $$7 = ji.a($$2 - $$3);
      int $$8 = ji.a($$0 + $$3);
      int $$9 = ji.a($$1 + $$3);
      int $$10 = ji.a($$2 + $$3);
      int $$11 = $$8 - $$5 + 1;
      int $$12 = $$9 - $$6 + 1;
      int $$13 = $$10 - $$7 + 1;
      Set<ix<dby>> $$14 = Sets.newHashSet();

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
   public Pair<io, ix<dby>> a(int $$0, int $$1, int $$2, int $$3, Predicate<ix<dby>> $$4, aym $$5, dch.f $$6) {
      return this.a($$0, $$1, $$2, $$3, 1, $$4, $$5, false, $$6);
   }

   @Nullable
   public Pair<io, ix<dby>> a(io $$0, int $$1, int $$2, int $$3, Predicate<ix<dby>> $$4, dch.f $$5, dbc $$6) {
      Set<ix<dby>> $$7 = this.c().stream().filter($$4).collect(Collectors.toUnmodifiableSet());
      if ($$7.isEmpty()) {
         return null;
      } else {
         int $$8 = Math.floorDiv($$1, $$2);
         int[] $$9 = ayf.a($$0.v(), $$6.I_() + 1, $$6.al(), $$3).toArray();

         for (io.a $$10 : io.a(io.c, $$8, it.f, it.d)) {
            int $$11 = $$0.u() + $$10.u() * $$2;
            int $$12 = $$0.w() + $$10.w() * $$2;
            int $$13 = ji.a($$11);
            int $$14 = ji.a($$12);

            for (int $$15 : $$9) {
               int $$16 = ji.a($$15);
               ix<dby> $$17 = this.getNoiseBiome($$13, $$16, $$14, $$5);
               if ($$7.contains($$17)) {
                  return Pair.of(new io($$11, $$15, $$12), $$17);
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public Pair<io, ix<dby>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ix<dby>> $$5, aym $$6, boolean $$7, dch.f $$8) {
      int $$9 = ji.a($$0);
      int $$10 = ji.a($$2);
      int $$11 = ji.a($$3);
      int $$12 = ji.a($$1);
      Pair<io, ix<dby>> $$13 = null;
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
               ix<dby> $$23 = this.getNoiseBiome($$21, $$12, $$22, $$8);
               if ($$5.test($$23)) {
                  if ($$13 == null || $$6.a($$14 + 1) == 0) {
                     io $$24 = new io(ji.c($$21), $$1, ji.c($$22));
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
   public abstract ix<dby> getNoiseBiome(int var1, int var2, int var3, dch.f var4);

   public void a(List<String> $$0, io $$1, dch.f $$2) {
   }
}
