import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bpv extends bqf<bfz> {
   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.W);
   }

   @Override
   protected void a(aif $$0, bfz $$1) {
      if ($$1.aV()) {
         $$1.dK().a(bpb.W, apz.a);
      } else {
         $$1.dK().b(bpb.W);
      }
   }
}
