import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aba implements vf<wy> {
   private final List<cmm<?>> a;

   public aba(Collection<cmm<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public aba(sq $$0) {
      this.a = $$0.a(aba::b);
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, aba::a);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public List<cmm<?>> a() {
      return this.a;
   }

   private static cmm<?> b(sq $$0) {
      aey $$1 = $$0.s();
      aey $$2 = $$0.s();
      cml<?> $$3 = jd.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new cmm<>($$2, $$3);
   }

   public static <T extends cml<?>> void a(sq $$0, cmm<?> $$1) {
      $$0.a(jd.u.b($$1.b().an_()));
      $$0.a($$1.a());
      ((cmo<cml<?>>)$$1.b().an_()).a($$0, $$1.b());
   }
}
