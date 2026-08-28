import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cer extends ceo<buf> {
   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.i);
   }

   @Override
   protected void a(arg $$0, buf $$1) {
      $$1.dX().a(cdi.i, this.a($$1));
   }

   private List<buf> a(buf $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(buf $$0) {
      return $$0.ao() == btq.bj && $$0.o_();
   }

   private cdk c(buf $$0) {
      return $$0.dX().c(cdi.h).orElse(cdk.a());
   }
}
