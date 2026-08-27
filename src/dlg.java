import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dlg {
   cwb b();

   static List<dlg> c() {
      return ld.h.s().map(dlg::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dlg a(dac $$0) {
      if ($$0.q() instanceof cqx $$1) {
         dde var6 = $$1.d();
         if (var6 instanceof dlg) {
            return (dlg)var6;
         }
      }

      csu $$2 = $$0.q();
      return $$2 instanceof dlg ? (dlg)$$2 : null;
   }
}
