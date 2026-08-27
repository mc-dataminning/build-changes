import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fcs implements fcw {
   private final GameProfile a;
   private final Supplier<fzg> b;
   private final te c;

   public fcs(GameProfile $$0) {
      this.a = $$0;
      this.b = eqn.N().ak().a($$0);
      this.c = te.b($$0.getName());
   }

   @Override
   public void a(fcu $$0) {
      eqn.N().I().b(new aco(this.a.getId()));
   }

   @Override
   public te aF_() {
      return this.c;
   }

   @Override
   public void a(erx $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      eth.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aG_() {
      return true;
   }
}
