import com.mojang.blaze3d.systems.RenderSystem;

public class fft {
   public static final int a = 8;
   public static final int b = 8;
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 40;
   public static final int f = 8;
   public static final int g = 8;
   public static final int h = 8;
   public static final int i = 64;
   public static final int j = 64;

   public static void a(feh $$0, gnn $$1, int $$2, int $$3, int $$4) {
      a($$0, $$1.a(), $$2, $$3, $$4);
   }

   public static void a(feh $$0, akf $$1, int $$2, int $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, true, false);
   }

   public static void a(feh $$0, akf $$1, int $$2, int $$3, int $$4, boolean $$5, boolean $$6) {
      int $$7 = 8 + ($$6 ? 8 : 0);
      int $$8 = 8 * ($$6 ? -1 : 1);
      $$0.a($$1, $$2, $$3, $$4, $$4, 8.0F, (float)$$7, 8, $$8, 64, 64);
      if ($$5) {
         a($$0, $$1, $$2, $$3, $$4, $$6);
      }
   }

   private static void a(feh $$0, akf $$1, int $$2, int $$3, int $$4, boolean $$5) {
      int $$6 = 8 + ($$5 ? 8 : 0);
      int $$7 = 8 * ($$5 ? -1 : 1);
      RenderSystem.enableBlend();
      $$0.a($$1, $$2, $$3, $$4, $$4, 40.0F, (float)$$6, 8, $$7, 64, 64);
      RenderSystem.disableBlend();
   }
}
