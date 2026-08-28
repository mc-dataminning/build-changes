import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fst implements fsx {
   private final GameProfile a;
   private final Supplier<gqo> b;
   private final wu c;

   public fst(GameProfile $$0) {
      this.a = $$0;
      this.b = fft.Q().am().a($$0);
      this.c = wu.b($$0.getName());
   }

   @Override
   public void a(fsv $$0) {
      fft.Q().L().b(new ahw(this.a.getId()));
   }

   @Override
   public wu aR_() {
      return this.c;
   }

   @Override
   public void a(fhf $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fir.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aS_() {
      return true;
   }
}
