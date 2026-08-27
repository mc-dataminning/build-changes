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

public final class cwd implements Predicate<csd> {
   public static final cwd a = new cwd(Stream.empty());
   public static final yq<wd, cwd> b = csd.h.a($$0 -> b($$0.stream().map(cwd.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cwd.c[] e;
   @Nullable
   private csd[] f;
   @Nullable
   private IntList g;
   public static final Codec<cwd> c = a(true);
   public static final Codec<cwd> d = a(false);

   private cwd(Stream<? extends cwd.c> $$0) {
      this.e = $$0.toArray(cwd.c[]::new);
   }

   private cwd(cwd.c[] $$0) {
      this.e = $$0;
   }

   public csd[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(csd[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable csd $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.d();
      } else {
         for (csd $$1 : this.a()) {
            if ($$1.a($$0.f())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         csd[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (csd $$1 : $$0) {
            this.g.add(ckp.c($$1));
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
      return $$0 instanceof cwd $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cwd b(Stream<? extends cwd.c> $$0) {
      cwd $$1 = new cwd($$0);
      return $$1.c() ? a : $$1;
   }

   public static cwd d() {
      return a;
   }

   public static cwd a(czt... $$0) {
      return a(Arrays.stream($$0).map(csd::new));
   }

   public static cwd a(csd... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cwd a(Stream<csd> $$0) {
      return b($$0.filter($$0x -> !$$0x.d()).map(cwd.a::new));
   }

   public static cwd a(awd<cry> $$0) {
      return b(Stream.of(new cwd.b($$0)));
   }

   private static Codec<cwd> a(boolean $$0) {
      Codec<cwd.c[]> $$1 = Codec.list(cwd.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cwd.c[0])),
            List::of
         );
      return axe.c($$1, cwd.c.a)
         .flatComapMap(
            $$0x -> (cwd)$$0x.map(cwd::new, $$0xx -> new cwd(new cwd.c[]{$$0xx})),
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

   static record a(csd b) implements cwd.c {
      static final Codec<cwd.a> c = RecordCodecBuilder.create($$0 -> $$0.group(csd.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cwd.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cwd.a $$1) ? false : $$1.b.f().equals(this.b.f()) && $$1.b.G() == this.b.G();
      }

      @Override
      public Collection<csd> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(awd<cry> b) implements cwd.c {
      static final Codec<cwd.b> c = RecordCodecBuilder.create($$0 -> $$0.group(awd.a(ld.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cwd.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cwd.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<csd> a() {
         List<csd> $$0 = Lists.newArrayList();

         for (iv<cry> $$1 : lc.h.c(this.b)) {
            $$0.add(new csd($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cwd.c> a = axe.a(cwd.a.c, cwd.b.c).xmap($$0 -> (cwd.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cwd.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cwd.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<csd> a();
   }
}
