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

public class dlv {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dlv.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dlv.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dlv.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dlv.d(dlv.b.a($$0), dlv.b.a($$1), dlv.b.a($$2), dlv.b.a($$3), dlv.b.a($$4), dlv.b.a($$5), a($$6));
   }

   public static dlv.d a(dlv.b $$0, dlv.b $$1, dlv.b $$2, dlv.b $$3, dlv.b $$4, dlv.b $$5, float $$6) {
      return new dlv.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dlv.f a() {
      ehi $$0 = ehj.a();
      return new dlv.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static iw a(List<dlv.d> $$0, dlv.f $$1) {
      return (new dlv.g($$0, $$1)).b.a();
   }

   interface a<T> {
      long distance(dlv.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dlv.b> a = azg.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dlv.b(dlv.a($$0), dlv.a($$1))),
         $$0 -> dlv.a($$0.a()),
         $$0 -> dlv.a($$0.b())
      );

      public static dlv.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dlv.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dlv.b(dlv.a($$0), dlv.a($$1));
         }
      }

      public static dlv.b a(dlv.b $$0, dlv.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dlv.b($$0.a(), $$1.b());
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

      public long a(dlv.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dlv.b b(@Nullable dlv.b $$0) {
         return $$0 == null ? this : new dlv.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dlv.d, T>> a;
      private final dlv.e<T> b;

      public static <T> Codec<dlv.c<T>> a(MapCodec<T> $$0) {
         return azg.b(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dlv.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dlv.c::new, dlv.c::a);
      }

      public c(List<Pair<dlv.d, T>> $$0) {
         this.a = $$0;
         this.b = dlv.e.a($$0);
      }

      public List<Pair<dlv.d, T>> a() {
         return this.a;
      }

      public T a(dlv.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dlv.h $$0) {
         Iterator<Pair<dlv.d, T>> $$1 = this.a().iterator();
         Pair<dlv.d, T> $$2 = $$1.next();
         long $$3 = ((dlv.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dlv.d, T> $$5 = $$1.next();
            long $$6 = ((dlv.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dlv.h $$0) {
         return this.a($$0, dlv.e.b::a);
      }

      protected T a(dlv.h $$0, dlv.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dlv.b b, dlv.b c, dlv.b d, dlv.b e, dlv.b f, dlv.b g, long h) {
      public static final Codec<dlv.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dlv.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dlv.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dlv.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dlv.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dlv.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dlv.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dlv::a, dlv::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dlv.d::new)
      );

      long a(dlv.h $$0) {
         return azz.b(this.b.a($$0.a))
            + azz.b(this.c.a($$0.b))
            + azz.b(this.d.a($$0.c))
            + azz.b(this.e.a($$0.d))
            + azz.b(this.f.a($$0.e))
            + azz.b(this.g.a($$0.f))
            + azz.b(this.h);
      }

      protected List<dlv.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dlv.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dlv.e.b<T> b;
      private final ThreadLocal<dlv.e.a<T>> c = new ThreadLocal<>();

      private e(dlv.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dlv.e<T> a(List<Pair<dlv.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dlv.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dlv.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dlv.e.a<>((dlv.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dlv.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dlv.e.b<T> a(int $$0, List<? extends dlv.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dlv.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dlv.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dlv.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dlv.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dlv.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dlv.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dlv.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dlv.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dlv.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dlv.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dlv.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dlv.e.c<T>> b(List<? extends dlv.e.b<T>> $$0) {
         List<dlv.e.c<T>> $$1 = Lists.newArrayList();
         List<dlv.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dlv.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dlv.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dlv.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dlv.b[] $$0) {
         long $$1 = 0L;

         for (dlv.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dlv.b> c(List<? extends dlv.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dlv.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dlv.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dlv.h $$0, dlv.a<T> $$1) {
         long[] $$2 = $$0.a();
         dlv.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dlv.e.b<T> {
         final T b;

         a(dlv.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dlv.e.a<T> a(long[] $$0, @Nullable dlv.e.a<T> $$1, dlv.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dlv.b[] a;

         protected b(List<dlv.b> $$0) {
            this.a = $$0.toArray(new dlv.b[0]);
         }

         protected abstract dlv.e.a<T> a(long[] var1, @Nullable dlv.e.a<T> var2, dlv.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += azz.b(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends dlv.e.b<T> {
         final dlv.e.b<T>[] b;

         protected c(List<? extends dlv.e.b<T>> $$0) {
            this(dlv.e.c($$0), $$0);
         }

         protected c(List<dlv.b> $$0, List<? extends dlv.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dlv.e.b[0]);
         }

         @Override
         protected dlv.e.a<T> a(long[] $$0, @Nullable dlv.e.a<T> $$1, dlv.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dlv.e.a<T> $$4 = $$1;

            for (dlv.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dlv.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(ehi a, ehi b, ehi c, ehi d, ehi e, ehi f, List<dlv.d> g) {
      public dlv.h a(int $$0, int $$1, int $$2) {
         int $$3 = jr.c($$0);
         int $$4 = jr.c($$1);
         int $$5 = jr.c($$2);
         ehi.e $$6 = new ehi.e($$3, $$4, $$5);
         return dlv.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public iw a() {
         return this.g.isEmpty() ? iw.c : dlv.a(this.g, this);
      }

      public ehi b() {
         return this.a;
      }

      public ehi c() {
         return this.b;
      }

      public ehi d() {
         return this.c;
      }

      public ehi e() {
         return this.d;
      }

      public ehi f() {
         return this.e;
      }

      public ehi g() {
         return this.f;
      }

      public List<dlv.d> h() {
         return this.g;
      }
   }

   static class g {
      private static final long a = 2048L;
      dlv.g.a b;

      g(List<dlv.d> $$0, dlv.f $$1) {
         this.b = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dlv.d> $$0, dlv.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         iw $$6 = this.b.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dlv.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static dlv.g.a a(List<dlv.d> $$0, dlv.f $$1, int $$2, int $$3) {
         dlv.h $$4 = $$1.a(jr.a($$2), 0, jr.a($$3));
         dlv.h $$5 = new dlv.h($$4.b(), $$4.c(), $$4.d(), $$4.e(), 0L, $$4.g());
         long $$6 = Long.MAX_VALUE;

         for (dlv.d $$7 : $$0) {
            $$6 = Math.min($$6, $$7.a($$5));
         }

         long $$8 = azz.b((long)$$2) + azz.b((long)$$3);
         long $$9 = $$6 * azz.b(2048L) + $$8;
         return new dlv.g.a(new iw($$2, 0, $$3), $$9);
      }

      static record a(iw a, long b) {
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
