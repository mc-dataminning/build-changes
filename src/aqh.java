import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class aqh {
   private static final int c = 33;
   private static final int d = 32;
   private static final int e = 31;
   private static final dzx f = dzt.a.a(dzu.n);
   public static final int a = f.c().c();
   public static final int b = 33 + a;

   @Nullable
   public static dzu a(int $$0) {
      return a($$0 - 33, null);
   }

   @Nullable
   @Contract("_,!null->!null;_,_->_")
   public static dzu a(int $$0, @Nullable dzu $$1) {
      if ($$0 > a) {
         return $$1;
      } else {
         return $$0 <= 0 ? dzu.n : f.c().a($$0);
      }
   }

   public static dzu b(int $$0) {
      return a($$0, dzu.c);
   }

   public static int a(dzu $$0) {
      return 33 + f.a($$0);
   }

   public static aqs c(int $$0) {
      if ($$0 <= 31) {
         return aqs.d;
      } else if ($$0 <= 32) {
         return aqs.c;
      } else {
         return $$0 <= 33 ? aqs.b : aqs.a;
      }
   }

   public static int a(aqs $$0) {
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
