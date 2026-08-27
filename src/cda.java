import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cda extends ccx<bso> {
   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.i);
   }

   @Override
   protected void a(aqt $$0, bso $$1) {
      $$1.dZ().a(cbr.i, this.a($$1));
   }

   private List<bso> a(bso $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bso $$0) {
      return $$0.ak() == bsb.bn && $$0.o_();
   }

   private cbt c(bso $$0) {
      return $$0.dZ().c(cbr.h).orElse(cbt.a());
   }
}
