import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class frt {
   public static final int a = -1;
   public final hx b;
   public final int c;
   public final String d;
   public final frv e;

   public frt(@Nullable hx $$0, int $$1, String $$2, frv $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<frt> {
      private static final int a = -1;

      public frt a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         hx $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         frv $$7 = (frv)$$2.deserialize($$3, frv.class);
         return new frt($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return atc.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return atc.i($$0, "texture");
      }

      @Nullable
      private hx c(JsonObject $$0) {
         String $$1 = atc.a($$0, "cullface", "");
         return hx.a($$1);
      }
   }
}
