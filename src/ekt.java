import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;

public class ekt extends ekv {
   private static final eko a = new eko() {
      @Override
      public String a(boolean $$0, String $$1) {
         return "#error Import statement not supported";
      }
   };
   private int b;

   private ekt(ekv.a $$0, int $$1, String $$2) {
      super($$0, $$1, $$2);
   }

   public void a(eks $$0) {
      RenderSystem.assertOnRenderThread();
      this.b++;
      this.a($$0);
   }

   @Override
   public void a() {
      RenderSystem.assertOnRenderThread();
      this.b--;
      if (this.b <= 0) {
         super.a();
      }
   }

   public static ekt a(ekv.a $$0, String $$1, InputStream $$2, String $$3) throws IOException {
      RenderSystem.assertOnRenderThread();
      int $$4 = b($$0, $$1, $$2, $$3, a);
      ekt $$5 = new ekt($$0, $$4, $$1);
      $$0.c().put($$1, $$5);
      return $$5;
   }
}
