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

public final class cxt implements Predicate<ctq> {
   public static final cxt a = new cxt(Stream.empty());
   public static final yv<wi, cxt> b = ctq.h.a($$0 -> b($$0.stream().map(cxt.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cxt.c[] e;
   @Nullable
   private ctq[] f;
   @Nullable
   private IntList g;
   public static final Codec<cxt> c = a(true);
   public static final Codec<cxt> d = a(false);

   private cxt(Stream<? extends cxt.c> $$0) {
      this.e = $$0.toArray(cxt.c[]::new);
   }

   private cxt(cxt.c[] $$0) {
      this.e = $$0;
   }

   public ctq[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(ctq[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable ctq $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (ctq $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         ctq[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (ctq $$1 : $$0) {
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
      return $$0 instanceof cxt $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cxt b(Stream<? extends cxt.c> $$0) {
      cxt $$1 = new cxt($$0);
      return $$1.c() ? a : $$1;
   }

   public static cxt d() {
      return a;
   }

   public static cxt a(day... $$0) {
      return a(Arrays.stream($$0).map(ctq::new));
   }

   public static cxt a(ctq... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cxt a(Stream<ctq> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cxt.a::new));
   }

   public static cxt a(awm<ctl> $$0) {
      return b(Stream.of(new cxt.b($$0)));
   }

   private static Codec<cxt> a(boolean $$0) {
      Codec<cxt.c[]> $$1 = Codec.list(cxt.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cxt.c[0])),
            List::of
         );
      return Codec.either($$1, cxt.c.a)
         .flatComapMap(
            $$0x -> (cxt)$$0x.map(cxt::new, $$0xx -> new cxt(new cxt.c[]{$$0xx})),
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

   static record a(ctq b) implements cxt.c {
      static final Codec<cxt.a> c = RecordCodecBuilder.create($$0 -> $$0.group(ctq.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cxt.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cxt.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.I() == this.b.I();
      }

      @Override
      public Collection<ctq> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(awm<ctl> b) implements cxt.c {
      static final Codec<cxt.b> c = RecordCodecBuilder.create($$0 -> $$0.group(awm.a(lf.G).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cxt.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cxt.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<ctq> a() {
         List<ctq> $$0 = Lists.newArrayList();

         for (ix<ctl> $$1 : le.h.c(this.b)) {
            $$0.add(new ctq($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cxt.c> a = Codec.xor(cxt.a.c, cxt.b.c).xmap($$0 -> (cxt.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cxt.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cxt.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<ctq> a();
   }
}
