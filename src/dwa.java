import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dwa {
   ddm c();

   static List<dwa> d() {
      return mh.g.s().map(dwa::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dwa a(dki $$0) {
      if ($$0.h() instanceof cys $$1) {
         dno var6 = $$1.c();
         if (var6 instanceof dwa) {
            return (dwa)var6;
         }
      }

      dag $$2 = $$0.h();
      return $$2 instanceof dwa ? (dwa)$$2 : null;
   }
}
