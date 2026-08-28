import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class avp extends avt<GameProfile, avq> {
   public avp(File $$0) {
      super($$0);
   }

   @Override
   protected avs<GameProfile> a(JsonObject $$0) {
      return new avq($$0);
   }

   @Override
   public String[] a() {
      return this.d().stream().map(avs::g).filter(Objects::nonNull).map(GameProfile::getName).toArray(String[]::new);
   }

   public boolean a(GameProfile $$0) {
      avq $$1 = this.b($$0);
      return $$1 != null ? $$1.b() : false;
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
