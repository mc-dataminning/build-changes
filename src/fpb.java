import org.joml.Vector3f;

public class fpb extends fof {
   public static final float b = 4.5F;
   private static final Vector3f c = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final int d = 16;
   private static final int r = 16;
   private final alf s = new alf("textures/gui/hanging_signs/" + this.a.b() + ".png");

   public fpb(dqt $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2, xp.c("hanging_sign.edit"));
   }

   @Override
   protected void b(fgt $$0, dse $$1) {
      $$0.c().a((float)this.n / 2.0F, 125.0F, 50.0F);
   }

   @Override
   protected void a(fgt $$0, dse $$1) {
      $$0.c().a(0.0F, -13.0F, 0.0F);
      $$0.c().b(4.5F, 4.5F, 1.0F);
      $$0.a(this.s, -8, -8, 0.0F, 0.0F, 16, 16, 16, 16);
   }

   @Override
   protected Vector3f m() {
      return c;
   }
}
