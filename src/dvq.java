import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dvq {
   ddc c();

   static List<dvq> d() {
      return mh.g.s().map(dvq::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dvq a(djy $$0) {
      if ($$0.h() instanceof cyi $$1) {
         dne var6 = $$1.c();
         if (var6 instanceof dvq) {
            return (dvq)var6;
         }
      }

      czw $$2 = $$0.h();
      return $$2 instanceof dvq ? (dvq)$$2 : null;
   }
}
