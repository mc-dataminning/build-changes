import java.util.Optional;

public class dge {
   private static final arv a = new arv(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(hb $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<hb> a(int $$0) {
      hb $$1 = switch ($$0) {
         case 0 -> hb.c;
         case 4 -> hb.f;
         case 8 -> hb.d;
         case 12 -> hb.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
