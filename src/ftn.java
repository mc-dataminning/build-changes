import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class ftn implements ftr {
   private final GameProfile a;
   private final Supplier<grj> b;
   private final wz c;

   public ftn(GameProfile $$0) {
      this.a = $$0;
      this.b = fgm.Q().am().a($$0);
      this.c = wz.b($$0.getName());
   }

   @Override
   public void a(ftp $$0) {
      fgm.Q().L().b(new aid(this.a.getId()));
   }

   @Override
   public wz aU_() {
      return this.c;
   }

   @Override
   public void a(fhx $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fjj.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aV_() {
      return true;
   }
}
