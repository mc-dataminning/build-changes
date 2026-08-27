import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class acs implements wu<yo> {
   private final List<cpn<?>> a;

   public acs(Collection<cpn<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public acs(ue $$0) {
      this.a = $$0.a(acs::b);
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, acs::a);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public List<cpn<?>> a() {
      return this.a;
   }

   private static cpn<?> b(ue $$0) {
      agt $$1 = $$0.t();
      agt $$2 = $$0.t();
      cpl<?> $$3 = kb.t.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new cpn<>($$2, $$3);
   }

   public static <T extends cpl<?>> void a(ue $$0, cpn<?> $$1) {
      $$0.a(kb.t.b($$1.b().ar_()));
      $$0.a($$1.a());
      ((cpp<cpl<?>>)$$1.b().ar_()).a($$0, $$1.b());
   }
}
