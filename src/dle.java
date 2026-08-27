import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class dle<T> implements dld<T>, dlf<T> {
   private static final int a = 0;
   private final dld<T> b = ($$0x, $$1x) -> 0;
   private final ik<T> c;
   private volatile dle.c<T> d;
   private final dle.d e;
   private final auw f = new auw("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<dle<T>> a(ik<T> $$0, Codec<T> $$1, dle.d $$2, T $$3) {
      dlf.b<T, dle<T>> $$4 = dle::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<dlf<T>> b(ik<T> $$0, Codec<T> $$1, dle.d $$2, T $$3) {
      dlf.b<T, dlf<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends dlf<T>> Codec<C> a(ik<T> $$0, Codec<T> $$1, dle.d $$2, T $$3, dlf.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(atg.a($$3)).listOf().fieldOf("palette").forGetter(dlf.a::a), Codec.LONG_STREAM.optionalFieldOf("data").forGetter(dlf.a::b)
                  )
                  .apply($$2x, dlf.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public dle(ik<T> $$0, dle.d $$1, dle.a<T> $$2, aso $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new dle.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private dle(ik<T> $$0, dle.d $$1, dle.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   public dle(ik<T> $$0, T $$1, dle.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private dle.c<T> a(@Nullable dle.c<T> $$0, int $$1) {
      dle.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.c()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      dle.c<T> $$2 = this.d;
      dle.c<T> $$3 = this.a($$2, $$0);
      $$3.a($$2.c, $$2.b);
      this.d = $$3;
      return $$3.c.a($$1);
   }

   public T a(int $$0, int $$1, int $$2, T $$3) {
      this.a();

      Object var5;
      try {
         var5 = this.a(this.e.a($$0, $$1, $$2), $$3);
      } finally {
         this.b();
      }

      return (T)var5;
   }

   public T b(int $$0, int $$1, int $$2, T $$3) {
      return this.a(this.e.a($$0, $$1, $$2), $$3);
   }

   private T a(int $$0, T $$1) {
      int $$2 = this.d.c.a($$1);
      int $$3 = this.d.b.a($$0, $$2);
      return this.d.c.a($$3);
   }

   public void c(int $$0, int $$1, int $$2, T $$3) {
      this.a();

      try {
         this.b(this.e.a($$0, $$1, $$2), $$3);
      } finally {
         this.b();
      }
   }

   private void b(int $$0, T $$1) {
      int $$2 = this.d.c.a($$1);
      this.d.b.b($$0, $$2);
   }

   @Override
   public T a(int $$0, int $$1, int $$2) {
      return this.a(this.e.a($$0, $$1, $$2));
   }

   protected T a(int $$0) {
      dle.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dlc<T> $$1 = this.d.e();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(ue $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         dle.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(ue $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<dle<T>> a(ik<T> $$0, dle.d $$1, dlf.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      dle.a<T> $$6 = $$1.a($$0, $$5);
      aso $$7;
      if ($$5 == 0) {
         $$7 = new ave($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == dle.d.f) {
               dlc<T> $$10 = new dku<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               aun $$11 = new aun($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new aun($$6.b(), $$4, $$12);
            } else {
               $$7 = new aun($$6.b(), $$4, $$9);
            }
         } catch (aun.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new dle<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public dlf.a<T> a(ik<T> $$0, dle.d $$1) {
      this.a();

      dlf.a var12;
      try {
         dku<T> $$2 = new dku<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            aun $$6 = new aun($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new dlf.a<>($$2.d(), $$7);
      } finally {
         this.b();
      }

      return var12;
   }

   private static <T> void a(int[] $$0, IntUnaryOperator $$1) {
      int $$2 = -1;
      int $$3 = -1;

      for (int $$4 = 0; $$4 < $$0.length; $$4++) {
         int $$5 = $$0[$$4];
         if ($$5 != $$2) {
            $$2 = $$5;
            $$3 = $$1.applyAsInt($$5);
         }

         $$0[$$4] = $$3;
      }
   }

   @Override
   public int c() {
      return this.d.a();
   }

   @Override
   public boolean a(Predicate<T> $$0) {
      return this.d.c.a($$0);
   }

   public dle<T> d() {
      return new dle<>(this.c, this.e, this.d.b());
   }

   @Override
   public dle<T> e() {
      return new dle<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(dle.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dlc.a a, int b) {
      public dle.c<T> a(ik<T> $$0, dld<T> $$1, int $$2) {
         aso $$3 = (aso)(this.b == 0 ? new ave($$2) : new aun(this.b, $$2));
         dlc<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new dle.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(dle.a<T> a, aso b, dlc<T> c) {

      public void a(dlc<T> $$0, aso $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + us.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(ue $$0) {
         $$0.k(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public dle.c<T> b() {
         return new dle.c<>(this.a, this.b.d(), this.c.c());
      }

      public dle.a<T> c() {
         return this.a;
      }

      public aso d() {
         return this.b;
      }

      public dlc<T> e() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dlc.a a = dlh::a;
      public static final dlc.a b = dla::a;
      public static final dlc.a c = dku::a;
      static final dlc.a f = dkt::a;
      public static final dle.d d = new dle.d(4) {
         @Override
         public <A> dle.a<A> a(ik<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dle.a(a, $$1);
               case 1, 2, 3, 4 -> new dle.a(b, 4);
               case 5, 6, 7, 8 -> new dle.a(c, $$1);
               default -> new dle.a(dle.d.f, aty.e($$0.b()));
            };
         }
      };
      public static final dle.d e = new dle.d(2) {
         @Override
         public <A> dle.a<A> a(ik<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dle.a(a, $$1);
               case 1, 2, 3 -> new dle.a(b, $$1);
               default -> new dle.a(dle.d.f, aty.e($$0.b()));
            };
         }
      };
      private final int g;

      d(int $$0) {
         this.g = $$0;
      }

      public int a() {
         return 1 << this.g * 3;
      }

      public int a(int $$0, int $$1, int $$2) {
         return ($$1 << this.g | $$2) << this.g | $$0;
      }

      public abstract <A> dle.a<A> a(ik<A> var1, int var2);

      <A> int b(ik<A> $$0, int $$1) {
         int $$2 = aty.e($$1);
         dle.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
