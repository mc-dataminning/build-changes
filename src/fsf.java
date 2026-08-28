import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fsf implements fsj {
   private final GameProfile a;
   private final Supplier<gpz> b;
   private final xp c;

   public fsf(GameProfile $$0) {
      this.a = $$0;
      this.b = fff.Q().am().a($$0);
      this.c = xp.b($$0.getName());
   }

   @Override
   public void a(fsh $$0) {
      fff.Q().L().b(new air(this.a.getId()));
   }

   @Override
   public xp aN_() {
      return this.c;
   }

   @Override
   public void a(fgr $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fid.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aO_() {
      return true;
   }
}
