import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class abw implements wb<xu> {
   private final List<cno<?>> a;

   public abw(Collection<cno<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public abw(tl $$0) {
      this.a = $$0.a(abw::b);
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a, abw::a);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public List<cno<?>> a() {
      return this.a;
   }

   private static cno<?> b(tl $$0) {
      afw $$1 = $$0.t();
      afw $$2 = $$0.t();
      cnn<?> $$3 = jy.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new cno<>($$2, $$3);
   }

   public static <T extends cnn<?>> void a(tl $$0, cno<?> $$1) {
      $$0.a(jy.u.b($$1.b().aq_()));
      $$0.a($$1.a());
      ((cnq<cnn<?>>)$$1.b().aq_()).a($$0, $$1.b());
   }
}
