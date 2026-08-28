import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dgk extends dgq, dhc, dhe {
   @Override
   default <T extends duq> Optional<T> a(jh $$0, dus<T> $$1) {
      return dhc.super.a($$0, $$1);
   }

   @Override
   default List<fcl> c(@Nullable bvb $$0, fbm $$1) {
      return dgq.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bvb $$0, fcl $$1) {
      return dgq.super.a($$0, $$1);
   }

   @Override
   default jh a(edj.a $$0, jh $$1) {
      return dhc.super.a($$0, $$1);
   }
}
