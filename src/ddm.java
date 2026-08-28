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

public class ddm {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static ddm.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new ddm.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static ddm.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new ddm.d(ddm.b.a($$0), ddm.b.a($$1), ddm.b.a($$2), ddm.b.a($$3), ddm.b.a($$4), ddm.b.a($$5), a($$6));
   }

   public static ddm.d a(ddm.b $$0, ddm.b $$1, ddm.b $$2, ddm.b $$3, ddm.b $$4, ddm.b $$5, float $$6) {
      return new ddm.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static ddm.f a() {
      dxs $$0 = dxt.a();
      return new ddm.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static ja a(List<ddm.d> $$0, ddm.f $$1) {
      return (new ddm.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(ddm.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<ddm.b> a = axm.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new ddm.b(ddm.a($$0), ddm.a($$1))),
         $$0 -> ddm.a($$0.a()),
         $$0 -> ddm.a($$0.b())
      );

      public static ddm.b a(float $$0) {
         return a($$0, $$0);
      }

      public static ddm.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new ddm.b(ddm.a($$0), ddm.a($$1));
         }
      }

      public static ddm.b a(ddm.b $$0, ddm.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new ddm.b($$0.a(), $$1.b());
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

      public long a(ddm.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public ddm.b b(@Nullable ddm.b $$0) {
         return $$0 == null ? this : new ddm.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<ddm.d, T>> a;
      private final ddm.e<T> b;

      public static <T> Codec<ddm.c<T>> a(MapCodec<T> $$0) {
         return axm.a(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(ddm.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(ddm.c::new, ddm.c::a);
      }

      public c(List<Pair<ddm.d, T>> $$0) {
         this.a = $$0;
         this.b = ddm.e.a($$0);
      }

      public List<Pair<ddm.d, T>> a() {
         return this.a;
      }

      public T a(ddm.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(ddm.h $$0) {
         Iterator<Pair<ddm.d, T>> $$1 = this.a().iterator();
         Pair<ddm.d, T> $$2 = $$1.next();
         long $$3 = ((ddm.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<ddm.d, T> $$5 = $$1.next();
            long $$6 = ((ddm.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(ddm.h $$0) {
         return this.a($$0, ddm.e.b::a);
      }

      protected T a(ddm.h $$0, ddm.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(ddm.b b, ddm.b c, ddm.b d, ddm.b e, ddm.b f, ddm.b g, long h) {
      public static final Codec<ddm.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ddm.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  ddm.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  ddm.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  ddm.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  ddm.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  ddm.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(ddm::a, ddm::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, ddm.d::new)
      );

      long a(ddm.h $$0) {
         return aye.a(this.b.a($$0.a))
            + aye.a(this.c.a($$0.b))
            + aye.a(this.d.a($$0.c))
            + aye.a(this.e.a($$0.d))
            + aye.a(this.f.a($$0.e))
            + aye.a(this.g.a($$0.f))
            + aye.a(this.h);
      }

      protected List<ddm.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new ddm.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final ddm.e.b<T> b;
      private final ThreadLocal<ddm.e.a<T>> c = new ThreadLocal<>();

      private e(ddm.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> ddm.e<T> a(List<Pair<ddm.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((ddm.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<ddm.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new ddm.e.a<>((ddm.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new ddm.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> ddm.e.b<T> a(int $$0, List<? extends ddm.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (ddm.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  ddm.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new ddm.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<ddm.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<ddm.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (ddm.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new ddm.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends ddm.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<ddm.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<ddm.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            ddm.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<ddm.e.c<T>> b(List<? extends ddm.e.b<T>> $$0) {
         List<ddm.e.c<T>> $$1 = Lists.newArrayList();
         List<ddm.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (ddm.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new ddm.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new ddm.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(ddm.b[] $$0) {
         long $$1 = 0L;

         for (ddm.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<ddm.b> c(List<? extends ddm.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<ddm.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (ddm.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(ddm.h $$0, ddm.a<T> $$1) {
         long[] $$2 = $$0.a();
         ddm.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends ddm.e.b<T> {
         final T b;

         a(ddm.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected ddm.e.a<T> a(long[] $$0, @Nullable ddm.e.a<T> $$1, ddm.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final ddm.b[] a;

         protected b(List<ddm.b> $$0) {
            this.a = $$0.toArray(new ddm.b[0]);
         }

         protected abstract ddm.e.a<T> a(long[] var1, @Nullable ddm.e.a<T> var2, ddm.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += aye.a(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends ddm.e.b<T> {
         final ddm.e.b<T>[] b;

         protected c(List<? extends ddm.e.b<T>> $$0) {
            this(ddm.e.c($$0), $$0);
         }

         protected c(List<ddm.b> $$0, List<? extends ddm.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new ddm.e.b[0]);
         }

         @Override
         protected ddm.e.a<T> a(long[] $$0, @Nullable ddm.e.a<T> $$1, ddm.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            ddm.e.a<T> $$4 = $$1;

            for (ddm.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  ddm.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(dxs a, dxs b, dxs c, dxs d, dxs e, dxs f, List<ddm.d> g) {
      public ddm.h a(int $$0, int $$1, int $$2) {
         int $$3 = ju.c($$0);
         int $$4 = ju.c($$1);
         int $$5 = ju.c($$2);
         dxs.e $$6 = new dxs.e($$3, $$4, $$5);
         return ddm.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public ja a() {
         return this.g.isEmpty() ? ja.c : ddm.a(this.g, this);
      }

      public dxs b() {
         return this.a;
      }

      public dxs c() {
         return this.b;
      }

      public dxs d() {
         return this.c;
      }

      public dxs e() {
         return this.d;
      }

      public dxs f() {
         return this.e;
      }

      public dxs g() {
         return this.f;
      }

      public List<ddm.d> h() {
         return this.g;
      }
   }

   static class g {
      ddm.g.a a;

      g(List<ddm.d> $$0, ddm.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<ddm.d> $$0, ddm.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         ja $$6 = this.a.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            ddm.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static ddm.g.a a(List<ddm.d> $$0, ddm.f $$1, int $$2, int $$3) {
         double $$4 = aye.k(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)aye.k(10000.0F) * Math.pow((double)(aye.a((long)$$2) + aye.a((long)$$3)) / $$4, 2.0));
         ddm.h $$7 = $$1.a(ju.a($$2), 0, ju.a($$3));
         ddm.h $$8 = new ddm.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for (ddm.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new ddm.g.a(new ja($$2, 0, $$3), $$6 + $$9);
      }

      static record a(ja a, long b) {
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
