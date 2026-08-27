import java.util.Optional;

public class dmp {
   private static final awr a = new awr(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(ie $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<ie> a(int $$0) {
      ie $$1 = switch ($$0) {
         case 0 -> ie.c;
         case 4 -> ie.f;
         case 8 -> ie.d;
         case 12 -> ie.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
