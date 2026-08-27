import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dme {
   Codec<dme> a = asg.a(dme.b.d, asg.a(dme.a.d, dme.c.d)).xmap(dme::a, dme::a);
   dme b = b(0);
   dme c = c(0);

   static dme a(int $$0) {
      return new dme.b($$0);
   }

   static dme b(int $$0) {
      return new dme.a($$0);
   }

   static dme c(int $$0) {
      return new dme.c($$0);
   }

   static dme a() {
      return b;
   }

   static dme b() {
      return c;
   }

   private static dme a(Either<dme.b, Either<dme.a, dme.c>> $$0) {
      return (dme)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dme.b, Either<dme.a, dme.c>> a(dme $$0) {
      return $$0 instanceof dme.b ? Either.left((dme.b)$$0) : Either.right($$0 instanceof dme.a ? Either.left((dme.a)$$0) : Either.right((dme.c)$$0));
   }

   int a(dmh var1);

   public static record a(int e) implements dme {
      public static final Codec<dme.a> d = Codec.intRange(djk.e, djk.d).fieldOf("above_bottom").xmap(dme.a::new, dme.a::c).codec();

      @Override
      public int a(dmh $$0) {
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

   public static record b(int e) implements dme {
      public static final Codec<dme.b> d = Codec.intRange(djk.e, djk.d).fieldOf("absolute").xmap(dme.b::new, dme.b::c).codec();

      @Override
      public int a(dmh $$0) {
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

   public static record c(int e) implements dme {
      public static final Codec<dme.c> d = Codec.intRange(djk.e, djk.d).fieldOf("below_top").xmap(dme.c::new, dme.c::c).codec();

      @Override
      public int a(dmh $$0) {
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
