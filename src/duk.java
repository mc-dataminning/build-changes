import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface duk {
   dca c();

   static List<duk> d() {
      return mf.g.s().map(duk::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static duk a(diu $$0) {
      if ($$0.h() instanceof cxg $$1) {
         dma var6 = $$1.c();
         if (var6 instanceof duk) {
            return (duk)var6;
         }
      }

      cyu $$2 = $$0.h();
      return $$2 instanceof duk ? (duk)$$2 : null;
   }
}
