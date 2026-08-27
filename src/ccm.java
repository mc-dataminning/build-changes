import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class ccm extends ccj<bsa> {
   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.i);
   }

   @Override
   protected void a(aqh $$0, bsa $$1) {
      $$1.dQ().a(cbd.i, this.a($$1));
   }

   private List<bsa> a(bsa $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bsa $$0) {
      return $$0.ai() == brn.bi && $$0.p_();
   }

   private cbf c(bsa $$0) {
      return $$0.dQ().c(cbd.h).orElse(cbf.a());
   }
}
