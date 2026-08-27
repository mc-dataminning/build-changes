import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class acf implements wk<yd> {
   private final List<coh<?>> a;

   public acf(Collection<coh<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public acf(tu $$0) {
      this.a = $$0.a(acf::b);
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, acf::a);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public List<coh<?>> a() {
      return this.a;
   }

   private static coh<?> b(tu $$0) {
      agg $$1 = $$0.t();
      agg $$2 = $$0.t();
      cof<?> $$3 = jy.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new coh<>($$2, $$3);
   }

   public static <T extends cof<?>> void a(tu $$0, coh<?> $$1) {
      $$0.a(jy.u.b($$1.b().aq_()));
      $$0.a($$1.a());
      ((coj<cof<?>>)$$1.b().aq_()).a($$0, $$1.b());
   }
}
