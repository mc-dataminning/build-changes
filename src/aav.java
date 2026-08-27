import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aav implements va<ws> {
   private final List<cmf<?>> a;

   public aav(Collection<cmf<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public aav(sl $$0) {
      this.a = $$0.a(aav::b);
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a, aav::a);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public List<cmf<?>> a() {
      return this.a;
   }

   private static cmf<?> b(sl $$0) {
      aeu $$1 = $$0.s();
      aeu $$2 = $$0.s();
      cme<?> $$3 = jd.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new cmf<>($$2, $$3);
   }

   public static <T extends cme<?>> void a(sl $$0, cmf<?> $$1) {
      $$0.a(jd.u.b($$1.b().ai_()));
      $$0.a($$1.a());
      ((cmh<cme<?>>)$$1.b().ai_()).a($$0, $$1.b());
   }
}
