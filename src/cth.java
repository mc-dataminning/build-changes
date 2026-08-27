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

public class cth {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static cth.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new cth.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static cth.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new cth.d(cth.b.a($$0), cth.b.a($$1), cth.b.a($$2), cth.b.a($$3), cth.b.a($$4), cth.b.a($$5), a($$6));
   }

   public static cth.d a(cth.b $$0, cth.b $$1, cth.b $$2, cth.b $$3, cth.b $$4, cth.b $$5, float $$6) {
      return new cth.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static cth.f a() {
      dmk $$0 = dml.a();
      return new cth.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static ht a(List<cth.d> $$0, cth.f $$1) {
      return (new cth.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(cth.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<cth.b> a = asu.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new cth.b(cth.a($$0), cth.a($$1))),
         $$0 -> cth.a($$0.a()),
         $$0 -> cth.a($$0.b())
      );

      public static cth.b a(float $$0) {
         return a($$0, $$0);
      }

      public static cth.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new cth.b(cth.a($$0), cth.a($$1));
         }
      }

      public static cth.b a(cth.b $$0, cth.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new cth.b($$0.a(), $$1.b());
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

      public long a(cth.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public cth.b b(@Nullable cth.b $$0) {
         return $$0 == null ? this : new cth.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<cth.d, T>> a;
      private final cth.e<T> b;

      public static <T> Codec<cth.c<T>> a(MapCodec<T> $$0) {
         return asu.a(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(cth.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(cth.c::new, cth.c::a);
      }

      public c(List<Pair<cth.d, T>> $$0) {
         this.a = $$0;
         this.b = cth.e.a($$0);
      }

      public List<Pair<cth.d, T>> a() {
         return this.a;
      }

      public T a(cth.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(cth.h $$0) {
         Iterator<Pair<cth.d, T>> $$1 = this.a().iterator();
         Pair<cth.d, T> $$2 = $$1.next();
         long $$3 = ((cth.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<cth.d, T> $$5 = $$1.next();
            long $$6 = ((cth.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(cth.h $$0) {
         return this.a($$0, cth.e.b::a);
      }

      protected T a(cth.h $$0, cth.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(cth.b b, cth.b c, cth.b d, cth.b e, cth.b f, cth.b g, long h) {
      public static final Codec<cth.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cth.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  cth.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  cth.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  cth.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  cth.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  cth.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(cth::a, cth::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, cth.d::new)
      );

      long a(cth.h $$0) {
         return atm.a(this.b.a($$0.a))
            + atm.a(this.c.a($$0.b))
            + atm.a(this.d.a($$0.c))
            + atm.a(this.e.a($$0.d))
            + atm.a(this.f.a($$0.e))
            + atm.a(this.g.a($$0.f))
            + atm.a(this.h);
      }

      protected List<cth.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new cth.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final cth.e.b<T> b;
      private final ThreadLocal<cth.e.a<T>> c = new ThreadLocal<>();

      private e(cth.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> cth.e<T> a(List<Pair<cth.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((cth.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<cth.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new cth.e.a<>((cth.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new cth.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> cth.e.b<T> a(int $$0, List<? extends cth.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (cth.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  cth.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new cth.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<cth.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<cth.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (cth.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new cth.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends cth.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<cth.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<cth.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            cth.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<cth.e.c<T>> b(List<? extends cth.e.b<T>> $$0) {
         List<cth.e.c<T>> $$1 = Lists.newArrayList();
         List<cth.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (cth.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new cth.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new cth.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(cth.b[] $$0) {
         long $$1 = 0L;

         for (cth.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<cth.b> c(List<? extends cth.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<cth.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (cth.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(cth.h $$0, cth.a<T> $$1) {
         long[] $$2 = $$0.a();
         cth.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends cth.e.b<T> {
         final T b;

         a(cth.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected cth.e.a<T> a(long[] $$0, @Nullable cth.e.a<T> $$1, cth.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final cth.b[] a;

         protected b(List<cth.b> $$0) {
            this.a = $$0.toArray(new cth.b[0]);
         }

         protected abstract cth.e.a<T> a(long[] var1, @Nullable cth.e.a<T> var2, cth.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += atm.a(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends cth.e.b<T> {
         final cth.e.b<T>[] b;

         protected c(List<? extends cth.e.b<T>> $$0) {
            this(cth.e.c($$0), $$0);
         }

         protected c(List<cth.b> $$0, List<? extends cth.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new cth.e.b[0]);
         }

         @Override
         protected cth.e.a<T> a(long[] $$0, @Nullable cth.e.a<T> $$1, cth.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            cth.e.a<T> $$4 = $$1;

            for (cth.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  cth.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(dmk a, dmk b, dmk c, dmk d, dmk e, dmk f, List<cth.d> g) {
      public cth.h a(int $$0, int $$1, int $$2) {
         int $$3 = in.c($$0);
         int $$4 = in.c($$1);
         int $$5 = in.c($$2);
         dmk.e $$6 = new dmk.e($$3, $$4, $$5);
         return cth.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public ht a() {
         return this.g.isEmpty() ? ht.b : cth.a(this.g, this);
      }

      public dmk b() {
         return this.a;
      }

      public dmk c() {
         return this.b;
      }

      public dmk d() {
         return this.c;
      }

      public dmk e() {
         return this.d;
      }

      public dmk f() {
         return this.e;
      }

      public dmk g() {
         return this.f;
      }

      public List<cth.d> h() {
         return this.g;
      }
   }

   static class g {
      cth.g.a a;

      g(List<cth.d> $$0, cth.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<cth.d> $$0, cth.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         ht $$6 = this.a.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            cth.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static cth.g.a a(List<cth.d> $$0, cth.f $$1, int $$2, int $$3) {
         double $$4 = atm.k(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)atm.k(10000.0F) * Math.pow((double)(atm.a((long)$$2) + atm.a((long)$$3)) / $$4, 2.0));
         cth.h $$7 = $$1.a(in.a($$2), 0, in.a($$3));
         cth.h $$8 = new cth.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for (cth.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new cth.g.a(new ht($$2, 0, $$3), $$6 + $$9);
      }

      static record a(ht a, long b) {
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
