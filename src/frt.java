import org.joml.Vector3f;

public class frt extends fqy {
   public static final float c = 4.5F;
   private static final Vector3f d = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final int s = 16;
   private static final int u = 16;
   private final ale v = ale.b("textures/gui/hanging_signs/" + this.b.b() + ".png");

   public frt(dth $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2, xe.c("hanging_sign.edit"));
   }

   @Override
   protected void a(fkb $$0, dus $$1) {
      $$0.c().a((float)this.n / 2.0F, 125.0F, 50.0F);
   }

   @Override
   protected void c(fkb $$0) {
      $$0.c().a(0.0F, -13.0F, 0.0F);
      $$0.c().b(4.5F, 4.5F, 1.0F);
      $$0.a(ghv::B, this.v, -8, -8, 0.0F, 0.0F, 16, 16, 16, 16);
   }

   @Override
   protected Vector3f m() {
      return d;
   }
}
