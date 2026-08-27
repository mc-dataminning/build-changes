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

public final class cvg implements Predicate<crj> {
   public static final cvg a = new cvg(Stream.empty());
   public static final ye<vr, cvg> b = crj.h.a($$0 -> b($$0.stream().map(cvg.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cvg.c[] e;
   @Nullable
   private crj[] f;
   @Nullable
   private IntList g;
   public static final Codec<cvg> c = a(true);
   public static final Codec<cvg> d = a(false);

   private cvg(Stream<? extends cvg.c> $$0) {
      this.e = $$0.toArray(cvg.c[]::new);
   }

   private cvg(cvg.c[] $$0) {
      this.e = $$0;
   }

   public crj[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(crj[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable crj $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.d();
      } else {
         for (crj $$1 : this.a()) {
            if ($$1.a($$0.f())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         crj[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (crj $$1 : $$0) {
            this.g.add(cjx.c($$1));
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
      return $$0 instanceof cvg $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cvg b(Stream<? extends cvg.c> $$0) {
      cvg $$1 = new cvg($$0);
      return $$1.c() ? a : $$1;
   }

   public static cvg d() {
      return a;
   }

   public static cvg a(cyw... $$0) {
      return a(Arrays.stream($$0).map(crj::new));
   }

   public static cvg a(crj... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cvg a(Stream<crj> $$0) {
      return b($$0.filter($$0x -> !$$0x.d()).map(cvg.a::new));
   }

   public static cvg a(avr<cre> $$0) {
      return b(Stream.of(new cvg.b($$0)));
   }

   private static Codec<cvg> a(boolean $$0) {
      Codec<cvg.c[]> $$1 = Codec.list(cvg.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cvg.c[0])),
            List::of
         );
      return aws.c($$1, cvg.c.a)
         .flatComapMap(
            $$0x -> (cvg)$$0x.map(cvg::new, $$0xx -> new cvg(new cvg.c[]{$$0xx})),
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

   static record a(crj b) implements cvg.c {
      static final Codec<cvg.a> c = RecordCodecBuilder.create($$0 -> $$0.group(crj.c.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cvg.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cvg.a $$1) ? false : $$1.b.f().equals(this.b.f()) && $$1.b.G() == this.b.G();
      }

      @Override
      public Collection<crj> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(avr<cre> b) implements cvg.c {
      static final Codec<cvg.b> c = RecordCodecBuilder.create($$0 -> $$0.group(avr.a(ks.F).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cvg.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cvg.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<crj> a() {
         List<crj> $$0 = Lists.newArrayList();

         for (il<cre> $$1 : kr.h.c(this.b)) {
            $$0.add(new crj($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cvg.c> a = aws.a(cvg.a.c, cvg.b.c).xmap($$0 -> (cvg.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cvg.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cvg.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<crj> a();
   }
}
