import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class abo implements ux<aaw> {
   public static final int a = 4;
   private static final int b = 128;
   private static final int c = 8192;
   private static final int d = 200;
   private final int e;
   private final List<String> f;
   private final Optional<String> g;

   public abo(int $$0, List<String> $$1, Optional<String> $$2) {
      this.e = $$0;
      this.f = ImmutableList.copyOf($$1);
      this.g = $$2;
   }

   public abo(si $$0) {
      this.e = $$0.m();
      this.f = $$0.a(si.a(Lists::newArrayListWithCapacity, 200), $$0x -> $$0x.d(8192));
      this.g = $$0.b((si.a<String>)($$0x -> $$0x.d(128)));
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.e);
      $$0.a(this.f, ($$0x, $$1) -> $$0x.a($$1, 8192));
      $$0.a(this.g, ($$0x, $$1) -> $$0x.a($$1, 128));
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public List<String> a() {
      return this.f;
   }

   public Optional<String> d() {
      return this.g;
   }

   public int e() {
      return this.e;
   }
}
