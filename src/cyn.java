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

public final class cyn implements Predicate<cuk> {
   public static final cyn a = new cyn(Stream.empty());
   public static final zj<ww, cyn> b = cuk.k.a($$0 -> b($$0.stream().map(cyn.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cyn.c[] e;
   @Nullable
   private cuk[] f;
   @Nullable
   private IntList g;
   public static final Codec<cyn> c = a(true);
   public static final Codec<cyn> d = a(false);

   private cyn(Stream<? extends cyn.c> $$0) {
      this.e = $$0.toArray(cyn.c[]::new);
   }

   private cyn(cyn.c[] $$0) {
      this.e = $$0;
   }

   public cuk[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cuk[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cuk $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (cuk $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cuk[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cuk $$1 : $$0) {
            this.g.add(cmw.c($$1));
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
      return $$0 instanceof cyn $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cyn b(Stream<? extends cyn.c> $$0) {
      cyn $$1 = new cyn($$0);
      return $$1.c() ? a : $$1;
   }

   public static cyn d() {
      return a;
   }

   public static cyn a(dbs... $$0) {
      return a(Arrays.stream($$0).map(cuk::new));
   }

   public static cyn a(cuk... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cyn a(Stream<cuk> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cyn.a::new));
   }

   public static cyn a(axb<cuf> $$0) {
      return b(Stream.of(new cyn.b($$0)));
   }

   private static Codec<cyn> a(boolean $$0) {
      Codec<cyn.c[]> $$1 = Codec.list(cyn.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cyn.c[0])),
            List::of
         );
      return Codec.either($$1, cyn.c.a)
         .flatComapMap(
            $$0x -> (cyn)$$0x.map(cyn::new, $$0xx -> new cyn(new cyn.c[]{$$0xx})),
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

   static record a(cuk b) implements cyn.c {
      static final Codec<cyn.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cuk.g.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cyn.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cyn.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.I() == this.b.I();
      }

      @Override
      public Collection<cuk> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(axb<cuf> b) implements cyn.c {
      static final Codec<cyn.b> c = RecordCodecBuilder.create($$0 -> $$0.group(axb.a(lq.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cyn.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cyn.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cuk> a() {
         List<cuk> $$0 = Lists.newArrayList();

         for (ji<cuf> $$1 : lp.h.c(this.b)) {
            $$0.add(new cuk($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cyn.c> a = Codec.xor(cyn.a.c, cyn.b.c).xmap($$0 -> (cyn.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cyn.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cyn.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cuk> a();
   }
}
