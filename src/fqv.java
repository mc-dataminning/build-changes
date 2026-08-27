import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fqv {
   private final List<ahg> a;

   private fqv(List<ahg> $$0) {
      this.a = $$0;
   }

   public List<ahg> a() {
      return this.a;
   }

   public static fqv a(JsonObject $$0) {
      JsonArray $$1 = aud.a($$0, "textures", null);
      if ($$1 == null) {
         return new fqv(List.of());
      } else {
         List<ahg> $$2 = Streams.stream($$1).map($$0x -> aud.a($$0x, "texture")).map(ahg::new).collect(ImmutableList.toImmutableList());
         return new fqv($$2);
      }
   }
}
