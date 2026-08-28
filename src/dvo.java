import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dvo {
   dda c();

   static List<dvo> d() {
      return mg.g.s().map(dvo::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dvo a(djw $$0) {
      if ($$0.h() instanceof cyg $$1) {
         dnc var6 = $$1.c();
         if (var6 instanceof dvo) {
            return (dvo)var6;
         }
      }

      czu $$2 = $$0.h();
      return $$2 instanceof dvo ? (dvo)$$2 : null;
   }
}
