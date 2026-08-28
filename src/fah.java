import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class fah {
   private final long a;
   private final List<fal> b;
   private fal c;
   private int d;
   private int e;

   public fah(long $$0) {
      this.a = $$0;
      this.b = Lists.newArrayList();
      this.a();
   }

   public void a() {
      this.b.clear();
      Buffer $$0 = GLFW.glfwGetVideoModes(this.a);

      for (int $$1 = $$0.limit() - 1; $$1 >= 0; $$1--) {
         $$0.position($$1);
         fal $$2 = new fal($$0);
         if ($$2.c() >= 8 && $$2.d() >= 8 && $$2.e() >= 8) {
            this.b.add($$2);
         }
      }

      int[] $$3 = new int[1];
      int[] $$4 = new int[1];
      GLFW.glfwGetMonitorPos(this.a, $$3, $$4);
      this.d = $$3[0];
      this.e = $$4[0];
      GLFWVidMode $$5 = GLFW.glfwGetVideoMode(this.a);
      this.c = new fal($$5);
   }

   public fal a(Optional<fal> $$0) {
      if ($$0.isPresent()) {
         fal $$1 = $$0.get();

         for (fal $$2 : this.b) {
            if ($$2.equals($$1)) {
               return $$2;
            }
         }
      }

      return this.b();
   }

   public int a(fal $$0) {
      return this.b.indexOf($$0);
   }

   public fal b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public fal a(int $$0) {
      return this.b.get($$0);
   }

   public int e() {
      return this.b.size();
   }

   public long f() {
      return this.a;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "Monitor[%s %sx%s %s]", this.a, this.d, this.e, this.c);
   }
}
