import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fqo {
   private final List<ahd> a;

   private fqo(List<ahd> $$0) {
      this.a = $$0;
   }

   public List<ahd> a() {
      return this.a;
   }

   public static fqo a(JsonObject $$0) {
      JsonArray $$1 = aty.a($$0, "textures", null);
      if ($$1 == null) {
         return new fqo(List.of());
      } else {
         List<ahd> $$2 = Streams.stream($$1).map($$0x -> aty.a($$0x, "texture")).map(ahd::new).collect(ImmutableList.toImmutableList());
         return new fqo($$2);
      }
   }
}
