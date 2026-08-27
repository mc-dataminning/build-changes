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

public final class cqh implements Predicate<cng> {
   public static final cqh a = new cqh(Stream.empty());
   private final cqh.c[] d;
   @Nullable
   private cng[] e;
   @Nullable
   private IntList f;
   public static final Codec<cqh> b = a(true);
   public static final Codec<cqh> c = a(false);

   private cqh(Stream<? extends cqh.c> $$0) {
      this.d = $$0.toArray(cqh.c[]::new);
   }

   private cqh(cqh.c[] $$0) {
      this.d = $$0;
   }

   public cng[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cng[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable cng $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cng $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         cng[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (cng $$1 : $$0) {
            this.f.add(cfu.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(uj $$0) {
      $$0.a(Arrays.asList(this.a()), uj::a);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof cqh $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static cqh b(Stream<? extends cqh.c> $$0) {
      cqh $$1 = new cqh($$0);
      return $$1.c() ? a : $$1;
   }

   public static cqh d() {
      return a;
   }

   public static cqh a(ctw... $$0) {
      return a(Arrays.stream($$0).map(cng::new));
   }

   public static cqh a(cng... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cqh a(Stream<cng> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cqh.a::new));
   }

   public static cqh a(asx<cnb> $$0) {
      return b(Stream.of(new cqh.b($$0)));
   }

   public static cqh b(uj $$0) {
      return b($$0.<cng>a(uj::r).stream().map(cqh.a::new));
   }

   private static Codec<cqh> a(boolean $$0) {
      Codec<cqh.c[]> $$1 = Codec.list(cqh.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cqh.c[0])),
            List::of
         );
      return atx.c($$1, cqh.c.a)
         .flatComapMap(
            $$0x -> (cqh)$$0x.map(cqh::new, $$0xx -> new cqh(new cqh.c[]{$$0xx})),
            $$1x -> {
               if ($$1x.d.length == 1) {
                  return DataResult.success(Either.right($$1x.d[0]));
               } else {
                  return $$1x.d.length == 0 && !$$0
                     ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                     : DataResult.success(Either.left($$1x.d));
               }
            }
         );
   }

   static record a(cng b) implements cqh.c {
      static final Codec<cqh.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cng.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cqh.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cqh.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<cng> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(asx<cnb> b) implements cqh.c {
      static final Codec<cqh.b> c = RecordCodecBuilder.create($$0 -> $$0.group(asx.a(ke.F).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cqh.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cqh.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cng> a() {
         List<cng> $$0 = Lists.newArrayList();

         for (ih<cnb> $$1 : kd.h.c(this.b)) {
            $$0.add(new cng($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cqh.c> a = atx.a(cqh.a.c, cqh.b.c).xmap($$0 -> (cqh.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cqh.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cqh.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cng> a();
   }
}
