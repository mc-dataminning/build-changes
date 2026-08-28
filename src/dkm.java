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

public class dkm {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dkm.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dkm.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dkm.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dkm.d(dkm.b.a($$0), dkm.b.a($$1), dkm.b.a($$2), dkm.b.a($$3), dkm.b.a($$4), dkm.b.a($$5), a($$6));
   }

   public static dkm.d a(dkm.b $$0, dkm.b $$1, dkm.b $$2, dkm.b $$3, dkm.b $$4, dkm.b $$5, float $$6) {
      return new dkm.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dkm.f a() {
      efz $$0 = ega.a();
      return new dkm.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static iu a(List<dkm.d> $$0, dkm.f $$1) {
      return (new dkm.g($$0, $$1)).b.a();
   }

   interface a<T> {
      long distance(dkm.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dkm.b> a = ayu.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dkm.b(dkm.a($$0), dkm.a($$1))),
         $$0 -> dkm.a($$0.a()),
         $$0 -> dkm.a($$0.b())
      );

      public static dkm.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dkm.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dkm.b(dkm.a($$0), dkm.a($$1));
         }
      }

      public static dkm.b a(dkm.b $$0, dkm.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dkm.b($$0.a(), $$1.b());
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

      public long a(dkm.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dkm.b b(@Nullable dkm.b $$0) {
         return $$0 == null ? this : new dkm.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dkm.d, T>> a;
      private final dkm.e<T> b;

      public static <T> Codec<dkm.c<T>> a(MapCodec<T> $$0) {
         return ayu.b(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dkm.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dkm.c::new, dkm.c::a);
      }

      public c(List<Pair<dkm.d, T>> $$0) {
         this.a = $$0;
         this.b = dkm.e.a($$0);
      }

      public List<Pair<dkm.d, T>> a() {
         return this.a;
      }

      public T a(dkm.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dkm.h $$0) {
         Iterator<Pair<dkm.d, T>> $$1 = this.a().iterator();
         Pair<dkm.d, T> $$2 = $$1.next();
         long $$3 = ((dkm.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dkm.d, T> $$5 = $$1.next();
            long $$6 = ((dkm.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dkm.h $$0) {
         return this.a($$0, dkm.e.b::a);
      }

      protected T a(dkm.h $$0, dkm.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dkm.b b, dkm.b c, dkm.b d, dkm.b e, dkm.b f, dkm.b g, long h) {
      public static final Codec<dkm.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dkm.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dkm.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dkm.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dkm.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dkm.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dkm.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dkm::a, dkm::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dkm.d::new)
      );

      long a(dkm.h $$0) {
         return azm.b(this.b.a($$0.a))
            + azm.b(this.c.a($$0.b))
            + azm.b(this.d.a($$0.c))
            + azm.b(this.e.a($$0.d))
            + azm.b(this.f.a($$0.e))
            + azm.b(this.g.a($$0.f))
            + azm.b(this.h);
      }

      protected List<dkm.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dkm.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dkm.e.b<T> b;
      private final ThreadLocal<dkm.e.a<T>> c = new ThreadLocal<>();

      private e(dkm.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dkm.e<T> a(List<Pair<dkm.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dkm.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dkm.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dkm.e.a<>((dkm.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dkm.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dkm.e.b<T> a(int $$0, List<? extends dkm.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dkm.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dkm.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dkm.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dkm.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dkm.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dkm.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dkm.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dkm.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dkm.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dkm.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dkm.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dkm.e.c<T>> b(List<? extends dkm.e.b<T>> $$0) {
         List<dkm.e.c<T>> $$1 = Lists.newArrayList();
         List<dkm.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dkm.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dkm.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dkm.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dkm.b[] $$0) {
         long $$1 = 0L;

         for (dkm.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dkm.b> c(List<? extends dkm.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dkm.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dkm.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dkm.h $$0, dkm.a<T> $$1) {
         long[] $$2 = $$0.a();
         dkm.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dkm.e.b<T> {
         final T b;

         a(dkm.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dkm.e.a<T> a(long[] $$0, @Nullable dkm.e.a<T> $$1, dkm.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dkm.b[] a;

         protected b(List<dkm.b> $$0) {
            this.a = $$0.toArray(new dkm.b[0]);
         }

         protected abstract dkm.e.a<T> a(long[] var1, @Nullable dkm.e.a<T> var2, dkm.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += azm.b(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends dkm.e.b<T> {
         final dkm.e.b<T>[] b;

         protected c(List<? extends dkm.e.b<T>> $$0) {
            this(dkm.e.c($$0), $$0);
         }

         protected c(List<dkm.b> $$0, List<? extends dkm.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dkm.e.b[0]);
         }

         @Override
         protected dkm.e.a<T> a(long[] $$0, @Nullable dkm.e.a<T> $$1, dkm.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dkm.e.a<T> $$4 = $$1;

            for (dkm.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dkm.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(efz a, efz b, efz c, efz d, efz e, efz f, List<dkm.d> g) {
      public dkm.h a(int $$0, int $$1, int $$2) {
         int $$3 = jp.c($$0);
         int $$4 = jp.c($$1);
         int $$5 = jp.c($$2);
         efz.e $$6 = new efz.e($$3, $$4, $$5);
         return dkm.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public iu a() {
         return this.g.isEmpty() ? iu.c : dkm.a(this.g, this);
      }

      public efz b() {
         return this.a;
      }

      public efz c() {
         return this.b;
      }

      public efz d() {
         return this.c;
      }

      public efz e() {
         return this.d;
      }

      public efz f() {
         return this.e;
      }

      public efz g() {
         return this.f;
      }

      public List<dkm.d> h() {
         return this.g;
      }
   }

   static class g {
      private static final long a = 2048L;
      dkm.g.a b;

      g(List<dkm.d> $$0, dkm.f $$1) {
         this.b = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dkm.d> $$0, dkm.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         iu $$6 = this.b.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dkm.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static dkm.g.a a(List<dkm.d> $$0, dkm.f $$1, int $$2, int $$3) {
         dkm.h $$4 = $$1.a(jp.a($$2), 0, jp.a($$3));
         dkm.h $$5 = new dkm.h($$4.b(), $$4.c(), $$4.d(), $$4.e(), 0L, $$4.g());
         long $$6 = Long.MAX_VALUE;

         for (dkm.d $$7 : $$0) {
            $$6 = Math.min($$6, $$7.a($$5));
         }

         long $$8 = azm.b((long)$$2) + azm.b((long)$$3);
         long $$9 = $$6 * azm.b(2048L) + $$8;
         return new dkm.g.a(new iu($$2, 0, $$3), $$9);
      }

      static record a(iu a, long b) {
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
