import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class aqe extends aqd<GameProfile, aqf> {
   public aqe(File $$0) {
      super($$0);
   }

   @Override
   protected aqc<GameProfile> a(JsonObject $$0) {
      return new aqf($$0);
   }

   public boolean a(GameProfile $$0) {
      return this.d($$0);
   }

   @Override
   public String[] a() {
      return this.d().stream().map(aqc::g).filter(Objects::nonNull).map(GameProfile::getName).toArray(String[]::new);
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
