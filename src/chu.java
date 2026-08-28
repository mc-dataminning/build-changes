import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class chu extends chr<bxj> {
   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.i);
   }

   @Override
   protected void a(arq $$0, bxj $$1) {
      $$1.eb().a(cgl.i, this.a($$1));
   }

   private List<bxj> a(bxj $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bxj $$0) {
      return $$0.an() == bwr.bD && $$0.n_();
   }

   private cgn c(bxj $$0) {
      return $$0.eb().c(cgl.h).orElse(cgn.a());
   }
}
