import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class fot {
   public static final int a = -1;
   public final ha b;
   public final int c;
   public final String d;
   public final fov e;

   public fot(@Nullable ha $$0, int $$1, String $$2, fov $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<fot> {
      private static final int a = -1;

      public fot a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ha $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         fov $$7 = (fov)$$2.deserialize($$3, fov.class);
         return new fot($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return arg.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return arg.i($$0, "texture");
      }

      @Nullable
      private ha c(JsonObject $$0) {
         String $$1 = arg.a($$0, "cullface", "");
         return ha.a($$1);
      }
   }
}
