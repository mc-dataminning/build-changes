import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agl implements zo<acd> {
   public static final zf<ws, agl> a = zo.a(agl::a, agl::new);
   private final boolean b;
   private final List<ag> c;
   private final Set<alh> d;
   private final Map<alh, ai> e;

   public agl(boolean $$0, Collection<ag> $$1, Set<alh> $$2, Map<alh, ai> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private agl(ws $$0) {
      this.b = $$0.readBoolean();
      this.c = ag.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, we::q);
      this.e = $$0.a(we::q, ai::b);
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      ag.b.encode($$0, this.c);
      $$0.a(this.d, we::a);
      $$0.a(this.e, we::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zq<agl> a() {
      return ags.bb;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public List<ag> b() {
      return this.c;
   }

   public Set<alh> e() {
      return this.d;
   }

   public Map<alh, ai> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
