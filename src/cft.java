import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cft extends cfq<bvg> {
   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.i);
   }

   @Override
   protected void a(ard $$0, bvg $$1) {
      $$1.eb().a(cek.i, this.a($$1));
   }

   private List<bvg> a(bvg $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bvg $$0) {
      return $$0.aq() == bur.bC && $$0.e_();
   }

   private cem c(bvg $$0) {
      return $$0.eb().c(cek.h).orElse(cem.a());
   }
}
