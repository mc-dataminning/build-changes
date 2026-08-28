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

public final class cyf implements Predicate<cuc> {
   public static final cyf a = new cyf(Stream.empty());
   public static final ys<wf, cyf> b = cuc.k.a($$0 -> b($$0.stream().map(cyf.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cyf.c[] e;
   @Nullable
   private cuc[] f;
   @Nullable
   private IntList g;
   public static final Codec<cyf> c = a(true);
   public static final Codec<cyf> d = a(false);

   private cyf(Stream<? extends cyf.c> $$0) {
      this.e = $$0.toArray(cyf.c[]::new);
   }

   private cyf(cyf.c[] $$0) {
      this.e = $$0;
   }

   public cuc[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cuc[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cuc $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (cuc $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cuc[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cuc $$1 : $$0) {
            this.g.add(cmo.c($$1));
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
      return $$0 instanceof cyf $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cyf b(Stream<? extends cyf.c> $$0) {
      cyf $$1 = new cyf($$0);
      return $$1.c() ? a : $$1;
   }

   public static cyf d() {
      return a;
   }

   public static cyf a(dce... $$0) {
      return a(Arrays.stream($$0).map(cuc::new));
   }

   public static cyf a(cuc... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cyf a(Stream<cuc> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cyf.a::new));
   }

   public static cyf a(awm<ctx> $$0) {
      return b(Stream.of(new cyf.b($$0)));
   }

   private static Codec<cyf> a(boolean $$0) {
      Codec<cyf.c[]> $$1 = Codec.list(cyf.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cyf.c[0])),
            List::of
         );
      return Codec.either($$1, cyf.c.a)
         .flatComapMap(
            $$0x -> (cyf)$$0x.map(cyf::new, $$0xx -> new cyf(new cyf.c[]{$$0xx})),
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

   static record a(cuc b) implements cyf.c {
      static final Codec<cyf.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cuc.g.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cyf.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cyf.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.H() == this.b.H();
      }

      @Override
      public Collection<cuc> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(awm<ctx> b) implements cyf.c {
      static final Codec<cyf.b> c = RecordCodecBuilder.create($$0 -> $$0.group(awm.a(lr.K).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cyf.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cyf.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cuc> a() {
         List<cuc> $$0 = Lists.newArrayList();

         for (jj<ctx> $$1 : lq.g.c(this.b)) {
            $$0.add(new cuc($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cyf.c> a = Codec.xor(cyf.a.c, cyf.b.c).xmap($$0 -> (cyf.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cyf.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cyf.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cuc> a();
   }
}
