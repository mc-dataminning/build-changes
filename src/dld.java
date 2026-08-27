import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dld {
   Codec<dld> a = aqy.a(dld.b.d, aqy.a(dld.a.d, dld.c.d)).xmap(dld::a, dld::a);
   dld b = b(0);
   dld c = c(0);

   static dld a(int $$0) {
      return new dld.b($$0);
   }

   static dld b(int $$0) {
      return new dld.a($$0);
   }

   static dld c(int $$0) {
      return new dld.c($$0);
   }

   static dld a() {
      return b;
   }

   static dld b() {
      return c;
   }

   private static dld a(Either<dld.b, Either<dld.a, dld.c>> $$0) {
      return (dld)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dld.b, Either<dld.a, dld.c>> a(dld $$0) {
      return $$0 instanceof dld.b ? Either.left((dld.b)$$0) : Either.right($$0 instanceof dld.a ? Either.left((dld.a)$$0) : Either.right((dld.c)$$0));
   }

   int a(dlg var1);

   public static record a(int e) implements dld {
      public static final Codec<dld.a> d = Codec.intRange(dij.e, dij.d).fieldOf("above_bottom").xmap(dld.a::new, dld.a::c).codec();

      @Override
      public int a(dlg $$0) {
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

   public static record b(int e) implements dld {
      public static final Codec<dld.b> d = Codec.intRange(dij.e, dij.d).fieldOf("absolute").xmap(dld.b::new, dld.b::c).codec();

      @Override
      public int a(dlg $$0) {
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

   public static record c(int e) implements dld {
      public static final Codec<dld.c> d = Codec.intRange(dij.e, dij.d).fieldOf("below_top").xmap(dld.c::new, dld.c::c).codec();

      @Override
      public int a(dlg $$0) {
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
