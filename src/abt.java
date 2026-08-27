import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class abt implements wb<xu> {
   private final boolean a;
   private final List<af> b;
   private final Set<afw> c;
   private final Map<afw, ah> d;

   public abt(boolean $$0, Collection<af> $$1, Set<afw> $$2, Map<afw, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public abt(tl $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, tl::t);
      this.d = $$0.a(tl::t, ah::b);
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, tl::a);
      $$0.a(this.d, tl::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<afw> d() {
      return this.c;
   }

   public Map<afw, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
