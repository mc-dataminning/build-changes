import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fip implements fit {
   private final GameProfile a;
   private final Supplier<gga> b;
   private final vg c;

   public fip(GameProfile $$0) {
      this.a = $$0;
      this.b = evr.O().al().a($$0);
      this.c = vg.b($$0.getName());
   }

   @Override
   public void a(fir $$0) {
      evr.O().J().b(new afe(this.a.getId()));
   }

   @Override
   public vg aQ_() {
      return this.c;
   }

   @Override
   public void a(exe $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      eyq.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aR_() {
      return true;
   }
}
