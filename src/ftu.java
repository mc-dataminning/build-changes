import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class ftu implements fty {
   private final GameProfile a;
   private final Supplier<gry> b;
   private final xe c;

   public ftu(GameProfile $$0) {
      this.a = $$0;
      this.b = fgj.Q().an().a($$0);
      this.c = xe.b($$0.getName());
   }

   @Override
   public void a(ftw $$0) {
      fgj.Q().L().b(new aif(this.a.getId()));
   }

   @Override
   public xe aO_() {
      return this.c;
   }

   @Override
   public void a(fia $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fjm.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aP_() {
      return true;
   }
}
