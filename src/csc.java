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

public final class csc implements Predicate<cpd> {
   public static final csc a = new csc(Stream.empty());
   public static final xo<vb, csc> b = cpd.g.a($$0 -> b($$0.stream().map(csc.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final csc.c[] e;
   @Nullable
   private cpd[] f;
   @Nullable
   private IntList g;
   public static final Codec<csc> c = a(true);
   public static final Codec<csc> d = a(false);

   private csc(Stream<? extends csc.c> $$0) {
      this.e = $$0.toArray(csc.c[]::new);
   }

   private csc(csc.c[] $$0) {
      this.e = $$0;
   }

   public cpd[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cpd[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cpd $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cpd $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cpd[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cpd $$1 : $$0) {
            this.g.add(chp.c($$1));
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
      return $$0 instanceof csc $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static csc b(Stream<? extends csc.c> $$0) {
      csc $$1 = new csc($$0);
      return $$1.c() ? a : $$1;
   }

   public static csc d() {
      return a;
   }

   public static csc a(cvq... $$0) {
      return a(Arrays.stream($$0).map(cpd::new));
   }

   public static csc a(cpd... $$0) {
      return a(Arrays.stream($$0));
   }

   public static csc a(Stream<cpd> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(csc.a::new));
   }

   public static csc a(aup<coy> $$0) {
      return b(Stream.of(new csc.b($$0)));
   }

   private static Codec<csc> a(boolean $$0) {
      Codec<csc.c[]> $$1 = Codec.list(csc.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new csc.c[0])),
            List::of
         );
      return avq.c($$1, csc.c.a)
         .flatComapMap(
            $$0x -> (csc)$$0x.map(csc::new, $$0xx -> new csc(new csc.c[]{$$0xx})),
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

   static record a(cpd b) implements csc.c {
      static final Codec<csc.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cpd.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, csc.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof csc.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.M() == this.b.M();
      }

      @Override
      public Collection<cpd> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(aup<coy> b) implements csc.c {
      static final Codec<csc.b> c = RecordCodecBuilder.create($$0 -> $$0.group(aup.a(kg.F).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, csc.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof csc.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cpd> a() {
         List<cpd> $$0 = Lists.newArrayList();

         for (ij<coy> $$1 : kf.h.c(this.b)) {
            $$0.add(new cpd($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<csc.c> a = avq.a(csc.a.c, csc.b.c).xmap($$0 -> (csc.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof csc.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof csc.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cpd> a();
   }
}
