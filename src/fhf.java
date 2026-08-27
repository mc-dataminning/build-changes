import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fhf implements fhj {
   private final GameProfile a;
   private final Supplier<geo> b;
   private final vb c;

   public fhf(GameProfile $$0) {
      this.a = $$0;
      this.b = euk.N().ak().a($$0);
      this.c = vb.b($$0.getName());
   }

   @Override
   public void a(fhh $$0) {
      euk.N().I().b(new aeq(this.a.getId()));
   }

   @Override
   public vb aQ_() {
      return this.c;
   }

   @Override
   public void a(evw $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      exg.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aR_() {
      return true;
   }
}
