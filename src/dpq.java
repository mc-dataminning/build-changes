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

public class dpq<T> implements dpp<T>, dpr<T> {
   private static final int a = 0;
   private final dpp<T> b = ($$0x, $$1x) -> 0;
   private final iq<T> c;
   private volatile dpq.c<T> d;
   private final dpq.d e;
   private final axt f = new axt("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<dpq<T>> a(iq<T> $$0, Codec<T> $$1, dpq.d $$2, T $$3) {
      dpr.b<T, dpq<T>> $$4 = dpq::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<dpr<T>> b(iq<T> $$0, Codec<T> $$1, dpq.d $$2, T $$3) {
      dpr.b<T, dpr<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends dpr<T>> Codec<C> a(iq<T> $$0, Codec<T> $$1, dpq.d $$2, T $$3, dpr.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(awe.a($$3)).listOf().fieldOf("palette").forGetter(dpr.a::a), Codec.LONG_STREAM.optionalFieldOf("data").forGetter(dpr.a::b)
                  )
                  .apply($$2x, dpr.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public dpq(iq<T> $$0, dpq.d $$1, dpq.a<T> $$2, avl $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new dpq.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private dpq(iq<T> $$0, dpq.d $$1, dpq.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   public dpq(iq<T> $$0, T $$1, dpq.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private dpq.c<T> a(@Nullable dpq.c<T> $$0, int $$1) {
      dpq.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.c()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      dpq.c<T> $$2 = this.d;
      dpq.c<T> $$3 = this.a($$2, $$0);
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
      dpq.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dpo<T> $$1 = this.d.e();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(uu $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         dpq.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(uu $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<dpq<T>> a(iq<T> $$0, dpq.d $$1, dpr.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      dpq.a<T> $$6 = $$1.a($$0, $$5);
      avl $$7;
      if ($$5 == 0) {
         $$7 = new aya($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == dpq.d.f) {
               dpo<T> $$10 = new dpg<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               axk $$11 = new axk($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new axk($$6.b(), $$4, $$12);
            } else {
               $$7 = new axk($$6.b(), $$4, $$9);
            }
         } catch (axk.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new dpq<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public dpr.a<T> a(iq<T> $$0, dpq.d $$1) {
      this.a();

      dpr.a var12;
      try {
         dpg<T> $$2 = new dpg<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            axk $$6 = new axk($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new dpr.a<>($$2.d(), $$7);
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

   public dpq<T> d() {
      return new dpq<>(this.c, this.e, this.d.b());
   }

   @Override
   public dpq<T> e() {
      return new dpq<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(dpq.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dpo.a a, int b) {
      public dpq.c<T> a(iq<T> $$0, dpp<T> $$1, int $$2) {
         avl $$3 = (avl)(this.b == 0 ? new aya($$2) : new axk(this.b, $$2));
         dpo<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new dpq.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(dpq.a<T> a, avl b, dpo<T> c) {

      public void a(dpo<T> $$0, avl $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + vl.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(uu $$0) {
         $$0.k(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public dpq.c<T> b() {
         return new dpq.c<>(this.a, this.b.d(), this.c.c());
      }

      public dpq.a<T> c() {
         return this.a;
      }

      public avl d() {
         return this.b;
      }

      public dpo<T> e() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dpo.a a = dpt::a;
      public static final dpo.a b = dpm::a;
      public static final dpo.a c = dpg::a;
      static final dpo.a f = dpf::a;
      public static final dpq.d d = new dpq.d(4) {
         @Override
         public <A> dpq.a<A> a(iq<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dpq.a(a, $$1);
               case 1, 2, 3, 4 -> new dpq.a(b, 4);
               case 5, 6, 7, 8 -> new dpq.a(c, $$1);
               default -> new dpq.a(dpq.d.f, aww.e($$0.b()));
            };
         }
      };
      public static final dpq.d e = new dpq.d(2) {
         @Override
         public <A> dpq.a<A> a(iq<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dpq.a(a, $$1);
               case 1, 2, 3 -> new dpq.a(b, $$1);
               default -> new dpq.a(dpq.d.f, aww.e($$0.b()));
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

      public abstract <A> dpq.a<A> a(iq<A> var1, int var2);

      <A> int b(iq<A> $$0, int $$1) {
         int $$2 = aww.e($$1);
         dpq.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
