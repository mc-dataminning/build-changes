import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fko implements fks {
   private final GameProfile a;
   private final Supplier<gia> b;
   private final vq c;

   public fko(GameProfile $$0) {
      this.a = $$0;
      this.b = exo.P().am().a($$0);
      this.c = vq.b($$0.getName());
   }

   @Override
   public void a(fkq $$0) {
      exo.P().K().b(new agl(this.a.getId()));
   }

   @Override
   public vq aR_() {
      return this.c;
   }

   @Override
   public void a(ezb $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fan.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aS_() {
      return true;
   }
}
