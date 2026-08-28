import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class avu extends avt<GameProfile, avv> {
   public avu(File $$0) {
      super($$0);
   }

   @Override
   protected avs<GameProfile> a(JsonObject $$0) {
      return new avv($$0);
   }

   public boolean a(GameProfile $$0) {
      return this.d($$0);
   }

   @Override
   public String[] a() {
      return this.d().stream().map(avs::g).filter(Objects::nonNull).map(GameProfile::getName).toArray(String[]::new);
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
