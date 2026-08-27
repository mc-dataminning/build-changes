import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dlb {
   Codec<dlb> a = aqw.a(dlb.b.d, aqw.a(dlb.a.d, dlb.c.d)).xmap(dlb::a, dlb::a);
   dlb b = b(0);
   dlb c = c(0);

   static dlb a(int $$0) {
      return new dlb.b($$0);
   }

   static dlb b(int $$0) {
      return new dlb.a($$0);
   }

   static dlb c(int $$0) {
      return new dlb.c($$0);
   }

   static dlb a() {
      return b;
   }

   static dlb b() {
      return c;
   }

   private static dlb a(Either<dlb.b, Either<dlb.a, dlb.c>> $$0) {
      return (dlb)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dlb.b, Either<dlb.a, dlb.c>> a(dlb $$0) {
      return $$0 instanceof dlb.b ? Either.left((dlb.b)$$0) : Either.right($$0 instanceof dlb.a ? Either.left((dlb.a)$$0) : Either.right((dlb.c)$$0));
   }

   int a(dle var1);

   public static record a(int e) implements dlb {
      public static final Codec<dlb.a> d = Codec.intRange(dih.e, dih.d).fieldOf("above_bottom").xmap(dlb.a::new, dlb.a::c).codec();

      @Override
      public int a(dle $$0) {
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

   public static record b(int e) implements dlb {
      public static final Codec<dlb.b> d = Codec.intRange(dih.e, dih.d).fieldOf("absolute").xmap(dlb.b::new, dlb.b::c).codec();

      @Override
      public int a(dle $$0) {
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

   public static record c(int e) implements dlb {
      public static final Codec<dlb.c> d = Codec.intRange(dih.e, dih.d).fieldOf("below_top").xmap(dlb.c::new, dlb.c::c).codec();

      @Override
      public int a(dle $$0) {
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
