import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dos {
   Codec<dos> a = atg.a(dos.b.d, atg.a(dos.a.d, dos.c.d)).xmap(dos::a, dos::a);
   dos b = b(0);
   dos c = c(0);

   static dos a(int $$0) {
      return new dos.b($$0);
   }

   static dos b(int $$0) {
      return new dos.a($$0);
   }

   static dos c(int $$0) {
      return new dos.c($$0);
   }

   static dos a() {
      return b;
   }

   static dos b() {
      return c;
   }

   private static dos a(Either<dos.b, Either<dos.a, dos.c>> $$0) {
      return (dos)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dos.b, Either<dos.a, dos.c>> a(dos $$0) {
      return $$0 instanceof dos.b ? Either.left((dos.b)$$0) : Either.right($$0 instanceof dos.a ? Either.left((dos.a)$$0) : Either.right((dos.c)$$0));
   }

   int a(dov var1);

   public static record a(int e) implements dos {
      public static final Codec<dos.a> d = Codec.intRange(dly.e, dly.d).fieldOf("above_bottom").xmap(dos.a::new, dos.a::c).codec();

      @Override
      public int a(dov $$0) {
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

   public static record b(int e) implements dos {
      public static final Codec<dos.b> d = Codec.intRange(dly.e, dly.d).fieldOf("absolute").xmap(dos.b::new, dos.b::c).codec();

      @Override
      public int a(dov $$0) {
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

   public static record c(int e) implements dos {
      public static final Codec<dos.c> d = Codec.intRange(dly.e, dly.d).fieldOf("below_top").xmap(dos.c::new, dos.c::c).codec();

      @Override
      public int a(dov $$0) {
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
