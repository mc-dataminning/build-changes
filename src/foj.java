import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class foj {
   private final List<agi> a;

   private foj(List<agi> $$0) {
      this.a = $$0;
   }

   public List<agi> a() {
      return this.a;
   }

   public static foj a(JsonObject $$0) {
      JsonArray $$1 = atc.a($$0, "textures", null);
      if ($$1 == null) {
         return new foj(List.of());
      } else {
         List<agi> $$2 = Streams.stream($$1).map($$0x -> atc.a($$0x, "texture")).map(agi::new).collect(ImmutableList.toImmutableList());
         return new foj($$2);
      }
   }
}
