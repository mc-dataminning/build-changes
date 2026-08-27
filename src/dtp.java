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

public class dtp<T> implements dto<T>, dtq<T> {
   private static final int a = 0;
   private final dto<T> b = ($$0x, $$1x) -> 0;
   private final jc<T> c;
   private volatile dtp.c<T> d;
   private final dtp.d e;
   private final aza f = new aza("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<dtp<T>> a(jc<T> $$0, Codec<T> $$1, dtp.d $$2, T $$3) {
      dtq.b<T, dtp<T>> $$4 = dtp::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<dtq<T>> b(jc<T> $$0, Codec<T> $$1, dtp.d $$2, T $$3) {
      dtq.b<T, dtq<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends dtq<T>> Codec<C> a(jc<T> $$0, Codec<T> $$1, dtp.d $$2, T $$3, dtq.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(axm.a($$3)).listOf().fieldOf("palette").forGetter(dtq.a::a),
                     Codec.LONG_STREAM.lenientOptionalFieldOf("data").forGetter(dtq.a::b)
                  )
                  .apply($$2x, dtq.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public dtp(jc<T> $$0, dtp.d $$1, dtp.a<T> $$2, awt $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new dtp.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private dtp(jc<T> $$0, dtp.d $$1, dtp.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   public dtp(jc<T> $$0, T $$1, dtp.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private dtp.c<T> a(@Nullable dtp.c<T> $$0, int $$1) {
      dtp.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.c()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      dtp.c<T> $$2 = this.d;
      dtp.c<T> $$3 = this.a($$2, $$0);
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
      dtp.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dtn<T> $$1 = this.d.e();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(vx $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         dtp.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(vx $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<dtp<T>> a(jc<T> $$0, dtp.d $$1, dtq.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      dtp.a<T> $$6 = $$1.a($$0, $$5);
      awt $$7;
      if ($$5 == 0) {
         $$7 = new azh($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == dtp.d.f) {
               dtn<T> $$10 = new dtf<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               ayr $$11 = new ayr($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new ayr($$6.b(), $$4, $$12);
            } else {
               $$7 = new ayr($$6.b(), $$4, $$9);
            }
         } catch (ayr.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new dtp<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public dtq.a<T> a(jc<T> $$0, dtp.d $$1) {
      this.a();

      dtq.a var12;
      try {
         dtf<T> $$2 = new dtf<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            ayr $$6 = new ayr($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new dtq.a<>($$2.d(), $$7);
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

   public dtp<T> d() {
      return new dtp<>(this.c, this.e, this.d.b());
   }

   @Override
   public dtp<T> e() {
      return new dtp<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(dtp.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dtn.a a, int b) {
      public dtp.c<T> a(jc<T> $$0, dto<T> $$1, int $$2) {
         awt $$3 = (awt)(this.b == 0 ? new azh($$2) : new ayr(this.b, $$2));
         dtn<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new dtp.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(dtp.a<T> a, awt b, dtn<T> c) {

      public void a(dtn<T> $$0, awt $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + wo.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(vx $$0) {
         $$0.k(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public dtp.c<T> b() {
         return new dtp.c<>(this.a, this.b.d(), this.c.c());
      }

      public dtp.a<T> c() {
         return this.a;
      }

      public awt d() {
         return this.b;
      }

      public dtn<T> e() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dtn.a a = dts::a;
      public static final dtn.a b = dtl::a;
      public static final dtn.a c = dtf::a;
      static final dtn.a f = dte::a;
      public static final dtp.d d = new dtp.d(4) {
         @Override
         public <A> dtp.a<A> a(jc<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dtp.a(a, $$1);
               case 1, 2, 3, 4 -> new dtp.a(b, 4);
               case 5, 6, 7, 8 -> new dtp.a(c, $$1);
               default -> new dtp.a(dtp.d.f, ayd.e($$0.b()));
            };
         }
      };
      public static final dtp.d e = new dtp.d(2) {
         @Override
         public <A> dtp.a<A> a(jc<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dtp.a(a, $$1);
               case 1, 2, 3 -> new dtp.a(b, $$1);
               default -> new dtp.a(dtp.d.f, ayd.e($$0.b()));
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

      public abstract <A> dtp.a<A> a(jc<A> var1, int var2);

      <A> int b(jc<A> $$0, int $$1) {
         int $$2 = ayd.e($$1);
         dtp.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
