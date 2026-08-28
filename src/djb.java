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

public class djb {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static djb.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new djb.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static djb.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new djb.d(djb.b.a($$0), djb.b.a($$1), djb.b.a($$2), djb.b.a($$3), djb.b.a($$4), djb.b.a($$5), a($$6));
   }

   public static djb.d a(djb.b $$0, djb.b $$1, djb.b $$2, djb.b $$3, djb.b $$4, djb.b $$5, float $$6) {
      return new djb.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static djb.f a() {
      eee $$0 = eef.a();
      return new djb.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static jj a(List<djb.d> $$0, djb.f $$1) {
      return (new djb.g($$0, $$1)).b.a();
   }

   interface a<T> {
      long distance(djb.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<djb.b> a = ays.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new djb.b(djb.a($$0), djb.a($$1))),
         $$0 -> djb.a($$0.a()),
         $$0 -> djb.a($$0.b())
      );

      public static djb.b a(float $$0) {
         return a($$0, $$0);
      }

      public static djb.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new djb.b(djb.a($$0), djb.a($$1));
         }
      }

      public static djb.b a(djb.b $$0, djb.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new djb.b($$0.a(), $$1.b());
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

      public long a(djb.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public djb.b b(@Nullable djb.b $$0) {
         return $$0 == null ? this : new djb.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<djb.d, T>> a;
      private final djb.e<T> b;

      public static <T> Codec<djb.c<T>> a(MapCodec<T> $$0) {
         return ays.b(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(djb.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(djb.c::new, djb.c::a);
      }

      public c(List<Pair<djb.d, T>> $$0) {
         this.a = $$0;
         this.b = djb.e.a($$0);
      }

      public List<Pair<djb.d, T>> a() {
         return this.a;
      }

      public T a(djb.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(djb.h $$0) {
         Iterator<Pair<djb.d, T>> $$1 = this.a().iterator();
         Pair<djb.d, T> $$2 = $$1.next();
         long $$3 = ((djb.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<djb.d, T> $$5 = $$1.next();
            long $$6 = ((djb.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(djb.h $$0) {
         return this.a($$0, djb.e.b::a);
      }

      protected T a(djb.h $$0, djb.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(djb.b b, djb.b c, djb.b d, djb.b e, djb.b f, djb.b g, long h) {
      public static final Codec<djb.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  djb.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  djb.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  djb.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  djb.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  djb.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  djb.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(djb::a, djb::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, djb.d::new)
      );

      long a(djb.h $$0) {
         return azk.b(this.b.a($$0.a))
            + azk.b(this.c.a($$0.b))
            + azk.b(this.d.a($$0.c))
            + azk.b(this.e.a($$0.d))
            + azk.b(this.f.a($$0.e))
            + azk.b(this.g.a($$0.f))
            + azk.b(this.h);
      }

      protected List<djb.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new djb.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final djb.e.b<T> b;
      private final ThreadLocal<djb.e.a<T>> c = new ThreadLocal<>();

      private e(djb.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> djb.e<T> a(List<Pair<djb.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((djb.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<djb.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new djb.e.a<>((djb.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new djb.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> djb.e.b<T> a(int $$0, List<? extends djb.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (djb.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  djb.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new djb.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<djb.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<djb.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (djb.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new djb.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends djb.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<djb.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<djb.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            djb.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<djb.e.c<T>> b(List<? extends djb.e.b<T>> $$0) {
         List<djb.e.c<T>> $$1 = Lists.newArrayList();
         List<djb.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (djb.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new djb.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new djb.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(djb.b[] $$0) {
         long $$1 = 0L;

         for (djb.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<djb.b> c(List<? extends djb.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<djb.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (djb.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(djb.h $$0, djb.a<T> $$1) {
         long[] $$2 = $$0.a();
         djb.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends djb.e.b<T> {
         final T b;

         a(djb.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected djb.e.a<T> a(long[] $$0, @Nullable djb.e.a<T> $$1, djb.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final djb.b[] a;

         protected b(List<djb.b> $$0) {
            this.a = $$0.toArray(new djb.b[0]);
         }

         protected abstract djb.e.a<T> a(long[] var1, @Nullable djb.e.a<T> var2, djb.a<T> var3);

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

      static final class c<T> extends djb.e.b<T> {
         final djb.e.b<T>[] b;

         protected c(List<? extends djb.e.b<T>> $$0) {
            this(djb.e.c($$0), $$0);
         }

         protected c(List<djb.b> $$0, List<? extends djb.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new djb.e.b[0]);
         }

         @Override
         protected djb.e.a<T> a(long[] $$0, @Nullable djb.e.a<T> $$1, djb.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            djb.e.a<T> $$4 = $$1;

            for (djb.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  djb.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(eee a, eee b, eee c, eee d, eee e, eee f, List<djb.d> g) {
      public djb.h a(int $$0, int $$1, int $$2) {
         int $$3 = kd.c($$0);
         int $$4 = kd.c($$1);
         int $$5 = kd.c($$2);
         eee.e $$6 = new eee.e($$3, $$4, $$5);
         return djb.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public jj a() {
         return this.g.isEmpty() ? jj.c : djb.a(this.g, this);
      }

      public eee b() {
         return this.a;
      }

      public eee c() {
         return this.b;
      }

      public eee d() {
         return this.c;
      }

      public eee e() {
         return this.d;
      }

      public eee f() {
         return this.e;
      }

      public eee g() {
         return this.f;
      }

      public List<djb.d> h() {
         return this.g;
      }
   }

   static class g {
      private static final long a = 2048L;
      djb.g.a b;

      g(List<djb.d> $$0, djb.f $$1) {
         this.b = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<djb.d> $$0, djb.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         jj $$6 = this.b.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            djb.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static djb.g.a a(List<djb.d> $$0, djb.f $$1, int $$2, int $$3) {
         djb.h $$4 = $$1.a(kd.a($$2), 0, kd.a($$3));
         djb.h $$5 = new djb.h($$4.b(), $$4.c(), $$4.d(), $$4.e(), 0L, $$4.g());
         long $$6 = Long.MAX_VALUE;

         for (djb.d $$7 : $$0) {
            $$6 = Math.min($$6, $$7.a($$5));
         }

         long $$8 = azk.b((long)$$2) + azk.b((long)$$3);
         long $$9 = $$6 * azk.b(2048L) + $$8;
         return new djb.g.a(new jj($$2, 0, $$3), $$9);
      }

      static record a(jj a, long b) {
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
