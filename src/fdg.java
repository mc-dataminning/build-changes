import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fdg implements fdk {
   private final GameProfile a;
   private final Supplier<fzz> b;
   private final ti c;

   public fdg(GameProfile $$0) {
      this.a = $$0;
      this.b = eqq.O().al().a($$0);
      this.c = ti.b($$0.getName());
   }

   @Override
   public void a(fdi $$0) {
      eqq.O().J().b(new act(this.a.getId()));
   }

   @Override
   public ti aE_() {
      return this.c;
   }

   @Override
   public void a(esa $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      etk.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aF_() {
      return true;
   }
}
