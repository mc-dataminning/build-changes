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

public class cux {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static cux.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new cux.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static cux.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new cux.d(cux.b.a($$0), cux.b.a($$1), cux.b.a($$2), cux.b.a($$3), cux.b.a($$4), cux.b.a($$5), a($$6));
   }

   public static cux.d a(cux.b $$0, cux.b $$1, cux.b $$2, cux.b $$3, cux.b $$4, cux.b $$5, float $$6) {
      return new cux.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static cux.f a() {
      doj $$0 = dok.a();
      return new cux.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static hx a(List<cux.d> $$0, cux.f $$1) {
      return (new cux.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(cux.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<cux.b> a = atw.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new cux.b(cux.a($$0), cux.a($$1))),
         $$0 -> cux.a($$0.a()),
         $$0 -> cux.a($$0.b())
      );

      public static cux.b a(float $$0) {
         return a($$0, $$0);
      }

      public static cux.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new cux.b(cux.a($$0), cux.a($$1));
         }
      }

      public static cux.b a(cux.b $$0, cux.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new cux.b($$0.a(), $$1.b());
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

      public long a(cux.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public cux.b b(@Nullable cux.b $$0) {
         return $$0 == null ? this : new cux.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<cux.d, T>> a;
      private final cux.e<T> b;

      public static <T> Codec<cux.c<T>> a(MapCodec<T> $$0) {
         return atw.a(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(cux.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(cux.c::new, cux.c::a);
      }

      public c(List<Pair<cux.d, T>> $$0) {
         this.a = $$0;
         this.b = cux.e.a($$0);
      }

      public List<Pair<cux.d, T>> a() {
         return this.a;
      }

      public T a(cux.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(cux.h $$0) {
         Iterator<Pair<cux.d, T>> $$1 = this.a().iterator();
         Pair<cux.d, T> $$2 = $$1.next();
         long $$3 = ((cux.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<cux.d, T> $$5 = $$1.next();
            long $$6 = ((cux.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(cux.h $$0) {
         return this.a($$0, cux.e.b::a);
      }

      protected T a(cux.h $$0, cux.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(cux.b b, cux.b c, cux.b d, cux.b e, cux.b f, cux.b g, long h) {
      public static final Codec<cux.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cux.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  cux.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  cux.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  cux.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  cux.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  cux.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(cux::a, cux::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, cux.d::new)
      );

      long a(cux.h $$0) {
         return auo.a(this.b.a($$0.a))
            + auo.a(this.c.a($$0.b))
            + auo.a(this.d.a($$0.c))
            + auo.a(this.e.a($$0.d))
            + auo.a(this.f.a($$0.e))
            + auo.a(this.g.a($$0.f))
            + auo.a(this.h);
      }

      protected List<cux.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new cux.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final cux.e.b<T> b;
      private final ThreadLocal<cux.e.a<T>> c = new ThreadLocal<>();

      private e(cux.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> cux.e<T> a(List<Pair<cux.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((cux.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<cux.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new cux.e.a<>((cux.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new cux.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> cux.e.b<T> a(int $$0, List<? extends cux.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (cux.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  cux.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new cux.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<cux.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<cux.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (cux.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new cux.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends cux.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<cux.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<cux.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            cux.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<cux.e.c<T>> b(List<? extends cux.e.b<T>> $$0) {
         List<cux.e.c<T>> $$1 = Lists.newArrayList();
         List<cux.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (cux.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new cux.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new cux.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(cux.b[] $$0) {
         long $$1 = 0L;

         for (cux.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<cux.b> c(List<? extends cux.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<cux.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (cux.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(cux.h $$0, cux.a<T> $$1) {
         long[] $$2 = $$0.a();
         cux.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends cux.e.b<T> {
         final T b;

         a(cux.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected cux.e.a<T> a(long[] $$0, @Nullable cux.e.a<T> $$1, cux.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final cux.b[] a;

         protected b(List<cux.b> $$0) {
            this.a = $$0.toArray(new cux.b[0]);
         }

         protected abstract cux.e.a<T> a(long[] var1, @Nullable cux.e.a<T> var2, cux.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += auo.a(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends cux.e.b<T> {
         final cux.e.b<T>[] b;

         protected c(List<? extends cux.e.b<T>> $$0) {
            this(cux.e.c($$0), $$0);
         }

         protected c(List<cux.b> $$0, List<? extends cux.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new cux.e.b[0]);
         }

         @Override
         protected cux.e.a<T> a(long[] $$0, @Nullable cux.e.a<T> $$1, cux.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            cux.e.a<T> $$4 = $$1;

            for (cux.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  cux.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(doj a, doj b, doj c, doj d, doj e, doj f, List<cux.d> g) {
      public cux.h a(int $$0, int $$1, int $$2) {
         int $$3 = is.c($$0);
         int $$4 = is.c($$1);
         int $$5 = is.c($$2);
         doj.e $$6 = new doj.e($$3, $$4, $$5);
         return cux.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public hx a() {
         return this.g.isEmpty() ? hx.b : cux.a(this.g, this);
      }

      public doj b() {
         return this.a;
      }

      public doj c() {
         return this.b;
      }

      public doj d() {
         return this.c;
      }

      public doj e() {
         return this.d;
      }

      public doj f() {
         return this.e;
      }

      public doj g() {
         return this.f;
      }

      public List<cux.d> h() {
         return this.g;
      }
   }

   static class g {
      cux.g.a a;

      g(List<cux.d> $$0, cux.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<cux.d> $$0, cux.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         hx $$6 = this.a.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            cux.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static cux.g.a a(List<cux.d> $$0, cux.f $$1, int $$2, int $$3) {
         double $$4 = auo.k(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)auo.k(10000.0F) * Math.pow((double)(auo.a((long)$$2) + auo.a((long)$$3)) / $$4, 2.0));
         cux.h $$7 = $$1.a(is.a($$2), 0, is.a($$3));
         cux.h $$8 = new cux.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for (cux.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new cux.g.a(new hx($$2, 0, $$3), $$6 + $$9);
      }

      static record a(hx a, long b) {
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
