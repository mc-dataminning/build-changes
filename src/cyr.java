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

public final class cyr implements Predicate<cuo> {
   public static final cyr a = new cyr(Stream.empty());
   public static final zm<wz, cyr> b = cuo.k.a($$0 -> b($$0.stream().map(cyr.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cyr.c[] e;
   @Nullable
   private cuo[] f;
   @Nullable
   private IntList g;
   public static final Codec<cyr> c = a(true);
   public static final Codec<cyr> d = a(false);

   private cyr(Stream<? extends cyr.c> $$0) {
      this.e = $$0.toArray(cyr.c[]::new);
   }

   private cyr(cyr.c[] $$0) {
      this.e = $$0;
   }

   public cuo[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cuo[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cuo $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (cuo $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cuo[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cuo $$1 : $$0) {
            this.g.add(cna.c($$1));
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
      return $$0 instanceof cyr $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cyr b(Stream<? extends cyr.c> $$0) {
      cyr $$1 = new cyr($$0);
      return $$1.c() ? a : $$1;
   }

   public static cyr d() {
      return a;
   }

   public static cyr a(dbw... $$0) {
      return a(Arrays.stream($$0).map(cuo::new));
   }

   public static cyr a(cuo... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cyr a(Stream<cuo> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cyr.a::new));
   }

   public static cyr a(axe<cuj> $$0) {
      return b(Stream.of(new cyr.b($$0)));
   }

   private static Codec<cyr> a(boolean $$0) {
      Codec<cyr.c[]> $$1 = Codec.list(cyr.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cyr.c[0])),
            List::of
         );
      return Codec.either($$1, cyr.c.a)
         .flatComapMap(
            $$0x -> (cyr)$$0x.map(cyr::new, $$0xx -> new cyr(new cyr.c[]{$$0xx})),
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

   static record a(cuo b) implements cyr.c {
      static final Codec<cyr.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cuo.g.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cyr.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cyr.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.I() == this.b.I();
      }

      @Override
      public Collection<cuo> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(axe<cuj> b) implements cyr.c {
      static final Codec<cyr.b> c = RecordCodecBuilder.create($$0 -> $$0.group(axe.a(lq.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cyr.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cyr.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cuo> a() {
         List<cuo> $$0 = Lists.newArrayList();

         for (ji<cuj> $$1 : lp.h.c(this.b)) {
            $$0.add(new cuo($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cyr.c> a = Codec.xor(cyr.a.c, cyr.b.c).xmap($$0 -> (cyr.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cyr.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cyr.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cuo> a();
   }
}
