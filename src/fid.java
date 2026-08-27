import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fid implements fih {
   private final GameProfile a;
   private final Supplier<gfl> b;
   private final vf c;

   public fid(GameProfile $$0) {
      this.a = $$0;
      this.b = evh.O().al().a($$0);
      this.c = vf.b($$0.getName());
   }

   @Override
   public void a(fif $$0) {
      evh.O().J().b(new afd(this.a.getId()));
   }

   @Override
   public vf aO_() {
      return this.c;
   }

   @Override
   public void a(ewt $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      eye.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aP_() {
      return true;
   }
}
