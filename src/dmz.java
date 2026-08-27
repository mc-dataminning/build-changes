import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dmz {
   Codec<dmz> a = asq.a(dmz.b.d, asq.a(dmz.a.d, dmz.c.d)).xmap(dmz::a, dmz::a);
   dmz b = b(0);
   dmz c = c(0);

   static dmz a(int $$0) {
      return new dmz.b($$0);
   }

   static dmz b(int $$0) {
      return new dmz.a($$0);
   }

   static dmz c(int $$0) {
      return new dmz.c($$0);
   }

   static dmz a() {
      return b;
   }

   static dmz b() {
      return c;
   }

   private static dmz a(Either<dmz.b, Either<dmz.a, dmz.c>> $$0) {
      return (dmz)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dmz.b, Either<dmz.a, dmz.c>> a(dmz $$0) {
      return $$0 instanceof dmz.b ? Either.left((dmz.b)$$0) : Either.right($$0 instanceof dmz.a ? Either.left((dmz.a)$$0) : Either.right((dmz.c)$$0));
   }

   int a(dnc var1);

   public static record a(int e) implements dmz {
      public static final Codec<dmz.a> d = Codec.intRange(dkf.e, dkf.d).fieldOf("above_bottom").xmap(dmz.a::new, dmz.a::c).codec();

      @Override
      public int a(dnc $$0) {
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

   public static record b(int e) implements dmz {
      public static final Codec<dmz.b> d = Codec.intRange(dkf.e, dkf.d).fieldOf("absolute").xmap(dmz.b::new, dmz.b::c).codec();

      @Override
      public int a(dnc $$0) {
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

   public static record c(int e) implements dmz {
      public static final Codec<dmz.c> d = Codec.intRange(dkf.e, dkf.d).fieldOf("below_top").xmap(dmz.c::new, dmz.c::c).codec();

      @Override
      public int a(dnc $$0) {
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
