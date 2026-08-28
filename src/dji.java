import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dji extends djp, dka, dkc {
   @Override
   default <T extends dyc> Optional<T> a(iv $$0, dye<T> $$1) {
      return dka.super.a($$0, $$1);
   }

   @Override
   default List<fgk> c(@Nullable bwt $$0, ffl $$1) {
      return djp.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bwt $$0, fgk $$1) {
      return djp.super.a($$0, $$1);
   }

   @Override
   default iv a(ehd.a $$0, iv $$1) {
      return dka.super.a($$0, $$1);
   }
}
