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

public final class ctm implements Predicate<cqm> {
   public static final ctm a = new ctm(Stream.empty());
   public static final xs<vf, ctm> b = cqm.g.a($$0 -> b($$0.stream().map(ctm.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final ctm.c[] e;
   @Nullable
   private cqm[] f;
   @Nullable
   private IntList g;
   public static final Codec<ctm> c = a(true);
   public static final Codec<ctm> d = a(false);

   private ctm(Stream<? extends ctm.c> $$0) {
      this.e = $$0.toArray(ctm.c[]::new);
   }

   private ctm(ctm.c[] $$0) {
      this.e = $$0;
   }

   public cqm[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cqm[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cqm $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cqm $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cqm[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cqm $$1 : $$0) {
            this.g.add(ciy.c($$1));
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
      return $$0 instanceof ctm $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static ctm b(Stream<? extends ctm.c> $$0) {
      ctm $$1 = new ctm($$0);
      return $$1.c() ? a : $$1;
   }

   public static ctm d() {
      return a;
   }

   public static ctm a(cxa... $$0) {
      return a(Arrays.stream($$0).map(cqm::new));
   }

   public static ctm a(cqm... $$0) {
      return a(Arrays.stream($$0));
   }

   public static ctm a(Stream<cqm> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(ctm.a::new));
   }

   public static ctm a(avd<cqh> $$0) {
      return b(Stream.of(new ctm.b($$0)));
   }

   private static Codec<ctm> a(boolean $$0) {
      Codec<ctm.c[]> $$1 = Codec.list(ctm.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new ctm.c[0])),
            List::of
         );
      return awe.c($$1, ctm.c.a)
         .flatComapMap(
            $$0x -> (ctm)$$0x.map(ctm::new, $$0xx -> new ctm(new ctm.c[]{$$0xx})),
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

   static record a(cqm b) implements ctm.c {
      static final Codec<ctm.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cqm.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, ctm.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof ctm.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.M() == this.b.M();
      }

      @Override
      public Collection<cqm> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(avd<cqh> b) implements ctm.c {
      static final Codec<ctm.b> c = RecordCodecBuilder.create($$0 -> $$0.group(avd.a(kj.F).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ctm.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof ctm.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cqm> a() {
         List<cqm> $$0 = Lists.newArrayList();

         for (il<cqh> $$1 : ki.h.c(this.b)) {
            $$0.add(new cqm($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<ctm.c> a = awe.a(ctm.a.c, ctm.b.c).xmap($$0 -> (ctm.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof ctm.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof ctm.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cqm> a();
   }
}
