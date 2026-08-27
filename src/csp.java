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

public final class csp implements Predicate<cpq> {
   public static final csp a = new csp(Stream.empty());
   public static final xq<vd, csp> b = cpq.g.a($$0 -> b($$0.stream().map(csp.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final csp.c[] e;
   @Nullable
   private cpq[] f;
   @Nullable
   private IntList g;
   public static final Codec<csp> c = a(true);
   public static final Codec<csp> d = a(false);

   private csp(Stream<? extends csp.c> $$0) {
      this.e = $$0.toArray(csp.c[]::new);
   }

   private csp(csp.c[] $$0) {
      this.e = $$0;
   }

   public cpq[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cpq[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cpq $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cpq $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cpq[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cpq $$1 : $$0) {
            this.g.add(cie.c($$1));
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
      return $$0 instanceof csp $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static csp b(Stream<? extends csp.c> $$0) {
      csp $$1 = new csp($$0);
      return $$1.c() ? a : $$1;
   }

   public static csp d() {
      return a;
   }

   public static csp a(cwd... $$0) {
      return a(Arrays.stream($$0).map(cpq::new));
   }

   public static csp a(cpq... $$0) {
      return a(Arrays.stream($$0));
   }

   public static csp a(Stream<cpq> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(csp.a::new));
   }

   public static csp a(aut<cpl> $$0) {
      return b(Stream.of(new csp.b($$0)));
   }

   private static Codec<csp> a(boolean $$0) {
      Codec<csp.c[]> $$1 = Codec.list(csp.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new csp.c[0])),
            List::of
         );
      return avu.c($$1, csp.c.a)
         .flatComapMap(
            $$0x -> (csp)$$0x.map(csp::new, $$0xx -> new csp(new csp.c[]{$$0xx})),
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

   static record a(cpq b) implements csp.c {
      static final Codec<csp.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cpq.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, csp.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof csp.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.M() == this.b.M();
      }

      @Override
      public Collection<cpq> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(aut<cpl> b) implements csp.c {
      static final Codec<csp.b> c = RecordCodecBuilder.create($$0 -> $$0.group(aut.a(ki.F).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, csp.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof csp.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cpq> a() {
         List<cpq> $$0 = Lists.newArrayList();

         for (il<cpl> $$1 : kh.h.c(this.b)) {
            $$0.add(new cpq($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<csp.c> a = avu.a(csp.a.c, csp.b.c).xmap($$0 -> (csp.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof csp.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof csp.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cpq> a();
   }
}
