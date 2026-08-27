import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bte<T extends bjg> extends btl<T> {
   @Override
   protected void a(akr $$0, T $$1) {
      ehi $$2 = $$1.cG().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bjg> $$3 = $$0.a(bjg.class, $$2, $$1x -> $$1x != $$1 && $$1x.bv());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bkg<?> $$4 = $$1.dN();
      $$4.a(bsh.g, $$3);
      $$4.a(bsh.h, new bsj($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.g, bsh.h);
   }
}
