import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.MemoryUtil.MemoryAllocator;

public class esz {
   private static final MemoryAllocator a = MemoryUtil.getAllocator(false);

   public static ByteBuffer a(int $$0) {
      long $$1 = a.malloc((long)$$0);
      if ($$1 == 0L) {
         throw new OutOfMemoryError("Failed to allocate " + $$0 + " bytes");
      } else {
         return MemoryUtil.memByteBuffer($$1, $$0);
      }
   }

   public static ByteBuffer a(ByteBuffer $$0, int $$1) {
      long $$2 = a.realloc(MemoryUtil.memAddress0($$0), (long)$$1);
      if ($$2 == 0L) {
         throw new OutOfMemoryError("Failed to resize buffer from " + $$0.capacity() + " bytes to " + $$1 + " bytes");
      } else {
         return MemoryUtil.memByteBuffer($$2, $$1);
      }
   }

   public static void a(ByteBuffer $$0) {
      a.free(MemoryUtil.memAddress0($$0));
   }
}
