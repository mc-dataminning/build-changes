import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;

public class ers {
   public static final int a = 65545;
   private final ByteBuffer b = BufferUtils.createByteBuffer(8192);

   public String a(long $$0, GLFWErrorCallbackI $$1) {
      GLFWErrorCallback $$2 = GLFW.glfwSetErrorCallback($$1);
      String $$3 = GLFW.glfwGetClipboardString($$0);
      $$3 = $$3 != null ? axf.a($$3) : "";
      GLFWErrorCallback $$4 = GLFW.glfwSetErrorCallback($$2);
      if ($$4 != null) {
         $$4.free();
      }

      return $$3;
   }

   private static void a(long $$0, ByteBuffer $$1, byte[] $$2) {
      $$1.clear();
      $$1.put($$2);
      $$1.put((byte)0);
      $$1.flip();
      GLFW.glfwSetClipboardString($$0, $$1);
   }

   public void a(long $$0, String $$1) {
      byte[] $$2 = $$1.getBytes(Charsets.UTF_8);
      int $$3 = $$2.length + 1;
      if ($$3 < this.b.capacity()) {
         a($$0, this.b, $$2);
      } else {
         ByteBuffer $$4 = MemoryUtil.memAlloc($$3);

         try {
            a($$0, $$4, $$2);
         } finally {
            MemoryUtil.memFree($$4);
         }
      }
   }
}
