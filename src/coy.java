import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface coy extends cpd, cpp, cpr {
   @Override
   default <T extends dcm> Optional<T> a(gu $$0, dco<T> $$1) {
      return cpp.super.a($$0, $$1);
   }

   @Override
   default List<ehx> c(@Nullable bii $$0, egz $$1) {
      return cpd.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bii $$0, ehx $$1) {
      return cpd.super.a($$0, $$1);
   }

   @Override
   default gu a(dkj.a $$0, gu $$1) {
      return cpp.super.a($$0, $$1);
   }
}
