import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface drs {
   czp c();

   static List<drs> d() {
      return mb.g.s().map(drs::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static drs a(dgg $$0) {
      if ($$0.j() instanceof cuu $$1) {
         djl var6 = $$1.d();
         if (var6 instanceof drs) {
            return (drs)var6;
         }
      }

      cwk $$2 = $$0.j();
      return $$2 instanceof drs ? (drs)$$2 : null;
   }
}
