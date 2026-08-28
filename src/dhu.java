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

public class dhu {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dhu.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dhu.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dhu.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dhu.d(dhu.b.a($$0), dhu.b.a($$1), dhu.b.a($$2), dhu.b.a($$3), dhu.b.a($$4), dhu.b.a($$5), a($$6));
   }

   public static dhu.d a(dhu.b $$0, dhu.b $$1, dhu.b $$2, dhu.b $$3, dhu.b $$4, dhu.b $$5, float $$6) {
      return new dhu.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dhu.f a() {
      ecm $$0 = ecn.a();
      return new dhu.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static ji a(List<dhu.d> $$0, dhu.f $$1) {
      return (new dhu.g($$0, $$1)).b.a();
   }

   interface a<T> {
      long distance(dhu.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dhu.b> a = ayi.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dhu.b(dhu.a($$0), dhu.a($$1))),
         $$0 -> dhu.a($$0.a()),
         $$0 -> dhu.a($$0.b())
      );

      public static dhu.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dhu.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dhu.b(dhu.a($$0), dhu.a($$1));
         }
      }

      public static dhu.b a(dhu.b $$0, dhu.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dhu.b($$0.a(), $$1.b());
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

      public long a(dhu.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dhu.b b(@Nullable dhu.b $$0) {
         return $$0 == null ? this : new dhu.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dhu.d, T>> a;
      private final dhu.e<T> b;

      public static <T> Codec<dhu.c<T>> a(MapCodec<T> $$0) {
         return ayi.b(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dhu.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dhu.c::new, dhu.c::a);
      }

      public c(List<Pair<dhu.d, T>> $$0) {
         this.a = $$0;
         this.b = dhu.e.a($$0);
      }

      public List<Pair<dhu.d, T>> a() {
         return this.a;
      }

      public T a(dhu.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dhu.h $$0) {
         Iterator<Pair<dhu.d, T>> $$1 = this.a().iterator();
         Pair<dhu.d, T> $$2 = $$1.next();
         long $$3 = ((dhu.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dhu.d, T> $$5 = $$1.next();
            long $$6 = ((dhu.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dhu.h $$0) {
         return this.a($$0, dhu.e.b::a);
      }

      protected T a(dhu.h $$0, dhu.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dhu.b b, dhu.b c, dhu.b d, dhu.b e, dhu.b f, dhu.b g, long h) {
      public static final Codec<dhu.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dhu.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dhu.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dhu.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dhu.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dhu.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dhu.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dhu::a, dhu::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dhu.d::new)
      );

      long a(dhu.h $$0) {
         return ayz.b(this.b.a($$0.a))
            + ayz.b(this.c.a($$0.b))
            + ayz.b(this.d.a($$0.c))
            + ayz.b(this.e.a($$0.d))
            + ayz.b(this.f.a($$0.e))
            + ayz.b(this.g.a($$0.f))
            + ayz.b(this.h);
      }

      protected List<dhu.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dhu.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dhu.e.b<T> b;
      private final ThreadLocal<dhu.e.a<T>> c = new ThreadLocal<>();

      private e(dhu.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dhu.e<T> a(List<Pair<dhu.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dhu.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dhu.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dhu.e.a<>((dhu.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dhu.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dhu.e.b<T> a(int $$0, List<? extends dhu.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dhu.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dhu.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dhu.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dhu.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dhu.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dhu.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dhu.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dhu.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dhu.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dhu.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dhu.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dhu.e.c<T>> b(List<? extends dhu.e.b<T>> $$0) {
         List<dhu.e.c<T>> $$1 = Lists.newArrayList();
         List<dhu.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dhu.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dhu.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dhu.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dhu.b[] $$0) {
         long $$1 = 0L;

         for (dhu.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dhu.b> c(List<? extends dhu.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dhu.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dhu.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dhu.h $$0, dhu.a<T> $$1) {
         long[] $$2 = $$0.a();
         dhu.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dhu.e.b<T> {
         final T b;

         a(dhu.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dhu.e.a<T> a(long[] $$0, @Nullable dhu.e.a<T> $$1, dhu.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dhu.b[] a;

         protected b(List<dhu.b> $$0) {
            this.a = $$0.toArray(new dhu.b[0]);
         }

         protected abstract dhu.e.a<T> a(long[] var1, @Nullable dhu.e.a<T> var2, dhu.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += ayz.b(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends dhu.e.b<T> {
         final dhu.e.b<T>[] b;

         protected c(List<? extends dhu.e.b<T>> $$0) {
            this(dhu.e.c($$0), $$0);
         }

         protected c(List<dhu.b> $$0, List<? extends dhu.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dhu.e.b[0]);
         }

         @Override
         protected dhu.e.a<T> a(long[] $$0, @Nullable dhu.e.a<T> $$1, dhu.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dhu.e.a<T> $$4 = $$1;

            for (dhu.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dhu.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(ecm a, ecm b, ecm c, ecm d, ecm e, ecm f, List<dhu.d> g) {
      public dhu.h a(int $$0, int $$1, int $$2) {
         int $$3 = kc.c($$0);
         int $$4 = kc.c($$1);
         int $$5 = kc.c($$2);
         ecm.e $$6 = new ecm.e($$3, $$4, $$5);
         return dhu.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public ji a() {
         return this.g.isEmpty() ? ji.c : dhu.a(this.g, this);
      }

      public ecm b() {
         return this.a;
      }

      public ecm c() {
         return this.b;
      }

      public ecm d() {
         return this.c;
      }

      public ecm e() {
         return this.d;
      }

      public ecm f() {
         return this.e;
      }

      public ecm g() {
         return this.f;
      }

      public List<dhu.d> h() {
         return this.g;
      }
   }

   static class g {
      private static final long a = 2048L;
      dhu.g.a b;

      g(List<dhu.d> $$0, dhu.f $$1) {
         this.b = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dhu.d> $$0, dhu.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         ji $$6 = this.b.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dhu.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static dhu.g.a a(List<dhu.d> $$0, dhu.f $$1, int $$2, int $$3) {
         dhu.h $$4 = $$1.a(kc.a($$2), 0, kc.a($$3));
         dhu.h $$5 = new dhu.h($$4.b(), $$4.c(), $$4.d(), $$4.e(), 0L, $$4.g());
         long $$6 = Long.MAX_VALUE;

         for (dhu.d $$7 : $$0) {
            $$6 = Math.min($$6, $$7.a($$5));
         }

         long $$8 = ayz.b((long)$$2) + ayz.b((long)$$3);
         long $$9 = $$6 * ayz.b(2048L) + $$8;
         return new dhu.g.a(new ji($$2, 0, $$3), $$9);
      }

      static record a(ji a, long b) {
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
