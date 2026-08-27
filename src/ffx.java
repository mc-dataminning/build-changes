import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class ffx implements fgb {
   private final GameProfile a;
   private final Supplier<gcu> b;
   private final ur c;

   public ffx(GameProfile $$0) {
      this.a = $$0;
      this.b = etd.N().ak().a($$0);
      this.c = ur.b($$0.getName());
   }

   @Override
   public void a(ffz $$0) {
      etd.N().I().b(new aef(this.a.getId()));
   }

   @Override
   public ur aQ_() {
      return this.c;
   }

   @Override
   public void a(euo $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      evy.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aR_() {
      return true;
   }
}
