import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fdb implements fdf {
   private final GameProfile a;
   private final Supplier<fzu> b;
   private final tf c;

   public fdb(GameProfile $$0) {
      this.a = $$0;
      this.b = eql.O().al().a($$0);
      this.c = tf.b($$0.getName());
   }

   @Override
   public void a(fdd $$0) {
      eql.O().J().b(new acq(this.a.getId()));
   }

   @Override
   public tf aD_() {
      return this.c;
   }

   @Override
   public void a(erv $$0, float $$1, int $$2) {
      $$0.a(1.0F, 1.0F, 1.0F, (float)$$2 / 255.0F);
      etf.a($$0, this.b.get(), 2, 2, 12);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean aE_() {
      return true;
   }
}
