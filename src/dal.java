import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dal extends daq, dbc, dbe {
   @Override
   default <T extends doi> Optional<T> a(io $$0, dok<T> $$1) {
      return dbc.super.a($$0, $$1);
   }

   @Override
   default List<evf> c(@Nullable brw $$0, euh $$1) {
      return daq.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable brw $$0, evf $$1) {
      return daq.super.a($$0, $$1);
   }

   @Override
   default io a(dwv.a $$0, io $$1) {
      return dbc.super.a($$0, $$1);
   }
}
