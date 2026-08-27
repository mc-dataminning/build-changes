import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fll {
   private final List<aer> a;

   private fll(List<aer> $$0) {
      this.a = $$0;
   }

   public List<aer> a() {
      return this.a;
   }

   public static fll a(JsonObject $$0) {
      JsonArray $$1 = arg.a($$0, "textures", null);
      if ($$1 == null) {
         return new fll(List.of());
      } else {
         List<aer> $$2 = Streams.stream($$1).map($$0x -> arg.a($$0x, "texture")).map(aer::new).collect(ImmutableList.toImmutableList());
         return new fll($$2);
      }
   }
}
