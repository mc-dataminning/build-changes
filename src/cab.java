import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cab extends bzy<bpp> {
   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.i);
   }

   @Override
   protected void a(apf $$0, bpp $$1) {
      $$1.dP().a(bys.i, this.a($$1));
   }

   private List<bpp> a(bpp $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bpp $$0) {
      return $$0.ai() == bpd.bj && $$0.o_();
   }

   private byu c(bpp $$0) {
      return $$0.dP().c(bys.h).orElse(byu.a());
   }
}
