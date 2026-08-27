import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fhn {
   private final List<acq> a;

   private fhn(List<acq> $$0) {
      this.a = $$0;
   }

   public List<acq> a() {
      return this.a;
   }

   public static fhn a(JsonObject $$0) {
      JsonArray $$1 = aor.a($$0, "textures", null);
      if ($$1 == null) {
         return new fhn(List.of());
      } else {
         List<acq> $$2 = Streams.stream($$1).map($$0x -> aor.a($$0x, "texture")).map(acq::new).collect(ImmutableList.toImmutableList());
         return new fhn($$2);
      }
   }
}
