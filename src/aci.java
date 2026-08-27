import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aci implements wo<yh> {
   private final boolean a;
   private final List<af> b;
   private final Set<agm> c;
   private final Map<agm, ah> d;

   public aci(boolean $$0, Collection<af> $$1, Set<agm> $$2, Map<agm, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public aci(ty $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, ty::t);
      this.d = $$0.a(ty::t, ah::b);
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, ty::a);
      $$0.a(this.d, ty::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<agm> d() {
      return this.c;
   }

   public Map<agm, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
