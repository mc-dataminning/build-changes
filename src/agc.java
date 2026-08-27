import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agc implements zl<abw> {
   public static final zc<wp, agc> a = zl.a(agc::a, agc::new);
   private final boolean b;
   private final List<ag> c;
   private final Set<akt> d;
   private final Map<akt, ai> e;

   public agc(boolean $$0, Collection<ag> $$1, Set<akt> $$2, Map<akt, ai> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private agc(wp $$0) {
      this.b = $$0.readBoolean();
      this.c = ag.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, we::q);
      this.e = $$0.a(we::q, ai::b);
   }

   private void a(wp $$0) {
      $$0.a(this.b);
      ag.b.encode($$0, this.c);
      $$0.a(this.d, we::a);
      $$0.a(this.e, we::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zn<agc> a() {
      return agj.bc;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public List<ag> b() {
      return this.c;
   }

   public Set<akt> e() {
      return this.d;
   }

   public Map<akt, ai> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
