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

public final class cpz implements Predicate<cmy> {
   public static final cpz a = new cpz(Stream.empty());
   private final cpz.c[] d;
   @Nullable
   private cmy[] e;
   @Nullable
   private IntList f;
   public static final Codec<cpz> b = a(true);
   public static final Codec<cpz> c = a(false);

   private cpz(Stream<? extends cpz.c> $$0) {
      this.d = $$0.toArray(cpz.c[]::new);
   }

   private cpz(cpz.c[] $$0) {
      this.d = $$0;
   }

   public cmy[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cmy[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable cmy $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cmy $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         cmy[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (cmy $$1 : $$0) {
            this.f.add(cfm.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(ui $$0) {
      $$0.a(Arrays.asList(this.a()), ui::a);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof cpz $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static cpz b(Stream<? extends cpz.c> $$0) {
      cpz $$1 = new cpz($$0);
      return $$1.c() ? a : $$1;
   }

   public static cpz d() {
      return a;
   }

   public static cpz a(cto... $$0) {
      return a(Arrays.stream($$0).map(cmy::new));
   }

   public static cpz a(cmy... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cpz a(Stream<cmy> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cpz.a::new));
   }

   public static cpz a(asw<cmt> $$0) {
      return b(Stream.of(new cpz.b($$0)));
   }

   public static cpz b(ui $$0) {
      return b($$0.<cmy>a(ui::r).stream().map(cpz.a::new));
   }

   private static Codec<cpz> a(boolean $$0) {
      Codec<cpz.c[]> $$1 = Codec.list(cpz.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cpz.c[0])),
            List::of
         );
      return atw.c($$1, cpz.c.a)
         .flatComapMap(
            $$0x -> (cpz)$$0x.map(cpz::new, $$0xx -> new cpz(new cpz.c[]{$$0xx})),
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

   static record a(cmy b) implements cpz.c {
      static final Codec<cpz.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cmy.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cpz.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cpz.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<cmy> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(asw<cmt> b) implements cpz.c {
      static final Codec<cpz.b> c = RecordCodecBuilder.create($$0 -> $$0.group(asw.a(ke.F).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cpz.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cpz.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cmy> a() {
         List<cmy> $$0 = Lists.newArrayList();

         for (ih<cmt> $$1 : kd.h.c(this.b)) {
            $$0.add(new cmy($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cpz.c> a = atw.a(cpz.a.c, cpz.b.c).xmap($$0 -> (cpz.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cpz.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cpz.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cmy> a();
   }
}
