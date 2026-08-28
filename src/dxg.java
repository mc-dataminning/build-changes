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

public class dxg<T> implements dxf<T>, dxh<T> {
   private static final int a = 0;
   private final dxf<T> b = ($$0x, $$1x) -> 0;
   private final jt<T> c;
   private volatile dxg.c<T> d;
   private final dxg.d e;
   private final bae f = new bae("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<dxg<T>> a(jt<T> $$0, Codec<T> $$1, dxg.d $$2, T $$3) {
      dxh.b<T, dxg<T>> $$4 = dxg::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<dxh<T>> b(jt<T> $$0, Codec<T> $$1, dxg.d $$2, T $$3) {
      dxh.b<T, dxh<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends dxh<T>> Codec<C> a(jt<T> $$0, Codec<T> $$1, dxg.d $$2, T $$3, dxh.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(ayo.a($$3)).listOf().fieldOf("palette").forGetter(dxh.a::a),
                     Codec.LONG_STREAM.lenientOptionalFieldOf("data").forGetter(dxh.a::b)
                  )
                  .apply($$2x, dxh.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public dxg(jt<T> $$0, dxg.d $$1, dxg.a<T> $$2, axu $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new dxg.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private dxg(jt<T> $$0, dxg.d $$1, dxg.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   private dxg(dxg<T> $$0) {
      this.c = $$0.c;
      this.e = $$0.e;
      this.d = $$0.d.a(this);
   }

   public dxg(jt<T> $$0, T $$1, dxg.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private dxg.c<T> a(@Nullable dxg.c<T> $$0, int $$1) {
      dxg.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.b()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      dxg.c<T> $$2 = this.d;
      dxg.c<T> $$3 = this.a($$2, $$0);
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
      dxg.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dxe<T> $$1 = this.d.d();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(wb $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         dxg.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(wb $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<dxg<T>> a(jt<T> $$0, dxg.d $$1, dxh.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      dxg.a<T> $$6 = $$1.a($$0, $$5);
      axu $$7;
      if ($$5 == 0) {
         $$7 = new bam($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == dxg.d.f) {
               dxe<T> $$10 = new dww<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               azu $$11 = new azu($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new azu($$6.b(), $$4, $$12);
            } else {
               $$7 = new azu($$6.b(), $$4, $$9);
            }
         } catch (azu.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new dxg<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public dxh.a<T> a(jt<T> $$0, dxg.d $$1) {
      this.a();

      dxh.a var12;
      try {
         dww<T> $$2 = new dww<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            azu $$6 = new azu($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new dxh.a<>($$2.c(), $$7);
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

   @Override
   public dxg<T> d() {
      return new dxg<>(this);
   }

   @Override
   public dxg<T> e() {
      return new dxg<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(dxg.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dxe.a a, int b) {
      public dxg.c<T> a(jt<T> $$0, dxf<T> $$1, int $$2) {
         axu $$3 = (axu)(this.b == 0 ? new bam($$2) : new azu(this.b, $$2));
         dxe<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new dxg.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(dxg.a<T> a, axu b, dxe<T> c) {

      public void a(dxe<T> $$0, axu $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + wv.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(wb $$0) {
         $$0.l(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public dxg.c<T> a(dxf<T> $$0) {
         return new dxg.c<>(this.a, this.b.d(), this.c.a($$0));
      }

      public dxg.a<T> b() {
         return this.a;
      }

      public axu c() {
         return this.b;
      }

      public dxe<T> d() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dxe.a a = dxj::a;
      public static final dxe.a b = dxc::a;
      public static final dxe.a c = dww::a;
      static final dxe.a f = dwv::a;
      public static final dxg.d d = new dxg.d(4) {
         @Override
         public <A> dxg.a<A> a(jt<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dxg.a(a, $$1);
               case 1, 2, 3, 4 -> new dxg.a(b, 4);
               case 5, 6, 7, 8 -> new dxg.a(c, $$1);
               default -> new dxg.a(dxg.d.f, azf.e($$0.d()));
            };
         }
      };
      public static final dxg.d e = new dxg.d(2) {
         @Override
         public <A> dxg.a<A> a(jt<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dxg.a(a, $$1);
               case 1, 2, 3 -> new dxg.a(b, $$1);
               default -> new dxg.a(dxg.d.f, azf.e($$0.d()));
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

      public abstract <A> dxg.a<A> a(jt<A> var1, int var2);

      <A> int b(jt<A> $$0, int $$1) {
         int $$2 = azf.e($$1);
         dxg.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
