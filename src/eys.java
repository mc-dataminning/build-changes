import java.util.concurrent.ConcurrentLinkedQueue;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryUtil;

public class eys {
   public static void a(ezn $$0, float $$1) {
      ConcurrentLinkedQueue<ezm> $$2 = $$0.i();
   }

   public static void b(ezn $$0, float $$1) {
      ConcurrentLinkedQueue<ezm> $$2 = $$0.j();
   }

   public static void a() {
      MemoryUtil.memSet(0L, 0, 1L);
   }

   public static double b() {
      return GLFW.glfwGetTime();
   }
}
