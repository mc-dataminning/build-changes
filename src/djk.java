import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface djk extends djr, dkc, dke {
   @Override
   default <T extends dye> Optional<T> a(iw $$0, dyg<T> $$1) {
      return dkc.super.a($$0, $$1);
   }

   @Override
   default List<fgm> c(@Nullable bwv $$0, ffn $$1) {
      return djr.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bwv $$0, fgm $$1) {
      return djr.super.a($$0, $$1);
   }

   @Override
   default iw a(ehf.a $$0, iw $$1) {
      return dkc.super.a($$0, $$1);
   }
}
