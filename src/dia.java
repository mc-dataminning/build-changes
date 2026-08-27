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

public class dia<T> implements dhz<T>, dib<T> {
   private static final int a = 0;
   private final dhz<T> b = ($$0x, $$1x) -> 0;
   private final hl<T> c;
   private volatile dia.c<T> d;
   private final dia.d e;
   private final asu f = new asu("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<dia<T>> a(hl<T> $$0, Codec<T> $$1, dia.d $$2, T $$3) {
      dib.b<T, dia<T>> $$4 = dia::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<dib<T>> b(hl<T> $$0, Codec<T> $$1, dia.d $$2, T $$3) {
      dib.b<T, dib<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends dib<T>> Codec<C> a(hl<T> $$0, Codec<T> $$1, dia.d $$2, T $$3, dib.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(arh.a($$3)).listOf().fieldOf("palette").forGetter(dib.a::a), Codec.LONG_STREAM.optionalFieldOf("data").forGetter(dib.a::b)
                  )
                  .apply($$2x, dib.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public dia(hl<T> $$0, dia.d $$1, dia.a<T> $$2, aqr $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new dia.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private dia(hl<T> $$0, dia.d $$1, dia.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   public dia(hl<T> $$0, T $$1, dia.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private dia.c<T> a(@Nullable dia.c<T> $$0, int $$1) {
      dia.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.c()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      dia.c<T> $$2 = this.d;
      dia.c<T> $$3 = this.a($$2, $$0);
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
      dia.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dhy<T> $$1 = this.d.e();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(sq $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         dia.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(sq $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<dia<T>> a(hl<T> $$0, dia.d $$1, dib.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      dia.a<T> $$6 = $$1.a($$0, $$5);
      aqr $$7;
      if ($$5 == 0) {
         $$7 = new atb($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == dia.d.f) {
               dhy<T> $$10 = new dhq<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               asl $$11 = new asl($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new asl($$6.b(), $$4, $$12);
            } else {
               $$7 = new asl($$6.b(), $$4, $$9);
            }
         } catch (asl.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new dia<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public dib.a<T> a(hl<T> $$0, dia.d $$1) {
      this.a();

      dib.a var12;
      try {
         dhq<T> $$2 = new dhq<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            asl $$6 = new asl($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new dib.a<>($$2.d(), $$7);
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

   public dia<T> d() {
      return new dia<>(this.c, this.e, this.d.b());
   }

   @Override
   public dia<T> e() {
      return new dia<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(dia.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dhy.a a, int b) {
      public dia.c<T> a(hl<T> $$0, dhz<T> $$1, int $$2) {
         aqr $$3 = (aqr)(this.b == 0 ? new atb($$2) : new asl(this.b, $$2));
         dhy<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new dia.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(dia.a<T> a, aqr b, dhy<T> c) {

      public void a(dhy<T> $$0, aqr $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + te.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(sq $$0) {
         $$0.k(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public dia.c<T> b() {
         return new dia.c<>(this.a, this.b.d(), this.c.c());
      }

      public dia.a<T> c() {
         return this.a;
      }

      public aqr d() {
         return this.b;
      }

      public dhy<T> e() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dhy.a a = did::a;
      public static final dhy.a b = dhw::a;
      public static final dhy.a c = dhq::a;
      static final dhy.a f = dhp::a;
      public static final dia.d d = new dia.d(4) {
         @Override
         public <A> dia.a<A> a(hl<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dia.a(a, $$1);
               case 1, 2, 3, 4 -> new dia.a(b, 4);
               case 5, 6, 7, 8 -> new dia.a(c, $$1);
               default -> new dia.a(dia.d.f, ary.e($$0.b()));
            };
         }
      };
      public static final dia.d e = new dia.d(2) {
         @Override
         public <A> dia.a<A> a(hl<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dia.a(a, $$1);
               case 1, 2, 3 -> new dia.a(b, $$1);
               default -> new dia.a(dia.d.f, ary.e($$0.b()));
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

      public abstract <A> dia.a<A> a(hl<A> var1, int var2);

      <A> int b(hl<A> $$0, int $$1) {
         int $$2 = ary.e($$1);
         dia.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
