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

public class dsv<T> implements dsu<T>, dsw<T> {
   private static final int a = 0;
   private final dsu<T> b = ($$0x, $$1x) -> 0;
   private final jb<T> c;
   private volatile dsv.c<T> d;
   private final dsv.d e;
   private final ayw f = new ayw("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<dsv<T>> a(jb<T> $$0, Codec<T> $$1, dsv.d $$2, T $$3) {
      dsw.b<T, dsv<T>> $$4 = dsv::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<dsw<T>> b(jb<T> $$0, Codec<T> $$1, dsv.d $$2, T $$3) {
      dsw.b<T, dsw<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends dsw<T>> Codec<C> a(jb<T> $$0, Codec<T> $$1, dsv.d $$2, T $$3, dsw.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(axh.a($$3)).listOf().fieldOf("palette").forGetter(dsw.a::a), Codec.LONG_STREAM.optionalFieldOf("data").forGetter(dsw.a::b)
                  )
                  .apply($$2x, dsw.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public dsv(jb<T> $$0, dsv.d $$1, dsv.a<T> $$2, awo $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new dsv.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private dsv(jb<T> $$0, dsv.d $$1, dsv.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   public dsv(jb<T> $$0, T $$1, dsv.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private dsv.c<T> a(@Nullable dsv.c<T> $$0, int $$1) {
      dsv.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.c()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      dsv.c<T> $$2 = this.d;
      dsv.c<T> $$3 = this.a($$2, $$0);
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
      dsv.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dst<T> $$1 = this.d.e();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(vu $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         dsv.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(vu $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<dsv<T>> a(jb<T> $$0, dsv.d $$1, dsw.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      dsv.a<T> $$6 = $$1.a($$0, $$5);
      awo $$7;
      if ($$5 == 0) {
         $$7 = new azd($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == dsv.d.f) {
               dst<T> $$10 = new dsl<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               ayn $$11 = new ayn($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new ayn($$6.b(), $$4, $$12);
            } else {
               $$7 = new ayn($$6.b(), $$4, $$9);
            }
         } catch (ayn.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new dsv<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public dsw.a<T> a(jb<T> $$0, dsv.d $$1) {
      this.a();

      dsw.a var12;
      try {
         dsl<T> $$2 = new dsl<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            ayn $$6 = new ayn($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new dsw.a<>($$2.d(), $$7);
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

   public dsv<T> d() {
      return new dsv<>(this.c, this.e, this.d.b());
   }

   @Override
   public dsv<T> e() {
      return new dsv<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(dsv.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dst.a a, int b) {
      public dsv.c<T> a(jb<T> $$0, dsu<T> $$1, int $$2) {
         awo $$3 = (awo)(this.b == 0 ? new azd($$2) : new ayn(this.b, $$2));
         dst<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new dsv.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(dsv.a<T> a, awo b, dst<T> c) {

      public void a(dst<T> $$0, awo $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + wl.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(vu $$0) {
         $$0.k(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public dsv.c<T> b() {
         return new dsv.c<>(this.a, this.b.d(), this.c.c());
      }

      public dsv.a<T> c() {
         return this.a;
      }

      public awo d() {
         return this.b;
      }

      public dst<T> e() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dst.a a = dsy::a;
      public static final dst.a b = dsr::a;
      public static final dst.a c = dsl::a;
      static final dst.a f = dsk::a;
      public static final dsv.d d = new dsv.d(4) {
         @Override
         public <A> dsv.a<A> a(jb<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dsv.a(a, $$1);
               case 1, 2, 3, 4 -> new dsv.a(b, 4);
               case 5, 6, 7, 8 -> new dsv.a(c, $$1);
               default -> new dsv.a(dsv.d.f, axz.e($$0.b()));
            };
         }
      };
      public static final dsv.d e = new dsv.d(2) {
         @Override
         public <A> dsv.a<A> a(jb<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dsv.a(a, $$1);
               case 1, 2, 3 -> new dsv.a(b, $$1);
               default -> new dsv.a(dsv.d.f, axz.e($$0.b()));
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

      public abstract <A> dsv.a<A> a(jb<A> var1, int var2);

      <A> int b(jb<A> $$0, int $$1) {
         int $$2 = axz.e($$1);
         dsv.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
