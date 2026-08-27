import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class fth {
   public static final int a = -1;
   public final ia b;
   public final int c;
   public final String d;
   public final ftj e;

   public fth(@Nullable ia $$0, int $$1, String $$2, ftj $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<fth> {
      private static final int a = -1;

      public fth a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ia $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         ftj $$7 = (ftj)$$2.deserialize($$3, ftj.class);
         return new fth($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return ato.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return ato.i($$0, "texture");
      }

      @Nullable
      private ia c(JsonObject $$0) {
         String $$1 = ato.a($$0, "cullface", "");
         return ia.a($$1);
      }
   }
}
