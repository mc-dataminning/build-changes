import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fmk implements fmo {
   private final GameProfile a;
   private final Supplier<gkb> b;
   private final vu c;

   public fmk(GameProfile $$0) {
      this.a = $$0;
      this.b = ezi.Q().an().a($$0);
      this.c = vu.b($$0.getName());
   }

   @Override
   public void a(fmm $$0) {
      ezi.Q().L().b(new agt(this.a.getId()));
   }

   @Override
   public vu aP_() {
      return this.c;
   }

   @Override
   public void a(fav $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fch.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aQ_() {
      return true;
   }
}
