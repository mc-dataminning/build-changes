import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class afy implements zf<abt> {
   public static final yw<wj, afy> a = zf.a(afy::a, afy::new);
   private final boolean b;
   private final List<ag> c;
   private final Set<akq> d;
   private final Map<akq, ai> e;

   public afy(boolean $$0, Collection<ag> $$1, Set<akq> $$2, Map<akq, ai> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private afy(wj $$0) {
      this.b = $$0.readBoolean();
      this.c = ag.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vv::q);
      this.e = $$0.a(vv::q, ai::b);
   }

   private void a(wj $$0) {
      $$0.a(this.b);
      ag.b.encode($$0, this.c);
      $$0.a(this.d, vv::a);
      $$0.a(this.e, vv::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zh<afy> a() {
      return agf.ba;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public List<ag> b() {
      return this.c;
   }

   public Set<akq> e() {
      return this.d;
   }

   public Map<akq, ai> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
