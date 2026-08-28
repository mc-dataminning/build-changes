import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eed {
   Codec<eed> a = Codec.xor(eed.b.d, Codec.xor(eed.a.d, eed.c.d)).xmap(eed::a, eed::a);
   eed b = b(0);
   eed c = c(0);

   static eed a(int $$0) {
      return new eed.b($$0);
   }

   static eed b(int $$0) {
      return new eed.a($$0);
   }

   static eed c(int $$0) {
      return new eed.c($$0);
   }

   static eed a() {
      return b;
   }

   static eed b() {
      return c;
   }

   private static eed a(Either<eed.b, Either<eed.a, eed.c>> $$0) {
      return (eed)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eed.b, Either<eed.a, eed.c>> a(eed $$0) {
      return $$0 instanceof eed.b ? Either.left((eed.b)$$0) : Either.right($$0 instanceof eed.a ? Either.left((eed.a)$$0) : Either.right((eed.c)$$0));
   }

   int a(eeg var1);

   public static record a(int e) implements eed {
      public static final Codec<eed.a> d = Codec.intRange(ebj.e, ebj.d).fieldOf("above_bottom").xmap(eed.a::new, eed.a::c).codec();

      @Override
      public int a(eeg $$0) {
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

   public static record b(int e) implements eed {
      public static final Codec<eed.b> d = Codec.intRange(ebj.e, ebj.d).fieldOf("absolute").xmap(eed.b::new, eed.b::c).codec();

      @Override
      public int a(eeg $$0) {
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

   public static record c(int e) implements eed {
      public static final Codec<eed.c> d = Codec.intRange(ebj.e, ebj.d).fieldOf("below_top").xmap(eed.c::new, eed.c::c).codec();

      @Override
      public int a(eeg $$0) {
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
