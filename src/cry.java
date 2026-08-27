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

public final class cry implements Predicate<coz> {
   public static final cry a = new cry(Stream.empty());
   public static final xo<vb, cry> b = coz.g.a($$0 -> b($$0.stream().map(cry.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cry.c[] e;
   @Nullable
   private coz[] f;
   @Nullable
   private IntList g;
   public static final Codec<cry> c = a(true);
   public static final Codec<cry> d = a(false);

   private cry(Stream<? extends cry.c> $$0) {
      this.e = $$0.toArray(cry.c[]::new);
   }

   private cry(cry.c[] $$0) {
      this.e = $$0;
   }

   public coz[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(coz[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable coz $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (coz $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         coz[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (coz $$1 : $$0) {
            this.g.add(chl.c($$1));
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
      return $$0 instanceof cry $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cry b(Stream<? extends cry.c> $$0) {
      cry $$1 = new cry($$0);
      return $$1.c() ? a : $$1;
   }

   public static cry d() {
      return a;
   }

   public static cry a(cvm... $$0) {
      return a(Arrays.stream($$0).map(coz::new));
   }

   public static cry a(coz... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cry a(Stream<coz> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cry.a::new));
   }

   public static cry a(auo<cou> $$0) {
      return b(Stream.of(new cry.b($$0)));
   }

   private static Codec<cry> a(boolean $$0) {
      Codec<cry.c[]> $$1 = Codec.list(cry.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cry.c[0])),
            List::of
         );
      return avp.c($$1, cry.c.a)
         .flatComapMap(
            $$0x -> (cry)$$0x.map(cry::new, $$0xx -> new cry(new cry.c[]{$$0xx})),
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

   static record a(coz b) implements cry.c {
      static final Codec<cry.a> c = RecordCodecBuilder.create($$0 -> $$0.group(coz.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cry.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cry.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.M() == this.b.M();
      }

      @Override
      public Collection<coz> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(auo<cou> b) implements cry.c {
      static final Codec<cry.b> c = RecordCodecBuilder.create($$0 -> $$0.group(auo.a(kg.F).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cry.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cry.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<coz> a() {
         List<coz> $$0 = Lists.newArrayList();

         for (ij<cou> $$1 : kf.h.c(this.b)) {
            $$0.add(new coz($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cry.c> a = avp.a(cry.a.c, cry.b.c).xmap($$0 -> (cry.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cry.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cry.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<coz> a();
   }
}
