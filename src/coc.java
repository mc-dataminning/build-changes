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

public final class coc implements Predicate<clb> {
   public static final coc a = new coc(Stream.empty());
   private final coc.c[] d;
   @Nullable
   private clb[] e;
   @Nullable
   private IntList f;
   public static final Codec<coc> b = b(true);
   public static final Codec<coc> c = b(false);

   private coc(Stream<? extends coc.c> $$0) {
      this.d = $$0.toArray(coc.c[]::new);
   }

   private coc(coc.c[] $$0) {
      this.d = $$0;
   }

   public clb[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(clb[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable clb $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (clb $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         clb[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (clb $$1 : $$0) {
            this.f.add(cdq.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(tu $$0) {
      $$0.a(Arrays.asList(this.a()), tu::a);
   }

   public JsonElement a(boolean $$0) {
      Codec<coc> $$1 = $$0 ? b : c;
      return ac.a($$1.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof coc $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static coc b(Stream<? extends coc.c> $$0) {
      coc $$1 = new coc($$0);
      return $$1.c() ? a : $$1;
   }

   public static coc d() {
      return a;
   }

   public static coc a(crr... $$0) {
      return a(Arrays.stream($$0).map(clb::new));
   }

   public static coc a(clb... $$0) {
      return a(Arrays.stream($$0));
   }

   public static coc a(Stream<clb> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(coc.a::new));
   }

   public static coc a(arr<ckw> $$0) {
      return b(Stream.of(new coc.b($$0)));
   }

   public static coc b(tu $$0) {
      return b($$0.<clb>a(tu::r).stream().map(coc.a::new));
   }

   private static Codec<coc> b(boolean $$0) {
      Codec<coc.c[]> $$1 = Codec.list(coc.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new coc.c[0])),
            List::of
         );
      return asq.c($$1, coc.c.a)
         .flatComapMap(
            $$0x -> (coc)$$0x.map(coc::new, $$0xx -> new coc(new coc.c[]{$$0xx})),
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

   static record a(clb b) implements coc.c {
      static final Codec<coc.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cnw.b.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, coc.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof coc.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<clb> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(arr<ckw> b) implements coc.c {
      static final Codec<coc.b> c = RecordCodecBuilder.create($$0 -> $$0.group(arr.a(jz.E).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, coc.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof coc.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<clb> a() {
         List<clb> $$0 = Lists.newArrayList();

         for (ib<ckw> $$1 : jy.i.c(this.b)) {
            $$0.add(new clb($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<coc.c> a = asq.a(coc.a.c, coc.b.c).xmap($$0 -> (coc.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof coc.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof coc.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<clb> a();
   }
}
