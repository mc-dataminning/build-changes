import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class flr {
   private final List<aez> a;

   private flr(List<aez> $$0) {
      this.a = $$0;
   }

   public List<aez> a() {
      return this.a;
   }

   public static flr a(JsonObject $$0) {
      JsonArray $$1 = arr.a($$0, "textures", null);
      if ($$1 == null) {
         return new flr(List.of());
      } else {
         List<aez> $$2 = Streams.stream($$1).map($$0x -> arr.a($$0x, "texture")).map(aez::new).collect(ImmutableList.toImmutableList());
         return new flr($$2);
      }
   }
}
