import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class ftj implements ftn {
   private final GameProfile a;
   private final Supplier<grf> b;
   private final wy c;

   public ftj(GameProfile $$0) {
      this.a = $$0;
      this.b = fgi.Q().am().a($$0);
      this.c = wy.b($$0.getName());
   }

   @Override
   public void a(ftl $$0) {
      fgi.Q().L().b(new aic(this.a.getId()));
   }

   @Override
   public wy aR_() {
      return this.c;
   }

   @Override
   public void a(fht $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fjf.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aS_() {
      return true;
   }
}
