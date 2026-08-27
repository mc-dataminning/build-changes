import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dlm {
   Codec<dlm> a = arg.a(dlm.b.d, arg.a(dlm.a.d, dlm.c.d)).xmap(dlm::a, dlm::a);
   dlm b = b(0);
   dlm c = c(0);

   static dlm a(int $$0) {
      return new dlm.b($$0);
   }

   static dlm b(int $$0) {
      return new dlm.a($$0);
   }

   static dlm c(int $$0) {
      return new dlm.c($$0);
   }

   static dlm a() {
      return b;
   }

   static dlm b() {
      return c;
   }

   private static dlm a(Either<dlm.b, Either<dlm.a, dlm.c>> $$0) {
      return (dlm)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dlm.b, Either<dlm.a, dlm.c>> a(dlm $$0) {
      return $$0 instanceof dlm.b ? Either.left((dlm.b)$$0) : Either.right($$0 instanceof dlm.a ? Either.left((dlm.a)$$0) : Either.right((dlm.c)$$0));
   }

   int a(dlp var1);

   public static record a(int e) implements dlm {
      public static final Codec<dlm.a> d = Codec.intRange(dis.e, dis.d).fieldOf("above_bottom").xmap(dlm.a::new, dlm.a::c).codec();

      @Override
      public int a(dlp $$0) {
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

   public static record b(int e) implements dlm {
      public static final Codec<dlm.b> d = Codec.intRange(dis.e, dis.d).fieldOf("absolute").xmap(dlm.b::new, dlm.b::c).codec();

      @Override
      public int a(dlp $$0) {
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

   public static record c(int e) implements dlm {
      public static final Codec<dlm.c> d = Codec.intRange(dis.e, dis.d).fieldOf("below_top").xmap(dlm.c::new, dlm.c::c).codec();

      @Override
      public int a(dlp $$0) {
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
