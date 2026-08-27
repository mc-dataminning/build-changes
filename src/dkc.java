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

public class dkc<T> implements dkb<T>, dkd<T> {
   private static final int a = 0;
   private final dkb<T> b = ($$0x, $$1x) -> 0;
   private final il<T> c;
   private volatile dkc.c<T> d;
   private final dkc.d e;
   private final aun f = new aun("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<dkc<T>> a(il<T> $$0, Codec<T> $$1, dkc.d $$2, T $$3) {
      dkd.b<T, dkc<T>> $$4 = dkc::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<dkd<T>> b(il<T> $$0, Codec<T> $$1, dkc.d $$2, T $$3) {
      dkd.b<T, dkd<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends dkd<T>> Codec<C> a(il<T> $$0, Codec<T> $$1, dkc.d $$2, T $$3, dkd.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(asy.a($$3)).listOf().fieldOf("palette").forGetter(dkd.a::a), Codec.LONG_STREAM.optionalFieldOf("data").forGetter(dkd.a::b)
                  )
                  .apply($$2x, dkd.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public dkc(il<T> $$0, dkc.d $$1, dkc.a<T> $$2, ash $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new dkc.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private dkc(il<T> $$0, dkc.d $$1, dkc.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   public dkc(il<T> $$0, T $$1, dkc.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private dkc.c<T> a(@Nullable dkc.c<T> $$0, int $$1) {
      dkc.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.c()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      dkc.c<T> $$2 = this.d;
      dkc.c<T> $$3 = this.a($$2, $$0);
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
      dkc.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dka<T> $$1 = this.d.e();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(ty $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         dkc.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(ty $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<dkc<T>> a(il<T> $$0, dkc.d $$1, dkd.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      dkc.a<T> $$6 = $$1.a($$0, $$5);
      ash $$7;
      if ($$5 == 0) {
         $$7 = new auu($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == dkc.d.f) {
               dka<T> $$10 = new djs<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               aue $$11 = new aue($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new aue($$6.b(), $$4, $$12);
            } else {
               $$7 = new aue($$6.b(), $$4, $$9);
            }
         } catch (aue.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new dkc<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public dkd.a<T> a(il<T> $$0, dkc.d $$1) {
      this.a();

      dkd.a var12;
      try {
         djs<T> $$2 = new djs<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            aue $$6 = new aue($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new dkd.a<>($$2.d(), $$7);
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

   public dkc<T> d() {
      return new dkc<>(this.c, this.e, this.d.b());
   }

   @Override
   public dkc<T> e() {
      return new dkc<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(dkc.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dka.a a, int b) {
      public dkc.c<T> a(il<T> $$0, dkb<T> $$1, int $$2) {
         ash $$3 = (ash)(this.b == 0 ? new auu($$2) : new aue(this.b, $$2));
         dka<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new dkc.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(dkc.a<T> a, ash b, dka<T> c) {

      public void a(dka<T> $$0, ash $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + um.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(ty $$0) {
         $$0.k(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public dkc.c<T> b() {
         return new dkc.c<>(this.a, this.b.d(), this.c.c());
      }

      public dkc.a<T> c() {
         return this.a;
      }

      public ash d() {
         return this.b;
      }

      public dka<T> e() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dka.a a = dkf::a;
      public static final dka.a b = djy::a;
      public static final dka.a c = djs::a;
      static final dka.a f = djr::a;
      public static final dkc.d d = new dkc.d(4) {
         @Override
         public <A> dkc.a<A> a(il<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dkc.a(a, $$1);
               case 1, 2, 3, 4 -> new dkc.a(b, 4);
               case 5, 6, 7, 8 -> new dkc.a(c, $$1);
               default -> new dkc.a(dkc.d.f, atq.e($$0.b()));
            };
         }
      };
      public static final dkc.d e = new dkc.d(2) {
         @Override
         public <A> dkc.a<A> a(il<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dkc.a(a, $$1);
               case 1, 2, 3 -> new dkc.a(b, $$1);
               default -> new dkc.a(dkc.d.f, atq.e($$0.b()));
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

      public abstract <A> dkc.a<A> a(il<A> var1, int var2);

      <A> int b(il<A> $$0, int $$1) {
         int $$2 = atq.e($$1);
         dkc.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
