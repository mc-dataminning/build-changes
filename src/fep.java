import org.joml.Vector3f;

public class fep extends fdu {
   public static final float b = 4.5F;
   private static final Vector3f c = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final int k = 16;
   private static final int l = 16;
   private final ahd m = new ahd("textures/gui/hanging_signs/" + this.a.b() + ".png");

   public fep(dhx $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2, vd.c("hanging_sign.edit"));
   }

   @Override
   protected void b(ewm $$0, dja $$1) {
      $$0.c().a((float)this.g / 2.0F, 125.0F, 50.0F);
   }

   @Override
   protected void a(ewm $$0, dja $$1) {
      $$0.c().a(0.0F, -13.0F, 0.0F);
      $$0.c().b(4.5F, 4.5F, 1.0F);
      $$0.a(this.m, -8, -8, 0.0F, 0.0F, 16, 16, 16, 16);
   }

   @Override
   protected Vector3f n() {
      return c;
   }
}
