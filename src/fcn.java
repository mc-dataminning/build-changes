import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Optional;
import javax.annotation.Nullable;
import org.lwjgl.opengl.ARBTimerQuery;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL32C;

public class fcn {
   private int a;

   public static Optional<fcn> a() {
      return fcn.b.a;
   }

   public void b() {
      RenderSystem.assertOnRenderThread();
      if (this.a != 0) {
         throw new IllegalStateException("Current profile not ended");
      } else {
         this.a = GL32C.glGenQueries();
         GL32C.glBeginQuery(35007, this.a);
      }
   }

   public fcn.a c() {
      RenderSystem.assertOnRenderThread();
      if (this.a == 0) {
         throw new IllegalStateException("endProfile called before beginProfile");
      } else {
         GL32C.glEndQuery(35007);
         fcn.a $$0 = new fcn.a(this.a);
         this.a = 0;
         return $$0;
      }
   }

   public static class a {
      private static final long a = 0L;
      private static final long b = -1L;
      private final int c;
      private long d;

      a(int $$0) {
         this.c = $$0;
      }

      public void a() {
         RenderSystem.assertOnRenderThread();
         if (this.d == 0L) {
            this.d = -1L;
            GL32C.glDeleteQueries(this.c);
         }
      }

      public boolean b() {
         RenderSystem.assertOnRenderThread();
         if (this.d != 0L) {
            return true;
         } else if (1 == GL32C.glGetQueryObjecti(this.c, 34919)) {
            this.d = ARBTimerQuery.glGetQueryObjecti64(this.c, 34918);
            GL32C.glDeleteQueries(this.c);
            return true;
         } else {
            return false;
         }
      }

      public long c() {
         RenderSystem.assertOnRenderThread();
         if (this.d == 0L) {
            this.d = ARBTimerQuery.glGetQueryObjecti64(this.c, 34918);
            GL32C.glDeleteQueries(this.c);
         }

         return this.d;
      }
   }

   static class b {
      static final Optional<fcn> a = Optional.ofNullable(a());

      private b() {
      }

      @Nullable
      private static fcn a() {
         return !GL.getCapabilities().GL_ARB_timer_query ? null : new fcn();
      }
   }
}
