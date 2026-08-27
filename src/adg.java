import com.mojang.authlib.GameProfile;

public class adg implements vd<ade> {
   private final GameProfile a;

   public adg(GameProfile $$0) {
      this.a = $$0;
   }

   public adg(so $$0) {
      this.a = $$0.z();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
   }

   public void a(ade $$0) {
      $$0.a(this);
   }

   public GameProfile a() {
      return this.a;
   }

   @Override
   public sn c() {
      return sn.e;
   }
}
