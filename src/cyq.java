import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class cyq implements Predicate<cun> {
   public static final cyq a = new cyq(Stream.empty());
   public static final zm<wz, cyq> b = cun.k.a($$0 -> b($$0.stream().map(cyq.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cyq.c[] e;
   @Nullable
   private cun[] f;
   @Nullable
   private IntList g;
   public static final Codec<cyq> c = a(true);
   public static final Codec<cyq> d = a(false);

   private cyq(Stream<? extends cyq.c> $$0) {
      this.e = $$0.toArray(cyq.c[]::new);
   }

   private cyq(cyq.c[] $$0) {
      this.e = $$0;
   }

   public cun[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cun[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cun $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (cun $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cun[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cun $$1 : $$0) {
            this.g.add(cmz.c($$1));
         }

         this.g.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.g;
   }

   public boolean c() {
      return this.e.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof cyq $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cyq b(Stream<? extends cyq.c> $$0) {
      cyq $$1 = new cyq($$0);
      return $$1.c() ? a : $$1;
   }

   public static cyq d() {
      return a;
   }

   public static cyq a(dbv... $$0) {
      return a(Arrays.stream($$0).map(cun::new));
   }

   public static cyq a(cun... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cyq a(Stream<cun> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cyq.a::new));
   }

   public static cyq a(axe<cui> $$0) {
      return b(Stream.of(new cyq.b($$0)));
   }

   private static Codec<cyq> a(boolean $$0) {
      Codec<cyq.c[]> $$1 = Codec.list(cyq.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cyq.c[0])),
            List::of
         );
      return Codec.either($$1, cyq.c.a)
         .flatComapMap(
            $$0x -> (cyq)$$0x.map(cyq::new, $$0xx -> new cyq(new cyq.c[]{$$0xx})),
            $$1x -> {
               if ($$1x.e.length == 1) {
                  return DataResult.success(Either.right($$1x.e[0]));
               } else {
                  return $$1x.e.length == 0 && !$$0
                     ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                     : DataResult.success(Either.left($$1x.e));
               }
            }
         );
   }

   static record a(cun b) implements cyq.c {
      static final Codec<cyq.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cun.g.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cyq.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cyq.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.I() == this.b.I();
      }

      @Override
      public Collection<cun> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(axe<cui> b) implements cyq.c {
      static final Codec<cyq.b> c = RecordCodecBuilder.create($$0 -> $$0.group(axe.a(lq.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cyq.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cyq.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cun> a() {
         List<cun> $$0 = Lists.newArrayList();

         for (ji<cui> $$1 : lp.h.c(this.b)) {
            $$0.add(new cun($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cyq.c> a = Codec.xor(cyq.a.c, cyq.b.c).xmap($$0 -> (cyq.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cyq.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cyq.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cun> a();
   }
}
