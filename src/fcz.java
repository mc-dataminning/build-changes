import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryUtil;

public class fcz {
   public static void a() {
      MemoryUtil.memSet(0L, 0, 1L);
   }

   public static double b() {
      return GLFW.glfwGetTime();
   }

   private fcz() {
   }
}
