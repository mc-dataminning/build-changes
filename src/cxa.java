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

public final class cxa implements Predicate<csz> {
   public static final cxa a = new cxa(Stream.empty());
   public static final ys<wf, cxa> b = csz.h.a($$0 -> b($$0.stream().map(cxa.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cxa.c[] e;
   @Nullable
   private csz[] f;
   @Nullable
   private IntList g;
   public static final Codec<cxa> c = a(true);
   public static final Codec<cxa> d = a(false);

   private cxa(Stream<? extends cxa.c> $$0) {
      this.e = $$0.toArray(cxa.c[]::new);
   }

   private cxa(cxa.c[] $$0) {
      this.e = $$0;
   }

   public csz[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(csz[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable csz $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.d();
      } else {
         for (csz $$1 : this.a()) {
            if ($$1.a($$0.f())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         csz[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (csz $$1 : $$0) {
            this.g.add(cll.c($$1));
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
      return $$0 instanceof cxa $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cxa b(Stream<? extends cxa.c> $$0) {
      cxa $$1 = new cxa($$0);
      return $$1.c() ? a : $$1;
   }

   public static cxa d() {
      return a;
   }

   public static cxa a(dac... $$0) {
      return a(Arrays.stream($$0).map(csz::new));
   }

   public static cxa a(csz... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cxa a(Stream<csz> $$0) {
      return b($$0.filter($$0x -> !$$0x.d()).map(cxa.a::new));
   }

   public static cxa a(awg<csu> $$0) {
      return b(Stream.of(new cxa.b($$0)));
   }

   private static Codec<cxa> a(boolean $$0) {
      Codec<cxa.c[]> $$1 = Codec.list(cxa.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cxa.c[0])),
            List::of
         );
      return axh.c($$1, cxa.c.a)
         .flatComapMap(
            $$0x -> (cxa)$$0x.map(cxa::new, $$0xx -> new cxa(new cxa.c[]{$$0xx})),
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

   static record a(csz b) implements cxa.c {
      static final Codec<cxa.a> c = RecordCodecBuilder.create($$0 -> $$0.group(csz.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cxa.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cxa.a $$1) ? false : $$1.b.f().equals(this.b.f()) && $$1.b.G() == this.b.G();
      }

      @Override
      public Collection<csz> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(awg<csu> b) implements cxa.c {
      static final Codec<cxa.b> c = RecordCodecBuilder.create($$0 -> $$0.group(awg.a(le.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cxa.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cxa.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<csz> a() {
         List<csz> $$0 = Lists.newArrayList();

         for (iw<csu> $$1 : ld.h.c(this.b)) {
            $$0.add(new csz($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cxa.c> a = axh.a(cxa.a.c, cxa.b.c).xmap($$0 -> (cxa.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cxa.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cxa.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<csz> a();
   }
}
