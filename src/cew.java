import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cew extends cet<buk> {
   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.i);
   }

   @Override
   protected void a(arh $$0, buk $$1) {
      $$1.dX().a(cdn.i, this.a($$1));
   }

   private List<buk> a(buk $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(buk $$0) {
      return $$0.ao() == btv.bj && $$0.o_();
   }

   private cdp c(buk $$0) {
      return $$0.dX().c(cdn.h).orElse(cdp.a());
   }
}
