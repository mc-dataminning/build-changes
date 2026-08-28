import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fsn implements fsr {
   private final GameProfile a;
   private final Supplier<gqi> b;
   private final wu c;

   public fsn(GameProfile $$0) {
      this.a = $$0;
      this.b = ffn.Q().am().a($$0);
      this.c = wu.b($$0.getName());
   }

   @Override
   public void a(fsp $$0) {
      ffn.Q().L().b(new ahw(this.a.getId()));
   }

   @Override
   public wu aQ_() {
      return this.c;
   }

   @Override
   public void a(fgz $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fil.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aR_() {
      return true;
   }
}
