import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class adf implements xf<za> {
   private final List<cqd<?>> a;

   public adf(Collection<cqd<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public adf(ui $$0) {
      this.a = $$0.a(adf::b);
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, adf::a);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public List<cqd<?>> a() {
      return this.a;
   }

   private static cqd<?> b(ui $$0) {
      ahg $$1 = $$0.t();
      ahg $$2 = $$0.t();
      cqb<?> $$3 = kd.t.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new cqd<>($$2, $$3);
   }

   public static <T extends cqb<?>> void a(ui $$0, cqd<?> $$1) {
      $$0.a(kd.t.b($$1.b().ar_()));
      $$0.a($$1.a());
      ((cqf<cqb<?>>)$$1.b().ar_()).a($$0, $$1.b());
   }
}
