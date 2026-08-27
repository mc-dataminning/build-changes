import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class apz extends aqd<GameProfile, aqa> {
   public apz(File $$0) {
      super($$0);
   }

   @Override
   protected aqc<GameProfile> a(JsonObject $$0) {
      return new aqa($$0);
   }

   @Override
   public String[] a() {
      return this.d().stream().map(aqc::g).filter(Objects::nonNull).map(GameProfile::getName).toArray(String[]::new);
   }

   public boolean a(GameProfile $$0) {
      aqa $$1 = this.b($$0);
      return $$1 != null ? $$1.b() : false;
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
