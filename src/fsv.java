import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fsv implements fsz {
   private final GameProfile a;
   private final Supplier<gqq> b;
   private final wu c;

   public fsv(GameProfile $$0) {
      this.a = $$0;
      this.b = ffw.Q().am().a($$0);
      this.c = wu.b($$0.getName());
   }

   @Override
   public void a(fsx $$0) {
      ffw.Q().L().b(new ahw(this.a.getId()));
   }

   @Override
   public wu aR_() {
      return this.c;
   }

   @Override
   public void a(fhh $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fit.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aS_() {
      return true;
   }
}
