import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class fpf {
   public static final int a = -1;
   public final hc b;
   public final int c;
   public final String d;
   public final fph e;

   public fpf(@Nullable hc $$0, int $$1, String $$2, fph $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<fpf> {
      private static final int a = -1;

      public fpf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         hc $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         fph $$7 = (fph)$$2.deserialize($$3, fph.class);
         return new fpf($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return arp.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return arp.i($$0, "texture");
      }

      @Nullable
      private hc c(JsonObject $$0) {
         String $$1 = arp.a($$0, "cullface", "");
         return hc.a($$1);
      }
   }
}
