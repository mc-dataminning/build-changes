import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class fke {
   private final long a;
   private final List<fkj> b;
   private fkj c;
   private int d;
   private int e;

   public fke(long $$0) {
      this.a = $$0;
      this.b = Lists.newArrayList();
      this.a();
   }

   public void a() {
      this.b.clear();
      Buffer $$0 = GLFW.glfwGetVideoModes(this.a);

      for (int $$1 = $$0.limit() - 1; $$1 >= 0; $$1--) {
         $$0.position($$1);
         fkj $$2 = new fkj($$0);
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
      this.c = new fkj($$5);
   }

   public fkj a(Optional<fkj> $$0) {
      if ($$0.isPresent()) {
         fkj $$1 = $$0.get();

         for (fkj $$2 : this.b) {
            if ($$2.equals($$1)) {
               return $$2;
            }
         }
      }

      return this.b();
   }

   public int a(fkj $$0) {
      return this.b.indexOf($$0);
   }

   public fkj b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public fkj a(int $$0) {
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
