import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class ach implements wk<yd> {
   private final List<coq<?>> a;

   public ach(Collection<coq<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public ach(tu $$0) {
      this.a = $$0.a(ach::b);
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, ach::a);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public List<coq<?>> a() {
      return this.a;
   }

   private static coq<?> b(tu $$0) {
      agi $$1 = $$0.t();
      agi $$2 = $$0.t();
      coo<?> $$3 = jy.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new coq<>($$2, $$3);
   }

   public static <T extends coo<?>> void a(tu $$0, coq<?> $$1) {
      $$0.a(jy.u.b($$1.b().aq_()));
      $$0.a($$1.a());
      ((cos<coo<?>>)$$1.b().aq_()).a($$0, $$1.b());
   }
}
