import org.joml.Vector3f;

public class flj extends fko {
   public static final float b = 4.5F;
   private static final Vector3f c = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final int d = 16;
   private static final int o = 16;
   private final ajt p = new ajt("textures/gui/hanging_signs/" + this.a.b() + ".png");

   public flj(dnp $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2, wg.c("hanging_sign.edit"));
   }

   @Override
   protected void b(fdc $$0, doz $$1) {
      $$0.c().a((float)this.k / 2.0F, 125.0F, 50.0F);
   }

   @Override
   protected void a(fdc $$0, doz $$1) {
      $$0.c().a(0.0F, -13.0F, 0.0F);
      $$0.c().b(4.5F, 4.5F, 1.0F);
      $$0.a(this.p, -8, -8, 0.0F, 0.0F, 16, 16, 16, 16);
   }

   @Override
   protected Vector3f m() {
      return c;
   }
}
