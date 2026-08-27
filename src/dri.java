import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dri {
   Codec<dri> a = avp.a(dri.b.d, avp.a(dri.a.d, dri.c.d)).xmap(dri::a, dri::a);
   dri b = b(0);
   dri c = c(0);

   static dri a(int $$0) {
      return new dri.b($$0);
   }

   static dri b(int $$0) {
      return new dri.a($$0);
   }

   static dri c(int $$0) {
      return new dri.c($$0);
   }

   static dri a() {
      return b;
   }

   static dri b() {
      return c;
   }

   private static dri a(Either<dri.b, Either<dri.a, dri.c>> $$0) {
      return (dri)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dri.b, Either<dri.a, dri.c>> a(dri $$0) {
      return $$0 instanceof dri.b ? Either.left((dri.b)$$0) : Either.right($$0 instanceof dri.a ? Either.left((dri.a)$$0) : Either.right((dri.c)$$0));
   }

   int a(drl var1);

   public static record a(int e) implements dri {
      public static final Codec<dri.a> d = Codec.intRange(doo.e, doo.d).fieldOf("above_bottom").xmap(dri.a::new, dri.a::c).codec();

      @Override
      public int a(drl $$0) {
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

   public static record b(int e) implements dri {
      public static final Codec<dri.b> d = Codec.intRange(doo.e, doo.d).fieldOf("absolute").xmap(dri.b::new, dri.b::c).codec();

      @Override
      public int a(drl $$0) {
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

   public static record c(int e) implements dri {
      public static final Codec<dri.c> d = Codec.intRange(doo.e, doo.d).fieldOf("below_top").xmap(dri.c::new, dri.c::c).codec();

      @Override
      public int a(drl $$0) {
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
