import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class flx {
   private final List<aey> a;

   private flx(List<aey> $$0) {
      this.a = $$0;
   }

   public List<aey> a() {
      return this.a;
   }

   public static flx a(JsonObject $$0) {
      JsonArray $$1 = arp.a($$0, "textures", null);
      if ($$1 == null) {
         return new flx(List.of());
      } else {
         List<aey> $$2 = Streams.stream($$1).map($$0x -> arp.a($$0x, "texture")).map(aey::new).collect(ImmutableList.toImmutableList());
         return new flx($$2);
      }
   }
}
