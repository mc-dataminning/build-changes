import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class acz implements xd<yx> {
   private final boolean a;
   private final List<af> b;
   private final Set<ahd> c;
   private final Map<ahd, ah> d;

   public acz(boolean $$0, Collection<af> $$1, Set<ahd> $$2, Map<ahd, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public acz(ug $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, ug::t);
      this.d = $$0.a(ug::t, ah::b);
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, ug::a);
      $$0.a(this.d, ug::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<ahd> d() {
      return this.c;
   }

   public Map<ahd, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
