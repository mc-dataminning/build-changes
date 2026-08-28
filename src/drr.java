import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface drr {
   czo c();

   static List<drr> d() {
      return mb.g.s().map(drr::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static drr a(dgf $$0) {
      if ($$0.j() instanceof cut $$1) {
         djk var6 = $$1.d();
         if (var6 instanceof drr) {
            return (drr)var6;
         }
      }

      cwj $$2 = $$0.j();
      return $$2 instanceof drr ? (drr)$$2 : null;
   }
}
