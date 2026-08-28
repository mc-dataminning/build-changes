import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dbf extends dbk, dbw, dby {
   @Override
   default <T extends dpc> Optional<T> a(iz $$0, dpe<T> $$1) {
      return dbw.super.a($$0, $$1);
   }

   @Override
   default List<ewf> c(@Nullable bsp $$0, evh $$1) {
      return dbk.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bsp $$0, ewf $$1) {
      return dbk.super.a($$0, $$1);
   }

   @Override
   default iz a(dxp.a $$0, iz $$1) {
      return dbw.super.a($$0, $$1);
   }
}
