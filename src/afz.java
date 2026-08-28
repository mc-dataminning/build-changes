import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class afz implements zg<abu> {
   public static final yx<wk, afz> a = zg.a(afz::a, afz::new);
   private final boolean b;
   private final List<ag> c;
   private final Set<akr> d;
   private final Map<akr, ai> e;

   public afz(boolean $$0, Collection<ag> $$1, Set<akr> $$2, Map<akr, ai> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private afz(wk $$0) {
      this.b = $$0.readBoolean();
      this.c = ag.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vw::q);
      this.e = $$0.a(vw::q, ai::b);
   }

   private void a(wk $$0) {
      $$0.a(this.b);
      ag.b.encode($$0, this.c);
      $$0.a(this.d, vw::a);
      $$0.a(this.e, vw::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zi<afz> a() {
      return agg.ba;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public List<ag> b() {
      return this.c;
   }

   public Set<akr> e() {
      return this.d;
   }

   public Map<akr, ai> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
