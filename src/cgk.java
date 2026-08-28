import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cgk extends cgh<bvx> {
   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.i);
   }

   @Override
   protected void a(arx $$0, bvx $$1) {
      $$1.ec().a(cfb.i, this.a($$1));
   }

   private List<bvx> a(bvx $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bvx $$0) {
      return $$0.aq() == bvi.bD && $$0.e_();
   }

   private cfd c(bvx $$0) {
      return $$0.ec().c(cfb.h).orElse(cfd.a());
   }
}
