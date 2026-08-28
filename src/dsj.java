import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dsj {
   dal b();

   static List<dsj> c() {
      return ma.g.s().map(dsj::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dsj a(dgz $$0) {
      if ($$0.j() instanceof cvq $$1) {
         dke var6 = $$1.d();
         if (var6 instanceof dsj) {
            return (dsj)var6;
         }
      }

      cxg $$2 = $$0.j();
      return $$2 instanceof dsj ? (dsj)$$2 : null;
   }
}
