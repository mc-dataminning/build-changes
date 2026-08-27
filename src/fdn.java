import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fdn implements fdr {
   private final GameProfile a;
   private final Supplier<gag> b;
   private final tn c;

   public fdn(GameProfile $$0) {
      this.a = $$0;
      this.b = eqx.O().al().a($$0);
      this.c = tn.b($$0.getName());
   }

   @Override
   public void a(fdp $$0) {
      eqx.O().J().b(new acx(this.a.getId()));
   }

   @Override
   public tn aI_() {
      return this.c;
   }

   @Override
   public void a(esh $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      etr.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aJ_() {
      return true;
   }
}
