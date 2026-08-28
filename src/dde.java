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

public class dde {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dde.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dde.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dde.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dde.d(dde.b.a($$0), dde.b.a($$1), dde.b.a($$2), dde.b.a($$3), dde.b.a($$4), dde.b.a($$5), a($$6));
   }

   public static dde.d a(dde.b $$0, dde.b $$1, dde.b $$2, dde.b $$3, dde.b $$4, dde.b $$5, float $$6) {
      return new dde.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dde.f a() {
      dxl $$0 = dxm.a();
      return new dde.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static iz a(List<dde.d> $$0, dde.f $$1) {
      return (new dde.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(dde.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dde.b> a = ayf.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dde.b(dde.a($$0), dde.a($$1))),
         $$0 -> dde.a($$0.a()),
         $$0 -> dde.a($$0.b())
      );

      public static dde.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dde.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dde.b(dde.a($$0), dde.a($$1));
         }
      }

      public static dde.b a(dde.b $$0, dde.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dde.b($$0.a(), $$1.b());
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

      public long a(dde.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dde.b b(@Nullable dde.b $$0) {
         return $$0 == null ? this : new dde.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dde.d, T>> a;
      private final dde.e<T> b;

      public static <T> Codec<dde.c<T>> a(MapCodec<T> $$0) {
         return ayf.a(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dde.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dde.c::new, dde.c::a);
      }

      public c(List<Pair<dde.d, T>> $$0) {
         this.a = $$0;
         this.b = dde.e.a($$0);
      }

      public List<Pair<dde.d, T>> a() {
         return this.a;
      }

      public T a(dde.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dde.h $$0) {
         Iterator<Pair<dde.d, T>> $$1 = this.a().iterator();
         Pair<dde.d, T> $$2 = $$1.next();
         long $$3 = ((dde.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dde.d, T> $$5 = $$1.next();
            long $$6 = ((dde.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dde.h $$0) {
         return this.a($$0, dde.e.b::a);
      }

      protected T a(dde.h $$0, dde.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dde.b b, dde.b c, dde.b d, dde.b e, dde.b f, dde.b g, long h) {
      public static final Codec<dde.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dde.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dde.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dde.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dde.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dde.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dde.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dde::a, dde::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dde.d::new)
      );

      long a(dde.h $$0) {
         return ayx.a(this.b.a($$0.a))
            + ayx.a(this.c.a($$0.b))
            + ayx.a(this.d.a($$0.c))
            + ayx.a(this.e.a($$0.d))
            + ayx.a(this.f.a($$0.e))
            + ayx.a(this.g.a($$0.f))
            + ayx.a(this.h);
      }

      protected List<dde.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dde.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dde.e.b<T> b;
      private final ThreadLocal<dde.e.a<T>> c = new ThreadLocal<>();

      private e(dde.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dde.e<T> a(List<Pair<dde.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dde.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dde.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dde.e.a<>((dde.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dde.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dde.e.b<T> a(int $$0, List<? extends dde.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dde.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dde.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dde.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dde.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dde.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dde.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dde.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dde.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dde.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dde.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dde.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dde.e.c<T>> b(List<? extends dde.e.b<T>> $$0) {
         List<dde.e.c<T>> $$1 = Lists.newArrayList();
         List<dde.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dde.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dde.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dde.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dde.b[] $$0) {
         long $$1 = 0L;

         for (dde.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dde.b> c(List<? extends dde.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dde.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dde.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dde.h $$0, dde.a<T> $$1) {
         long[] $$2 = $$0.a();
         dde.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dde.e.b<T> {
         final T b;

         a(dde.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dde.e.a<T> a(long[] $$0, @Nullable dde.e.a<T> $$1, dde.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dde.b[] a;

         protected b(List<dde.b> $$0) {
            this.a = $$0.toArray(new dde.b[0]);
         }

         protected abstract dde.e.a<T> a(long[] var1, @Nullable dde.e.a<T> var2, dde.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += ayx.a(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends dde.e.b<T> {
         final dde.e.b<T>[] b;

         protected c(List<? extends dde.e.b<T>> $$0) {
            this(dde.e.c($$0), $$0);
         }

         protected c(List<dde.b> $$0, List<? extends dde.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dde.e.b[0]);
         }

         @Override
         protected dde.e.a<T> a(long[] $$0, @Nullable dde.e.a<T> $$1, dde.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dde.e.a<T> $$4 = $$1;

            for (dde.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dde.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(dxl a, dxl b, dxl c, dxl d, dxl e, dxl f, List<dde.d> g) {
      public dde.h a(int $$0, int $$1, int $$2) {
         int $$3 = jt.c($$0);
         int $$4 = jt.c($$1);
         int $$5 = jt.c($$2);
         dxl.e $$6 = new dxl.e($$3, $$4, $$5);
         return dde.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public iz a() {
         return this.g.isEmpty() ? iz.c : dde.a(this.g, this);
      }

      public dxl b() {
         return this.a;
      }

      public dxl c() {
         return this.b;
      }

      public dxl d() {
         return this.c;
      }

      public dxl e() {
         return this.d;
      }

      public dxl f() {
         return this.e;
      }

      public dxl g() {
         return this.f;
      }

      public List<dde.d> h() {
         return this.g;
      }
   }

   static class g {
      dde.g.a a;

      g(List<dde.d> $$0, dde.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dde.d> $$0, dde.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         iz $$6 = this.a.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dde.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static dde.g.a a(List<dde.d> $$0, dde.f $$1, int $$2, int $$3) {
         double $$4 = ayx.k(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)ayx.k(10000.0F) * Math.pow((double)(ayx.a((long)$$2) + ayx.a((long)$$3)) / $$4, 2.0));
         dde.h $$7 = $$1.a(jt.a($$2), 0, jt.a($$3));
         dde.h $$8 = new dde.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for (dde.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new dde.g.a(new iz($$2, 0, $$3), $$6 + $$9);
      }

      static record a(iz a, long b) {
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
