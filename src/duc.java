import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface duc {
   dbu c();

   static List<duc> d() {
      return mf.g.s().map(duc::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static duc a(dio $$0) {
      if ($$0.h() instanceof cxa $$1) {
         dlu var6 = $$1.c();
         if (var6 instanceof duc) {
            return (duc)var6;
         }
      }

      cyo $$2 = $$0.h();
      return $$2 instanceof duc ? (duc)$$2 : null;
   }
}
