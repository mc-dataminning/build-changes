import com.mojang.blaze3d.platform.GLX;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import org.lwjgl.system.Pointer;

public class ert {
   @Nullable
   private static final MethodHandle a = GLX.make(() -> {
      try {
         Lookup $$0 = MethodHandles.lookup();
         Class<?> $$1 = Class.forName("org.lwjgl.system.MemoryManage$DebugAllocator");
         Method $$2 = $$1.getDeclaredMethod("untrack", long.class);
         $$2.setAccessible(true);
         Field $$3 = Class.forName("org.lwjgl.system.MemoryUtil$LazyInit").getDeclaredField("ALLOCATOR");
         $$3.setAccessible(true);
         Object $$4 = $$3.get(null);
         return $$1.isInstance($$4) ? $$0.unreflect($$2) : null;
      } catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException | ClassNotFoundException var5) {
         throw new RuntimeException(var5);
      }
   });

   public static void a(long $$0) {
      if (a != null) {
         try {
            a.invoke((long)$$0);
         } catch (Throwable var3) {
            throw new RuntimeException(var3);
         }
      }
   }

   public static void a(Pointer $$0) {
      a($$0.address());
   }
}
