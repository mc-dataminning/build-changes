import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface csk extends csp, ctb, ctd {
   @Override
   default <T extends dgd> Optional<T> a(hv $$0, dgf<T> $$1) {
      return ctb.super.a($$0, $$1);
   }

   @Override
   default List<elu> c(@Nullable blf $$0, ekw $$1) {
      return csp.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable blf $$0, elu $$1) {
      return csp.super.a($$0, $$1);
   }

   @Override
   default hv a(dny.a $$0, hv $$1) {
      return ctb.super.a($$0, $$1);
   }
}
