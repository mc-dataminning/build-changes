import ca.weblite.objc.Client;
import ca.weblite.objc.NSObject;
import com.sun.jna.Pointer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Locale;
import java.util.Optional;
import org.lwjgl.glfw.GLFWNativeCocoa;

public class fkf {
   public static final boolean a = System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("mac");
   private static final int b = 8;
   private static final int c = 16384;

   public static void a(long $$0) {
      c($$0).filter(fkf::a).ifPresent(fkf::c);
   }

   public static void b(long $$0) {
      c($$0).ifPresent($$0x -> {
         long $$1 = b($$0x);
         $$0x.send("setStyleMask:", new Object[]{$$1 & -9L});
      });
   }

   private static Optional<NSObject> c(long $$0) {
      long $$1 = GLFWNativeCocoa.glfwGetCocoaWindow($$0);
      return $$1 != 0L ? Optional.of(new NSObject(new Pointer($$1))) : Optional.empty();
   }

   private static boolean a(NSObject $$0) {
      return (b($$0) & 16384L) != 0L;
   }

   private static long b(NSObject $$0) {
      return (Long)$$0.sendRaw("styleMask", new Object[0]);
   }

   private static void c(NSObject $$0) {
      $$0.send("toggleFullScreen:", new Object[]{Pointer.NULL});
   }

   public static void a(auz<InputStream> $$0) throws IOException {
      try (InputStream $$1 = $$0.get()) {
         String $$2 = Base64.getEncoder().encodeToString($$1.readAllBytes());
         Client $$3 = Client.getInstance();
         Object $$4 = $$3.sendProxy("NSData", "alloc", new Object[0]).send("initWithBase64Encoding:", new Object[]{$$2});
         Object $$5 = $$3.sendProxy("NSImage", "alloc", new Object[0]).send("initWithData:", new Object[]{$$4});
         $$3.sendProxy("NSApplication", "sharedApplication", new Object[0]).send("setApplicationIconImage:", new Object[]{$$5});
      }
   }
}
