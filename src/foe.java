import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class foe {
   public static final int a = -1;
   public final hb b;
   public final int c;
   public final String d;
   public final fog e;

   public foe(@Nullable hb $$0, int $$1, String $$2, fog $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<foe> {
      private static final int a = -1;

      public foe a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         hb $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         fog $$7 = (fog)$$2.deserialize($$3, fog.class);
         return new foe($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return arf.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return arf.i($$0, "texture");
      }

      @Nullable
      private hb c(JsonObject $$0) {
         String $$1 = arf.a($$0, "cullface", "");
         return hb.a($$1);
      }
   }
}
