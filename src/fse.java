import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fse implements fsi {
   private final GameProfile a;
   private final Supplier<gpy> b;
   private final xo c;

   public fse(GameProfile $$0) {
      this.a = $$0;
      this.b = ffe.Q().am().a($$0);
      this.c = xo.b($$0.getName());
   }

   @Override
   public void a(fsg $$0) {
      ffe.Q().L().b(new aiq(this.a.getId()));
   }

   @Override
   public xo aN_() {
      return this.c;
   }

   @Override
   public void a(fgq $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fic.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aO_() {
      return true;
   }
}
