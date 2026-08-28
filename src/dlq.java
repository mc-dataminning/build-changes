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

public abstract class dlq implements dlp {
   public static final Codec<dlq> a = mh.Z.q().dispatchStable(dlq::a, Function.identity());
   private final Supplier<Set<jg<dlm>>> b = Suppliers.memoize(() -> this.b().distinct().collect(ImmutableSet.toImmutableSet()));

   protected dlq() {
   }

   protected abstract MapCodec<? extends dlq> a();

   protected abstract Stream<jg<dlm>> b();

   public Set<jg<dlm>> c() {
      return this.b.get();
   }

   public Set<jg<dlm>> a(int $$0, int $$1, int $$2, int $$3, dlv.f $$4) {
      int $$5 = jr.a($$0 - $$3);
      int $$6 = jr.a($$1 - $$3);
      int $$7 = jr.a($$2 - $$3);
      int $$8 = jr.a($$0 + $$3);
      int $$9 = jr.a($$1 + $$3);
      int $$10 = jr.a($$2 + $$3);
      int $$11 = $$8 - $$5 + 1;
      int $$12 = $$9 - $$6 + 1;
      int $$13 = $$10 - $$7 + 1;
      Set<jg<dlm>> $$14 = Sets.newHashSet();

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
   public Pair<iw, jg<dlm>> a(int $$0, int $$1, int $$2, int $$3, Predicate<jg<dlm>> $$4, bai $$5, dlv.f $$6) {
      return this.a($$0, $$1, $$2, $$3, 1, $$4, $$5, false, $$6);
   }

   @Nullable
   public Pair<iw, jg<dlm>> a(iw $$0, int $$1, int $$2, int $$3, Predicate<jg<dlm>> $$4, dlv.f $$5, dkm $$6) {
      Set<jg<dlm>> $$7 = this.c().stream().filter($$4).collect(Collectors.toUnmodifiableSet());
      if ($$7.isEmpty()) {
         return null;
      } else {
         int $$8 = Math.floorDiv($$1, $$2);
         int[] $$9 = azz.a($$0.v(), $$6.K_() + 1, $$6.ao() + 1, $$3).toArray();

         for (iw.a $$10 : iw.a(iw.c, $$8, jc.f, jc.d)) {
            int $$11 = $$0.u() + $$10.u() * $$2;
            int $$12 = $$0.w() + $$10.w() * $$2;
            int $$13 = jr.a($$11);
            int $$14 = jr.a($$12);

            for (int $$15 : $$9) {
               int $$16 = jr.a($$15);
               jg<dlm> $$17 = this.getNoiseBiome($$13, $$16, $$14, $$5);
               if ($$7.contains($$17)) {
                  return Pair.of(new iw($$11, $$15, $$12), $$17);
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public Pair<iw, jg<dlm>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jg<dlm>> $$5, bai $$6, boolean $$7, dlv.f $$8) {
      int $$9 = jr.a($$0);
      int $$10 = jr.a($$2);
      int $$11 = jr.a($$3);
      int $$12 = jr.a($$1);
      Pair<iw, jg<dlm>> $$13 = null;
      int $$14 = 0;
      int $$15 = $$7 ? 0 : $$11;
      int $$16 = $$15;

      while ($$16 <= $$11) {
         for (int $$17 = ac.ar ? 0 : -$$16; $$17 <= $$16; $$17 += $$4) {
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
               jg<dlm> $$23 = this.getNoiseBiome($$21, $$12, $$22, $$8);
               if ($$5.test($$23)) {
                  if ($$13 == null || $$6.a($$14 + 1) == 0) {
                     iw $$24 = new iw(jr.c($$21), $$1, jr.c($$22));
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
   public abstract jg<dlm> getNoiseBiome(int var1, int var2, int var3, dlv.f var4);

   public void a(List<String> $$0, iw $$1, dlv.f $$2) {
   }
}
