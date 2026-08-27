import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fgc implements fgg {
   private final GameProfile a;
   private final Supplier<gcz> b;
   private final uv c;

   public fgc(GameProfile $$0) {
      this.a = $$0;
      this.b = eti.N().ak().a($$0);
      this.c = uv.b($$0.getName());
   }

   @Override
   public void a(fge $$0) {
      eti.N().I().b(new aej(this.a.getId()));
   }

   @Override
   public uv aR_() {
      return this.c;
   }

   @Override
   public void a(eut $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      ewd.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aS_() {
      return true;
   }
}
