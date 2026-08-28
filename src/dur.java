import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dur {
   dcf c();

   static List<dur> d() {
      return mf.g.s().map(dur::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dur a(diz $$0) {
      if ($$0.h() instanceof cxl $$1) {
         dmf var6 = $$1.c();
         if (var6 instanceof dur) {
            return (dur)var6;
         }
      }

      cyz $$2 = $$0.h();
      return $$2 instanceof dur ? (dur)$$2 : null;
   }
}
