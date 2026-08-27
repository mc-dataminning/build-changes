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

public final class cnk implements Predicate<ckj> {
   public static final cnk a = new cnk(Stream.empty());
   private final cnk.c[] d;
   @Nullable
   private ckj[] e;
   @Nullable
   private IntList f;
   public static final Codec<cnk> b = b(true);
   public static final Codec<cnk> c = b(false);

   private cnk(Stream<? extends cnk.c> $$0) {
      this.d = $$0.toArray(cnk.c[]::new);
   }

   private cnk(cnk.c[] $$0) {
      this.d = $$0;
   }

   public ckj[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(ckj[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable ckj $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (ckj $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         ckj[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (ckj $$1 : $$0) {
            this.f.add(cdb.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(tl $$0) {
      $$0.a(Arrays.asList(this.a()), tl::a);
   }

   public JsonElement a(boolean $$0) {
      Codec<cnk> $$1 = $$0 ? b : c;
      return ac.a($$1.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof cnk $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static cnk b(Stream<? extends cnk.c> $$0) {
      cnk $$1 = new cnk($$0);
      return $$1.c() ? a : $$1;
   }

   public static cnk d() {
      return a;
   }

   public static cnk a(cqy... $$0) {
      return a(Arrays.stream($$0).map(ckj::new));
   }

   public static cnk a(ckj... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cnk a(Stream<ckj> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cnk.a::new));
   }

   public static cnk a(arh<cke> $$0) {
      return b(Stream.of(new cnk.b($$0)));
   }

   public static cnk b(tl $$0) {
      return b($$0.<ckj>a(tl::r).stream().map(cnk.a::new));
   }

   private static Codec<cnk> b(boolean $$0) {
      Codec<cnk.c[]> $$1 = Codec.list(cnk.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cnk.c[0])),
            List::of
         );
      return asg.c($$1, cnk.c.a)
         .flatComapMap(
            $$0x -> (cnk)$$0x.map(cnk::new, $$0xx -> new cnk(new cnk.c[]{$$0xx})),
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

   static record a(ckj b) implements cnk.c {
      static final Codec<cnk.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cne.b.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cnk.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cnk.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<ckj> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(arh<cke> b) implements cnk.c {
      static final Codec<cnk.b> c = RecordCodecBuilder.create($$0 -> $$0.group(arh.a(jz.E).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cnk.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cnk.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<ckj> a() {
         List<ckj> $$0 = Lists.newArrayList();

         for (ib<cke> $$1 : jy.i.c(this.b)) {
            $$0.add(new ckj($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cnk.c> a = asg.a(cnk.a.c, cnk.b.c).xmap($$0 -> (cnk.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cnk.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cnk.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<ckj> a();
   }
}
