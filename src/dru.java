import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dru {
   czr c();

   static List<dru> d() {
      return mb.g.s().map(dru::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dru a(dgi $$0) {
      if ($$0.j() instanceof cuw $$1) {
         djn var6 = $$1.d();
         if (var6 instanceof dru) {
            return (dru)var6;
         }
      }

      cwm $$2 = $$0.j();
      return $$2 instanceof dru ? (dru)$$2 : null;
   }
}
