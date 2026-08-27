import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aas implements ux<wp> {
   private final List<cma<?>> a;

   public aas(Collection<cma<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public aas(si $$0) {
      this.a = $$0.a(aas::b);
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a, aas::a);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public List<cma<?>> a() {
      return this.a;
   }

   public static cma<?> b(si $$0) {
      aer $$1 = $$0.s();
      aer $$2 = $$0.s();
      return jb.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$2, $$0);
   }

   public static <T extends cma<?>> void a(si $$0, T $$1) {
      $$0.a(jb.u.b($$1.ai_()));
      $$0.a($$1.e());
      ((cmc<T>)$$1.ai_()).a($$0, $$1);
   }
}
