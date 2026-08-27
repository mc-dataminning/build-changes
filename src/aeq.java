import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aeq implements yb<aam> {
   public static final xs<vf, aeq> a = yb.a(aeq::a, aeq::new);
   private final boolean b;
   private final List<af> c;
   private final Set<ajh> d;
   private final Map<ajh, ah> e;

   public aeq(boolean $$0, Collection<af> $$1, Set<ajh> $$2, Map<ajh, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private aeq(vf $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, uu::q);
      this.e = $$0.a(uu::q, ah::b);
   }

   private void a(vf $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, uu::a);
      $$0.a(this.e, uu::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yd<aeq> a() {
      return aex.ba;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<ajh> e() {
      return this.d;
   }

   public Map<ajh, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
