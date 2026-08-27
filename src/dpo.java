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

public class dpo<T> implements dpn<T>, dpp<T> {
   private static final int a = 0;
   private final dpn<T> b = ($$0x, $$1x) -> 0;
   private final iq<T> c;
   private volatile dpo.c<T> d;
   private final dpo.d e;
   private final axt f = new axt("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<dpo<T>> a(iq<T> $$0, Codec<T> $$1, dpo.d $$2, T $$3) {
      dpp.b<T, dpo<T>> $$4 = dpo::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<dpp<T>> b(iq<T> $$0, Codec<T> $$1, dpo.d $$2, T $$3) {
      dpp.b<T, dpp<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends dpp<T>> Codec<C> a(iq<T> $$0, Codec<T> $$1, dpo.d $$2, T $$3, dpp.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(awe.a($$3)).listOf().fieldOf("palette").forGetter(dpp.a::a), Codec.LONG_STREAM.optionalFieldOf("data").forGetter(dpp.a::b)
                  )
                  .apply($$2x, dpp.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public dpo(iq<T> $$0, dpo.d $$1, dpo.a<T> $$2, avl $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new dpo.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private dpo(iq<T> $$0, dpo.d $$1, dpo.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   public dpo(iq<T> $$0, T $$1, dpo.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private dpo.c<T> a(@Nullable dpo.c<T> $$0, int $$1) {
      dpo.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.c()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      dpo.c<T> $$2 = this.d;
      dpo.c<T> $$3 = this.a($$2, $$0);
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
      dpo.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dpm<T> $$1 = this.d.e();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(uu $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         dpo.c<T> $$2 = this.a(this.d, $$1);
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

   private static <T> DataResult<dpo<T>> a(iq<T> $$0, dpo.d $$1, dpp.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      dpo.a<T> $$6 = $$1.a($$0, $$5);
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
            if ($$6.a() == dpo.d.f) {
               dpm<T> $$10 = new dpe<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
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

      return DataResult.success(new dpo<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public dpp.a<T> a(iq<T> $$0, dpo.d $$1) {
      this.a();

      dpp.a var12;
      try {
         dpe<T> $$2 = new dpe<>($$0, this.d.b.c(), this.b);
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

         var12 = new dpp.a<>($$2.d(), $$7);
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

   public dpo<T> d() {
      return new dpo<>(this.c, this.e, this.d.b());
   }

   @Override
   public dpo<T> e() {
      return new dpo<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(dpo.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dpm.a a, int b) {
      public dpo.c<T> a(iq<T> $$0, dpn<T> $$1, int $$2) {
         avl $$3 = (avl)(this.b == 0 ? new aya($$2) : new axk(this.b, $$2));
         dpm<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new dpo.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(dpo.a<T> a, avl b, dpm<T> c) {

      public void a(dpm<T> $$0, avl $$1) {
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

      public dpo.c<T> b() {
         return new dpo.c<>(this.a, this.b.d(), this.c.c());
      }

      public dpo.a<T> c() {
         return this.a;
      }

      public avl d() {
         return this.b;
      }

      public dpm<T> e() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dpm.a a = dpr::a;
      public static final dpm.a b = dpk::a;
      public static final dpm.a c = dpe::a;
      static final dpm.a f = dpd::a;
      public static final dpo.d d = new dpo.d(4) {
         @Override
         public <A> dpo.a<A> a(iq<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dpo.a(a, $$1);
               case 1, 2, 3, 4 -> new dpo.a(b, 4);
               case 5, 6, 7, 8 -> new dpo.a(c, $$1);
               default -> new dpo.a(dpo.d.f, aww.e($$0.b()));
            };
         }
      };
      public static final dpo.d e = new dpo.d(2) {
         @Override
         public <A> dpo.a<A> a(iq<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dpo.a(a, $$1);
               case 1, 2, 3 -> new dpo.a(b, $$1);
               default -> new dpo.a(dpo.d.f, aww.e($$0.b()));
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

      public abstract <A> dpo.a<A> a(iq<A> var1, int var2);

      <A> int b(iq<A> $$0, int $$1) {
         int $$2 = aww.e($$1);
         dpo.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
