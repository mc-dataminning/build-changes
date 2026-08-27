import org.joml.Vector3f;

public class fdy extends fdd {
   public static final float b = 4.5F;
   private static final Vector3f c = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final int k = 16;
   private static final int l = 16;
   private final agt m = new agt("textures/gui/hanging_signs/" + this.a.b() + ".png");

   public fdy(dhm $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2, vb.c("hanging_sign.edit"));
   }

   @Override
   protected void b(evw $$0, dip $$1) {
      $$0.c().a((float)this.g / 2.0F, 125.0F, 50.0F);
   }

   @Override
   protected void a(evw $$0, dip $$1) {
      $$0.c().a(0.0F, -13.0F, 0.0F);
      $$0.c().b(4.5F, 4.5F, 1.0F);
      $$0.a(this.m, -8, -8, 0.0F, 0.0F, 16, 16, 16, 16);
   }

   @Override
   protected Vector3f l() {
      return c;
   }
}
