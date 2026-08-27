import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;

public class epw extends epy {
   private static final epr a = new epr() {
      @Override
      public String a(boolean $$0, String $$1) {
         return "#error Import statement not supported";
      }
   };
   private int b;

   private epw(epy.a $$0, int $$1, String $$2) {
      super($$0, $$1, $$2);
   }

   public void a(epv $$0) {
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

   public static epw a(epy.a $$0, String $$1, InputStream $$2, String $$3) throws IOException {
      RenderSystem.assertOnRenderThread();
      int $$4 = b($$0, $$1, $$2, $$3, a);
      epw $$5 = new epw($$0, $$4, $$1);
      $$0.c().put($$1, $$5);
      return $$5;
   }
}
