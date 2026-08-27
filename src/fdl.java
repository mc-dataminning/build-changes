import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fdl implements fdp {
   private final GameProfile a;
   private final Supplier<gae> b;
   private final tl c;

   public fdl(GameProfile $$0) {
      this.a = $$0;
      this.b = eqv.O().al().a($$0);
      this.c = tl.b($$0.getName());
   }

   @Override
   public void a(fdn $$0) {
      eqv.O().J().b(new acw(this.a.getId()));
   }

   @Override
   public tl aJ_() {
      return this.c;
   }

   @Override
   public void a(esf $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      etp.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aK_() {
      return true;
   }
}
