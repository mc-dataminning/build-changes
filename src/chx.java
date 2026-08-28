import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class chx<T extends bxw> extends cie<T> {
   @Override
   protected void a(aru $$0, T $$1) {
      double $$2 = $$1.h(bzc.m);
      ffn $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bxw> $$4 = $$0.a(bxw.class, $$3, $$1x -> $$1x != $$1 && $$1x.bJ());
      $$4.sort(Comparator.comparingDouble($$1::g));
      byw<?> $$5 = $$1.ec();
      $$5.a(cgy.g, $$4);
      $$5.a(cgy.h, new cha($$0, $$1, $$4));
   }

   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.g, cgy.h);
   }
}
