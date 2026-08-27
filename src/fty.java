import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class fty {
   public static final int a = -1;
   public final ic b;
   public final int c;
   public final String d;
   public final fua e;

   public fty(@Nullable ic $$0, int $$1, String $$2, fua $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<fty> {
      private static final int a = -1;

      public fty a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ic $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         fua $$7 = (fua)$$2.deserialize($$3, fua.class);
         return new fty($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return aty.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return aty.i($$0, "texture");
      }

      @Nullable
      private ic c(JsonObject $$0) {
         String $$1 = aty.a($$0, "cullface", "");
         return ic.a($$1);
      }
   }
}
