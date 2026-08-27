import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bpy<T extends bfz> extends bqf<T> {
   @Override
   protected void a(aif $$0, T $$1) {
      eed $$2 = $$1.cE().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bfz> $$3 = $$0.a(bfz.class, $$2, $$1x -> $$1x != $$1 && $$1x.bs());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bha<?> $$4 = $$1.dK();
      $$4.a(bpb.g, $$3);
      $$4.a(bpb.h, new bpd($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.g, bpb.h);
   }
}
