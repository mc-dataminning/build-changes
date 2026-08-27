import com.mojang.authlib.GameProfile;

public class ahg implements yb<ahe> {
   public static final xs<uu, ahg> a = yb.a(ahg::a, ahg::new);
   private final GameProfile b;

   public ahg(GameProfile $$0) {
      this.b = $$0;
   }

   private ahg(uu $$0) {
      this.b = $$0.x();
   }

   private void a(uu $$0) {
      $$0.a(this.b);
   }

   @Override
   public yd<ahg> a() {
      return ahk.b;
   }

   public void a(ahe $$0) {
      $$0.a(this);
   }

   public GameProfile b() {
      return this.b;
   }

   @Override
   public boolean d() {
      return true;
   }
}
