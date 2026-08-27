import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fqw {
   private final List<ahg> a;

   private fqw(List<ahg> $$0) {
      this.a = $$0;
   }

   public List<ahg> a() {
      return this.a;
   }

   public static fqw a(JsonObject $$0) {
      JsonArray $$1 = aue.a($$0, "textures", null);
      if ($$1 == null) {
         return new fqw(List.of());
      } else {
         List<ahg> $$2 = Streams.stream($$1).map($$0x -> aue.a($$0x, "texture")).map(ahg::new).collect(ImmutableList.toImmutableList());
         return new fqw($$2);
      }
   }
}
