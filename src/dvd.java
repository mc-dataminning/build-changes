import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dvd {
   dcp c();

   static List<dvd> d() {
      return mg.g.s().map(dvd::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dvd a(djl $$0) {
      if ($$0.h() instanceof cxv $$1) {
         dmr var6 = $$1.c();
         if (var6 instanceof dvd) {
            return (dvd)var6;
         }
      }

      czj $$2 = $$0.h();
      return $$2 instanceof dvd ? (dvd)$$2 : null;
   }
}
