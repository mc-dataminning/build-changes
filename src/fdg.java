import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fdg implements fdk {
   private final GameProfile a;
   private final Supplier<gaa> b;
   private final tl c;

   public fdg(GameProfile $$0) {
      this.a = $$0;
      this.b = eqp.O().al().a($$0);
      this.c = tl.b($$0.getName());
   }

   @Override
   public void a(fdi $$0) {
      eqp.O().J().b(new acw(this.a.getId()));
   }

   @Override
   public tl aI_() {
      return this.c;
   }

   @Override
   public void a(erz $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      etj.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aJ_() {
      return true;
   }
}
