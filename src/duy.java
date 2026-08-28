import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface duy {
   dcm c();

   static List<duy> d() {
      return mg.g.s().map(duy::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static duy a(djg $$0) {
      if ($$0.h() instanceof cxs $$1) {
         dmm var6 = $$1.c();
         if (var6 instanceof duy) {
            return (duy)var6;
         }
      }

      czg $$2 = $$0.h();
      return $$2 instanceof duy ? (duy)$$2 : null;
   }
}
