import org.joml.Vector3f;

public class foy extends foc {
   public static final float b = 4.5F;
   private static final Vector3f c = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final int q = 16;
   private static final int r = 16;
   private final akk s = new akk("textures/gui/hanging_signs/" + this.a.b() + ".png");

   public foy(drb $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2, wu.c("hanging_sign.edit"));
   }

   @Override
   protected void b(fhh $$0, dsl $$1) {
      $$0.c().a((float)this.m / 2.0F, 125.0F, 50.0F);
   }

   @Override
   protected void a(fhh $$0, dsl $$1) {
      $$0.c().a(0.0F, -13.0F, 0.0F);
      $$0.c().b(4.5F, 4.5F, 1.0F);
      $$0.a(this.s, -8, -8, 0.0F, 0.0F, 16, 16, 16, 16);
   }

   @Override
   protected Vector3f m() {
      return c;
   }
}
