import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aaw implements ve<wx> {
   private final boolean a;
   private final List<af> b;
   private final Set<aex> c;
   private final Map<aex, ah> d;

   public aaw(boolean $$0, Collection<af> $$1, Set<aex> $$2, Map<aex, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public aaw(sp $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, sp::s);
      this.d = $$0.a(sp::s, ah::b);
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, sp::a);
      $$0.a(this.d, sp::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<aex> d() {
      return this.c;
   }

   public Map<aex, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
