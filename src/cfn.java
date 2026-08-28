import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cfn extends cfk<bva> {
   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.i);
   }

   @Override
   protected void a(arn $$0, bva $$1) {
      $$1.ed().a(cee.i, this.a($$1));
   }

   private List<bva> a(bva $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bva $$0) {
      return $$0.ar() == bul.bj && $$0.p_();
   }

   private ceg c(bva $$0) {
      return $$0.ed().c(cee.h).orElse(ceg.a());
   }
}
