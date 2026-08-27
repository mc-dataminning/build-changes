import com.mojang.blaze3d.systems.RenderSystem;

public class ell {
   private static final int a = 8388608;
   private static final int b = 2097152;
   private final ele c;
   private static final ell d = new ell();

   public static ell a() {
      RenderSystem.assertOnGameThreadOrInit();
      return d;
   }

   public ell(int $$0) {
      this.c = new ele($$0);
   }

   public ell() {
      this(2097152);
   }

   public void b() {
      elf.a(this.c.d());
   }

   public ele c() {
      return this.c;
   }
}
