import com.mojang.blaze3d.systems.RenderSystem;

public class fgr {
   public static final akn a = new akn("textures/gui/title/minecraft.png");
   public static final akn b = new akn("textures/gui/title/minceraft.png");
   public static final akn c = new akn("textures/gui/title/edition.png");
   public static final int d = 256;
   public static final int e = 44;
   private static final int g = 256;
   private static final int h = 64;
   private static final int i = 128;
   private static final int j = 14;
   private static final int k = 128;
   private static final int l = 16;
   public static final int f = 30;
   private static final int m = 7;
   private final boolean n = (double)aym.a().i() < 1.0E-4;
   private final boolean o;

   public fgr(boolean $$0) {
      this.o = $$0;
   }

   public void a(ffn $$0, int $$1, float $$2) {
      this.a($$0, $$1, $$2, 30);
   }

   public void a(ffn $$0, int $$1, float $$2, int $$3) {
      $$0.a(1.0F, 1.0F, 1.0F, this.o ? 1.0F : $$2);
      RenderSystem.enableBlend();
      int $$4 = $$1 / 2 - 128;
      $$0.a(this.n ? b : a, $$4, $$3, 0.0F, 0.0F, 256, 44, 256, 64);
      int $$5 = $$1 / 2 - 64;
      int $$6 = $$3 + 44 - 7;
      $$0.a(c, $$5, $$6, 0.0F, 0.0F, 128, 14, 128, 16);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
   }
}
