import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fuf {
   private final List<ajc> a;

   private fuf(List<ajc> $$0) {
      this.a = $$0;
   }

   public List<ajc> a() {
      return this.a;
   }

   public static fuf a(JsonObject $$0) {
      JsonArray $$1 = awc.a($$0, "textures", null);
      if ($$1 == null) {
         return new fuf(List.of());
      } else {
         List<ajc> $$2 = Streams.stream($$1).map($$0x -> awc.a($$0x, "texture")).map(ajc::new).collect(ImmutableList.toImmutableList());
         return new fuf($$2);
      }
   }
}
