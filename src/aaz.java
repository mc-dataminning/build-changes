import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aaz implements ve<wx> {
   private final List<cmq<?>> a;

   public aaz(Collection<cmq<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public aaz(so $$0) {
      this.a = $$0.a(aaz::b);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, aaz::a);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public List<cmq<?>> a() {
      return this.a;
   }

   private static cmq<?> b(so $$0) {
      aez $$1 = $$0.t();
      aez $$2 = $$0.t();
      cmp<?> $$3 = jb.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new cmq<>($$2, $$3);
   }

   public static <T extends cmp<?>> void a(so $$0, cmq<?> $$1) {
      $$0.a(jb.u.b($$1.b().an_()));
      $$0.a($$1.a());
      ((cms<cmp<?>>)$$1.b().an_()).a($$0, $$1.b());
   }
}
