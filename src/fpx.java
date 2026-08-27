import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fpx {
   private final List<agt> a;

   private fpx(List<agt> $$0) {
      this.a = $$0;
   }

   public List<agt> a() {
      return this.a;
   }

   public static fpx a(JsonObject $$0) {
      JsonArray $$1 = ato.a($$0, "textures", null);
      if ($$1 == null) {
         return new fpx(List.of());
      } else {
         List<agt> $$2 = Streams.stream($$1).map($$0x -> ato.a($$0x, "texture")).map(agt::new).collect(ImmutableList.toImmutableList());
         return new fpx($$2);
      }
   }
}
