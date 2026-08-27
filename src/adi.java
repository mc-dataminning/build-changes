import com.mojang.authlib.GameProfile;

public class adi implements vf<adg> {
   private final GameProfile a;

   public adi(GameProfile $$0) {
      this.a = $$0;
   }

   public adi(sq $$0) {
      this.a = $$0.z();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public GameProfile a() {
      return this.a;
   }

   @Override
   public sp c() {
      return sp.e;
   }
}
