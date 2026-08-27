import com.mojang.blaze3d.systems.RenderSystem;

public class elm {
   private static final int a = 8388608;
   private static final int b = 2097152;
   private final elf c;
   private static final elm d = new elm();

   public static elm a() {
      RenderSystem.assertOnGameThreadOrInit();
      return d;
   }

   public elm(int $$0) {
      this.c = new elf($$0);
   }

   public elm() {
      this(2097152);
   }

   public void b() {
      elg.a(this.c.d());
   }

   public elf c() {
      return this.c;
   }
}
