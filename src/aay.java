import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aay implements vd<ww> {
   private final List<cmk<?>> a;

   public aay(Collection<cmk<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public aay(so $$0) {
      this.a = $$0.a(aay::b);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, aay::a);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public List<cmk<?>> a() {
      return this.a;
   }

   private static cmk<?> b(so $$0) {
      aew $$1 = $$0.s();
      aew $$2 = $$0.s();
      cmj<?> $$3 = jb.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$0);
      return new cmk<>($$2, $$3);
   }

   public static <T extends cmj<?>> void a(so $$0, cmk<?> $$1) {
      $$0.a(jb.u.b($$1.b().an_()));
      $$0.a($$1.a());
      ((cmm<cmj<?>>)$$1.b().an_()).a($$0, $$1.b());
   }
}
