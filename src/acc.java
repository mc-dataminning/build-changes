import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class acc implements wk<yd> {
   private final boolean a;
   private final List<af> b;
   private final Set<agg> c;
   private final Map<agg, ah> d;

   public acc(boolean $$0, Collection<af> $$1, Set<agg> $$2, Map<agg, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public acc(tu $$0) {
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

   public Set<agg> d() {
      return this.c;
   }

   public Map<agg, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
