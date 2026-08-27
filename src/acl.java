import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class acl implements wo<yh> {
   private final List<cov<?>> a;

   public acl(Collection<cov<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public acl(ty $$0) {
      this.a = $$0.a(acl::b);
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a, acl::a);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public List<cov<?>> a() {
      return this.a;
   }

   private static cov<?> b(ty $$0) {
      agm $$1 = $$0.t();
      agm $$2 = $$0.t();
      cot<?> $$3 = kc.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new cov<>($$2, $$3);
   }

   public static <T extends cot<?>> void a(ty $$0, cov<?> $$1) {
      $$0.a(kc.u.b($$1.b().as_()));
      $$0.a($$1.a());
      ((cox<cot<?>>)$$1.b().as_()).a($$0, $$1.b());
   }
}
