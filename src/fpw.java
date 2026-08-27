import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fpw implements fqa {
   private final GameProfile a;
   private final Supplier<gnn> b;
   private final ws c;

   public fpw(GameProfile $$0) {
      this.a = $$0;
      this.b = fcu.Q().an().a($$0);
      this.c = ws.b($$0.getName());
   }

   @Override
   public void a(fpy $$0) {
      fcu.Q().L().b(new ahr(this.a.getId()));
   }

   @Override
   public ws aN_() {
      return this.c;
   }

   @Override
   public void a(feh $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fft.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aO_() {
      return true;
   }
}
