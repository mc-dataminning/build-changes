import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dlg {
   Codec<dlg> a = arj.a(dlg.b.d, arj.a(dlg.a.d, dlg.c.d)).xmap(dlg::a, dlg::a);
   dlg b = b(0);
   dlg c = c(0);

   static dlg a(int $$0) {
      return new dlg.b($$0);
   }

   static dlg b(int $$0) {
      return new dlg.a($$0);
   }

   static dlg c(int $$0) {
      return new dlg.c($$0);
   }

   static dlg a() {
      return b;
   }

   static dlg b() {
      return c;
   }

   private static dlg a(Either<dlg.b, Either<dlg.a, dlg.c>> $$0) {
      return (dlg)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dlg.b, Either<dlg.a, dlg.c>> a(dlg $$0) {
      return $$0 instanceof dlg.b ? Either.left((dlg.b)$$0) : Either.right($$0 instanceof dlg.a ? Either.left((dlg.a)$$0) : Either.right((dlg.c)$$0));
   }

   int a(dlj var1);

   public static record a(int e) implements dlg {
      public static final Codec<dlg.a> d = Codec.intRange(dim.e, dim.d).fieldOf("above_bottom").xmap(dlg.a::new, dlg.a::c).codec();

      @Override
      public int a(dlj $$0) {
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

   public static record b(int e) implements dlg {
      public static final Codec<dlg.b> d = Codec.intRange(dim.e, dim.d).fieldOf("absolute").xmap(dlg.b::new, dlg.b::c).codec();

      @Override
      public int a(dlj $$0) {
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

   public static record c(int e) implements dlg {
      public static final Codec<dlg.c> d = Codec.intRange(dim.e, dim.d).fieldOf("below_top").xmap(dlg.c::new, dlg.c::c).codec();

      @Override
      public int a(dlj $$0) {
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
