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

public final class cyd implements Predicate<cua> {
   public static final cyd a = new cyd(Stream.empty());
   public static final ys<wf, cyd> b = cua.k.a($$0 -> b($$0.stream().map(cyd.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cyd.c[] e;
   @Nullable
   private cua[] f;
   @Nullable
   private IntList g;
   public static final Codec<cyd> c = a(true);
   public static final Codec<cyd> d = a(false);

   private cyd(Stream<? extends cyd.c> $$0) {
      this.e = $$0.toArray(cyd.c[]::new);
   }

   private cyd(cyd.c[] $$0) {
      this.e = $$0;
   }

   public cua[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cua[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cua $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (cua $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cua[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cua $$1 : $$0) {
            this.g.add(cml.c($$1));
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
      return $$0 instanceof cyd $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cyd b(Stream<? extends cyd.c> $$0) {
      cyd $$1 = new cyd($$0);
      return $$1.c() ? a : $$1;
   }

   public static cyd d() {
      return a;
   }

   public static cyd a(dcc... $$0) {
      return a(Arrays.stream($$0).map(cua::new));
   }

   public static cyd a(cua... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cyd a(Stream<cua> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cyd.a::new));
   }

   public static cyd a(awk<ctv> $$0) {
      return b(Stream.of(new cyd.b($$0)));
   }

   private static Codec<cyd> a(boolean $$0) {
      Codec<cyd.c[]> $$1 = Codec.list(cyd.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cyd.c[0])),
            List::of
         );
      return Codec.either($$1, cyd.c.a)
         .flatComapMap(
            $$0x -> (cyd)$$0x.map(cyd::new, $$0xx -> new cyd(new cyd.c[]{$$0xx})),
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

   static record a(cua b) implements cyd.c {
      static final Codec<cyd.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cua.g.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cyd.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cyd.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.H() == this.b.H();
      }

      @Override
      public Collection<cua> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(awk<ctv> b) implements cyd.c {
      static final Codec<cyd.b> c = RecordCodecBuilder.create($$0 -> $$0.group(awk.a(lr.K).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cyd.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cyd.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cua> a() {
         List<cua> $$0 = Lists.newArrayList();

         for (jj<ctv> $$1 : lq.g.c(this.b)) {
            $$0.add(new cua($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cyd.c> a = Codec.xor(cyd.a.c, cyd.b.c).xmap($$0 -> (cyd.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cyd.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cyd.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cua> a();
   }
}
