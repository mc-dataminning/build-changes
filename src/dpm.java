import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dpm {
   cyu b();

   static List<dpm> c() {
      return lu.g.s().map(dpm::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dpm a(def $$0) {
      if ($$0.q() instanceof ctr $$1) {
         dhj var6 = $$1.d();
         if (var6 instanceof dpm) {
            return (dpm)var6;
         }
      }

      cvk $$2 = $$0.q();
      return $$2 instanceof dpm ? (dpm)$$2 : null;
   }
}
