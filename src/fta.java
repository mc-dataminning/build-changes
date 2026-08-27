import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fta {
   private final List<aiy> a;

   private fta(List<aiy> $$0) {
      this.a = $$0;
   }

   public List<aiy> a() {
      return this.a;
   }

   public static fta a(JsonObject $$0) {
      JsonArray $$1 = avx.a($$0, "textures", null);
      if ($$1 == null) {
         return new fta(List.of());
      } else {
         List<aiy> $$2 = Streams.stream($$1).map($$0x -> avx.a($$0x, "texture")).map(aiy::new).collect(ImmutableList.toImmutableList());
         return new fta($$2);
      }
   }
}
