import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ewt {
   private static final Vector3f a = new Vector3f(0.2F, 1.0F, -0.7F).normalize();
   private static final Vector3f b = new Vector3f(-0.2F, 1.0F, 0.7F).normalize();
   private static final Vector3f c = new Vector3f(0.2F, 1.0F, -0.7F).normalize();
   private static final Vector3f d = new Vector3f(-0.2F, -1.0F, 0.7F).normalize();
   private static final Vector3f e = new Vector3f(0.2F, -1.0F, 1.0F).normalize();
   private static final Vector3f f = new Vector3f(-0.2F, -1.0F, 0.0F).normalize();

   public static void a() {
      RenderSystem.setupLevelDiffuseLighting(c, d);
   }

   public static void b() {
      RenderSystem.setupLevelDiffuseLighting(a, b);
   }

   public static void c() {
      RenderSystem.setupGuiFlatDiffuseLighting(a, b);
   }

   public static void d() {
      RenderSystem.setupGui3DDiffuseLighting(a, b);
   }

   public static void e() {
      RenderSystem.setShaderLights(e, f);
   }

   public static void a(Quaternionf $$0) {
      RenderSystem.setShaderLights($$0.transform(e, new Vector3f()), $$0.transform(f, new Vector3f()));
   }
}
