import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fkx {
   private final List<aep> a;

   private fkx(List<aep> $$0) {
      this.a = $$0;
   }

   public List<aep> a() {
      return this.a;
   }

   public static fkx a(JsonObject $$0) {
      JsonArray $$1 = arf.a($$0, "textures", null);
      if ($$1 == null) {
         return new fkx(List.of());
      } else {
         List<aep> $$2 = Streams.stream($$1).map($$0x -> arf.a($$0x, "texture")).map(aep::new).collect(ImmutableList.toImmutableList());
         return new fkx($$2);
      }
   }
}
