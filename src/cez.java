import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cez extends cfj<cmt> {
   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cek.B)));
   }

   protected void a(ard $$0, cmt $$1) {
      super.a($$0, $$1);
      $$1.eb()
         .c(cek.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bup.e)
         .filter($$2 -> cfq.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.eb().a(cek.B, $$1x), () -> $$1.eb().b(cek.B));
   }
}
