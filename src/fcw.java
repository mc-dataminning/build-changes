import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fcw implements fda {
   private final GameProfile a;
   private final Supplier<fzl> b;
   private final tf c;

   public fcw(GameProfile $$0) {
      this.a = $$0;
      this.b = eqm.O().al().a($$0);
      this.c = tf.b($$0.getName());
   }

   @Override
   public void a(fcy $$0) {
      eqm.O().J().b(new acq(this.a.getId()));
   }

   @Override
   public tf aF_() {
      return this.c;
   }

   @Override
   public void a(erw $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      etg.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aG_() {
      return true;
   }
}
