import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fhw implements fia {
   private final GameProfile a;
   private final Supplier<gff> b;
   private final vd c;

   public fhw(GameProfile $$0) {
      this.a = $$0;
      this.b = eva.N().ak().a($$0);
      this.c = vd.b($$0.getName());
   }

   @Override
   public void a(fhy $$0) {
      eva.N().I().b(new afa(this.a.getId()));
   }

   @Override
   public vd aO_() {
      return this.c;
   }

   @Override
   public void a(ewm $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      exx.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aP_() {
      return true;
   }
}
