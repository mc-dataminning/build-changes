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

public final class cys implements Predicate<cup> {
   public static final cys a = new cys(Stream.empty());
   public static final zn<xa, cys> b = cup.k.a($$0 -> b($$0.stream().map(cys.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cys.c[] e;
   @Nullable
   private cup[] f;
   @Nullable
   private IntList g;
   public static final Codec<cys> c = a(true);
   public static final Codec<cys> d = a(false);

   private cys(Stream<? extends cys.c> $$0) {
      this.e = $$0.toArray(cys.c[]::new);
   }

   private cys(cys.c[] $$0) {
      this.e = $$0;
   }

   public cup[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cup[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cup $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (cup $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cup[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cup $$1 : $$0) {
            this.g.add(cnb.c($$1));
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
      return $$0 instanceof cys $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cys b(Stream<? extends cys.c> $$0) {
      cys $$1 = new cys($$0);
      return $$1.c() ? a : $$1;
   }

   public static cys d() {
      return a;
   }

   public static cys a(dbx... $$0) {
      return a(Arrays.stream($$0).map(cup::new));
   }

   public static cys a(cup... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cys a(Stream<cup> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cys.a::new));
   }

   public static cys a(axf<cuk> $$0) {
      return b(Stream.of(new cys.b($$0)));
   }

   private static Codec<cys> a(boolean $$0) {
      Codec<cys.c[]> $$1 = Codec.list(cys.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cys.c[0])),
            List::of
         );
      return Codec.either($$1, cys.c.a)
         .flatComapMap(
            $$0x -> (cys)$$0x.map(cys::new, $$0xx -> new cys(new cys.c[]{$$0xx})),
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

   static record a(cup b) implements cys.c {
      static final Codec<cys.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cup.g.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cys.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cys.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.I() == this.b.I();
      }

      @Override
      public Collection<cup> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(axf<cuk> b) implements cys.c {
      static final Codec<cys.b> c = RecordCodecBuilder.create($$0 -> $$0.group(axf.a(lq.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cys.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cys.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cup> a() {
         List<cup> $$0 = Lists.newArrayList();

         for (ji<cuk> $$1 : lp.h.c(this.b)) {
            $$0.add(new cup($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cys.c> a = Codec.xor(cys.a.c, cys.b.c).xmap($$0 -> (cys.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cys.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cys.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cup> a();
   }
}
