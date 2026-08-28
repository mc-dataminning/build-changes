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

public class duv<T> implements duu<T>, duw<T> {
   private static final int a = 0;
   private final duu<T> b = ($$0x, $$1x) -> 0;
   private final jo<T> c;
   private volatile duv.c<T> d;
   private final duv.d e;
   private final azc f = new azc("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<duv<T>> a(jo<T> $$0, Codec<T> $$1, duv.d $$2, T $$3) {
      duw.b<T, duv<T>> $$4 = duv::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<duw<T>> b(jo<T> $$0, Codec<T> $$1, duv.d $$2, T $$3) {
      duw.b<T, duw<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends duw<T>> Codec<C> a(jo<T> $$0, Codec<T> $$1, duv.d $$2, T $$3, duw.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(axm.a($$3)).listOf().fieldOf("palette").forGetter(duw.a::a),
                     Codec.LONG_STREAM.lenientOptionalFieldOf("data").forGetter(duw.a::b)
                  )
                  .apply($$2x, duw.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public duv(jo<T> $$0, duv.d $$1, duv.a<T> $$2, aws $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new duv.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private duv(jo<T> $$0, duv.d $$1, duv.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   public duv(jo<T> $$0, T $$1, duv.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private duv.c<T> a(@Nullable duv.c<T> $$0, int $$1) {
      duv.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.c()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      duv.c<T> $$2 = this.d;
      duv.c<T> $$3 = this.a($$2, $$0);
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
      duv.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dut<T> $$1 = this.d.e();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(vr $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         duv.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(vr $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<duv<T>> a(jo<T> $$0, duv.d $$1, duw.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      duv.a<T> $$6 = $$1.a($$0, $$5);
      aws $$7;
      if ($$5 == 0) {
         $$7 = new azj($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == duv.d.f) {
               dut<T> $$10 = new dul<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               ayt $$11 = new ayt($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new ayt($$6.b(), $$4, $$12);
            } else {
               $$7 = new ayt($$6.b(), $$4, $$9);
            }
         } catch (ayt.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new duv<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public duw.a<T> a(jo<T> $$0, duv.d $$1) {
      this.a();

      duw.a var12;
      try {
         dul<T> $$2 = new dul<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            ayt $$6 = new ayt($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new duw.a<>($$2.d(), $$7);
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

   public duv<T> d() {
      return new duv<>(this.c, this.e, this.d.b());
   }

   @Override
   public duv<T> e() {
      return new duv<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(duv.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dut.a a, int b) {
      public duv.c<T> a(jo<T> $$0, duu<T> $$1, int $$2) {
         aws $$3 = (aws)(this.b == 0 ? new azj($$2) : new ayt(this.b, $$2));
         dut<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new duv.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(duv.a<T> a, aws b, dut<T> c) {

      public void a(dut<T> $$0, aws $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + wl.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(vr $$0) {
         $$0.k(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public duv.c<T> b() {
         return new duv.c<>(this.a, this.b.d(), this.c.c());
      }

      public duv.a<T> c() {
         return this.a;
      }

      public aws d() {
         return this.b;
      }

      public dut<T> e() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dut.a a = duy::a;
      public static final dut.a b = dur::a;
      public static final dut.a c = dul::a;
      static final dut.a f = duk::a;
      public static final duv.d d = new duv.d(4) {
         @Override
         public <A> duv.a<A> a(jo<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new duv.a(a, $$1);
               case 1, 2, 3, 4 -> new duv.a(b, 4);
               case 5, 6, 7, 8 -> new duv.a(c, $$1);
               default -> new duv.a(duv.d.f, aye.e($$0.c()));
            };
         }
      };
      public static final duv.d e = new duv.d(2) {
         @Override
         public <A> duv.a<A> a(jo<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new duv.a(a, $$1);
               case 1, 2, 3 -> new duv.a(b, $$1);
               default -> new duv.a(duv.d.f, aye.e($$0.c()));
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

      public abstract <A> duv.a<A> a(jo<A> var1, int var2);

      <A> int b(jo<A> $$0, int $$1) {
         int $$2 = aye.e($$1);
         duv.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
