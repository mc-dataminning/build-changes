import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import org.slf4j.Logger;

public class bkb extends DataFix {
   private static final Logger a = LogUtils.getLogger();

   public bkb(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, String>> $$0 = this.getInputSchema().getType(biw.z);
      Type<?> $$1 = this.getOutputSchema().getType(biw.z);
      return this.a($$0, $$1);
   }

   private <T> TypeRewriteRule a(Type<Pair<String, String>> $$0, Type<T> $$1) {
      return this.fixTypeEverywhere("UnflattenTextComponentFix", $$0, $$1, $$1x -> $$2 -> af.a($$1, a($$1x, (String)$$2.getSecond()), true).getValue());
   }

   private static <T> Dynamic<T> a(DynamicOps<T> $$0, String $$1) {
      try {
         JsonElement $$2 = JsonParser.parseString($$1);
         if (!$$2.isJsonNull()) {
            return new Dynamic($$0, JsonOps.INSTANCE.convertTo($$0, $$2));
         }
      } catch (Exception var3) {
         a.error("Failed to unflatten text component json: {}", $$1, var3);
      }

      return new Dynamic($$0, $$0.createString($$1));
   }
}
