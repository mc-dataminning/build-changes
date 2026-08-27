import com.mojang.authlib.GameProfile;

public class afo implements xf<afm> {
   private final GameProfile a;

   public afo(GameProfile $$0) {
      this.a = $$0;
   }

   public afo(ui $$0) {
      this.a = $$0.A();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
   }

   public void a(afm $$0) {
      $$0.a(this);
   }

   public GameProfile a() {
      return this.a;
   }

   @Override
   public uh c() {
      return uh.e;
   }
}
