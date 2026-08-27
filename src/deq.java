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

public class deq<T> implements dep<T>, der<T> {
   private static final int a = 0;
   private final dep<T> b = ($$0x, $$1x) -> 0;
   private final hj<T> c;
   private volatile deq.c<T> d;
   private final deq.d e;
   private final apu f = new apu("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<deq<T>> a(hj<T> $$0, Codec<T> $$1, deq.d $$2, T $$3) {
      der.b<T, deq<T>> $$4 = deq::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<der<T>> b(hj<T> $$0, Codec<T> $$1, deq.d $$2, T $$3) {
      der.b<T, der<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends der<T>> Codec<C> a(hj<T> $$0, Codec<T> $$1, deq.d $$2, T $$3, der.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(aoi.a($$3)).listOf().fieldOf("palette").forGetter(der.a::a), Codec.LONG_STREAM.optionalFieldOf("data").forGetter(der.a::b)
                  )
                  .apply($$2x, der.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public deq(hj<T> $$0, deq.d $$1, deq.a<T> $$2, ans $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new deq.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private deq(hj<T> $$0, deq.d $$1, deq.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   public deq(hj<T> $$0, T $$1, deq.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private deq.c<T> a(@Nullable deq.c<T> $$0, int $$1) {
      deq.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.c()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      deq.c<T> $$2 = this.d;
      deq.c<T> $$3 = this.a($$2, $$0);
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
      deq.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      deo<T> $$1 = this.d.e();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(sf $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         deq.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(sf $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<deq<T>> a(hj<T> $$0, deq.d $$1, der.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      deq.a<T> $$6 = $$1.a($$0, $$5);
      ans $$7;
      if ($$5 == 0) {
         $$7 = new aqb($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == deq.d.f) {
               deo<T> $$10 = new deg<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               apl $$11 = new apl($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new apl($$6.b(), $$4, $$12);
            } else {
               $$7 = new apl($$6.b(), $$4, $$9);
            }
         } catch (apl.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new deq<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public der.a<T> a(hj<T> $$0, deq.d $$1) {
      this.a();

      der.a var12;
      try {
         deg<T> $$2 = new deg<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            apl $$6 = new apl($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new der.a<>($$2.d(), $$7);
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

   public deq<T> d() {
      return new deq<>(this.c, this.e, this.d.b());
   }

   @Override
   public deq<T> e() {
      return new deq<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(deq.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(deo.a a, int b) {
      public deq.c<T> a(hj<T> $$0, dep<T> $$1, int $$2) {
         ans $$3 = (ans)(this.b == 0 ? new aqb($$2) : new apl(this.b, $$2));
         deo<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new deq.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(deq.a<T> a, ans b, deo<T> c) {

      public void a(deo<T> $$0, ans $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + sf.a(this.b.b()) + this.b.a().length * 8;
      }

      public void a(sf $$0) {
         $$0.writeByte(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public deq.c<T> b() {
         return new deq.c<>(this.a, this.b.d(), this.c.c());
      }

      public deq.a<T> c() {
         return this.a;
      }

      public ans d() {
         return this.b;
      }

      public deo<T> e() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final deo.a a = det::a;
      public static final deo.a b = dem::a;
      public static final deo.a c = deg::a;
      static final deo.a f = def::a;
      public static final deq.d d = new deq.d(4) {
         @Override
         public <A> deq.a<A> a(hj<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new deq.a(a, $$1);
               case 1, 2, 3, 4 -> new deq.a(b, 4);
               case 5, 6, 7, 8 -> new deq.a(c, $$1);
               default -> new deq.a(deq.d.f, apa.e($$0.b()));
            };
         }
      };
      public static final deq.d e = new deq.d(2) {
         @Override
         public <A> deq.a<A> a(hj<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new deq.a(a, $$1);
               case 1, 2, 3 -> new deq.a(b, $$1);
               default -> new deq.a(deq.d.f, apa.e($$0.b()));
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

      public abstract <A> deq.a<A> a(hj<A> var1, int var2);

      <A> int b(hj<A> $$0, int $$1) {
         int $$2 = apa.e($$1);
         deq.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
