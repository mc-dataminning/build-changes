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

public final class cmm implements Predicate<cjl> {
   public static final cmm a = new cmm(Stream.empty());
   private final cmm.c[] d;
   @Nullable
   private cjl[] e;
   @Nullable
   private IntList f;
   public static final Codec<cmm> b = b(true);
   public static final Codec<cmm> c = b(false);

   private cmm(Stream<? extends cmm.c> $$0) {
      this.d = $$0.toArray(cmm.c[]::new);
   }

   private cmm(cmm.c[] $$0) {
      this.d = $$0;
   }

   public cjl[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cjl[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable cjl $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cjl $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         cjl[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (cjl $$1 : $$0) {
            this.f.add(cce.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(so $$0) {
      $$0.a(Arrays.asList(this.a()), so::a);
   }

   public JsonElement a(boolean $$0) {
      Codec<cmm> $$1 = $$0 ? b : c;
      return ac.a($$1.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof cmm $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static cmm b(Stream<? extends cmm.c> $$0) {
      cmm $$1 = new cmm($$0);
      return $$1.c() ? a : $$1;
   }

   public static cmm d() {
      return a;
   }

   public static cmm a(cqa... $$0) {
      return a(Arrays.stream($$0).map(cjl::new));
   }

   public static cmm a(cjl... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cmm a(Stream<cjl> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cmm.a::new));
   }

   public static cmm a(aqk<cjg> $$0) {
      return b(Stream.of(new cmm.b($$0)));
   }

   public static cmm b(so $$0) {
      return b($$0.<cjl>a(so::r).stream().map(cmm.a::new));
   }

   private static Codec<cmm> b(boolean $$0) {
      Codec<cmm.c[]> $$1 = Codec.list(cmm.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cmm.c[0])),
            List::of
         );
      return arj.c($$1, cmm.c.a)
         .flatComapMap(
            $$0x -> (cmm)$$0x.map(cmm::new, $$0xx -> new cmm(new cmm.c[]{$$0xx})),
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

   static record a(cjl b) implements cmm.c {
      static final Codec<cmm.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cmg.b.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cmm.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cmm.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<cjl> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(aqk<cjg> b) implements cmm.c {
      static final Codec<cmm.b> c = RecordCodecBuilder.create($$0 -> $$0.group(aqk.a(jc.E).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cmm.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cmm.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cjl> a() {
         List<cjl> $$0 = Lists.newArrayList();

         for (he<cjg> $$1 : jb.i.c(this.b)) {
            $$0.add(new cjl($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cmm.c> a = arj.a(cmm.a.c, cmm.b.c).xmap($$0 -> (cmm.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cmm.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cmm.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cjl> a();
   }
}
