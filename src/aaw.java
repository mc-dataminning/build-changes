import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aaw implements ve<wx> {
   private final boolean a;
   private final List<af> b;
   private final Set<aez> c;
   private final Map<aez, ah> d;

   public aaw(boolean $$0, Collection<af> $$1, Set<aez> $$2, Map<aez, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public aaw(so $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, so::t);
      this.d = $$0.a(so::t, ah::b);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, so::a);
      $$0.a(this.d, so::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<aez> d() {
      return this.c;
   }

   public Map<aez, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
