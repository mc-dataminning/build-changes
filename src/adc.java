import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class adc implements xd<yx> {
   private final List<cpx<?>> a;

   public adc(Collection<cpx<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public adc(ug $$0) {
      this.a = $$0.a(adc::b);
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a, adc::a);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public List<cpx<?>> a() {
      return this.a;
   }

   private static cpx<?> b(ug $$0) {
      ahd $$1 = $$0.t();
      ahd $$2 = $$0.t();
      cpv<?> $$3 = kd.t.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new cpx<>($$2, $$3);
   }

   public static <T extends cpv<?>> void a(ug $$0, cpx<?> $$1) {
      $$0.a(kd.t.b($$1.b().ar_()));
      $$0.a($$1.a());
      ((cpz<cpv<?>>)$$1.b().ar_()).a($$0, $$1.b());
   }
}
