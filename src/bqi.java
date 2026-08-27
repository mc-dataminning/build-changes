import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bqi extends bqf<bfz> {
   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.i);
   }

   @Override
   protected void a(aif $$0, bfz $$1) {
      $$1.dK().a(bpb.i, this.a($$1));
   }

   private List<bfz> a(bfz $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bfz $$0) {
      return $$0.ae() == bfn.bf && $$0.h_();
   }

   private bpd c(bfz $$0) {
      return $$0.dK().c(bpb.h).orElse(bpd.a());
   }
}
