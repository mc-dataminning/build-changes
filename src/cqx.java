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

public class cqx {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static cqx.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new cqx.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static cqx.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new cqx.d(cqx.b.a($$0), cqx.b.a($$1), cqx.b.a($$2), cqx.b.a($$3), cqx.b.a($$4), cqx.b.a($$5), a($$6));
   }

   public static cqx.d a(cqx.b $$0, cqx.b $$1, cqx.b $$2, cqx.b $$3, cqx.b $$4, cqx.b $$5, float $$6) {
      return new cqx.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static cqx.f a() {
      dkg $$0 = dkh.a();
      return new cqx.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static gw a(List<cqx.d> $$0, cqx.f $$1) {
      return (new cqx.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(cqx.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<cqx.b> a = arb.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new cqx.b(cqx.a($$0), cqx.a($$1))),
         $$0 -> cqx.a($$0.a()),
         $$0 -> cqx.a($$0.b())
      );

      public static cqx.b a(float $$0) {
         return a($$0, $$0);
      }

      public static cqx.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new cqx.b(cqx.a($$0), cqx.a($$1));
         }
      }

      public static cqx.b a(cqx.b $$0, cqx.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new cqx.b($$0.a(), $$1.b());
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

      public long a(cqx.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public cqx.b b(@Nullable cqx.b $$0) {
         return $$0 == null ? this : new cqx.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<cqx.d, T>> a;
      private final cqx.e<T> b;

      public static <T> Codec<cqx.c<T>> a(MapCodec<T> $$0) {
         return arb.a(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(cqx.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(cqx.c::new, cqx.c::a);
      }

      public c(List<Pair<cqx.d, T>> $$0) {
         this.a = $$0;
         this.b = cqx.e.a($$0);
      }

      public List<Pair<cqx.d, T>> a() {
         return this.a;
      }

      public T a(cqx.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(cqx.h $$0) {
         Iterator<Pair<cqx.d, T>> $$1 = this.a().iterator();
         Pair<cqx.d, T> $$2 = $$1.next();
         long $$3 = ((cqx.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<cqx.d, T> $$5 = $$1.next();
            long $$6 = ((cqx.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(cqx.h $$0) {
         return this.a($$0, cqx.e.b::a);
      }

      protected T a(cqx.h $$0, cqx.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(cqx.b b, cqx.b c, cqx.b d, cqx.b e, cqx.b f, cqx.b g, long h) {
      public static final Codec<cqx.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cqx.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  cqx.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  cqx.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  cqx.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  cqx.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  cqx.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(cqx::a, cqx::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, cqx.d::new)
      );

      long a(cqx.h $$0) {
         return ars.a(this.b.a($$0.a))
            + ars.a(this.c.a($$0.b))
            + ars.a(this.d.a($$0.c))
            + ars.a(this.e.a($$0.d))
            + ars.a(this.f.a($$0.e))
            + ars.a(this.g.a($$0.f))
            + ars.a(this.h);
      }

      protected List<cqx.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new cqx.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final cqx.e.b<T> b;
      private final ThreadLocal<cqx.e.a<T>> c = new ThreadLocal<>();

      private e(cqx.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> cqx.e<T> a(List<Pair<cqx.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((cqx.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<cqx.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new cqx.e.a<>((cqx.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new cqx.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> cqx.e.b<T> a(int $$0, List<? extends cqx.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (cqx.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  cqx.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new cqx.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<cqx.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<cqx.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (cqx.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new cqx.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends cqx.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<cqx.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<cqx.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            cqx.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<cqx.e.c<T>> b(List<? extends cqx.e.b<T>> $$0) {
         List<cqx.e.c<T>> $$1 = Lists.newArrayList();
         List<cqx.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (cqx.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new cqx.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new cqx.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(cqx.b[] $$0) {
         long $$1 = 0L;

         for (cqx.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<cqx.b> c(List<? extends cqx.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<cqx.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (cqx.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(cqx.h $$0, cqx.a<T> $$1) {
         long[] $$2 = $$0.a();
         cqx.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends cqx.e.b<T> {
         final T b;

         a(cqx.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected cqx.e.a<T> a(long[] $$0, @Nullable cqx.e.a<T> $$1, cqx.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final cqx.b[] a;

         protected b(List<cqx.b> $$0) {
            this.a = $$0.toArray(new cqx.b[0]);
         }

         protected abstract cqx.e.a<T> a(long[] var1, @Nullable cqx.e.a<T> var2, cqx.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += ars.a(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends cqx.e.b<T> {
         final cqx.e.b<T>[] b;

         protected c(List<? extends cqx.e.b<T>> $$0) {
            this(cqx.e.c($$0), $$0);
         }

         protected c(List<cqx.b> $$0, List<? extends cqx.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new cqx.e.b[0]);
         }

         @Override
         protected cqx.e.a<T> a(long[] $$0, @Nullable cqx.e.a<T> $$1, cqx.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            cqx.e.a<T> $$4 = $$1;

            for (cqx.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  cqx.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(dkg a, dkg b, dkg c, dkg d, dkg e, dkg f, List<cqx.d> g) {
      public cqx.h a(int $$0, int $$1, int $$2) {
         int $$3 = hs.c($$0);
         int $$4 = hs.c($$1);
         int $$5 = hs.c($$2);
         dkg.e $$6 = new dkg.e($$3, $$4, $$5);
         return cqx.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public gw a() {
         return this.g.isEmpty() ? gw.b : cqx.a(this.g, this);
      }

      public dkg b() {
         return this.a;
      }

      public dkg c() {
         return this.b;
      }

      public dkg d() {
         return this.c;
      }

      public dkg e() {
         return this.d;
      }

      public dkg f() {
         return this.e;
      }

      public dkg g() {
         return this.f;
      }

      public List<cqx.d> h() {
         return this.g;
      }
   }

   static class g {
      cqx.g.a a;

      g(List<cqx.d> $$0, cqx.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<cqx.d> $$0, cqx.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         gw $$6 = this.a.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            cqx.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static cqx.g.a a(List<cqx.d> $$0, cqx.f $$1, int $$2, int $$3) {
         double $$4 = ars.k(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)ars.k(10000.0F) * Math.pow((double)(ars.a((long)$$2) + ars.a((long)$$3)) / $$4, 2.0));
         cqx.h $$7 = $$1.a(hs.a($$2), 0, hs.a($$3));
         cqx.h $$8 = new cqx.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for (cqx.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new cqx.g.a(new gw($$2, 0, $$3), $$6 + $$9);
      }

      static record a(gw a, long b) {
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
