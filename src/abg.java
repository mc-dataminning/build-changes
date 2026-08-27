import com.mojang.authlib.GameProfile;

public class abg implements uo<abe> {
   private final GameProfile a;

   public abg(GameProfile $$0) {
      this.a = $$0;
   }

   public abg(sf $$0) {
      this.a = $$0.z();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public GameProfile a() {
      return this.a;
   }
}
