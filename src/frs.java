import com.mojang.logging.LogUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;
import org.slf4j.Logger;

public class frs {
   private static final Logger b = LogUtils.getLogger();
   public static final Object a = new Object();
   private static long c = 0L;

   public static long a() {
      synchronized (a) {
         if (c == 0L) {
            MemoryStack $$0 = MemoryStack.stackPush();

            try {
               PointerBuffer $$1 = $$0.mallocPointer(1);
               a(FreeType.FT_Init_FreeType($$1), "Initializing FreeType library");
               c = $$1.get();
            } catch (Throwable var6) {
               if ($$0 != null) {
                  try {
                     $$0.close();
                  } catch (Throwable var5) {
                     var6.addSuppressed(var5);
                  }
               }

               throw var6;
            }

            if ($$0 != null) {
               $$0.close();
            }
         }

         return c;
      }
   }

   public static void a(int $$0, String $$1) {
      if ($$0 != 0) {
         throw new IllegalStateException("FreeType error: " + a($$0) + " (" + $$1 + ")");
      }
   }

   public static boolean b(int $$0, String $$1) {
      if ($$0 != 0) {
         b.error("FreeType error: {} ({})", a($$0), $$1);
         return true;
      } else {
         return false;
      }
   }

   private static String a(int $$0) {
      String $$1 = FreeType.FT_Error_String($$0);
      return $$1 != null ? $$1 : "Unrecognized error: 0x" + Integer.toHexString($$0);
   }

   public static FT_Vector a(FT_Vector $$0, float $$1, float $$2) {
      long $$3 = (long)Math.round($$1 * 64.0F);
      long $$4 = (long)Math.round($$2 * 64.0F);
      return $$0.set($$3, $$4);
   }

   public static float a(FT_Vector $$0) {
      return (float)$$0.x() / 64.0F;
   }

   public static void b() {
      synchronized (a) {
         if (c != 0L) {
            FreeType.FT_Done_Library(c);
            c = 0L;
         }
      }
   }
}
