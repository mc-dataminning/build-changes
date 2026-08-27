import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class adg implements xg<zb> {
   private final List<cqm<?>> a;

   public adg(Collection<cqm<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public adg(uj $$0) {
      this.a = $$0.a(adg::b);
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a, adg::a);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public List<cqm<?>> a() {
      return this.a;
   }

   private static cqm<?> b(uj $$0) {
      ahh $$1 = $$0.t();
      ahh $$2 = $$0.t();
      cqk<?> $$3 = kd.t.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new cqm<>($$2, $$3);
   }

   public static <T extends cqk<?>> void a(uj $$0, cqm<?> $$1) {
      $$0.a(kd.t.b($$1.b().at_()));
      $$0.a($$1.a());
      ((cqo<cqk<?>>)$$1.b().at_()).a($$0, $$1.b());
   }
}
