import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface djz {
   cui b();

   static List<djz> c() {
      return kr.h.s().map(djz::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static djz a(cyw $$0) {
      if ($$0.p() instanceof cph $$1) {
         dby var6 = $$1.d();
         if (var6 instanceof djz) {
            return (djz)var6;
         }
      }

      cre $$2 = $$0.p();
      return $$2 instanceof djz ? (djz)$$2 : null;
   }
}
