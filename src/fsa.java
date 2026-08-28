import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fsa implements fse {
   private final GameProfile a;
   private final Supplier<gpu> b;
   private final xl c;

   public fsa(GameProfile $$0) {
      this.a = $$0;
      this.b = ffa.Q().am().a($$0);
      this.c = xl.b($$0.getName());
   }

   @Override
   public void a(fsc $$0) {
      ffa.Q().L().b(new ain(this.a.getId()));
   }

   @Override
   public xl aO_() {
      return this.c;
   }

   @Override
   public void a(fgm $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fhy.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aP_() {
      return true;
   }
}
