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

public final class cyw implements Predicate<cuq> {
   public static final cyw a = new cyw(Stream.empty());
   public static final yx<wk, cyw> b = cuq.k.a($$0 -> b($$0.stream().map(cyw.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cyw.c[] e;
   @Nullable
   private cuq[] f;
   @Nullable
   private IntList g;
   public static final Codec<cyw> c = a(true);
   public static final Codec<cyw> d = a(false);

   private cyw(Stream<? extends cyw.c> $$0) {
      this.e = $$0.toArray(cyw.c[]::new);
   }

   private cyw(cyw.c[] $$0) {
      this.e = $$0;
   }

   public cuq[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cuq[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cuq $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (cuq $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cuq[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cuq $$1 : $$0) {
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
      return $$0 instanceof cyw $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cyw b(Stream<? extends cyw.c> $$0) {
      cyw $$1 = new cyw($$0);
      return $$1.c() ? a : $$1;
   }

   public static cyw d() {
      return a;
   }

   public static cyw a(dcv... $$0) {
      return a(Arrays.stream($$0).map(cuq::new));
   }

   public static cyw a(cuq... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cyw a(Stream<cuq> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cyw.a::new));
   }

   public static cyw a(awu<cul> $$0) {
      return b(Stream.of(new cyw.b($$0)));
   }

   private static Codec<cyw> a(boolean $$0) {
      Codec<cyw.c[]> $$1 = Codec.list(cyw.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cyw.c[0])),
            List::of
         );
      return Codec.either($$1, cyw.c.a)
         .flatComapMap(
            $$0x -> (cyw)$$0x.map(cyw::new, $$0xx -> new cyw(new cyw.c[]{$$0xx})),
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

   static record a(cuq b) implements cyw.c {
      static final Codec<cyw.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cuq.g.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cyw.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cyw.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.H() == this.b.H();
      }

      @Override
      public Collection<cuq> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(awu<cul> b) implements cyw.c {
      static final Codec<cyw.b> c = RecordCodecBuilder.create($$0 -> $$0.group(awu.a(lu.K).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cyw.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cyw.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cuq> a() {
         List<cuq> $$0 = Lists.newArrayList();

         for (jm<cul> $$1 : lt.g.c(this.b)) {
            $$0.add(new cuq($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cyw.c> a = Codec.xor(cyw.a.c, cyw.b.c).xmap($$0 -> (cyw.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cyw.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cyw.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cuq> a();
   }
}
