import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class chk extends chh<bwz> {
   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.i);
   }

   @Override
   protected void a(aro $$0, bwz $$1) {
      $$1.eb().a(cgb.i, this.a($$1));
   }

   private List<bwz> a(bwz $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bwz $$0) {
      return $$0.aq() == bwj.bD && $$0.n_();
   }

   private cgd c(bwz $$0) {
      return $$0.eb().c(cgb.h).orElse(cgd.a());
   }
}
