import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fri {
   private final List<ahh> a;

   private fri(List<ahh> $$0) {
      this.a = $$0;
   }

   public List<ahh> a() {
      return this.a;
   }

   public static fri a(JsonObject $$0) {
      JsonArray $$1 = auf.a($$0, "textures", null);
      if ($$1 == null) {
         return new fri(List.of());
      } else {
         List<ahh> $$2 = Streams.stream($$1).map($$0x -> auf.a($$0x, "texture")).map(ahh::new).collect(ImmutableList.toImmutableList());
         return new fri($$2);
      }
   }
}
