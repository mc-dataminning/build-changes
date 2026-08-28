import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class aqv {
   private static final int c = 33;
   private static final int d = 32;
   private static final int e = 31;
   private static final eef f = eeb.a.a(eec.n);
   public static final int a = f.c().c();
   public static final int b = 33 + a;

   @Nullable
   public static eec a(int $$0) {
      return a($$0 - 33, null);
   }

   @Nullable
   @Contract("_,!null->!null;_,_->_")
   public static eec a(int $$0, @Nullable eec $$1) {
      if ($$0 > a) {
         return $$1;
      } else {
         return $$0 <= 0 ? eec.n : f.c().a($$0);
      }
   }

   public static eec b(int $$0) {
      return a($$0, eec.c);
   }

   public static int a(eec $$0) {
      return 33 + f.a($$0);
   }

   public static arg c(int $$0) {
      if ($$0 <= 31) {
         return arg.d;
      } else if ($$0 <= 32) {
         return arg.c;
      } else {
         return $$0 <= 33 ? arg.b : arg.a;
      }
   }

   public static int a(arg $$0) {
      return switch ($$0) {
         case a -> b;
         case b -> 33;
         case c -> 32;
         case d -> 31;
      };
   }

   public static boolean d(int $$0) {
      return $$0 <= 31;
   }

   public static boolean e(int $$0) {
      return $$0 <= 32;
   }

   public static boolean f(int $$0) {
      return $$0 <= b;
   }
}
