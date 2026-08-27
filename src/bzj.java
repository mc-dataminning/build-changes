import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bzj extends bzg<box> {
   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.i);
   }

   @Override
   protected void a(apa $$0, box $$1) {
      $$1.dM().a(bya.i, this.a($$1));
   }

   private List<box> a(box $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(box $$0) {
      return $$0.ai() == bol.bh && $$0.o_();
   }

   private byc c(box $$0) {
      return $$0.dM().c(bya.h).orElse(byc.a());
   }
}
