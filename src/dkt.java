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

public class dkt {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dkt.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dkt.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dkt.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dkt.d(dkt.b.a($$0), dkt.b.a($$1), dkt.b.a($$2), dkt.b.a($$3), dkt.b.a($$4), dkt.b.a($$5), a($$6));
   }

   public static dkt.d a(dkt.b $$0, dkt.b $$1, dkt.b $$2, dkt.b $$3, dkt.b $$4, dkt.b $$5, float $$6) {
      return new dkt.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dkt.f a() {
      egg $$0 = egh.a();
      return new dkt.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static iv a(List<dkt.d> $$0, dkt.f $$1) {
      return (new dkt.g($$0, $$1)).b.a();
   }

   interface a<T> {
      long distance(dkt.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dkt.b> a = ayu.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dkt.b(dkt.a($$0), dkt.a($$1))),
         $$0 -> dkt.a($$0.a()),
         $$0 -> dkt.a($$0.b())
      );

      public static dkt.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dkt.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dkt.b(dkt.a($$0), dkt.a($$1));
         }
      }

      public static dkt.b a(dkt.b $$0, dkt.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dkt.b($$0.a(), $$1.b());
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

      public long a(dkt.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dkt.b b(@Nullable dkt.b $$0) {
         return $$0 == null ? this : new dkt.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dkt.d, T>> a;
      private final dkt.e<T> b;

      public static <T> Codec<dkt.c<T>> a(MapCodec<T> $$0) {
         return ayu.b(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dkt.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dkt.c::new, dkt.c::a);
      }

      public c(List<Pair<dkt.d, T>> $$0) {
         this.a = $$0;
         this.b = dkt.e.a($$0);
      }

      public List<Pair<dkt.d, T>> a() {
         return this.a;
      }

      public T a(dkt.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dkt.h $$0) {
         Iterator<Pair<dkt.d, T>> $$1 = this.a().iterator();
         Pair<dkt.d, T> $$2 = $$1.next();
         long $$3 = ((dkt.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dkt.d, T> $$5 = $$1.next();
            long $$6 = ((dkt.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dkt.h $$0) {
         return this.a($$0, dkt.e.b::a);
      }

      protected T a(dkt.h $$0, dkt.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dkt.b b, dkt.b c, dkt.b d, dkt.b e, dkt.b f, dkt.b g, long h) {
      public static final Codec<dkt.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dkt.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dkt.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dkt.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dkt.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dkt.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dkt.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dkt::a, dkt::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dkt.d::new)
      );

      long a(dkt.h $$0) {
         return azm.b(this.b.a($$0.a))
            + azm.b(this.c.a($$0.b))
            + azm.b(this.d.a($$0.c))
            + azm.b(this.e.a($$0.d))
            + azm.b(this.f.a($$0.e))
            + azm.b(this.g.a($$0.f))
            + azm.b(this.h);
      }

      protected List<dkt.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dkt.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dkt.e.b<T> b;
      private final ThreadLocal<dkt.e.a<T>> c = new ThreadLocal<>();

      private e(dkt.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dkt.e<T> a(List<Pair<dkt.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dkt.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dkt.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dkt.e.a<>((dkt.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dkt.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dkt.e.b<T> a(int $$0, List<? extends dkt.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dkt.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dkt.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dkt.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dkt.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dkt.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dkt.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dkt.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dkt.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dkt.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dkt.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dkt.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dkt.e.c<T>> b(List<? extends dkt.e.b<T>> $$0) {
         List<dkt.e.c<T>> $$1 = Lists.newArrayList();
         List<dkt.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dkt.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dkt.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dkt.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dkt.b[] $$0) {
         long $$1 = 0L;

         for (dkt.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dkt.b> c(List<? extends dkt.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dkt.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dkt.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dkt.h $$0, dkt.a<T> $$1) {
         long[] $$2 = $$0.a();
         dkt.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dkt.e.b<T> {
         final T b;

         a(dkt.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dkt.e.a<T> a(long[] $$0, @Nullable dkt.e.a<T> $$1, dkt.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dkt.b[] a;

         protected b(List<dkt.b> $$0) {
            this.a = $$0.toArray(new dkt.b[0]);
         }

         protected abstract dkt.e.a<T> a(long[] var1, @Nullable dkt.e.a<T> var2, dkt.a<T> var3);

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

      static final class c<T> extends dkt.e.b<T> {
         final dkt.e.b<T>[] b;

         protected c(List<? extends dkt.e.b<T>> $$0) {
            this(dkt.e.c($$0), $$0);
         }

         protected c(List<dkt.b> $$0, List<? extends dkt.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dkt.e.b[0]);
         }

         @Override
         protected dkt.e.a<T> a(long[] $$0, @Nullable dkt.e.a<T> $$1, dkt.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dkt.e.a<T> $$4 = $$1;

            for (dkt.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dkt.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(egg a, egg b, egg c, egg d, egg e, egg f, List<dkt.d> g) {
      public dkt.h a(int $$0, int $$1, int $$2) {
         int $$3 = jq.c($$0);
         int $$4 = jq.c($$1);
         int $$5 = jq.c($$2);
         egg.e $$6 = new egg.e($$3, $$4, $$5);
         return dkt.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public iv a() {
         return this.g.isEmpty() ? iv.c : dkt.a(this.g, this);
      }

      public egg b() {
         return this.a;
      }

      public egg c() {
         return this.b;
      }

      public egg d() {
         return this.c;
      }

      public egg e() {
         return this.d;
      }

      public egg f() {
         return this.e;
      }

      public egg g() {
         return this.f;
      }

      public List<dkt.d> h() {
         return this.g;
      }
   }

   static class g {
      private static final long a = 2048L;
      dkt.g.a b;

      g(List<dkt.d> $$0, dkt.f $$1) {
         this.b = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dkt.d> $$0, dkt.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         iv $$6 = this.b.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dkt.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static dkt.g.a a(List<dkt.d> $$0, dkt.f $$1, int $$2, int $$3) {
         dkt.h $$4 = $$1.a(jq.a($$2), 0, jq.a($$3));
         dkt.h $$5 = new dkt.h($$4.b(), $$4.c(), $$4.d(), $$4.e(), 0L, $$4.g());
         long $$6 = Long.MAX_VALUE;

         for (dkt.d $$7 : $$0) {
            $$6 = Math.min($$6, $$7.a($$5));
         }

         long $$8 = azm.b((long)$$2) + azm.b((long)$$3);
         long $$9 = $$6 * azm.b(2048L) + $$8;
         return new dkt.g.a(new iv($$2, 0, $$3), $$9);
      }

      static record a(iv a, long b) {
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
