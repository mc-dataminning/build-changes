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

public class cvf {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static cvf.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new cvf.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static cvf.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new cvf.d(cvf.b.a($$0), cvf.b.a($$1), cvf.b.a($$2), cvf.b.a($$3), cvf.b.a($$4), cvf.b.a($$5), a($$6));
   }

   public static cvf.d a(cvf.b $$0, cvf.b $$1, cvf.b $$2, cvf.b $$3, cvf.b $$4, cvf.b $$5, float $$6) {
      return new cvf.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static cvf.f a() {
      dor $$0 = dos.a();
      return new cvf.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static hx a(List<cvf.d> $$0, cvf.f $$1) {
      return (new cvf.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(cvf.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<cvf.b> a = atx.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new cvf.b(cvf.a($$0), cvf.a($$1))),
         $$0 -> cvf.a($$0.a()),
         $$0 -> cvf.a($$0.b())
      );

      public static cvf.b a(float $$0) {
         return a($$0, $$0);
      }

      public static cvf.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new cvf.b(cvf.a($$0), cvf.a($$1));
         }
      }

      public static cvf.b a(cvf.b $$0, cvf.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new cvf.b($$0.a(), $$1.b());
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

      public long a(cvf.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public cvf.b b(@Nullable cvf.b $$0) {
         return $$0 == null ? this : new cvf.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<cvf.d, T>> a;
      private final cvf.e<T> b;

      public static <T> Codec<cvf.c<T>> a(MapCodec<T> $$0) {
         return atx.a(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(cvf.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(cvf.c::new, cvf.c::a);
      }

      public c(List<Pair<cvf.d, T>> $$0) {
         this.a = $$0;
         this.b = cvf.e.a($$0);
      }

      public List<Pair<cvf.d, T>> a() {
         return this.a;
      }

      public T a(cvf.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(cvf.h $$0) {
         Iterator<Pair<cvf.d, T>> $$1 = this.a().iterator();
         Pair<cvf.d, T> $$2 = $$1.next();
         long $$3 = ((cvf.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<cvf.d, T> $$5 = $$1.next();
            long $$6 = ((cvf.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(cvf.h $$0) {
         return this.a($$0, cvf.e.b::a);
      }

      protected T a(cvf.h $$0, cvf.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(cvf.b b, cvf.b c, cvf.b d, cvf.b e, cvf.b f, cvf.b g, long h) {
      public static final Codec<cvf.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cvf.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  cvf.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  cvf.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  cvf.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  cvf.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  cvf.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(cvf::a, cvf::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, cvf.d::new)
      );

      long a(cvf.h $$0) {
         return aup.a(this.b.a($$0.a))
            + aup.a(this.c.a($$0.b))
            + aup.a(this.d.a($$0.c))
            + aup.a(this.e.a($$0.d))
            + aup.a(this.f.a($$0.e))
            + aup.a(this.g.a($$0.f))
            + aup.a(this.h);
      }

      protected List<cvf.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new cvf.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final cvf.e.b<T> b;
      private final ThreadLocal<cvf.e.a<T>> c = new ThreadLocal<>();

      private e(cvf.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> cvf.e<T> a(List<Pair<cvf.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((cvf.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<cvf.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new cvf.e.a<>((cvf.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new cvf.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> cvf.e.b<T> a(int $$0, List<? extends cvf.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (cvf.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  cvf.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new cvf.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<cvf.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<cvf.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (cvf.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new cvf.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends cvf.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<cvf.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<cvf.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            cvf.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<cvf.e.c<T>> b(List<? extends cvf.e.b<T>> $$0) {
         List<cvf.e.c<T>> $$1 = Lists.newArrayList();
         List<cvf.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (cvf.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new cvf.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new cvf.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(cvf.b[] $$0) {
         long $$1 = 0L;

         for (cvf.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<cvf.b> c(List<? extends cvf.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<cvf.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (cvf.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(cvf.h $$0, cvf.a<T> $$1) {
         long[] $$2 = $$0.a();
         cvf.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends cvf.e.b<T> {
         final T b;

         a(cvf.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected cvf.e.a<T> a(long[] $$0, @Nullable cvf.e.a<T> $$1, cvf.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final cvf.b[] a;

         protected b(List<cvf.b> $$0) {
            this.a = $$0.toArray(new cvf.b[0]);
         }

         protected abstract cvf.e.a<T> a(long[] var1, @Nullable cvf.e.a<T> var2, cvf.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += aup.a(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends cvf.e.b<T> {
         final cvf.e.b<T>[] b;

         protected c(List<? extends cvf.e.b<T>> $$0) {
            this(cvf.e.c($$0), $$0);
         }

         protected c(List<cvf.b> $$0, List<? extends cvf.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new cvf.e.b[0]);
         }

         @Override
         protected cvf.e.a<T> a(long[] $$0, @Nullable cvf.e.a<T> $$1, cvf.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            cvf.e.a<T> $$4 = $$1;

            for (cvf.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  cvf.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(dor a, dor b, dor c, dor d, dor e, dor f, List<cvf.d> g) {
      public cvf.h a(int $$0, int $$1, int $$2) {
         int $$3 = is.c($$0);
         int $$4 = is.c($$1);
         int $$5 = is.c($$2);
         dor.e $$6 = new dor.e($$3, $$4, $$5);
         return cvf.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public hx a() {
         return this.g.isEmpty() ? hx.b : cvf.a(this.g, this);
      }

      public dor b() {
         return this.a;
      }

      public dor c() {
         return this.b;
      }

      public dor d() {
         return this.c;
      }

      public dor e() {
         return this.d;
      }

      public dor f() {
         return this.e;
      }

      public dor g() {
         return this.f;
      }

      public List<cvf.d> h() {
         return this.g;
      }
   }

   static class g {
      cvf.g.a a;

      g(List<cvf.d> $$0, cvf.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<cvf.d> $$0, cvf.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         hx $$6 = this.a.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            cvf.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static cvf.g.a a(List<cvf.d> $$0, cvf.f $$1, int $$2, int $$3) {
         double $$4 = aup.k(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)aup.k(10000.0F) * Math.pow((double)(aup.a((long)$$2) + aup.a((long)$$3)) / $$4, 2.0));
         cvf.h $$7 = $$1.a(is.a($$2), 0, is.a($$3));
         cvf.h $$8 = new cvf.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for (cvf.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new cvf.g.a(new hx($$2, 0, $$3), $$6 + $$9);
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
