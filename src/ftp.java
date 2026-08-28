import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class ftp implements ftt {
   private final GameProfile a;
   private final Supplier<grl> b;
   private final wz c;

   public ftp(GameProfile $$0) {
      this.a = $$0;
      this.b = fgo.Q().am().a($$0);
      this.c = wz.b($$0.getName());
   }

   @Override
   public void a(ftr $$0) {
      fgo.Q().L().b(new aid(this.a.getId()));
   }

   @Override
   public wz aU_() {
      return this.c;
   }

   @Override
   public void a(fhz $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fjl.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aV_() {
      return true;
   }
}
