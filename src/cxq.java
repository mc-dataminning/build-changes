import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface cxq {
   bey a();

   int b();

   static List<cxq> c() {
      return jb.i.s().map(cxq::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static cxq a(cml $$0) {
      if ($$0.k() instanceof cds $$1) {
         cpn var6 = $$1.e();
         if (var6 instanceof cxq) {
            return (cxq)var6;
         }
      }

      cfu $$2 = $$0.k();
      return $$2 instanceof cxq ? (cxq)$$2 : null;
   }
}
