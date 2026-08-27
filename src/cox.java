import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cox extends cpc, cpo, cpq {
   @Override
   default <T extends dcl> Optional<T> a(gu $$0, dcn<T> $$1) {
      return cpo.super.a($$0, $$1);
   }

   @Override
   default List<ehw> c(@Nullable bii $$0, egy $$1) {
      return cpc.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bii $$0, ehw $$1) {
      return cpc.super.a($$0, $$1);
   }

   @Override
   default gu a(dki.a $$0, gu $$1) {
      return cpo.super.a($$0, $$1);
   }
}
