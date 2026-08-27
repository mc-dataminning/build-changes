import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class aqx extends arb<GameProfile, aqy> {
   public aqx(File $$0) {
      super($$0);
   }

   @Override
   protected ara<GameProfile> a(JsonObject $$0) {
      return new aqy($$0);
   }

   @Override
   public String[] a() {
      return this.d().stream().map(ara::g).filter(Objects::nonNull).map(GameProfile::getName).toArray(String[]::new);
   }

   public boolean a(GameProfile $$0) {
      aqy $$1 = this.b($$0);
      return $$1 != null ? $$1.b() : false;
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
