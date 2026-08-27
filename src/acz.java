import com.mojang.authlib.GameProfile;

public class acz implements uw<acx> {
   private final GameProfile a;

   public acz(GameProfile $$0) {
      this.a = $$0;
   }

   public acz(sh $$0) {
      this.a = $$0.z();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
   }

   public void a(acx $$0) {
      $$0.a(this);
   }

   public GameProfile a() {
      return this.a;
   }

   @Override
   public sg c() {
      return sg.e;
   }
}
