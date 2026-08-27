import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class fpz {
   public static final int a = -1;
   public final hx b;
   public final int c;
   public final String d;
   public final fqb e;

   public fpz(@Nullable hx $$0, int $$1, String $$2, fqb $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<fpz> {
      private static final int a = -1;

      public fpz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         hx $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         fqb $$7 = (fqb)$$2.deserialize($$3, fqb.class);
         return new fpz($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return aso.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return aso.i($$0, "texture");
      }

      @Nullable
      private hx c(JsonObject $$0) {
         String $$1 = aso.a($$0, "cullface", "");
         return hx.a($$1);
      }
   }
}
