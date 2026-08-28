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

public final class cyg implements Predicate<cud> {
   public static final cyg a = new cyg(Stream.empty());
   public static final ys<wf, cyg> b = cud.k.a($$0 -> b($$0.stream().map(cyg.a::new)), $$0 -> Arrays.asList($$0.a()));
   private final cyg.c[] e;
   @Nullable
   private cud[] f;
   @Nullable
   private IntList g;
   public static final Codec<cyg> c = a(true);
   public static final Codec<cyg> d = a(false);

   private cyg(Stream<? extends cyg.c> $$0) {
      this.e = $$0.toArray(cyg.c[]::new);
   }

   private cyg(cyg.c[] $$0) {
      this.e = $$0;
   }

   public cud[] a() {
      if (this.f == null) {
         this.f = Arrays.stream(this.e).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cud[]::new);
      }

      return this.f;
   }

   public boolean a(@Nullable cud $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.e();
      } else {
         for (cud $$1 : this.a()) {
            if ($$1.a($$0.g())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.g == null) {
         cud[] $$0 = this.a();
         this.g = new IntArrayList($$0.length);

         for (cud $$1 : $$0) {
            this.g.add(cmp.c($$1));
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
      return $$0 instanceof cyg $$1 ? Arrays.equals((Object[])this.e, (Object[])$$1.e) : false;
   }

   private static cyg b(Stream<? extends cyg.c> $$0) {
      cyg $$1 = new cyg($$0);
      return $$1.c() ? a : $$1;
   }

   public static cyg d() {
      return a;
   }

   public static cyg a(dcf... $$0) {
      return a(Arrays.stream($$0).map(cud::new));
   }

   public static cyg a(cud... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cyg a(Stream<cud> $$0) {
      return b($$0.filter($$0x -> !$$0x.e()).map(cyg.a::new));
   }

   public static cyg a(awm<cty> $$0) {
      return b(Stream.of(new cyg.b($$0)));
   }

   private static Codec<cyg> a(boolean $$0) {
      Codec<cyg.c[]> $$1 = Codec.list(cyg.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cyg.c[0])),
            List::of
         );
      return Codec.either($$1, cyg.c.a)
         .flatComapMap(
            $$0x -> (cyg)$$0x.map(cyg::new, $$0xx -> new cyg(new cyg.c[]{$$0xx})),
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

   static record a(cud b) implements cyg.c {
      static final Codec<cyg.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cud.g.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cyg.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cyg.a $$1) ? false : $$1.b.g().equals(this.b.g()) && $$1.b.H() == this.b.H();
      }

      @Override
      public Collection<cud> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(awm<cty> b) implements cyg.c {
      static final Codec<cyg.b> c = RecordCodecBuilder.create($$0 -> $$0.group(awm.a(lr.K).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cyg.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cyg.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cud> a() {
         List<cud> $$0 = Lists.newArrayList();

         for (jj<cty> $$1 : lq.g.c(this.b)) {
            $$0.add(new cud($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cyg.c> a = Codec.xor(cyg.a.c, cyg.b.c).xmap($$0 -> (cyg.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cyg.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cyg.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cud> a();
   }
}
