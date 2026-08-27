import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class csb implements csa {
   public static final Codec<csb> a = jy.ac.q().dispatchStable(csb::a, Function.identity());
   private final Supplier<Set<ib<crx>>> b = Suppliers.memoize(() -> this.b().distinct().collect(ImmutableSet.toImmutableSet()));

   protected csb() {
   }

   protected abstract Codec<? extends csb> a();

   protected abstract Stream<ib<crx>> b();

   public Set<ib<crx>> c() {
      return this.b.get();
   }

   public Set<ib<crx>> a(int $$0, int $$1, int $$2, int $$3, csg.f $$4) {
      int $$5 = in.a($$0 - $$3);
      int $$6 = in.a($$1 - $$3);
      int $$7 = in.a($$2 - $$3);
      int $$8 = in.a($$0 + $$3);
      int $$9 = in.a($$1 + $$3);
      int $$10 = in.a($$2 + $$3);
      int $$11 = $$8 - $$5 + 1;
      int $$12 = $$9 - $$6 + 1;
      int $$13 = $$10 - $$7 + 1;
      Set<ib<crx>> $$14 = Sets.newHashSet();

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
   public Pair<ht, ib<crx>> a(int $$0, int $$1, int $$2, int $$3, Predicate<ib<crx>> $$4, ate $$5, csg.f $$6) {
      return this.a($$0, $$1, $$2, $$3, 1, $$4, $$5, false, $$6);
   }

   @Nullable
   public Pair<ht, ib<crx>> a(ht $$0, int $$1, int $$2, int $$3, Predicate<ib<crx>> $$4, csg.f $$5, crc $$6) {
      Set<ib<crx>> $$7 = this.c().stream().filter($$4).collect(Collectors.toUnmodifiableSet());
      if ($$7.isEmpty()) {
         return null;
      } else {
         int $$8 = Math.floorDiv($$1, $$2);
         int[] $$9 = asy.a($$0.v(), $$6.I_() + 1, $$6.aj(), $$3).toArray();

         for (ht.a $$10 : ht.a(ht.b, $$8, hx.f, hx.d)) {
            int $$11 = $$0.u() + $$10.u() * $$2;
            int $$12 = $$0.w() + $$10.w() * $$2;
            int $$13 = in.a($$11);
            int $$14 = in.a($$12);

            for (int $$15 : $$9) {
               int $$16 = in.a($$15);
               ib<crx> $$17 = this.getNoiseBiome($$13, $$16, $$14, $$5);
               if ($$7.contains($$17)) {
                  return Pair.of(new ht($$11, $$15, $$12), $$17);
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public Pair<ht, ib<crx>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ib<crx>> $$5, ate $$6, boolean $$7, csg.f $$8) {
      int $$9 = in.a($$0);
      int $$10 = in.a($$2);
      int $$11 = in.a($$3);
      int $$12 = in.a($$1);
      Pair<ht, ib<crx>> $$13 = null;
      int $$14 = 0;
      int $$15 = $$7 ? 0 : $$11;
      int $$16 = $$15;

      while ($$16 <= $$11) {
         for (int $$17 = aa.aq ? 0 : -$$16; $$17 <= $$16; $$17 += $$4) {
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
               ib<crx> $$23 = this.getNoiseBiome($$21, $$12, $$22, $$8);
               if ($$5.test($$23)) {
                  if ($$13 == null || $$6.a($$14 + 1) == 0) {
                     ht $$24 = new ht(in.c($$21), $$1, in.c($$22));
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
   public abstract ib<crx> getNoiseBiome(int var1, int var2, int var3, csg.f var4);

   public void a(List<String> $$0, ht $$1, csg.f $$2) {
   }
}
