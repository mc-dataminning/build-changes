import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class fug {
   public static final int a = -1;
   public final ic b;
   public final int c;
   public final String d;
   public final fui e;

   public fug(@Nullable ic $$0, int $$1, String $$2, fui $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<fug> {
      private static final int a = -1;

      public fug a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ic $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         fui $$7 = (fui)$$2.deserialize($$3, fui.class);
         return new fug($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return aue.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return aue.i($$0, "texture");
      }

      @Nullable
      private ic c(JsonObject $$0) {
         String $$1 = aue.a($$0, "cullface", "");
         return ic.a($$1);
      }
   }
}
