import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class avo extends avs<GameProfile, avp> {
   public avo(File $$0) {
      super($$0);
   }

   @Override
   protected avr<GameProfile> a(JsonObject $$0) {
      return new avp($$0);
   }

   @Override
   public String[] a() {
      return this.d().stream().map(avr::g).filter(Objects::nonNull).map(GameProfile::getName).toArray(String[]::new);
   }

   public boolean a(GameProfile $$0) {
      avp $$1 = this.b($$0);
      return $$1 != null ? $$1.b() : false;
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
