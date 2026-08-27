import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;

public class eye extends eyg {
   private static final exz a = new exz() {
      @Override
      public String a(boolean $$0, String $$1) {
         return "#error Import statement not supported";
      }
   };
   private int b;

   private eye(eyg.a $$0, int $$1, String $$2) {
      super($$0, $$1, $$2);
   }

   public void a(eyd $$0) {
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

   public static eye a(eyg.a $$0, String $$1, InputStream $$2, String $$3) throws IOException {
      RenderSystem.assertOnRenderThread();
      int $$4 = b($$0, $$1, $$2, $$3, a);
      eye $$5 = new eye($$0, $$4, $$1);
      $$0.c().put($$1, $$5);
      return $$5;
   }
}
