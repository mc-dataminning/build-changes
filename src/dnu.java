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

public class dnu<T> implements dnt<T>, dnv<T> {
   private static final int a = 0;
   private final dnt<T> b = ($$0x, $$1x) -> 0;
   private final io<T> c;
   private volatile dnu.c<T> d;
   private final dnu.d e;
   private final axf f = new axf("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<dnu<T>> a(io<T> $$0, Codec<T> $$1, dnu.d $$2, T $$3) {
      dnv.b<T, dnu<T>> $$4 = dnu::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<dnv<T>> b(io<T> $$0, Codec<T> $$1, dnu.d $$2, T $$3) {
      dnv.b<T, dnv<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends dnv<T>> Codec<C> a(io<T> $$0, Codec<T> $$1, dnu.d $$2, T $$3, dnv.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(avp.a($$3)).listOf().fieldOf("palette").forGetter(dnv.a::a), Codec.LONG_STREAM.optionalFieldOf("data").forGetter(dnv.a::b)
                  )
                  .apply($$2x, dnv.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public dnu(io<T> $$0, dnu.d $$1, dnu.a<T> $$2, auw $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new dnu.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private dnu(io<T> $$0, dnu.d $$1, dnu.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   public dnu(io<T> $$0, T $$1, dnu.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private dnu.c<T> a(@Nullable dnu.c<T> $$0, int $$1) {
      dnu.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.c()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      dnu.c<T> $$2 = this.d;
      dnu.c<T> $$3 = this.a($$2, $$0);
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
      dnu.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dns<T> $$1 = this.d.e();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(uq $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         dnu.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(uq $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<dnu<T>> a(io<T> $$0, dnu.d $$1, dnv.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      dnu.a<T> $$6 = $$1.a($$0, $$5);
      auw $$7;
      if ($$5 == 0) {
         $$7 = new axm($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == dnu.d.f) {
               dns<T> $$10 = new dnk<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               aww $$11 = new aww($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new aww($$6.b(), $$4, $$12);
            } else {
               $$7 = new aww($$6.b(), $$4, $$9);
            }
         } catch (aww.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new dnu<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public dnv.a<T> a(io<T> $$0, dnu.d $$1) {
      this.a();

      dnv.a var12;
      try {
         dnk<T> $$2 = new dnk<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            aww $$6 = new aww($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new dnv.a<>($$2.d(), $$7);
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

   public dnu<T> d() {
      return new dnu<>(this.c, this.e, this.d.b());
   }

   @Override
   public dnu<T> e() {
      return new dnu<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(dnu.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dns.a a, int b) {
      public dnu.c<T> a(io<T> $$0, dnt<T> $$1, int $$2) {
         auw $$3 = (auw)(this.b == 0 ? new axm($$2) : new aww(this.b, $$2));
         dns<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new dnu.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(dnu.a<T> a, auw b, dns<T> c) {

      public void a(dns<T> $$0, auw $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + vh.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(uq $$0) {
         $$0.k(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public dnu.c<T> b() {
         return new dnu.c<>(this.a, this.b.d(), this.c.c());
      }

      public dnu.a<T> c() {
         return this.a;
      }

      public auw d() {
         return this.b;
      }

      public dns<T> e() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dns.a a = dnx::a;
      public static final dns.a b = dnq::a;
      public static final dns.a c = dnk::a;
      static final dns.a f = dnj::a;
      public static final dnu.d d = new dnu.d(4) {
         @Override
         public <A> dnu.a<A> a(io<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dnu.a(a, $$1);
               case 1, 2, 3, 4 -> new dnu.a(b, 4);
               case 5, 6, 7, 8 -> new dnu.a(c, $$1);
               default -> new dnu.a(dnu.d.f, awh.e($$0.b()));
            };
         }
      };
      public static final dnu.d e = new dnu.d(2) {
         @Override
         public <A> dnu.a<A> a(io<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dnu.a(a, $$1);
               case 1, 2, 3 -> new dnu.a(b, $$1);
               default -> new dnu.a(dnu.d.f, awh.e($$0.b()));
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

      public abstract <A> dnu.a<A> a(io<A> var1, int var2);

      <A> int b(io<A> $$0, int $$1) {
         int $$2 = awh.e($$1);
         dnu.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
