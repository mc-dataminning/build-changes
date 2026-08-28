import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agh implements zk<abz> {
   public static final zb<wo, agh> a = zk.a(agh::a, agh::new);
   private final boolean b;
   private final List<ag> c;
   private final Set<alc> d;
   private final Map<alc, ai> e;

   public agh(boolean $$0, Collection<ag> $$1, Set<alc> $$2, Map<alc, ai> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private agh(wo $$0) {
      this.b = $$0.readBoolean();
      this.c = ag.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, wa::q);
      this.e = $$0.a(wa::q, ai::b);
   }

   private void a(wo $$0) {
      $$0.a(this.b);
      ag.b.encode($$0, this.c);
      $$0.a(this.d, wa::a);
      $$0.a(this.e, wa::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zm<agh> a() {
      return ago.bb;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public List<ag> b() {
      return this.c;
   }

   public Set<alc> e() {
      return this.d;
   }

   public Map<alc, ai> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
