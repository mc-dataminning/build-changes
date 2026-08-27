import ca.weblite.objc.Client;
import ca.weblite.objc.NSObject;
import com.sun.jna.Pointer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Optional;
import org.lwjgl.glfw.GLFWNativeCocoa;

public class ekm {
   private static final int a = 16384;

   public static void a(long $$0) {
      b($$0).filter(ekm::a).ifPresent(ekm::b);
   }

   private static Optional<NSObject> b(long $$0) {
      long $$1 = GLFWNativeCocoa.glfwGetCocoaWindow($$0);
      return $$1 != 0L ? Optional.of(new NSObject(new Pointer($$1))) : Optional.empty();
   }

   private static boolean a(NSObject $$0) {
      return ((Long)$$0.sendRaw("styleMask", new Object[0]) & 16384L) == 16384L;
   }

   private static void b(NSObject $$0) {
      $$0.send("toggleFullScreen:", new Object[]{Pointer.NULL});
   }

   public static void a(anl<InputStream> $$0) throws IOException {
      try (InputStream $$1 = $$0.get()) {
         String $$2 = Base64.getEncoder().encodeToString($$1.readAllBytes());
         Client $$3 = Client.getInstance();
         Object $$4 = $$3.sendProxy("NSData", "alloc", new Object[0]).send("initWithBase64Encoding:", new Object[]{$$2});
         Object $$5 = $$3.sendProxy("NSImage", "alloc", new Object[0]).send("initWithData:", new Object[]{$$4});
         $$3.sendProxy("NSApplication", "sharedApplication", new Object[0]).send("setApplicationIconImage:", new Object[]{$$5});
      }
   }
}
