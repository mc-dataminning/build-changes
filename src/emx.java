import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class emx {
   private static final Vector3f a = new Vector3f(0.2F, 1.0F, -0.7F).normalize();
   private static final Vector3f b = new Vector3f(-0.2F, 1.0F, 0.7F).normalize();
   private static final Vector3f c = new Vector3f(0.2F, 1.0F, -0.7F).normalize();
   private static final Vector3f d = new Vector3f(-0.2F, -1.0F, 0.7F).normalize();
   private static final Vector3f e = new Vector3f(0.2F, -1.0F, -1.0F).normalize();
   private static final Vector3f f = new Vector3f(-0.2F, -1.0F, 0.0F).normalize();

   public static void a(Matrix4f $$0) {
      RenderSystem.setupLevelDiffuseLighting(c, d, $$0);
   }

   public static void b(Matrix4f $$0) {
      RenderSystem.setupLevelDiffuseLighting(a, b, $$0);
   }

   public static void a() {
      RenderSystem.setupGuiFlatDiffuseLighting(a, b);
   }

   public static void b() {
      RenderSystem.setupGui3DDiffuseLighting(a, b);
   }

   public static void c() {
      RenderSystem.setShaderLights(e, f);
   }
}
