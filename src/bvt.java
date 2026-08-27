import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bvt extends bvq<bll> {
   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.i);
   }

   @Override
   protected void a(ami $$0, bll $$1) {
      $$1.dP().a(bum.i, this.a($$1));
   }

   private List<bll> a(bll $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bll $$0) {
      return $$0.ai() == bkz.bf && $$0.o_();
   }

   private buo c(bll $$0) {
      return $$0.dP().c(bum.h).orElse(buo.a());
   }
}
