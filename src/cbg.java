import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cbg<T extends bre> extends cbn<T> {
   @Override
   protected void a(aqe $$0, T $$1) {
      eta $$2 = $$1.cI().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bre> $$3 = $$0.a(bre.class, $$2, $$1x -> $$1x != $$1 && $$1x.bB());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bsf<?> $$4 = $$1.dQ();
      $$4.a(cah.g, $$3);
      $$4.a(cah.h, new caj($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.g, cah.h);
   }
}
