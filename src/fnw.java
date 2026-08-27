import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fnw {
   private final List<agg> a;

   private fnw(List<agg> $$0) {
      this.a = $$0;
   }

   public List<agg> a() {
      return this.a;
   }

   public static fnw a(JsonObject $$0) {
      JsonArray $$1 = asy.a($$0, "textures", null);
      if ($$1 == null) {
         return new fnw(List.of());
      } else {
         List<agg> $$2 = Streams.stream($$1).map($$0x -> asy.a($$0x, "texture")).map(agg::new).collect(ImmutableList.toImmutableList());
         return new fnw($$2);
      }
   }
}
