import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class frb implements frf {
   private final GameProfile a;
   private final Supplier<gov> b;
   private final wx c;

   public frb(GameProfile $$0) {
      this.a = $$0;
      this.b = fdz.Q().an().a($$0);
      this.c = wx.b($$0.getName());
   }

   @Override
   public void a(frd $$0) {
      fdz.Q().L().b(new ahy(this.a.getId()));
   }

   @Override
   public wx aN_() {
      return this.c;
   }

   @Override
   public void a(ffm $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fgy.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aO_() {
      return true;
   }
}
