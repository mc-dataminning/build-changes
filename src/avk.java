import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class avk extends avo<GameProfile, avl> {
   public avk(File $$0) {
      super($$0);
   }

   @Override
   protected avn<GameProfile> a(JsonObject $$0) {
      return new avl($$0);
   }

   @Override
   public String[] a() {
      return this.d().stream().map(avn::g).filter(Objects::nonNull).map(GameProfile::getName).toArray(String[]::new);
   }

   public boolean a(GameProfile $$0) {
      avl $$1 = this.b($$0);
      return $$1 != null ? $$1.b() : false;
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
