import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aar implements uw<wo> {
   private final List<clz<?>> a;

   public aar(Collection<clz<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public aar(sh $$0) {
      this.a = $$0.a(aar::b);
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a, aar::a);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public List<clz<?>> a() {
      return this.a;
   }

   public static clz<?> b(sh $$0) {
      aep $$1 = $$0.s();
      aep $$2 = $$0.s();
      return jc.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$2, $$0);
   }

   public static <T extends clz<?>> void a(sh $$0, T $$1) {
      $$0.a(jc.u.b($$1.aj_()));
      $$0.a($$1.e());
      ((cmb<T>)$$1.aj_()).a($$0, $$1);
   }
}
