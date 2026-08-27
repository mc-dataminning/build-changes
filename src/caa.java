import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class caa extends bzx<bpo> {
   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.i);
   }

   @Override
   protected void a(apf $$0, bpo $$1) {
      $$1.dP().a(byr.i, this.a($$1));
   }

   private List<bpo> a(bpo $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bpo $$0) {
      return $$0.ai() == bpc.bi && $$0.o_();
   }

   private byt c(bpo $$0) {
      return $$0.dP().c(byr.h).orElse(byt.a());
   }
}
