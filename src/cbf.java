import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cbf extends cbc<bqt> {
   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.i);
   }

   @Override
   protected void a(apu $$0, bqt $$1) {
      $$1.dP().a(bzw.i, this.a($$1));
   }

   private List<bqt> a(bqt $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bqt $$0) {
      return $$0.ai() == bqg.bi && $$0.p_();
   }

   private bzy c(bqt $$0) {
      return $$0.dP().c(bzw.h).orElse(bzy.a());
   }
}
