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

public class dkh {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dkh.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dkh.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dkh.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dkh.d(dkh.b.a($$0), dkh.b.a($$1), dkh.b.a($$2), dkh.b.a($$3), dkh.b.a($$4), dkh.b.a($$5), a($$6));
   }

   public static dkh.d a(dkh.b $$0, dkh.b $$1, dkh.b $$2, dkh.b $$3, dkh.b $$4, dkh.b $$5, float $$6) {
      return new dkh.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dkh.f a() {
      efr $$0 = efs.a();
      return new dkh.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static iu a(List<dkh.d> $$0, dkh.f $$1) {
      return (new dkh.g($$0, $$1)).b.a();
   }

   interface a<T> {
      long distance(dkh.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dkh.b> a = ayu.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dkh.b(dkh.a($$0), dkh.a($$1))),
         $$0 -> dkh.a($$0.a()),
         $$0 -> dkh.a($$0.b())
      );

      public static dkh.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dkh.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dkh.b(dkh.a($$0), dkh.a($$1));
         }
      }

      public static dkh.b a(dkh.b $$0, dkh.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dkh.b($$0.a(), $$1.b());
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

      public long a(dkh.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dkh.b b(@Nullable dkh.b $$0) {
         return $$0 == null ? this : new dkh.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dkh.d, T>> a;
      private final dkh.e<T> b;

      public static <T> Codec<dkh.c<T>> a(MapCodec<T> $$0) {
         return ayu.b(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dkh.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dkh.c::new, dkh.c::a);
      }

      public c(List<Pair<dkh.d, T>> $$0) {
         this.a = $$0;
         this.b = dkh.e.a($$0);
      }

      public List<Pair<dkh.d, T>> a() {
         return this.a;
      }

      public T a(dkh.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dkh.h $$0) {
         Iterator<Pair<dkh.d, T>> $$1 = this.a().iterator();
         Pair<dkh.d, T> $$2 = $$1.next();
         long $$3 = ((dkh.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dkh.d, T> $$5 = $$1.next();
            long $$6 = ((dkh.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dkh.h $$0) {
         return this.a($$0, dkh.e.b::a);
      }

      protected T a(dkh.h $$0, dkh.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dkh.b b, dkh.b c, dkh.b d, dkh.b e, dkh.b f, dkh.b g, long h) {
      public static final Codec<dkh.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dkh.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dkh.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dkh.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dkh.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dkh.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dkh.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dkh::a, dkh::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dkh.d::new)
      );

      long a(dkh.h $$0) {
         return azm.b(this.b.a($$0.a))
            + azm.b(this.c.a($$0.b))
            + azm.b(this.d.a($$0.c))
            + azm.b(this.e.a($$0.d))
            + azm.b(this.f.a($$0.e))
            + azm.b(this.g.a($$0.f))
            + azm.b(this.h);
      }

      protected List<dkh.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dkh.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dkh.e.b<T> b;
      private final ThreadLocal<dkh.e.a<T>> c = new ThreadLocal<>();

      private e(dkh.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dkh.e<T> a(List<Pair<dkh.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dkh.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dkh.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dkh.e.a<>((dkh.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dkh.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dkh.e.b<T> a(int $$0, List<? extends dkh.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dkh.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dkh.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dkh.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dkh.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dkh.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dkh.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dkh.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dkh.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dkh.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dkh.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dkh.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dkh.e.c<T>> b(List<? extends dkh.e.b<T>> $$0) {
         List<dkh.e.c<T>> $$1 = Lists.newArrayList();
         List<dkh.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dkh.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dkh.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dkh.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dkh.b[] $$0) {
         long $$1 = 0L;

         for (dkh.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dkh.b> c(List<? extends dkh.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dkh.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dkh.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dkh.h $$0, dkh.a<T> $$1) {
         long[] $$2 = $$0.a();
         dkh.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dkh.e.b<T> {
         final T b;

         a(dkh.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dkh.e.a<T> a(long[] $$0, @Nullable dkh.e.a<T> $$1, dkh.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dkh.b[] a;

         protected b(List<dkh.b> $$0) {
            this.a = $$0.toArray(new dkh.b[0]);
         }

         protected abstract dkh.e.a<T> a(long[] var1, @Nullable dkh.e.a<T> var2, dkh.a<T> var3);

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

      static final class c<T> extends dkh.e.b<T> {
         final dkh.e.b<T>[] b;

         protected c(List<? extends dkh.e.b<T>> $$0) {
            this(dkh.e.c($$0), $$0);
         }

         protected c(List<dkh.b> $$0, List<? extends dkh.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dkh.e.b[0]);
         }

         @Override
         protected dkh.e.a<T> a(long[] $$0, @Nullable dkh.e.a<T> $$1, dkh.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dkh.e.a<T> $$4 = $$1;

            for (dkh.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dkh.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(efr a, efr b, efr c, efr d, efr e, efr f, List<dkh.d> g) {
      public dkh.h a(int $$0, int $$1, int $$2) {
         int $$3 = jp.c($$0);
         int $$4 = jp.c($$1);
         int $$5 = jp.c($$2);
         efr.e $$6 = new efr.e($$3, $$4, $$5);
         return dkh.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public iu a() {
         return this.g.isEmpty() ? iu.c : dkh.a(this.g, this);
      }

      public efr b() {
         return this.a;
      }

      public efr c() {
         return this.b;
      }

      public efr d() {
         return this.c;
      }

      public efr e() {
         return this.d;
      }

      public efr f() {
         return this.e;
      }

      public efr g() {
         return this.f;
      }

      public List<dkh.d> h() {
         return this.g;
      }
   }

   static class g {
      private static final long a = 2048L;
      dkh.g.a b;

      g(List<dkh.d> $$0, dkh.f $$1) {
         this.b = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dkh.d> $$0, dkh.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         iu $$6 = this.b.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dkh.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static dkh.g.a a(List<dkh.d> $$0, dkh.f $$1, int $$2, int $$3) {
         dkh.h $$4 = $$1.a(jp.a($$2), 0, jp.a($$3));
         dkh.h $$5 = new dkh.h($$4.b(), $$4.c(), $$4.d(), $$4.e(), 0L, $$4.g());
         long $$6 = Long.MAX_VALUE;

         for (dkh.d $$7 : $$0) {
            $$6 = Math.min($$6, $$7.a($$5));
         }

         long $$8 = azm.b((long)$$2) + azm.b((long)$$3);
         long $$9 = $$6 * azm.b(2048L) + $$8;
         return new dkh.g.a(new iu($$2, 0, $$3), $$9);
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
