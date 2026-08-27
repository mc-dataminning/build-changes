import java.util.concurrent.ConcurrentLinkedQueue;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryUtil;

public class ega {
   public static void a(egu $$0, float $$1) {
      ConcurrentLinkedQueue<egt> $$2 = $$0.i();
   }

   public static void b(egu $$0, float $$1) {
      ConcurrentLinkedQueue<egt> $$2 = $$0.j();
   }

   public static void a() {
      MemoryUtil.memSet(0L, 0, 1L);
   }

   public static double b() {
      return GLFW.glfwGetTime();
   }
}
