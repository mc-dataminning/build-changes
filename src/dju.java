import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dju extends dkb, dkm, dko {
   @Override
   default <T extends dyo> Optional<T> a(iw $$0, dyq<T> $$1) {
      return dkm.super.a($$0, $$1);
   }

   @Override
   default List<fgw> c(@Nullable bxe $$0, ffx $$1) {
      return dkb.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bxe $$0, fgw $$1) {
      return dkb.super.a($$0, $$1);
   }

   @Override
   default iw a(ehp.a $$0, iw $$1) {
      return dkm.super.a($$0, $$1);
   }
}
