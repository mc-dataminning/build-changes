import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class caq<T extends bqo> extends cax<T> {
   @Override
   protected void a(aps $$0, T $$1) {
      erv $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bqo> $$3 = $$0.a(bqo.class, $$2, $$1x -> $$1x != $$1 && $$1x.bA());
      $$3.sort(Comparator.comparingDouble($$1::g));
      brp<?> $$4 = $$1.dP();
      $$4.a(bzr.g, $$3);
      $$4.a(bzr.h, new bzt($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.g, bzr.h);
   }
}
