import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.lang.reflect.Type;
import org.apache.commons.lang3.StringUtils;

public class ayn extends bcn {
   public static final Gson a = new GsonBuilder().registerTypeAdapter(vq.class, new JsonDeserializer<vq>() {
      public we a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         if ($$0.isJsonPrimitive()) {
            return vq.b($$0.getAsString());
         } else if ($$0.isJsonArray()) {
            JsonArray $$3 = $$0.getAsJsonArray();
            we $$4 = null;

            for (JsonElement $$5 : $$3) {
               we $$6 = this.a($$5, $$5.getClass(), $$2);
               if ($$4 == null) {
                  $$4 = $$6;
               } else {
                  $$4.b($$6);
               }
            }

            return $$4;
         } else {
            throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
         }
      }
   }).create();

   public ayn(Schema $$0, boolean $$1) {
      super($$0, $$1, "BlockEntitySignTextStrictJsonFix", bdn.s, "Sign");
   }

   private Dynamic<?> a(Dynamic<?> $$0, String $$1) {
      String $$2 = $$0.get($$1).asString("");
      vq $$3 = null;
      if (!"null".equals($$2) && !StringUtils.isEmpty($$2)) {
         if ($$2.charAt(0) == '"' && $$2.charAt($$2.length() - 1) == '"' || $$2.charAt(0) == '{' && $$2.charAt($$2.length() - 1) == '}') {
            try {
               $$3 = avy.b(a, $$2, vq.class, true);
               if ($$3 == null) {
                  $$3 = vp.a;
               }
            } catch (Exception var8) {
            }

            if ($$3 == null) {
               try {
                  $$3 = vq.a.a($$2);
               } catch (Exception var7) {
               }
            }

            if ($$3 == null) {
               try {
                  $$3 = vq.a.b($$2);
               } catch (Exception var6) {
               }
            }

            if ($$3 == null) {
               $$3 = vq.b($$2);
            }
         } else {
            $$3 = vq.b($$2);
         }
      } else {
         $$3 = vp.a;
      }

      return $$0.set($$1, $$0.createString(vq.a.a($$3)));
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> {
         $$0x = this.a($$0x, "Text1");
         $$0x = this.a($$0x, "Text2");
         $$0x = this.a($$0x, "Text3");
         return this.a($$0x, "Text4");
      });
   }
}
