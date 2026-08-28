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

public class edt<T> implements eds<T>, edu<T> {
   private static final int a = 0;
   private final eds<T> b = ($$0x, $$1x) -> 0;
   private final jk<T> c;
   private volatile edt.c<T> d;
   private final edt.d e;
   private final bap f = new bap("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<edt<T>> a(jk<T> $$0, Codec<T> $$1, edt.d $$2, T $$3) {
      edu.b<T, edt<T>> $$4 = edt::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<edu<T>> b(jk<T> $$0, Codec<T> $$1, edt.d $$2, T $$3) {
      edu.b<T, edu<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends edu<T>> Codec<C> a(jk<T> $$0, Codec<T> $$1, edt.d $$2, T $$3, edu.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(ayw.a($$3)).listOf().fieldOf("palette").forGetter(edu.a::a),
                     Codec.LONG_STREAM.lenientOptionalFieldOf("data").forGetter(edu.a::b)
                  )
                  .apply($$2x, edu.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public edt(jk<T> $$0, edt.d $$1, edt.a<T> $$2, ayc $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new edt.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private edt(jk<T> $$0, edt.d $$1, edt.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   private edt(edt<T> $$0) {
      this.c = $$0.c;
      this.e = $$0.e;
      this.d = $$0.d.a(this);
   }

   public edt(jk<T> $$0, T $$1, edt.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private edt.c<T> a(@Nullable edt.c<T> $$0, int $$1) {
      edt.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.b()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      edt.c<T> $$2 = this.d;
      edt.c<T> $$3 = this.a($$2, $$0);
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
      edt.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      edr<T> $$1 = this.d.d();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(vw $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         edt.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.c($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(vw $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<edt<T>> a(jk<T> $$0, edt.d $$1, edu.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      edt.a<T> $$6 = $$1.a($$0, $$5);
      ayc $$7;
      if ($$5 == 0) {
         $$7 = new bay($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == edt.d.f) {
               edr<T> $$10 = new edj<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               baf $$11 = new baf($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new baf($$6.b(), $$4, $$12);
            } else {
               $$7 = new baf($$6.b(), $$4, $$9);
            }
         } catch (baf.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new edt<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public edu.a<T> a(jk<T> $$0, edt.d $$1) {
      this.a();

      edu.a var12;
      try {
         edj<T> $$2 = new edj<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            baf $$6 = new baf($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new edu.a<>($$2.c(), $$7);
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
   public edt<T> d() {
      return new edt<>(this);
   }

   @Override
   public edt<T> e() {
      return new edt<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(edt.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(edr.a a, int b) {
      public edt.c<T> a(jk<T> $$0, eds<T> $$1, int $$2) {
         ayc $$3 = (ayc)(this.b == 0 ? new bay($$2) : new baf(this.b, $$2));
         edr<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new edt.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(edt.a<T> a, ayc b, edr<T> c) {

      public void a(edr<T> $$0, ayc $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + wr.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(vw $$0) {
         $$0.l(this.b.c());
         this.c.b($$0);
         $$0.b(this.b.a());
      }

      public edt.c<T> a(eds<T> $$0) {
         return new edt.c<>(this.a, this.b.d(), this.c.a($$0));
      }

      public edt.a<T> b() {
         return this.a;
      }

      public ayc c() {
         return this.b;
      }

      public edr<T> d() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final edr.a a = edw::a;
      public static final edr.a b = edp::a;
      public static final edr.a c = edj::a;
      static final edr.a f = edi::a;
      public static final edt.d d = new edt.d(4) {
         @Override
         public <A> edt.a<A> a(jk<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new edt.a(a, $$1);
               case 1, 2, 3, 4 -> new edt.a(b, 4);
               case 5, 6, 7, 8 -> new edt.a(c, $$1);
               default -> new edt.a(edt.d.f, azo.e($$0.d()));
            };
         }
      };
      public static final edt.d e = new edt.d(2) {
         @Override
         public <A> edt.a<A> a(jk<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new edt.a(a, $$1);
               case 1, 2, 3 -> new edt.a(b, $$1);
               default -> new edt.a(edt.d.f, azo.e($$0.d()));
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

      public abstract <A> edt.a<A> a(jk<A> var1, int var2);

      <A> int b(jk<A> $$0, int $$1) {
         int $$2 = azo.e($$1);
         edt.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
