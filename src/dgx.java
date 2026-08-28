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

public class dgx {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dgx.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dgx.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dgx.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dgx.d(dgx.b.a($$0), dgx.b.a($$1), dgx.b.a($$2), dgx.b.a($$3), dgx.b.a($$4), dgx.b.a($$5), a($$6));
   }

   public static dgx.d a(dgx.b $$0, dgx.b $$1, dgx.b $$2, dgx.b $$3, dgx.b $$4, dgx.b $$5, float $$6) {
      return new dgx.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dgx.f a() {
      ebj $$0 = ebk.a();
      return new dgx.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static jh a(List<dgx.d> $$0, dgx.f $$1) {
      return (new dgx.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(dgx.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<dgx.b> a = ayv.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new dgx.b(dgx.a($$0), dgx.a($$1))),
         $$0 -> dgx.a($$0.a()),
         $$0 -> dgx.a($$0.b())
      );

      public static dgx.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dgx.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dgx.b(dgx.a($$0), dgx.a($$1));
         }
      }

      public static dgx.b a(dgx.b $$0, dgx.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dgx.b($$0.a(), $$1.b());
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

      public long a(dgx.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dgx.b b(@Nullable dgx.b $$0) {
         return $$0 == null ? this : new dgx.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dgx.d, T>> a;
      private final dgx.e<T> b;

      public static <T> Codec<dgx.c<T>> a(MapCodec<T> $$0) {
         return ayv.a(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dgx.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dgx.c::new, dgx.c::a);
      }

      public c(List<Pair<dgx.d, T>> $$0) {
         this.a = $$0;
         this.b = dgx.e.a($$0);
      }

      public List<Pair<dgx.d, T>> a() {
         return this.a;
      }

      public T a(dgx.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dgx.h $$0) {
         Iterator<Pair<dgx.d, T>> $$1 = this.a().iterator();
         Pair<dgx.d, T> $$2 = $$1.next();
         long $$3 = ((dgx.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dgx.d, T> $$5 = $$1.next();
            long $$6 = ((dgx.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dgx.h $$0) {
         return this.a($$0, dgx.e.b::a);
      }

      protected T a(dgx.h $$0, dgx.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(dgx.b b, dgx.b c, dgx.b d, dgx.b e, dgx.b f, dgx.b g, long h) {
      public static final Codec<dgx.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dgx.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  dgx.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  dgx.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  dgx.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  dgx.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  dgx.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dgx::a, dgx::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dgx.d::new)
      );

      long a(dgx.h $$0) {
         return azm.b(this.b.a($$0.a))
            + azm.b(this.c.a($$0.b))
            + azm.b(this.d.a($$0.c))
            + azm.b(this.e.a($$0.d))
            + azm.b(this.f.a($$0.e))
            + azm.b(this.g.a($$0.f))
            + azm.b(this.h);
      }

      protected List<dgx.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dgx.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dgx.e.b<T> b;
      private final ThreadLocal<dgx.e.a<T>> c = new ThreadLocal<>();

      private e(dgx.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dgx.e<T> a(List<Pair<dgx.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dgx.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dgx.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dgx.e.a<>((dgx.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dgx.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dgx.e.b<T> a(int $$0, List<? extends dgx.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dgx.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dgx.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dgx.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dgx.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dgx.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dgx.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dgx.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dgx.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dgx.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dgx.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dgx.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dgx.e.c<T>> b(List<? extends dgx.e.b<T>> $$0) {
         List<dgx.e.c<T>> $$1 = Lists.newArrayList();
         List<dgx.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));

         for (dgx.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dgx.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dgx.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dgx.b[] $$0) {
         long $$1 = 0L;

         for (dgx.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dgx.b> c(List<? extends dgx.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dgx.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dgx.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dgx.h $$0, dgx.a<T> $$1) {
         long[] $$2 = $$0.a();
         dgx.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dgx.e.b<T> {
         final T b;

         a(dgx.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dgx.e.a<T> a(long[] $$0, @Nullable dgx.e.a<T> $$1, dgx.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dgx.b[] a;

         protected b(List<dgx.b> $$0) {
            this.a = $$0.toArray(new dgx.b[0]);
         }

         protected abstract dgx.e.a<T> a(long[] var1, @Nullable dgx.e.a<T> var2, dgx.a<T> var3);

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

      static final class c<T> extends dgx.e.b<T> {
         final dgx.e.b<T>[] b;

         protected c(List<? extends dgx.e.b<T>> $$0) {
            this(dgx.e.c($$0), $$0);
         }

         protected c(List<dgx.b> $$0, List<? extends dgx.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dgx.e.b[0]);
         }

         @Override
         protected dgx.e.a<T> a(long[] $$0, @Nullable dgx.e.a<T> $$1, dgx.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dgx.e.a<T> $$4 = $$1;

            for (dgx.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dgx.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
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

   public static record f(ebj a, ebj b, ebj c, ebj d, ebj e, ebj f, List<dgx.d> g) {
      public dgx.h a(int $$0, int $$1, int $$2) {
         int $$3 = kb.c($$0);
         int $$4 = kb.c($$1);
         int $$5 = kb.c($$2);
         ebj.e $$6 = new ebj.e($$3, $$4, $$5);
         return dgx.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public jh a() {
         return this.g.isEmpty() ? jh.c : dgx.a(this.g, this);
      }

      public ebj b() {
         return this.a;
      }

      public ebj c() {
         return this.b;
      }

      public ebj d() {
         return this.c;
      }

      public ebj e() {
         return this.d;
      }

      public ebj f() {
         return this.e;
      }

      public ebj g() {
         return this.f;
      }

      public List<dgx.d> h() {
         return this.g;
      }
   }

   static class g {
      dgx.g.a a;

      g(List<dgx.d> $$0, dgx.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dgx.d> $$0, dgx.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         jh $$6 = this.a.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            dgx.g.a $$9 = a($$0, $$1, $$7, $$8);
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

      private static dgx.g.a a(List<dgx.d> $$0, dgx.f $$1, int $$2, int $$3) {
         double $$4 = azm.k(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)azm.l(10000.0F) * Math.pow((double)(azm.b((long)$$2) + azm.b((long)$$3)) / $$4, 2.0));
         dgx.h $$7 = $$1.a(kb.a($$2), 0, kb.a($$3));
         dgx.h $$8 = new dgx.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for (dgx.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new dgx.g.a(new jh($$2, 0, $$3), $$6 + $$9);
      }

      static record a(jh a, long b) {
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
