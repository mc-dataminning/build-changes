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

public final class cvp implements Predicate<crs> {
   public static final cvp a = new cvp(Stream.empty());
   public static final yg<vt, cvp> b = crs.h.a($$0 -> b($$0.stream().map(cvp.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cvp.c[] e;
   @Nullable
   private crs[] f;
   @Nullable
   private IntList g;
   public static final Codec<cvp> c = a(true);
   public static final Codec<cvp> d = a(false);

   private cvp(Stream<? extends cvp.c> $$0) {
      this.e = $$0.toArray(cvp.c[]::new);
   }

   private cvp(cvp.c[] $$0) {
      this.e = $$0;
   }

   public crs[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(crs[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable crs $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.d();
      } else {
         for (crs $$1 : this.a()) {
            if ($$1.a($$0.f())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         crs[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (crs $$1 : $$0) {
            this.g.add(cke.c($$1));
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
      return $$0 instanceof cvp $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cvp b(Stream<? extends cvp.c> $$0) {
      cvp $$1 = new cvp($$0);
      return $$1.c() ? a : $$1;
   }

   public static cvp d() {
      return a;
   }

   public static cvp a(czf... $$0) {
      return a(Arrays.stream($$0).map(crs::new));
   }

   public static cvp a(crs... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cvp a(Stream<crs> $$0) {
      return b($$0.filter($$0x -> !$$0x.d()).map(cvp.a::new));
   }

   public static cvp a(avt<crn> $$0) {
      return b(Stream.of(new cvp.b($$0)));
   }

   private static Codec<cvp> a(boolean $$0) {
      Codec<cvp.c[]> $$1 = Codec.list(cvp.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cvp.c[0])),
            List::of
         );
      return awu.c($$1, cvp.c.a)
         .flatComapMap(
            $$0x -> (cvp)$$0x.map(cvp::new, $$0xx -> new cvp(new cvp.c[]{$$0xx})),
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

   static record a(crs b) implements cvp.c {
      static final Codec<cvp.a> c = RecordCodecBuilder.create($$0 -> $$0.group(crs.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cvp.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cvp.a $$1) ? false : $$1.b.f().equals(this.b.f()) && $$1.b.G() == this.b.G();
      }

      @Override
      public Collection<crs> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(avt<crn> b) implements cvp.c {
      static final Codec<cvp.b> c = RecordCodecBuilder.create($$0 -> $$0.group(avt.a(ku.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cvp.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cvp.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<crs> a() {
         List<crs> $$0 = Lists.newArrayList();

         for (in<crn> $$1 : kt.h.c(this.b)) {
            $$0.add(new crs($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cvp.c> a = awu.a(cvp.a.c, cvp.b.c).xmap($$0 -> (cvp.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cvp.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cvp.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<crs> a();
   }
}
