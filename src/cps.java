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

public final class cps implements Predicate<cmr> {
   public static final cps a = new cps(Stream.empty());
   private final cps.c[] d;
   @Nullable
   private cmr[] e;
   @Nullable
   private IntList f;
   public static final Codec<cps> b = a(true);
   public static final Codec<cps> c = a(false);

   private cps(Stream<? extends cps.c> $$0) {
      this.d = $$0.toArray(cps.c[]::new);
   }

   private cps(cps.c[] $$0) {
      this.d = $$0;
   }

   public cmr[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cmr[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable cmr $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cmr $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         cmr[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (cmr $$1 : $$0) {
            this.f.add(cff.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(ug $$0) {
      $$0.a(Arrays.asList(this.a()), ug::a);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof cps $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static cps b(Stream<? extends cps.c> $$0) {
      cps $$1 = new cps($$0);
      return $$1.c() ? a : $$1;
   }

   public static cps d() {
      return a;
   }

   public static cps a(cth... $$0) {
      return a(Arrays.stream($$0).map(cmr::new));
   }

   public static cps a(cmr... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cps a(Stream<cmr> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cps.a::new));
   }

   public static cps a(asq<cmm> $$0) {
      return b(Stream.of(new cps.b($$0)));
   }

   public static cps b(ug $$0) {
      return b($$0.<cmr>a(ug::r).stream().map(cps.a::new));
   }

   private static Codec<cps> a(boolean $$0) {
      Codec<cps.c[]> $$1 = Codec.list(cps.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cps.c[0])),
            List::of
         );
      return atq.c($$1, cps.c.a)
         .flatComapMap(
            $$0x -> (cps)$$0x.map(cps::new, $$0xx -> new cps(new cps.c[]{$$0xx})),
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

   static record a(cmr b) implements cps.c {
      static final Codec<cps.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cmr.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cps.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cps.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<cmr> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(asq<cmm> b) implements cps.c {
      static final Codec<cps.b> c = RecordCodecBuilder.create($$0 -> $$0.group(asq.a(ke.F).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cps.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cps.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cmr> a() {
         List<cmr> $$0 = Lists.newArrayList();

         for (ih<cmm> $$1 : kd.h.c(this.b)) {
            $$0.add(new cmr($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cps.c> a = atq.a(cps.a.c, cps.b.c).xmap($$0 -> (cps.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cps.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cps.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cmr> a();
   }
}
