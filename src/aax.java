import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aax implements vf<wy> {
   private final boolean a;
   private final List<af> b;
   private final Set<aey> c;
   private final Map<aey, ah> d;

   public aax(boolean $$0, Collection<af> $$1, Set<aey> $$2, Map<aey, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public aax(sq $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, sq::s);
      this.d = $$0.a(sq::s, ah::b);
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, sq::a);
      $$0.a(this.d, sq::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<aey> d() {
      return this.c;
   }

   public Map<aey, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
