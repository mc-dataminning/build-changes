import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fkh implements fkl {
   private final GameProfile a;
   private final Supplier<ght> b;
   private final vq c;

   public fkh(GameProfile $$0) {
      this.a = $$0;
      this.b = exh.O().al().a($$0);
      this.c = vq.b($$0.getName());
   }

   @Override
   public void a(fkj $$0) {
      exh.O().J().b(new agl(this.a.getId()));
   }

   @Override
   public vq aR_() {
      return this.c;
   }

   @Override
   public void a(eyu $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fag.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aS_() {
      return true;
   }
}
