import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class flq {
   private final List<aeu> a;

   private flq(List<aeu> $$0) {
      this.a = $$0;
   }

   public List<aeu> a() {
      return this.a;
   }

   public static flq a(JsonObject $$0) {
      JsonArray $$1 = arj.a($$0, "textures", null);
      if ($$1 == null) {
         return new flq(List.of());
      } else {
         List<aeu> $$2 = Streams.stream($$1).map($$0x -> arj.a($$0x, "texture")).map(aeu::new).collect(ImmutableList.toImmutableList());
         return new flq($$2);
      }
   }
}
