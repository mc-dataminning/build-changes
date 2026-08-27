import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class add implements xg<zb> {
   private final boolean a;
   private final List<af> b;
   private final Set<ahh> c;
   private final Map<ahh, ah> d;

   public add(boolean $$0, Collection<af> $$1, Set<ahh> $$2, Map<ahh, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public add(uj $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, uj::t);
      this.d = $$0.a(uj::t, ah::b);
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, uj::a);
      $$0.a(this.d, uj::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<ahh> d() {
      return this.c;
   }

   public Map<ahh, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
