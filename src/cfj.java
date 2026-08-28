import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cfj<T extends bvg> extends cfq<T> {
   @Override
   protected void a(arc $$0, T $$1) {
      double $$2 = $$1.h(bwo.m);
      fav $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bvg> $$4 = $$0.a(bvg.class, $$3, $$1x -> $$1x != $$1 && $$1x.bL());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bwi<?> $$5 = $$1.ec();
      $$5.a(cek.g, $$4);
      $$5.a(cek.h, new cem($$0, $$1, $$4));
   }

   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.g, cek.h);
   }
}
