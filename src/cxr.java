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

public final class cxr implements Predicate<cto> {
   public static final cxr a = new cxr(Stream.empty());
   public static final yv<wi, cxr> b = cto.h.a($$0 -> b($$0.stream().map(cxr.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cxr.c[] e;
   @Nullable
   private cto[] f;
   @Nullable
   private IntList g;
   public static final Codec<cxr> c = a(true);
   public static final Codec<cxr> d = a(false);

   private cxr(Stream<? extends cxr.c> $$0) {
      this.e = $$0.toArray(cxr.c[]::new);
   }

   private cxr(cxr.c[] $$0) {
      this.e = $$0;
   }

   public cto[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cto[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cto $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (cto $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cto[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cto $$1 : $$0) {
            this.g.add(cma.c($$1));
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
      return $$0 instanceof cxr $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cxr b(Stream<? extends cxr.c> $$0) {
      cxr $$1 = new cxr($$0);
      return $$1.c() ? a : $$1;
   }

   public static cxr d() {
      return a;
   }

   public static cxr a(daw... $$0) {
      return a(Arrays.stream($$0).map(cto::new));
   }

   public static cxr a(cto... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cxr a(Stream<cto> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cxr.a::new));
   }

   public static cxr a(awl<ctj> $$0) {
      return b(Stream.of(new cxr.b($$0)));
   }

   private static Codec<cxr> a(boolean $$0) {
      Codec<cxr.c[]> $$1 = Codec.list(cxr.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cxr.c[0])),
            List::of
         );
      return Codec.either($$1, cxr.c.a)
         .flatComapMap(
            $$0x -> (cxr)$$0x.map(cxr::new, $$0xx -> new cxr(new cxr.c[]{$$0xx})),
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

   static record a(cto b) implements cxr.c {
      static final Codec<cxr.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cto.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cxr.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cxr.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.I() == this.b.I();
      }

      @Override
      public Collection<cto> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(awl<ctj> b) implements cxr.c {
      static final Codec<cxr.b> c = RecordCodecBuilder.create($$0 -> $$0.group(awl.a(lf.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cxr.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cxr.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cto> a() {
         List<cto> $$0 = Lists.newArrayList();

         for (ix<ctj> $$1 : le.h.c(this.b)) {
            $$0.add(new cto($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cxr.c> a = Codec.xor(cxr.a.c, cxr.b.c).xmap($$0 -> (cxr.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cxr.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cxr.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cto> a();
   }
}
