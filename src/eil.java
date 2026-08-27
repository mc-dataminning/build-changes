import com.mojang.blaze3d.systems.RenderSystem;

public class eil {
   private static final int a = 8388608;
   private static final int b = 2097152;
   private final eie c;
   private static final eil d = new eil();

   public static eil a() {
      RenderSystem.assertOnGameThreadOrInit();
      return d;
   }

   public eil(int $$0) {
      this.c = new eie($$0);
   }

   public eil() {
      this(2097152);
   }

   public void b() {
      eif.a(this.c.d());
   }

   public eie c() {
      return this.c;
   }
}
