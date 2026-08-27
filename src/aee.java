import com.mojang.authlib.GameProfile;

public class aee implements wb<aec> {
   private final GameProfile a;

   public aee(GameProfile $$0) {
      this.a = $$0;
   }

   public aee(tl $$0) {
      this.a = $$0.A();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
   }

   public void a(aec $$0) {
      $$0.a(this);
   }

   public GameProfile a() {
      return this.a;
   }

   @Override
   public tk c() {
      return tk.e;
   }
}
