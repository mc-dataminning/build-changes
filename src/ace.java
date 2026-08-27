import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ace implements wk<yd> {
   private final boolean a;
   private final List<af> b;
   private final Set<agi> c;
   private final Map<agi, ah> d;

   public ace(boolean $$0, Collection<af> $$1, Set<agi> $$2, Map<agi, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public ace(tu $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, tu::t);
      this.d = $$0.a(tu::t, ah::b);
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, tu::a);
      $$0.a(this.d, tu::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<agi> d() {
      return this.c;
   }

   public Map<agi, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
