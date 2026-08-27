import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class foo {
   private final List<agm> a;

   private foo(List<agm> $$0) {
      this.a = $$0;
   }

   public List<agm> a() {
      return this.a;
   }

   public static foo a(JsonObject $$0) {
      JsonArray $$1 = atg.a($$0, "textures", null);
      if ($$1 == null) {
         return new foo(List.of());
      } else {
         List<agm> $$2 = Streams.stream($$1).map($$0x -> atg.a($$0x, "texture")).map(agm::new).collect(ImmutableList.toImmutableList());
         return new foo($$2);
      }
   }
}
