import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class eyx {
   private final long a;
   private final List<ezb> b;
   private ezb c;
   private int d;
   private int e;

   public eyx(long $$0) {
      this.a = $$0;
      this.b = Lists.newArrayList();
      this.a();
   }

   public void a() {
      RenderSystem.assertInInitPhase();
      this.b.clear();
      Buffer $$0 = GLFW.glfwGetVideoModes(this.a);

      for (int $$1 = $$0.limit() - 1; $$1 >= 0; $$1--) {
         $$0.position($$1);
         ezb $$2 = new ezb($$0);
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
      this.c = new ezb($$5);
   }

   public ezb a(Optional<ezb> $$0) {
      RenderSystem.assertInInitPhase();
      if ($$0.isPresent()) {
         ezb $$1 = $$0.get();

         for (ezb $$2 : this.b) {
            if ($$2.equals($$1)) {
               return $$2;
            }
         }
      }

      return this.b();
   }

   public int a(ezb $$0) {
      RenderSystem.assertInInitPhase();
      return this.b.indexOf($$0);
   }

   public ezb b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public ezb a(int $$0) {
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
