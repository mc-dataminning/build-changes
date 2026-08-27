import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import javax.annotation.Nullable;

public class aqr extends aqt<GameProfile> {
   private final int a;
   private final boolean b;

   public aqr(GameProfile $$0, int $$1, boolean $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public aqr(JsonObject $$0) {
      super(b($$0));
      this.a = $$0.has("level") ? $$0.get("level").getAsInt() : 0;
      this.b = $$0.has("bypassesPlayerLimit") && $$0.get("bypassesPlayerLimit").getAsBoolean();
   }

   public int a() {
      return this.a;
   }

   public boolean b() {
      return this.b;
   }

   @Override
   protected void a(JsonObject $$0) {
      if (this.g() != null) {
         $$0.addProperty("uuid", this.g().getId().toString());
         $$0.addProperty("name", this.g().getName());
         $$0.addProperty("level", this.a);
         $$0.addProperty("bypassesPlayerLimit", this.b);
      }
   }

   @Nullable
   private static GameProfile b(JsonObject $$0) {
      if ($$0.has("uuid") && $$0.has("name")) {
         String $$1 = $$0.get("uuid").getAsString();

         UUID $$2;
         try {
            $$2 = UUID.fromString($$1);
         } catch (Throwable var4) {
            return null;
         }

         return new GameProfile($$2, $$0.get("name").getAsString());
      } else {
         return null;
      }
   }
}
