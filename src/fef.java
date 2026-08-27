import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fef implements fej {
   private final GameProfile a;
   private final Supplier<gba> b;
   private final ui c;

   public fef(GameProfile $$0) {
      this.a = $$0;
      this.b = ero.O().al().a($$0);
      this.c = ui.b($$0.getName());
   }

   @Override
   public void a(feh $$0) {
      ero.O().J().b(new adt(this.a.getId()));
   }

   @Override
   public ui aN_() {
      return this.c;
   }

   @Override
   public void a(esy $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      eui.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aO_() {
      return true;
   }
}
