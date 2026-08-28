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

public class dwo<T> implements dwn<T>, dwp<T> {
   private static final int a = 0;
   private final dwn<T> b = ($$0x, $$1x) -> 0;
   private final js<T> c;
   private volatile dwo.c<T> d;
   private final dwo.d e;
   private final bab f = new bab("PalettedContainer");

   public void a() {
      this.f.a();
   }

   public void b() {
      this.f.b();
   }

   public static <T> Codec<dwo<T>> a(js<T> $$0, Codec<T> $$1, dwo.d $$2, T $$3) {
      dwp.b<T, dwo<T>> $$4 = dwo::a;
      return a($$0, $$1, $$2, $$3, $$4);
   }

   public static <T> Codec<dwp<T>> b(js<T> $$0, Codec<T> $$1, dwo.d $$2, T $$3) {
      dwp.b<T, dwp<T>> $$4 = ($$0x, $$1x, $$2x) -> a($$0x, $$1x, $$2x).map($$0xx -> $$0xx);
      return a($$0, $$1, $$2, $$3, $$4);
   }

   private static <T, C extends dwp<T>> Codec<C> a(js<T> $$0, Codec<T> $$1, dwo.d $$2, T $$3, dwp.b<T, C> $$4) {
      return RecordCodecBuilder.create(
            $$2x -> $$2x.group(
                     $$1.mapResult(ayl.a($$3)).listOf().fieldOf("palette").forGetter(dwp.a::a),
                     Codec.LONG_STREAM.lenientOptionalFieldOf("data").forGetter(dwp.a::b)
                  )
                  .apply($$2x, dwp.a::new)
         )
         .comapFlatMap($$3x -> $$4.read($$0, $$2, $$3x), $$2x -> $$2x.a($$0, $$2));
   }

   public dwo(js<T> $$0, dwo.d $$1, dwo.a<T> $$2, axr $$3, List<T> $$4) {
      this.c = $$0;
      this.e = $$1;
      this.d = new dwo.c<>($$2, $$3, $$2.a().create($$2.b(), $$0, this, $$4));
   }

   private dwo(js<T> $$0, dwo.d $$1, dwo.c<T> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$2;
   }

   private dwo(dwo<T> $$0) {
      this.c = $$0.c;
      this.e = $$0.e;
      this.d = $$0.d.a(this);
   }

   public dwo(js<T> $$0, T $$1, dwo.d $$2) {
      this.e = $$2;
      this.c = $$0;
      this.d = this.a(null, 0);
      this.d.c.a($$1);
   }

   private dwo.c<T> a(@Nullable dwo.c<T> $$0, int $$1) {
      dwo.a<T> $$2 = this.e.a(this.c, $$1);
      return $$0 != null && $$2.equals($$0.b()) ? $$0 : $$2.a(this.c, this, this.e.a());
   }

   @Override
   public int onResize(int $$0, T $$1) {
      dwo.c<T> $$2 = this.d;
      dwo.c<T> $$3 = this.a($$2, $$0);
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
      dwo.c<T> $$1 = this.d;
      return $$1.c.a($$1.b.a($$0));
   }

   @Override
   public void a(Consumer<T> $$0) {
      dwm<T> $$1 = this.d.d();
      IntSet $$2 = new IntArraySet();
      this.d.b.a($$2::add);
      $$2.forEach($$2x -> $$0.accept($$1.a($$2x)));
   }

   public void a(wa $$0) {
      this.a();

      try {
         int $$1 = $$0.readByte();
         dwo.c<T> $$2 = this.a(this.d, $$1);
         $$2.c.a($$0);
         $$0.b($$2.b.a());
         this.d = $$2;
      } finally {
         this.b();
      }
   }

   @Override
   public void b(wa $$0) {
      this.a();

      try {
         this.d.a($$0);
      } finally {
         this.b();
      }
   }

   private static <T> DataResult<dwo<T>> a(js<T> $$0, dwo.d $$1, dwp.a<T> $$2) {
      List<T> $$3 = $$2.a();
      int $$4 = $$1.a();
      int $$5 = $$1.b($$0, $$3.size());
      dwo.a<T> $$6 = $$1.a($$0, $$5);
      axr $$7;
      if ($$5 == 0) {
         $$7 = new baj($$4);
      } else {
         Optional<LongStream> $$8 = $$2.b();
         if ($$8.isEmpty()) {
            return DataResult.error(() -> "Missing values for non-zero storage");
         }

         long[] $$9 = $$8.get().toArray();

         try {
            if ($$6.a() == dwo.d.f) {
               dwm<T> $$10 = new dwe<>($$0, $$5, ($$0x, $$1x) -> 0, $$3);
               azr $$11 = new azr($$5, $$4, $$9);
               int[] $$12 = new int[$$4];
               $$11.a($$12);
               a($$12, $$2x -> $$0.a($$10.a($$2x)));
               $$7 = new azr($$6.b(), $$4, $$12);
            } else {
               $$7 = new azr($$6.b(), $$4, $$9);
            }
         } catch (azr.a var13) {
            return DataResult.error(() -> "Failed to read PalettedContainer: " + var13.getMessage());
         }
      }

      return DataResult.success(new dwo<>($$0, $$1, $$6, $$7, $$3));
   }

   @Override
   public dwp.a<T> a(js<T> $$0, dwo.d $$1) {
      this.a();

      dwp.a var12;
      try {
         dwe<T> $$2 = new dwe<>($$0, this.d.b.c(), this.b);
         int $$3 = $$1.a();
         int[] $$4 = new int[$$3];
         this.d.b.a($$4);
         a($$4, $$1x -> $$2.a(this.d.c.a($$1x)));
         int $$5 = $$1.b($$0, $$2.b());
         Optional<LongStream> $$7;
         if ($$5 != 0) {
            azr $$6 = new azr($$5, $$3, $$4);
            $$7 = Optional.of(Arrays.stream($$6.a()));
         } else {
            $$7 = Optional.empty();
         }

         var12 = new dwp.a<>($$2.c(), $$7);
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
   public dwo<T> d() {
      return new dwo<>(this);
   }

   @Override
   public dwo<T> e() {
      return new dwo<>(this.c, this.d.c.a(0), this.e);
   }

   @Override
   public void a(dwo.b<T> $$0) {
      if (this.d.c.b() == 1) {
         $$0.accept(this.d.c.a(0), this.d.b.b());
      } else {
         Int2IntOpenHashMap $$1 = new Int2IntOpenHashMap();
         this.d.b.a($$1x -> $$1.addTo($$1x, 1));
         $$1.int2IntEntrySet().forEach($$1x -> $$0.accept(this.d.c.a($$1x.getIntKey()), $$1x.getIntValue()));
      }
   }

   static record a<T>(dwm.a a, int b) {
      public dwo.c<T> a(js<T> $$0, dwn<T> $$1, int $$2) {
         axr $$3 = (axr)(this.b == 0 ? new baj($$2) : new azr(this.b, $$2));
         dwm<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
         return new dwo.c<>(this, $$3, $$4);
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1, int var2);
   }

   static record c<T>(dwo.a<T> a, axr b, dwm<T> c) {

      public void a(dwm<T> $$0, axr $$1) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            T $$3 = $$0.a($$1.a($$2));
            this.b.b($$2, this.c.a($$3));
         }
      }

      public int a() {
         return 1 + this.c.a() + wu.a(this.b.a().length) + this.b.a().length * 8;
      }

      public void a(wa $$0) {
         $$0.l(this.b.c());
         this.c.b($$0);
         $$0.a(this.b.a());
      }

      public dwo.c<T> a(dwn<T> $$0) {
         return new dwo.c<>(this.a, this.b.d(), this.c.a($$0));
      }

      public dwo.a<T> b() {
         return this.a;
      }

      public axr c() {
         return this.b;
      }

      public dwm<T> d() {
         return this.c;
      }
   }

   public abstract static class d {
      public static final dwm.a a = dwr::a;
      public static final dwm.a b = dwk::a;
      public static final dwm.a c = dwe::a;
      static final dwm.a f = dwd::a;
      public static final dwo.d d = new dwo.d(4) {
         @Override
         public <A> dwo.a<A> a(js<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dwo.a(a, $$1);
               case 1, 2, 3, 4 -> new dwo.a(b, 4);
               case 5, 6, 7, 8 -> new dwo.a(c, $$1);
               default -> new dwo.a(dwo.d.f, azc.e($$0.c()));
            };
         }
      };
      public static final dwo.d e = new dwo.d(2) {
         @Override
         public <A> dwo.a<A> a(js<A> $$0, int $$1) {
            return switch ($$1) {
               case 0 -> new dwo.a(a, $$1);
               case 1, 2, 3 -> new dwo.a(b, $$1);
               default -> new dwo.a(dwo.d.f, azc.e($$0.c()));
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

      public abstract <A> dwo.a<A> a(js<A> var1, int var2);

      <A> int b(js<A> $$0, int $$1) {
         int $$2 = azc.e($$1);
         dwo.a<A> $$3 = this.a($$0, $$2);
         return $$3.a() == f ? $$2 : $$3.b();
      }
   }
}
