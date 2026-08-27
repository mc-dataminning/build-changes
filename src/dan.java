import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dan {
   bhr a();

   int b();

   static List<dan> c() {
      return jc.i.s().map(dan::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dan a(cpj $$0) {
      if ($$0.k() instanceof cgp $$1) {
         csk var6 = $$1.e();
         if (var6 instanceof dan) {
            return (dan)var6;
         }
      }

      cir $$2 = $$0.k();
      return $$2 instanceof dan ? (dan)$$2 : null;
   }
}
