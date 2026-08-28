import javax.annotation.Nullable;

public class azx {
   @Nullable
   private static byte[] a;

   public static void a() {
      a = new byte[10485760];
   }

   public static void b() {
      if (a != null) {
         a = null;

         try {
            System.gc();
            System.gc();
            System.gc();
         } catch (Throwable var1) {
         }
      }
   }
}
