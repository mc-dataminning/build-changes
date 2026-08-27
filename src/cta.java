import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cta extends ctf, ctr, ctt {
   @Override
   default <T extends dgu> Optional<T> a(hx $$0, dgw<T> $$1) {
      return ctr.super.a($$0, $$1);
   }

   @Override
   default List<eml> c(@Nullable blu $$0, eln $$1) {
      return ctf.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable blu $$0, eml $$1) {
      return ctf.super.a($$0, $$1);
   }

   @Override
   default hx a(dop.a $$0, hx $$1) {
      return ctr.super.a($$0, $$1);
   }
}
