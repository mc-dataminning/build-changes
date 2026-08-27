import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
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

public final class coq implements Predicate<clo> {
   public static final coq a = new coq(Stream.empty());
   private final coq.c[] d;
   @Nullable
   private clo[] e;
   @Nullable
   private IntList f;
   public static final Codec<coq> b = b(true);
   public static final Codec<coq> c = b(false);

   private coq(Stream<? extends coq.c> $$0) {
      this.d = $$0.toArray(coq.c[]::new);
   }

   private coq(coq.c[] $$0) {
      this.d = $$0;
   }

   public clo[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(clo[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable clo $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (clo $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         clo[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (clo $$1 : $$0) {
            this.f.add(ced.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(ty $$0) {
      $$0.a(Arrays.asList(this.a()), ty::a);
   }

   public JsonElement a(boolean $$0) {
      Codec<coq> $$1 = $$0 ? b : c;
      return ac.a($$1.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof coq $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static coq b(Stream<? extends coq.c> $$0) {
      coq $$1 = new coq($$0);
      return $$1.c() ? a : $$1;
   }

   public static coq d() {
      return a;
   }

   public static coq a(cse... $$0) {
      return a(Arrays.stream($$0).map(clo::new));
   }

   public static coq a(clo... $$0) {
      return a(Arrays.stream($$0));
   }

   public static coq a(Stream<clo> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(coq.a::new));
   }

   public static coq a(arz<clj> $$0) {
      return b(Stream.of(new coq.b($$0)));
   }

   public static coq b(ty $$0) {
      return b($$0.<clo>a(ty::r).stream().map(coq.a::new));
   }

   private static Codec<coq> b(boolean $$0) {
      Codec<coq.c[]> $$1 = Codec.list(coq.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new coq.c[0])),
            List::of
         );
      return asy.c($$1, coq.c.a)
         .flatComapMap(
            $$0x -> (coq)$$0x.map(coq::new, $$0xx -> new coq(new coq.c[]{$$0xx})),
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

   static record a(clo b) implements coq.c {
      static final Codec<coq.a> c = RecordCodecBuilder.create($$0 -> $$0.group(coj.b.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, coq.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof coq.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<clo> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(arz<clj> b) implements coq.c {
      static final Codec<coq.b> c = RecordCodecBuilder.create($$0 -> $$0.group(arz.a(kd.E).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, coq.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof coq.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<clo> a() {
         List<clo> $$0 = Lists.newArrayList();

         for (ig<clj> $$1 : kc.i.c(this.b)) {
            $$0.add(new clo($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<coq.c> a = asy.a(coq.a.c, coq.b.c).xmap($$0 -> (coq.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof coq.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof coq.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<clo> a();
   }
}
