import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dqa {
   cyw b();

   static List<dqa> c() {
      return lx.g.s().map(dqa::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dqa a(deu $$0) {
      if ($$0.j() instanceof cuc $$1) {
         dhy var6 = $$1.d();
         if (var6 instanceof dqa) {
            return (dqa)var6;
         }
      }

      cvt $$2 = $$0.j();
      return $$2 instanceof dqa ? (dqa)$$2 : null;
   }
}
