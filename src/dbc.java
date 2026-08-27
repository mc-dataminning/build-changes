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

public class dbc {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dbc.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dbc.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dbc.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dbc.d(dbc.b.a($$0), dbc.b.a($$1), dbc.b.a($$2), dbc.b.a($$3), dbc.b.a($$4), dbc.b.a($$5), a($$6));
   }

   public static dbc.d a(dbc.b $$0, dbc.b $$1, dbc.b $$2, dbc.b $$3, dbc.b $$4, dbc.b $$5, float $$6) {
      return new dbc.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dbc.f a() {
      dvj $$0 = dvk.a();
      return new dbc.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static im a(List<dbc.d> $$0, dbc.f $$1) {
      return (new dbc.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(dbc.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dbc.b> a = axe.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dbc.b(dbc.a($$0), dbc.a($$1))),
         $$0 -> dbc.a($$0.a()),
         $$0 -> dbc.a($$0.b())
      );

      public static dbc.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dbc.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dbc.b(dbc.a($$0), dbc.a($$1));
         }
      }

      public static dbc.b a(dbc.b $$0, dbc.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dbc.b($$0.a(), $$1.b());
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

      public long a(dbc.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dbc.b b(@Nullable dbc.b $$0) {
         return $$0 == null ? this : new dbc.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dbc.d, T>> a;
      private final dbc.e<T> b;

      public static <T> Codec<dbc.c<T>> a(MapCodec<T> $$0) {
         return axe.a(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dbc.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dbc.c::new, dbc.c::a);
      }

      public c(List<Pair<dbc.d, T>> $$0) {
         this.a = $$0;
         this.b = dbc.e.a($$0);
      }

      public List<Pair<dbc.d, T>> a() {
         return this.a;
      }

      public T a(dbc.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dbc.h $$0) {
         Iterator<Pair<dbc.d, T>> $$1 = this.a().iterator();
         Pair<dbc.d, T> $$2 = $$1.next();
         long $$3 = ((dbc.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dbc.d, T> $$5 = $$1.next();
            long $$6 = ((dbc.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dbc.h $$0) {
         return this.a($$0, dbc.e.b::a);
      }

      protected T a(dbc.h $$0, dbc.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dbc.b b, dbc.b c, dbc.b d, dbc.b e, dbc.b f, dbc.b g, long h) {
      public static final Codec<dbc.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dbc.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dbc.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dbc.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dbc.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dbc.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dbc.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dbc::a, dbc::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dbc.d::new)
      );

      long a(dbc.h $$0) {
         return axw.a(this.b.a($$0.a))
            + axw.a(this.c.a($$0.b))
            + axw.a(this.d.a($$0.c))
            + axw.a(this.e.a($$0.d))
            + axw.a(this.f.a($$0.e))
            + axw.a(this.g.a($$0.f))
            + axw.a(this.h);
      }

      protected List<dbc.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dbc.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dbc.e.b<T> b;
      private final ThreadLocal<dbc.e.a<T>> c = new ThreadLocal<>();

      private e(dbc.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dbc.e<T> a(List<Pair<dbc.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dbc.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dbc.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dbc.e.a<>((dbc.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dbc.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dbc.e.b<T> a(int $$0, List<? extends dbc.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dbc.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dbc.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dbc.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dbc.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dbc.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dbc.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dbc.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dbc.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dbc.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dbc.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dbc.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dbc.e.c<T>> b(List<? extends dbc.e.b<T>> $$0) {
         List<dbc.e.c<T>> $$1 = Lists.newArrayList();
         List<dbc.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dbc.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dbc.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dbc.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dbc.b[] $$0) {
         long $$1 = 0L;

         for (dbc.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dbc.b> c(List<? extends dbc.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dbc.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dbc.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dbc.h $$0, dbc.a<T> $$1) {
         long[] $$2 = $$0.a();
         dbc.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dbc.e.b<T> {
         final T b;

         a(dbc.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dbc.e.a<T> a(long[] $$0, @Nullable dbc.e.a<T> $$1, dbc.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dbc.b[] a;

         protected b(List<dbc.b> $$0) {
            this.a = $$0.toArray(new dbc.b[0]);
         }

         protected abstract dbc.e.a<T> a(long[] var1, @Nullable dbc.e.a<T> var2, dbc.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += axw.a(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends dbc.e.b<T> {
         final dbc.e.b<T>[] b;

         protected c(List<? extends dbc.e.b<T>> $$0) {
            this(dbc.e.c($$0), $$0);
         }

         protected c(List<dbc.b> $$0, List<? extends dbc.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dbc.e.b[0]);
         }

         @Override
         protected dbc.e.a<T> a(long[] $$0, @Nullable dbc.e.a<T> $$1, dbc.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dbc.e.a<T> $$4 = $$1;

            for (dbc.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dbc.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(dvj a, dvj b, dvj c, dvj d, dvj e, dvj f, List<dbc.d> g) {
      public dbc.h a(int $$0, int $$1, int $$2) {
         int $$3 = jg.c($$0);
         int $$4 = jg.c($$1);
         int $$5 = jg.c($$2);
         dvj.e $$6 = new dvj.e($$3, $$4, $$5);
         return dbc.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public im a() {
         return this.g.isEmpty() ? im.c : dbc.a(this.g, this);
      }

      public dvj b() {
         return this.a;
      }

      public dvj c() {
         return this.b;
      }

      public dvj d() {
         return this.c;
      }

      public dvj e() {
         return this.d;
      }

      public dvj f() {
         return this.e;
      }

      public dvj g() {
         return this.f;
      }

      public List<dbc.d> h() {
         return this.g;
      }
   }

   static class g {
      dbc.g.a a;

      g(List<dbc.d> $$0, dbc.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dbc.d> $$0, dbc.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         im $$6 = this.a.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dbc.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static dbc.g.a a(List<dbc.d> $$0, dbc.f $$1, int $$2, int $$3) {
         double $$4 = axw.k(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)axw.k(10000.0F) * Math.pow((double)(axw.a((long)$$2) + axw.a((long)$$3)) / $$4, 2.0));
         dbc.h $$7 = $$1.a(jg.a($$2), 0, jg.a($$3));
         dbc.h $$8 = new dbc.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for (dbc.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new dbc.g.a(new im($$2, 0, $$3), $$6 + $$9);
      }

      static record a(im a, long b) {
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
