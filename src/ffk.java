import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class ffk implements ffo {
   private final GameProfile a;
   private final Supplier<gch> b;
   private final ur c;

   public ffk(GameProfile $$0) {
      this.a = $$0;
      this.b = esr.N().ak().a($$0);
      this.c = ur.b($$0.getName());
   }

   @Override
   public void a(ffm $$0) {
      esr.N().I().b(new aed(this.a.getId()));
   }

   @Override
   public ur aP_() {
      return this.c;
   }

   @Override
   public void a(eub $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      evl.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aQ_() {
      return true;
   }
}
