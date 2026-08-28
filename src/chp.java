import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class chp extends chm<bxe> {
   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(cgg.i);
   }

   @Override
   protected void a(arq $$0, bxe $$1) {
      $$1.ec().a(cgg.i, this.a($$1));
   }

   private List<bxe> a(bxe $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bxe $$0) {
      return $$0.aq() == bwo.bD && $$0.n_();
   }

   private cgi c(bxe $$0) {
      return $$0.ec().c(cgg.h).orElse(cgi.a());
   }
}
