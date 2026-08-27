import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class btq extends btn<bji> {
   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.i);
   }

   @Override
   protected void a(aks $$0, bji $$1) {
      $$1.dN().a(bsj.i, this.a($$1));
   }

   private List<bji> a(bji $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bji $$0) {
      return $$0.ag() == biw.bf && $$0.m_();
   }

   private bsl c(bji $$0) {
      return $$0.dN().c(bsj.h).orElse(bsl.a());
   }
}
