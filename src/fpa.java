import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fpa implements fpe {
   private final GameProfile a;
   private final Supplier<gmr> b;
   private final wi c;

   public fpa(GameProfile $$0) {
      this.a = $$0;
      this.b = fby.Q().an().a($$0);
      this.c = wi.b($$0.getName());
   }

   @Override
   public void a(fpc $$0) {
      fby.Q().L().b(new ahh(this.a.getId()));
   }

   @Override
   public wi aN_() {
      return this.c;
   }

   @Override
   public void a(fdl $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fex.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aO_() {
      return true;
   }
}
