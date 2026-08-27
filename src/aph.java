import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class aph extends apl<GameProfile, api> {
   public aph(File $$0) {
      super($$0);
   }

   @Override
   protected apk<GameProfile> a(JsonObject $$0) {
      return new api($$0);
   }

   @Override
   public String[] a() {
      return this.d().stream().map(apk::g).filter(Objects::nonNull).map(GameProfile::getName).toArray(String[]::new);
   }

   public boolean a(GameProfile $$0) {
      api $$1 = this.b($$0);
      return $$1 != null ? $$1.b() : false;
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
