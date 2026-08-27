import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class afj implements xx<aes> {
   public static final xo<uq, afj> a = xx.a(afj::a, afj::new);
   public static final int b = 4;
   private static final int c = 128;
   private static final int d = 8192;
   private static final int e = 200;
   private final int f;
   private final List<String> g;
   private final Optional<String> h;

   public afj(int $$0, List<String> $$1, Optional<String> $$2) {
      this.f = $$0;
      this.g = ImmutableList.copyOf($$1);
      this.h = $$2;
   }

   private afj(uq $$0) {
      this.f = $$0.n();
      this.g = $$0.a(uq.a(Lists::newArrayListWithCapacity, 200), $$0x -> $$0x.d(8192));
      this.h = $$0.b((xp<? super uq, String>)($$0x -> $$0x.d(128)));
   }

   private void a(uq $$0) {
      $$0.c(this.f);
      $$0.a(this.g, ($$0x, $$1) -> $$0x.a($$1, 8192));
      $$0.a(this.h, ($$0x, $$1) -> $$0x.a($$1, 128));
   }

   @Override
   public xz<afj> a() {
      return aeq.bs;
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   public List<String> b() {
      return this.g;
   }

   public Optional<String> e() {
      return this.h;
   }

   public int f() {
      return this.f;
   }
}
