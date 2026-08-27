import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class foq implements fov {
   private final GameProfile a;
   private final Supplier<gmi> b;
   private final wg c;

   public foq(GameProfile $$0) {
      this.a = $$0;
      this.b = fbp.Q().an().a($$0);
      this.c = wg.b($$0.getName());
   }

   @Override
   public void a(fot $$0) {
      fbp.Q().L().b(new ahf(this.a.getId()));
   }

   @Override
   public wg aO_() {
      return this.c;
   }

   @Override
   public void a(fdc $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      feo.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aP_() {
      return true;
   }
}
