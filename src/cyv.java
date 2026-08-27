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

public final class cyv implements Predicate<cuh> {
   public static final cyv a = new cyv(Stream.empty());
   public static final zc<wp, cyv> b = cuh.h.a($$0 -> b($$0.stream().map(cyv.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cyv.c[] e;
   @Nullable
   private cuh[] f;
   @Nullable
   private IntList g;
   public static final Codec<cyv> c = a(true);
   public static final Codec<cyv> d = a(false);

   private cyv(Stream<? extends cyv.c> $$0) {
      this.e = $$0.toArray(cyv.c[]::new);
   }

   private cyv(cyv.c[] $$0) {
      this.e = $$0;
   }

   public cuh[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cuh[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cuh $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.d();
      } else {
         for (cuh $$1 : this.a()) {
            if ($$1.a($$0.f())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cuh[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cuh $$1 : $$0) {
            this.g.add(cmc.c($$1));
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
      return $$0 instanceof cyv $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cyv b(Stream<? extends cyv.c> $$0) {
      cyv $$1 = new cyv($$0);
      return $$1.c() ? a : $$1;
   }

   public static cyv d() {
      return a;
   }

   public static cyv a(dbz... $$0) {
      return a(Arrays.stream($$0).map(cuh::new));
   }

   public static cyv a(cuh... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cyv a(Stream<cuh> $$0) {
      return b($$0.filter($$0x -> !$$0x.d()).map(cyv.a::new));
   }

   public static cyv a(awt<cuc> $$0) {
      return b(Stream.of(new cyv.b($$0)));
   }

   private static Codec<cyv> a(boolean $$0) {
      Codec<cyv.c[]> $$1 = Codec.list(cyv.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cyv.c[0])),
            List::of
         );
      return axu.c($$1, cyv.c.a)
         .flatComapMap(
            $$0x -> (cyv)$$0x.map(cyv::new, $$0xx -> new cyv(new cyv.c[]{$$0xx})),
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

   static record a(cuh b) implements cyv.c {
      static final Codec<cyv.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cuh.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cyv.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cyv.a $$1) ? false : $$1.b.f().equals(this.b.f()) && $$1.b.G() == this.b.G();
      }

      @Override
      public Collection<cuh> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(awt<cuc> b) implements cyv.c {
      static final Codec<cyv.b> c = RecordCodecBuilder.create($$0 -> $$0.group(awt.a(li.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cyv.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cyv.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cuh> a() {
         List<cuh> $$0 = Lists.newArrayList();

         for (ja<cuc> $$1 : lh.h.c(this.b)) {
            $$0.add(new cuh($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cyv.c> a = axu.a(cyv.a.c, cyv.b.c).xmap($$0 -> (cyv.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cyv.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cyv.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cuh> a();
   }
}
