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

public final class cmg implements Predicate<cjf> {
   public static final cmg a = new cmg(Stream.empty());
   private final cmg.c[] d;
   @Nullable
   private cjf[] e;
   @Nullable
   private IntList f;
   public static final Codec<cmg> b = b(true);
   public static final Codec<cmg> c = b(false);

   private cmg(Stream<? extends cmg.c> $$0) {
      this.d = $$0.toArray(cmg.c[]::new);
   }

   private cmg(cmg.c[] $$0) {
      this.d = $$0;
   }

   public cjf[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cjf[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable cjf $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cjf $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         cjf[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (cjf $$1 : $$0) {
            this.f.add(cby.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(so $$0) {
      $$0.a(Arrays.asList(this.a()), so::a);
   }

   public JsonElement a(boolean $$0) {
      Codec<cmg> $$1 = $$0 ? b : c;
      return ac.a($$1.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof cmg $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static cmg b(Stream<? extends cmg.c> $$0) {
      cmg $$1 = new cmg($$0);
      return $$1.c() ? a : $$1;
   }

   public static cmg d() {
      return a;
   }

   public static cmg a(cpu... $$0) {
      return a(Arrays.stream($$0).map(cjf::new));
   }

   public static cmg a(cjf... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cmg a(Stream<cjf> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cmg.a::new));
   }

   public static cmg a(aqi<cja> $$0) {
      return b(Stream.of(new cmg.b($$0)));
   }

   public static cmg b(so $$0) {
      return b($$0.<cjf>a(so::q).stream().map(cmg.a::new));
   }

   private static Codec<cmg> b(boolean $$0) {
      Codec<cmg.c[]> $$1 = Codec.list(cmg.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cmg.c[0])),
            List::of
         );
      return arg.c($$1, cmg.c.a)
         .flatComapMap(
            $$0x -> (cmg)$$0x.map(cmg::new, $$0xx -> new cmg(new cmg.c[]{$$0xx})),
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

   static record a(cjf b) implements cmg.c {
      static final Codec<cmg.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cma.b.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cmg.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cmg.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<cjf> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(aqi<cja> b) implements cmg.c {
      static final Codec<cmg.b> c = RecordCodecBuilder.create($$0 -> $$0.group(aqi.a(je.D).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cmg.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cmg.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cjf> a() {
         List<cjf> $$0 = Lists.newArrayList();

         for (hg<cja> $$1 : jd.i.c(this.b)) {
            $$0.add(new cjf($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cmg.c> a = arg.a(cmg.a.c, cmg.b.c).xmap($$0 -> (cmg.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cmg.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cmg.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cjf> a();
   }
}
