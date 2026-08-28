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

public class dkb {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dkb.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dkb.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dkb.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dkb.d(dkb.b.a($$0), dkb.b.a($$1), dkb.b.a($$2), dkb.b.a($$3), dkb.b.a($$4), dkb.b.a($$5), a($$6));
   }

   public static dkb.d a(dkb.b $$0, dkb.b $$1, dkb.b $$2, dkb.b $$3, dkb.b $$4, dkb.b $$5, float $$6) {
      return new dkb.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dkb.f a() {
      efg $$0 = efh.a();
      return new dkb.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static iu a(List<dkb.d> $$0, dkb.f $$1) {
      return (new dkb.g($$0, $$1)).b.a();
   }

   interface a<T> {
      long distance(dkb.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dkb.b> a = ays.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dkb.b(dkb.a($$0), dkb.a($$1))),
         $$0 -> dkb.a($$0.a()),
         $$0 -> dkb.a($$0.b())
      );

      public static dkb.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dkb.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dkb.b(dkb.a($$0), dkb.a($$1));
         }
      }

      public static dkb.b a(dkb.b $$0, dkb.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dkb.b($$0.a(), $$1.b());
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

      public long a(dkb.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dkb.b b(@Nullable dkb.b $$0) {
         return $$0 == null ? this : new dkb.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dkb.d, T>> a;
      private final dkb.e<T> b;

      public static <T> Codec<dkb.c<T>> a(MapCodec<T> $$0) {
         return ays.b(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dkb.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dkb.c::new, dkb.c::a);
      }

      public c(List<Pair<dkb.d, T>> $$0) {
         this.a = $$0;
         this.b = dkb.e.a($$0);
      }

      public List<Pair<dkb.d, T>> a() {
         return this.a;
      }

      public T a(dkb.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dkb.h $$0) {
         Iterator<Pair<dkb.d, T>> $$1 = this.a().iterator();
         Pair<dkb.d, T> $$2 = $$1.next();
         long $$3 = ((dkb.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dkb.d, T> $$5 = $$1.next();
            long $$6 = ((dkb.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dkb.h $$0) {
         return this.a($$0, dkb.e.b::a);
      }

      protected T a(dkb.h $$0, dkb.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dkb.b b, dkb.b c, dkb.b d, dkb.b e, dkb.b f, dkb.b g, long h) {
      public static final Codec<dkb.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dkb.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dkb.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dkb.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dkb.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dkb.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dkb.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dkb::a, dkb::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dkb.d::new)
      );

      long a(dkb.h $$0) {
         return azk.b(this.b.a($$0.a))
            + azk.b(this.c.a($$0.b))
            + azk.b(this.d.a($$0.c))
            + azk.b(this.e.a($$0.d))
            + azk.b(this.f.a($$0.e))
            + azk.b(this.g.a($$0.f))
            + azk.b(this.h);
      }

      protected List<dkb.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dkb.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dkb.e.b<T> b;
      private final ThreadLocal<dkb.e.a<T>> c = new ThreadLocal<>();

      private e(dkb.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dkb.e<T> a(List<Pair<dkb.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dkb.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dkb.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dkb.e.a<>((dkb.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dkb.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dkb.e.b<T> a(int $$0, List<? extends dkb.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dkb.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dkb.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dkb.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dkb.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dkb.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dkb.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dkb.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dkb.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dkb.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dkb.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dkb.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dkb.e.c<T>> b(List<? extends dkb.e.b<T>> $$0) {
         List<dkb.e.c<T>> $$1 = Lists.newArrayList();
         List<dkb.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dkb.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dkb.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dkb.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dkb.b[] $$0) {
         long $$1 = 0L;

         for (dkb.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dkb.b> c(List<? extends dkb.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dkb.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dkb.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dkb.h $$0, dkb.a<T> $$1) {
         long[] $$2 = $$0.a();
         dkb.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dkb.e.b<T> {
         final T b;

         a(dkb.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dkb.e.a<T> a(long[] $$0, @Nullable dkb.e.a<T> $$1, dkb.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dkb.b[] a;

         protected b(List<dkb.b> $$0) {
            this.a = $$0.toArray(new dkb.b[0]);
         }

         protected abstract dkb.e.a<T> a(long[] var1, @Nullable dkb.e.a<T> var2, dkb.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += azk.b(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends dkb.e.b<T> {
         final dkb.e.b<T>[] b;

         protected c(List<? extends dkb.e.b<T>> $$0) {
            this(dkb.e.c($$0), $$0);
         }

         protected c(List<dkb.b> $$0, List<? extends dkb.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dkb.e.b[0]);
         }

         @Override
         protected dkb.e.a<T> a(long[] $$0, @Nullable dkb.e.a<T> $$1, dkb.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dkb.e.a<T> $$4 = $$1;

            for (dkb.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dkb.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(efg a, efg b, efg c, efg d, efg e, efg f, List<dkb.d> g) {
      public dkb.h a(int $$0, int $$1, int $$2) {
         int $$3 = jp.c($$0);
         int $$4 = jp.c($$1);
         int $$5 = jp.c($$2);
         efg.e $$6 = new efg.e($$3, $$4, $$5);
         return dkb.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public iu a() {
         return this.g.isEmpty() ? iu.c : dkb.a(this.g, this);
      }

      public efg b() {
         return this.a;
      }

      public efg c() {
         return this.b;
      }

      public efg d() {
         return this.c;
      }

      public efg e() {
         return this.d;
      }

      public efg f() {
         return this.e;
      }

      public efg g() {
         return this.f;
      }

      public List<dkb.d> h() {
         return this.g;
      }
   }

   static class g {
      private static final long a = 2048L;
      dkb.g.a b;

      g(List<dkb.d> $$0, dkb.f $$1) {
         this.b = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dkb.d> $$0, dkb.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         iu $$6 = this.b.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dkb.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static dkb.g.a a(List<dkb.d> $$0, dkb.f $$1, int $$2, int $$3) {
         dkb.h $$4 = $$1.a(jp.a($$2), 0, jp.a($$3));
         dkb.h $$5 = new dkb.h($$4.b(), $$4.c(), $$4.d(), $$4.e(), 0L, $$4.g());
         long $$6 = Long.MAX_VALUE;

         for (dkb.d $$7 : $$0) {
            $$6 = Math.min($$6, $$7.a($$5));
         }

         long $$8 = azk.b((long)$$2) + azk.b((long)$$3);
         long $$9 = $$6 * azk.b(2048L) + $$8;
         return new dkb.g.a(new iu($$2, 0, $$3), $$9);
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
