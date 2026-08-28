import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dpp {
   cyx b();

   static List<dpp> c() {
      return lv.g.s().map(dpp::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dpp a(dei $$0) {
      if ($$0.q() instanceof ctu $$1) {
         dhm var6 = $$1.d();
         if (var6 instanceof dpp) {
            return (dpp)var6;
         }
      }

      cvn $$2 = $$0.q();
      return $$2 instanceof dpp ? (dpp)$$2 : null;
   }
}
