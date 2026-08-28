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

public class ddo {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static ddo.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new ddo.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static ddo.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new ddo.d(ddo.b.a($$0), ddo.b.a($$1), ddo.b.a($$2), ddo.b.a($$3), ddo.b.a($$4), ddo.b.a($$5), a($$6));
   }

   public static ddo.d a(ddo.b $$0, ddo.b $$1, ddo.b $$2, ddo.b $$3, ddo.b $$4, ddo.b $$5, float $$6) {
      return new ddo.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static ddo.f a() {
      dxy $$0 = dxz.a();
      return new ddo.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static ja a(List<ddo.d> $$0, ddo.f $$1) {
      return (new ddo.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(ddo.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<ddo.b> a = axo.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new ddo.b(ddo.a($$0), ddo.a($$1))),
         $$0 -> ddo.a($$0.a()),
         $$0 -> ddo.a($$0.b())
      );

      public static ddo.b a(float $$0) {
         return a($$0, $$0);
      }

      public static ddo.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new ddo.b(ddo.a($$0), ddo.a($$1));
         }
      }

      public static ddo.b a(ddo.b $$0, ddo.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new ddo.b($$0.a(), $$1.b());
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

      public long a(ddo.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public ddo.b b(@Nullable ddo.b $$0) {
         return $$0 == null ? this : new ddo.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<ddo.d, T>> a;
      private final ddo.e<T> b;

      public static <T> Codec<ddo.c<T>> a(MapCodec<T> $$0) {
         return axo.a(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(ddo.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(ddo.c::new, ddo.c::a);
      }

      public c(List<Pair<ddo.d, T>> $$0) {
         this.a = $$0;
         this.b = ddo.e.a($$0);
      }

      public List<Pair<ddo.d, T>> a() {
         return this.a;
      }

      public T a(ddo.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(ddo.h $$0) {
         Iterator<Pair<ddo.d, T>> $$1 = this.a().iterator();
         Pair<ddo.d, T> $$2 = $$1.next();
         long $$3 = ((ddo.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<ddo.d, T> $$5 = $$1.next();
            long $$6 = ((ddo.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(ddo.h $$0) {
         return this.a($$0, ddo.e.b::a);
      }

      protected T a(ddo.h $$0, ddo.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(ddo.b b, ddo.b c, ddo.b d, ddo.b e, ddo.b f, ddo.b g, long h) {
      public static final Codec<ddo.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ddo.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  ddo.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  ddo.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  ddo.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  ddo.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  ddo.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(ddo::a, ddo::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, ddo.d::new)
      );

      long a(ddo.h $$0) {
         return ayg.a(this.b.a($$0.a))
            + ayg.a(this.c.a($$0.b))
            + ayg.a(this.d.a($$0.c))
            + ayg.a(this.e.a($$0.d))
            + ayg.a(this.f.a($$0.e))
            + ayg.a(this.g.a($$0.f))
            + ayg.a(this.h);
      }

      protected List<ddo.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new ddo.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final ddo.e.b<T> b;
      private final ThreadLocal<ddo.e.a<T>> c = new ThreadLocal<>();

      private e(ddo.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> ddo.e<T> a(List<Pair<ddo.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((ddo.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<ddo.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new ddo.e.a<>((ddo.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new ddo.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> ddo.e.b<T> a(int $$0, List<? extends ddo.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (ddo.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  ddo.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new ddo.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<ddo.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<ddo.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (ddo.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new ddo.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends ddo.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<ddo.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<ddo.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            ddo.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<ddo.e.c<T>> b(List<? extends ddo.e.b<T>> $$0) {
         List<ddo.e.c<T>> $$1 = Lists.newArrayList();
         List<ddo.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (ddo.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new ddo.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new ddo.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(ddo.b[] $$0) {
         long $$1 = 0L;

         for (ddo.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<ddo.b> c(List<? extends ddo.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<ddo.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (ddo.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(ddo.h $$0, ddo.a<T> $$1) {
         long[] $$2 = $$0.a();
         ddo.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends ddo.e.b<T> {
         final T b;

         a(ddo.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected ddo.e.a<T> a(long[] $$0, @Nullable ddo.e.a<T> $$1, ddo.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final ddo.b[] a;

         protected b(List<ddo.b> $$0) {
            this.a = $$0.toArray(new ddo.b[0]);
         }

         protected abstract ddo.e.a<T> a(long[] var1, @Nullable ddo.e.a<T> var2, ddo.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += ayg.a(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends ddo.e.b<T> {
         final ddo.e.b<T>[] b;

         protected c(List<? extends ddo.e.b<T>> $$0) {
            this(ddo.e.c($$0), $$0);
         }

         protected c(List<ddo.b> $$0, List<? extends ddo.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new ddo.e.b[0]);
         }

         @Override
         protected ddo.e.a<T> a(long[] $$0, @Nullable ddo.e.a<T> $$1, ddo.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            ddo.e.a<T> $$4 = $$1;

            for (ddo.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  ddo.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(dxy a, dxy b, dxy c, dxy d, dxy e, dxy f, List<ddo.d> g) {
      public ddo.h a(int $$0, int $$1, int $$2) {
         int $$3 = ju.c($$0);
         int $$4 = ju.c($$1);
         int $$5 = ju.c($$2);
         dxy.e $$6 = new dxy.e($$3, $$4, $$5);
         return ddo.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public ja a() {
         return this.g.isEmpty() ? ja.c : ddo.a(this.g, this);
      }

      public dxy b() {
         return this.a;
      }

      public dxy c() {
         return this.b;
      }

      public dxy d() {
         return this.c;
      }

      public dxy e() {
         return this.d;
      }

      public dxy f() {
         return this.e;
      }

      public dxy g() {
         return this.f;
      }

      public List<ddo.d> h() {
         return this.g;
      }
   }

   static class g {
      ddo.g.a a;

      g(List<ddo.d> $$0, ddo.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<ddo.d> $$0, ddo.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         ja $$6 = this.a.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            ddo.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static ddo.g.a a(List<ddo.d> $$0, ddo.f $$1, int $$2, int $$3) {
         double $$4 = ayg.k(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)ayg.k(10000.0F) * Math.pow((double)(ayg.a((long)$$2) + ayg.a((long)$$3)) / $$4, 2.0));
         ddo.h $$7 = $$1.a(ju.a($$2), 0, ju.a($$3));
         ddo.h $$8 = new ddo.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for (ddo.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new ddo.g.a(new ja($$2, 0, $$3), $$6 + $$9);
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
