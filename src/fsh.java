import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fsh implements fsl {
   private final GameProfile a;
   private final Supplier<gqb> b;
   private final xp c;

   public fsh(GameProfile $$0) {
      this.a = $$0;
      this.b = ffh.Q().am().a($$0);
      this.c = xp.b($$0.getName());
   }

   @Override
   public void a(fsj $$0) {
      ffh.Q().L().b(new air(this.a.getId()));
   }

   @Override
   public xp aN_() {
      return this.c;
   }

   @Override
   public void a(fgt $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fif.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aO_() {
      return true;
   }
}
