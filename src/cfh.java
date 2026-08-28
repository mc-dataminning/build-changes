import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cfh<T extends bve> extends cfo<T> {
   @Override
   protected void a(arq $$0, T $$1) {
      double $$2 = $$1.h(bwm.m);
      ezm $$3 = $$1.cT().c($$2, $$2, $$2);
      List<bve> $$4 = $$0.a(bve.class, $$3, $$1x -> $$1x != $$1 && $$1x.bN());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bwg<?> $$5 = $$1.ee();
      $$5.a(cei.g, $$4);
      $$5.a(cei.h, new cek($$1, $$4));
   }

   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.g, cei.h);
   }
}
