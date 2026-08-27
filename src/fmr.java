import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fmr {
   private final List<afw> a;

   private fmr(List<afw> $$0) {
      this.a = $$0;
   }

   public List<afw> a() {
      return this.a;
   }

   public static fmr a(JsonObject $$0) {
      JsonArray $$1 = aso.a($$0, "textures", null);
      if ($$1 == null) {
         return new fmr(List.of());
      } else {
         List<afw> $$2 = Streams.stream($$1).map($$0x -> aso.a($$0x, "texture")).map(afw::new).collect(ImmutableList.toImmutableList());
         return new fmr($$2);
      }
   }
}
