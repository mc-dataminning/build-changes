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

public final class cyu implements Predicate<cur> {
   public static final cyu a = new cyu(Stream.empty());
   public static final zn<xa, cyu> b = cur.k.a($$0 -> b($$0.stream().map(cyu.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cyu.c[] e;
   @Nullable
   private cur[] f;
   @Nullable
   private IntList g;
   public static final Codec<cyu> c = a(true);
   public static final Codec<cyu> d = a(false);

   private cyu(Stream<? extends cyu.c> $$0) {
      this.e = $$0.toArray(cyu.c[]::new);
   }

   private cyu(cyu.c[] $$0) {
      this.e = $$0;
   }

   public cur[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cur[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cur $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (cur $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cur[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cur $$1 : $$0) {
            this.g.add(cnd.c($$1));
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
      return $$0 instanceof cyu $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cyu b(Stream<? extends cyu.c> $$0) {
      cyu $$1 = new cyu($$0);
      return $$1.c() ? a : $$1;
   }

   public static cyu d() {
      return a;
   }

   public static cyu a(dbz... $$0) {
      return a(Arrays.stream($$0).map(cur::new));
   }

   public static cyu a(cur... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cyu a(Stream<cur> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cyu.a::new));
   }

   public static cyu a(axf<cum> $$0) {
      return b(Stream.of(new cyu.b($$0)));
   }

   private static Codec<cyu> a(boolean $$0) {
      Codec<cyu.c[]> $$1 = Codec.list(cyu.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cyu.c[0])),
            List::of
         );
      return Codec.either($$1, cyu.c.a)
         .flatComapMap(
            $$0x -> (cyu)$$0x.map(cyu::new, $$0xx -> new cyu(new cyu.c[]{$$0xx})),
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

   static record a(cur b) implements cyu.c {
      static final Codec<cyu.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cur.g.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cyu.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cyu.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.I() == this.b.I();
      }

      @Override
      public Collection<cur> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(axf<cum> b) implements cyu.c {
      static final Codec<cyu.b> c = RecordCodecBuilder.create($$0 -> $$0.group(axf.a(lq.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cyu.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cyu.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cur> a() {
         List<cur> $$0 = Lists.newArrayList();

         for (ji<cum> $$1 : lp.h.c(this.b)) {
            $$0.add(new cur($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cyu.c> a = Codec.xor(cyu.a.c, cyu.b.c).xmap($$0 -> (cyu.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cyu.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cyu.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cur> a();
   }
}
