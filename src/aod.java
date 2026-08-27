import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class aod extends aoh<GameProfile, aoe> {
   public aod(File $$0) {
      super($$0);
   }

   @Override
   protected aog<GameProfile> a(JsonObject $$0) {
      return new aoe($$0);
   }

   @Override
   public String[] a() {
      return this.d().stream().map(aog::g).filter(Objects::nonNull).map(GameProfile::getName).toArray(String[]::new);
   }

   public boolean a(GameProfile $$0) {
      aoe $$1 = this.b($$0);
      return $$1 != null ? $$1.b() : false;
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
