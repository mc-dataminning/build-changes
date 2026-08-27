import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dsk {
   Codec<dsk> a = avu.a(dsk.b.d, avu.a(dsk.a.d, dsk.c.d)).xmap(dsk::a, dsk::a);
   dsk b = b(0);
   dsk c = c(0);

   static dsk a(int $$0) {
      return new dsk.b($$0);
   }

   static dsk b(int $$0) {
      return new dsk.a($$0);
   }

   static dsk c(int $$0) {
      return new dsk.c($$0);
   }

   static dsk a() {
      return b;
   }

   static dsk b() {
      return c;
   }

   private static dsk a(Either<dsk.b, Either<dsk.a, dsk.c>> $$0) {
      return (dsk)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dsk.b, Either<dsk.a, dsk.c>> a(dsk $$0) {
      return $$0 instanceof dsk.b ? Either.left((dsk.b)$$0) : Either.right($$0 instanceof dsk.a ? Either.left((dsk.a)$$0) : Either.right((dsk.c)$$0));
   }

   int a(dsn var1);

   public static record a(int e) implements dsk {
      public static final Codec<dsk.a> d = Codec.intRange(dpq.e, dpq.d).fieldOf("above_bottom").xmap(dsk.a::new, dsk.a::c).codec();

      @Override
      public int a(dsn $$0) {
         return $$0.a() + this.e;
      }

      @Override
      public String toString() {
         return this.e + " above bottom";
      }

      public int c() {
         return this.e;
      }
   }

   public static record b(int e) implements dsk {
      public static final Codec<dsk.b> d = Codec.intRange(dpq.e, dpq.d).fieldOf("absolute").xmap(dsk.b::new, dsk.b::c).codec();

      @Override
      public int a(dsn $$0) {
         return this.e;
      }

      @Override
      public String toString() {
         return this.e + " absolute";
      }

      public int c() {
         return this.e;
      }
   }

   public static record c(int e) implements dsk {
      public static final Codec<dsk.c> d = Codec.intRange(dpq.e, dpq.d).fieldOf("below_top").xmap(dsk.c::new, dsk.c::c).codec();

      @Override
      public int a(dsn $$0) {
         return $$0.b() - 1 + $$0.a() - this.e;
      }

      @Override
      public String toString() {
         return this.e + " below top";
      }

      public int c() {
         return this.e;
      }
   }
}
