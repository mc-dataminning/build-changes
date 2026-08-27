import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dbm extends dbr, dcd, dcf {
   @Override
   default <T extends dqc> Optional<T> a(ir $$0, dqe<T> $$1) {
      return dcd.super.a($$0, $$1);
   }

   @Override
   default List<exn> a(@Nullable brv $$0, ewp $$1) {
      return dbr.super.a($$0, $$1);
   }

   @Override
   default boolean a(@Nullable brv $$0, exn $$1) {
      return dbr.super.a($$0, $$1);
   }

   @Override
   default ir a(dyu.a $$0, ir $$1) {
      return dcd.super.a($$0, $$1);
   }
}
