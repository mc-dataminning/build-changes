import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fqg implements fqk {
   private final GameProfile a;
   private final Supplier<gny> b;
   private final wu c;

   public fqg(GameProfile $$0) {
      this.a = $$0;
      this.b = fde.Q().an().a($$0);
      this.c = wu.b($$0.getName());
   }

   @Override
   public void a(fqi $$0) {
      fde.Q().L().b(new aht(this.a.getId()));
   }

   @Override
   public wu aN_() {
      return this.c;
   }

   @Override
   public void a(fer $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fgd.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aO_() {
      return true;
   }
}
