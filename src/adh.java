import com.mojang.authlib.GameProfile;

public class adh implements vd<adf> {
   private final GameProfile a;

   public adh(GameProfile $$0) {
      this.a = $$0;
   }

   public adh(so $$0) {
      this.a = $$0.z();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
   }

   public void a(adf $$0) {
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
