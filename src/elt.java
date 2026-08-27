import com.mojang.blaze3d.systems.RenderSystem;

public class elt {
   private static final int a = 8388608;
   private static final int b = 2097152;
   private final elm c;
   private static final elt d = new elt();

   public static elt a() {
      RenderSystem.assertOnGameThreadOrInit();
      return d;
   }

   public elt(int $$0) {
      this.c = new elm($$0);
   }

   public elt() {
      this(2097152);
   }

   public void b() {
      eln.a(this.c.d());
   }

   public elm c() {
      return this.c;
   }
}
