import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class flk implements flo {
   private final GameProfile a;
   private final Supplier<giy> b;
   private final vs c;

   public flk(GameProfile $$0) {
      this.a = $$0;
      this.b = eyk.P().am().a($$0);
      this.c = vs.b($$0.getName());
   }

   @Override
   public void a(flm $$0) {
      eyk.P().K().b(new agp(this.a.getId()));
   }

   @Override
   public vs aQ_() {
      return this.c;
   }

   @Override
   public void a(ezx $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      fbj.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aR_() {
      return true;
   }
}
