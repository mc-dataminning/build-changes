import com.mojang.authlib.GameProfile;

public class afp implements xg<afn> {
   private final GameProfile a;

   public afp(GameProfile $$0) {
      this.a = $$0;
   }

   public afp(uj $$0) {
      this.a = $$0.A();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public GameProfile a() {
      return this.a;
   }

   @Override
   public ui c() {
      return ui.e;
   }
}
