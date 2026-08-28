public class fsh {
   public static final ale a = ale.b("textures/gui/title/minecraft.png");
   public static final ale b = ale.b("textures/gui/title/minceraft.png");
   public static final ale c = ale.b("textures/gui/title/edition.png");
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
   private final boolean n = (double)azt.a().i() < 1.0E-4;
   private final boolean o;

   public fsh(boolean $$0) {
      this.o = $$0;
   }

   public void a(frc $$0, int $$1, float $$2) {
      this.a($$0, $$1, $$2, 30);
   }

   public void a(frc $$0, int $$1, float $$2, int $$3) {
      int $$4 = $$1 / 2 - 128;
      float $$5 = this.o ? 1.0F : $$2;
      int $$6 = axu.a($$5);
      $$0.a(gpn::H, this.n ? b : a, $$4, $$3, 0.0F, 0.0F, 256, 44, 256, 64, $$6);
      int $$7 = $$1 / 2 - 64;
      int $$8 = $$3 + 44 - 7;
      $$0.a(gpn::H, c, $$7, $$8, 0.0F, 0.0F, 128, 14, 128, 16, $$6);
   }
}
