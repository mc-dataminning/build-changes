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

public class dfq {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dfq.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dfq.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dfq.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dfq.d(dfq.b.a($$0), dfq.b.a($$1), dfq.b.a($$2), dfq.b.a($$3), dfq.b.a($$4), dfq.b.a($$5), a($$6));
   }

   public static dfq.d a(dfq.b $$0, dfq.b $$1, dfq.b $$2, dfq.b $$3, dfq.b $$4, dfq.b $$5, float $$6) {
      return new dfq.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dfq.f a() {
      ead $$0 = eae.a();
      return new dfq.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static je a(List<dfq.d> $$0, dfq.f $$1) {
      return (new dfq.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(dfq.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dfq.b> a = aym.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dfq.b(dfq.a($$0), dfq.a($$1))),
         $$0 -> dfq.a($$0.a()),
         $$0 -> dfq.a($$0.b())
      );

      public static dfq.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dfq.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dfq.b(dfq.a($$0), dfq.a($$1));
         }
      }

      public static dfq.b a(dfq.b $$0, dfq.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dfq.b($$0.a(), $$1.b());
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

      public long a(dfq.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dfq.b b(@Nullable dfq.b $$0) {
         return $$0 == null ? this : new dfq.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dfq.d, T>> a;
      private final dfq.e<T> b;

      public static <T> Codec<dfq.c<T>> a(MapCodec<T> $$0) {
         return aym.a(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dfq.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dfq.c::new, dfq.c::a);
      }

      public c(List<Pair<dfq.d, T>> $$0) {
         this.a = $$0;
         this.b = dfq.e.a($$0);
      }

      public List<Pair<dfq.d, T>> a() {
         return this.a;
      }

      public T a(dfq.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dfq.h $$0) {
         Iterator<Pair<dfq.d, T>> $$1 = this.a().iterator();
         Pair<dfq.d, T> $$2 = $$1.next();
         long $$3 = ((dfq.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dfq.d, T> $$5 = $$1.next();
            long $$6 = ((dfq.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dfq.h $$0) {
         return this.a($$0, dfq.e.b::a);
      }

      protected T a(dfq.h $$0, dfq.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dfq.b b, dfq.b c, dfq.b d, dfq.b e, dfq.b f, dfq.b g, long h) {
      public static final Codec<dfq.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dfq.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dfq.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dfq.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dfq.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dfq.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dfq.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dfq::a, dfq::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dfq.d::new)
      );

      long a(dfq.h $$0) {
         return azd.b(this.b.a($$0.a))
            + azd.b(this.c.a($$0.b))
            + azd.b(this.d.a($$0.c))
            + azd.b(this.e.a($$0.d))
            + azd.b(this.f.a($$0.e))
            + azd.b(this.g.a($$0.f))
            + azd.b(this.h);
      }

      protected List<dfq.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dfq.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dfq.e.b<T> b;
      private final ThreadLocal<dfq.e.a<T>> c = new ThreadLocal<>();

      private e(dfq.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dfq.e<T> a(List<Pair<dfq.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dfq.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dfq.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dfq.e.a<>((dfq.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dfq.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dfq.e.b<T> a(int $$0, List<? extends dfq.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dfq.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dfq.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dfq.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dfq.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dfq.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dfq.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dfq.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dfq.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dfq.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dfq.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dfq.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dfq.e.c<T>> b(List<? extends dfq.e.b<T>> $$0) {
         List<dfq.e.c<T>> $$1 = Lists.newArrayList();
         List<dfq.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dfq.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dfq.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dfq.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dfq.b[] $$0) {
         long $$1 = 0L;

         for (dfq.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dfq.b> c(List<? extends dfq.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dfq.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dfq.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dfq.h $$0, dfq.a<T> $$1) {
         long[] $$2 = $$0.a();
         dfq.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dfq.e.b<T> {
         final T b;

         a(dfq.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dfq.e.a<T> a(long[] $$0, @Nullable dfq.e.a<T> $$1, dfq.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dfq.b[] a;

         protected b(List<dfq.b> $$0) {
            this.a = $$0.toArray(new dfq.b[0]);
         }

         protected abstract dfq.e.a<T> a(long[] var1, @Nullable dfq.e.a<T> var2, dfq.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += azd.b(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends dfq.e.b<T> {
         final dfq.e.b<T>[] b;

         protected c(List<? extends dfq.e.b<T>> $$0) {
            this(dfq.e.c($$0), $$0);
         }

         protected c(List<dfq.b> $$0, List<? extends dfq.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dfq.e.b[0]);
         }

         @Override
         protected dfq.e.a<T> a(long[] $$0, @Nullable dfq.e.a<T> $$1, dfq.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dfq.e.a<T> $$4 = $$1;

            for (dfq.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dfq.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(ead a, ead b, ead c, ead d, ead e, ead f, List<dfq.d> g) {
      public dfq.h a(int $$0, int $$1, int $$2) {
         int $$3 = jy.c($$0);
         int $$4 = jy.c($$1);
         int $$5 = jy.c($$2);
         ead.e $$6 = new ead.e($$3, $$4, $$5);
         return dfq.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public je a() {
         return this.g.isEmpty() ? je.c : dfq.a(this.g, this);
      }

      public ead b() {
         return this.a;
      }

      public ead c() {
         return this.b;
      }

      public ead d() {
         return this.c;
      }

      public ead e() {
         return this.d;
      }

      public ead f() {
         return this.e;
      }

      public ead g() {
         return this.f;
      }

      public List<dfq.d> h() {
         return this.g;
      }
   }

   static class g {
      dfq.g.a a;

      g(List<dfq.d> $$0, dfq.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dfq.d> $$0, dfq.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         je $$6 = this.a.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dfq.g.a $$9 = a($$0, $$1, $$7, $$8);
            if ($$9.b() < this.a.b()) {
               this.a = $$9;
            }

            $$4 += $$3 / $$5;
            if ((double)$$4 > Math.PI * 2) {
               $$4 = 0.0F;
               $$5 += $$3;
            }
         }
      }

      private static dfq.g.a a(List<dfq.d> $$0, dfq.f $$1, int $$2, int $$3) {
         double $$4 = azd.k(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)azd.k(10000.0F) * Math.pow((double)(azd.b((long)$$2) + azd.b((long)$$3)) / $$4, 2.0));
         dfq.h $$7 = $$1.a(jy.a($$2), 0, jy.a($$3));
         dfq.h $$8 = new dfq.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for (dfq.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new dfq.g.a(new je($$2, 0, $$3), $$6 + $$9);
      }

      static record a(je a, long b) {
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
