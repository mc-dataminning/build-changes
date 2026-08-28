import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agm implements zp<ace> {
   public static final zg<wt, agm> a = zp.a(agm::a, agm::new);
   private final boolean b;
   private final List<ah> c;
   private final Set<ali> d;
   private final Map<ali, aj> e;

   public agm(boolean $$0, Collection<ah> $$1, Set<ali> $$2, Map<ali, aj> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private agm(wt $$0) {
      this.b = $$0.readBoolean();
      this.c = ah.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, wf::q);
      this.e = $$0.a(wf::q, aj::b);
   }

   private void a(wt $$0) {
      $$0.a(this.b);
      ah.b.encode($$0, this.c);
      $$0.a(this.d, wf::a);
      $$0.a(this.e, wf::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zr<agm> a() {
      return agt.bb;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public List<ah> b() {
      return this.c;
   }

   public Set<ali> e() {
      return this.d;
   }

   public Map<ali, aj> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
