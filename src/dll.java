import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dll {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dll.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dll.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dll.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dll.d(dll.b.a($$0), dll.b.a($$1), dll.b.a($$2), dll.b.a($$3), dll.b.a($$4), dll.b.a($$5), a($$6));
   }

   public static dll.d a(dll.b $$0, dll.b $$1, dll.b $$2, dll.b $$3, dll.b $$4, dll.b $$5, float $$6) {
      return new dll.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dll.f a() {
      egy $$0 = egz.a();
      return new dll.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static iw a(List<dll.d> $$0, dll.f $$1) {
      return (new dll.g($$0, $$1)).b.a();
   }

   interface a<T> {
      long distance(dll.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dll.b> a = ayy.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dll.b(dll.a($$0), dll.a($$1))),
         $$0 -> dll.a($$0.a()),
         $$0 -> dll.a($$0.b())
      );

      public static dll.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dll.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dll.b(dll.a($$0), dll.a($$1));
         }
      }

      public static dll.b a(dll.b $$0, dll.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dll.b($$0.a(), $$1.b());
         }
      }

      @Override
      public String toString() {
         return this.b == this.c ? String.format(Locale.ROOT, "%d", this.b) : String.format(Locale.ROOT, "[%d-%d]", this.b, this.c);
      }

      public long a(long $$0) {
         long $$1 = $$0 - this.c;
         long $$2 = this.b - $$0;
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public long a(dll.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dll.b b(@Nullable dll.b $$0) {
         return $$0 == null ? this : new dll.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dll.d, T>> a;
      private final dll.e<T> b;

      public static <T> Codec<dll.c<T>> a(MapCodec<T> $$0) {
         return ayy.b(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dll.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dll.c::new, dll.c::a);
      }

      public c(List<Pair<dll.d, T>> $$0) {
         this.a = $$0;
         this.b = dll.e.a($$0);
      }

      public List<Pair<dll.d, T>> a() {
         return this.a;
      }

      public T a(dll.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dll.h $$0) {
         Iterator<Pair<dll.d, T>> $$1 = this.a().iterator();
         Pair<dll.d, T> $$2 = $$1.next();
         long $$3 = ((dll.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dll.d, T> $$5 = $$1.next();
            long $$6 = ((dll.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dll.h $$0) {
         return this.a($$0, dll.e.b::a);
      }

      protected T a(dll.h $$0, dll.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dll.b b, dll.b c, dll.b d, dll.b e, dll.b f, dll.b g, long h) {
      public static final Codec<dll.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dll.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dll.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dll.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dll.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dll.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dll.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dll::a, dll::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dll.d::new)
      );

      long a(dll.h $$0) {
         return azq.b(this.b.a($$0.a))
            + azq.b(this.c.a($$0.b))
            + azq.b(this.d.a($$0.c))
            + azq.b(this.e.a($$0.d))
            + azq.b(this.f.a($$0.e))
            + azq.b(this.g.a($$0.f))
            + azq.b(this.h);
      }

      protected List<dll.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dll.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dll.e.b<T> b;
      private final ThreadLocal<dll.e.a<T>> c = new ThreadLocal<>();

      private e(dll.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dll.e<T> a(List<Pair<dll.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dll.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dll.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dll.e.a<>((dll.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dll.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dll.e.b<T> a(int $$0, List<? extends dll.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dll.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dll.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dll.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dll.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dll.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dll.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dll.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dll.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dll.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dll.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dll.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dll.e.c<T>> b(List<? extends dll.e.b<T>> $$0) {
         List<dll.e.c<T>> $$1 = Lists.newArrayList();
         List<dll.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dll.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dll.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dll.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dll.b[] $$0) {
         long $$1 = 0L;

         for (dll.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dll.b> c(List<? extends dll.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dll.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dll.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dll.h $$0, dll.a<T> $$1) {
         long[] $$2 = $$0.a();
         dll.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dll.e.b<T> {
         final T b;

         a(dll.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dll.e.a<T> a(long[] $$0, @Nullable dll.e.a<T> $$1, dll.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dll.b[] a;

         protected b(List<dll.b> $$0) {
            this.a = $$0.toArray(new dll.b[0]);
         }

         protected abstract dll.e.a<T> a(long[] var1, @Nullable dll.e.a<T> var2, dll.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += azq.b(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends dll.e.b<T> {
         final dll.e.b<T>[] b;

         protected c(List<? extends dll.e.b<T>> $$0) {
            this(dll.e.c($$0), $$0);
         }

         protected c(List<dll.b> $$0, List<? extends dll.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dll.e.b[0]);
         }

         @Override
         protected dll.e.a<T> a(long[] $$0, @Nullable dll.e.a<T> $$1, dll.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dll.e.a<T> $$4 = $$1;

            for (dll.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dll.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
                  long $$8 = $$5 == $$7 ? $$6 : $$2.distance($$7, $$0);
                  if ($$3 > $$8) {
                     $$3 = $$8;
                     $$4 = $$7;
                  }
               }
            }

            return $$4;
         }
      }
   }

   public static record f(egy a, egy b, egy c, egy d, egy e, egy f, List<dll.d> g) {
      public dll.h a(int $$0, int $$1, int $$2) {
         int $$3 = jr.c($$0);
         int $$4 = jr.c($$1);
         int $$5 = jr.c($$2);
         egy.e $$6 = new egy.e($$3, $$4, $$5);
         return dll.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public iw a() {
         return this.g.isEmpty() ? iw.c : dll.a(this.g, this);
      }

      public egy b() {
         return this.a;
      }

      public egy c() {
         return this.b;
      }

      public egy d() {
         return this.c;
      }

      public egy e() {
         return this.d;
      }

      public egy f() {
         return this.e;
      }

      public egy g() {
         return this.f;
      }

      public List<dll.d> h() {
         return this.g;
      }
   }

   static class g {
      private static final long a = 2048L;
      dll.g.a b;

      g(List<dll.d> $$0, dll.f $$1) {
         this.b = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dll.d> $$0, dll.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         iw $$6 = this.b.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dll.g.a $$9 = a($$0, $$1, $$7, $$8);
            if ($$9.b() < this.b.b()) {
               this.b = $$9;
            }

            $$4 += $$3 / $$5;
            if ((double)$$4 > Math.PI * 2) {
               $$4 = 0.0F;
               $$5 += $$3;
            }
         }
      }

      private static dll.g.a a(List<dll.d> $$0, dll.f $$1, int $$2, int $$3) {
         dll.h $$4 = $$1.a(jr.a($$2), 0, jr.a($$3));
         dll.h $$5 = new dll.h($$4.b(), $$4.c(), $$4.d(), $$4.e(), 0L, $$4.g());
         long $$6 = Long.MAX_VALUE;

         for (dll.d $$7 : $$0) {
            $$6 = Math.min($$6, $$7.a($$5));
         }

         long $$8 = azq.b((long)$$2) + azq.b((long)$$3);
         long $$9 = $$6 * azq.b(2048L) + $$8;
         return new dll.g.a(new iw($$2, 0, $$3), $$9);
      }

      static record a(iw a, long b) {
      }
   }

   public static record h(long a, long b, long c, long d, long e, long f) {

      @VisibleForTesting
      protected long[] a() {
         return new long[]{this.a, this.b, this.c, this.d, this.e, this.f, 0L};
      }

      public long b() {
         return this.a;
      }

      public long c() {
         return this.b;
      }

      public long d() {
         return this.c;
      }

      public long e() {
         return this.d;
      }

      public long f() {
         return this.e;
      }

      public long g() {
         return this.f;
      }
   }
}
