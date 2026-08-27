import com.mojang.blaze3d.systems.RenderSystem;

public class fje {
   public static final akt a = new akt("nothingtoseeheremovealong", "textures/gui/title/poisonous_potato_logo.png");
   public static final int b = 256;
   public static final int c = 44;
   private static final int e = 256;
   private static final int f = 128;
   public static final int d = 30;
   private final boolean g;

   public fje(boolean $$0) {
      this.g = $$0;
   }

   public void a(fia $$0, int $$1, float $$2) {
      this.a($$0, $$1, $$2, 30);
   }

   public void a(fia $$0, int $$1, float $$2, int $$3) {
      $$0.a(1.0F, 1.0F, 1.0F, this.g ? 1.0F : $$2);
      RenderSystem.enableBlend();
      int $$4 = $$1 / 2 - 128;
      $$0.a(a, $$4, $$3, 0.0F, 0.0F, 256, 128, 256, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
   }
}
