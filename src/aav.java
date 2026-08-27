import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aav implements vd<ww> {
   private final boolean a;
   private final List<af> b;
   private final Set<aew> c;
   private final Map<aew, ah> d;

   public aav(boolean $$0, Collection<af> $$1, Set<aew> $$2, Map<aew, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public aav(so $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, so::s);
      this.d = $$0.a(so::s, ah::b);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, so::a);
      $$0.a(this.d, so::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<aew> d() {
      return this.c;
   }

   public Map<aew, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
