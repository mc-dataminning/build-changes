import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class flv {
   private final List<aew> a;

   private flv(List<aew> $$0) {
      this.a = $$0;
   }

   public List<aew> a() {
      return this.a;
   }

   public static flv a(JsonObject $$0) {
      JsonArray $$1 = arn.a($$0, "textures", null);
      if ($$1 == null) {
         return new flv(List.of());
      } else {
         List<aew> $$2 = Streams.stream($$1).map($$0x -> arn.a($$0x, "texture")).map(aew::new).collect(ImmutableList.toImmutableList());
         return new flv($$2);
      }
   }
}
