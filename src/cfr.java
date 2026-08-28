import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cfr extends cfo<bve> {
   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.i);
   }

   @Override
   protected void a(arq $$0, bve $$1) {
      $$1.ee().a(cei.i, this.a($$1));
   }

   private List<bve> a(bve $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bve $$0) {
      return $$0.ar() == bup.bj && $$0.p_();
   }

   private cek c(bve $$0) {
      return $$0.ee().c(cei.h).orElse(cek.a());
   }
}
