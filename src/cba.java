import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cba extends cax<bqo> {
   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.i);
   }

   @Override
   protected void a(aps $$0, bqo $$1) {
      $$1.dP().a(bzr.i, this.a($$1));
   }

   private List<bqo> a(bqo $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bqo $$0) {
      return $$0.ai() == bqb.bi && $$0.p_();
   }

   private bzt c(bqo $$0) {
      return $$0.dP().c(bzr.h).orElse(bzt.a());
   }
}
