import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class byz<T extends box> extends bzg<T> {
   @Override
   protected void a(apa $$0, T $$1) {
      eoq $$2 = $$1.cE().c((double)this.b(), (double)this.c(), (double)this.b());
      List<box> $$3 = $$0.a(box.class, $$2, $$1x -> $$1x != $$1 && $$1x.bx());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bpy<?> $$4 = $$1.dM();
      $$4.a(bya.g, $$3);
      $$4.a(bya.h, new byc($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.g, bya.h);
   }
}
