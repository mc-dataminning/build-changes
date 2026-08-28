import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agi implements zl<aca> {
   public static final zc<wp, agi> a = zl.a(agi::a, agi::new);
   private final boolean b;
   private final List<ag> c;
   private final Set<ale> d;
   private final Map<ale, ai> e;

   public agi(boolean $$0, Collection<ag> $$1, Set<ale> $$2, Map<ale, ai> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private agi(wp $$0) {
      this.b = $$0.readBoolean();
      this.c = ag.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, wb::q);
      this.e = $$0.a(wb::q, ai::b);
   }

   private void a(wp $$0) {
      $$0.a(this.b);
      ag.b.encode($$0, this.c);
      $$0.a(this.d, wb::a);
      $$0.a(this.e, wb::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zn<agi> a() {
      return agp.bb;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public List<ag> b() {
      return this.c;
   }

   public Set<ale> e() {
      return this.d;
   }

   public Map<ale, ai> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
