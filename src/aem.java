import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aem implements xz<aai> {
   public static final xq<vd, aem> a = xz.a(aem::a, aem::new);
   private final boolean b;
   private final List<af> c;
   private final Set<ajc> d;
   private final Map<ajc, ah> e;

   public aem(boolean $$0, Collection<af> $$1, Set<ajc> $$2, Map<ajc, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private aem(vd $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, us::q);
      this.e = $$0.a(us::q, ah::b);
   }

   private void a(vd $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, us::a);
      $$0.a(this.e, us::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yb<aem> a() {
      return aet.ba;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<ajc> e() {
      return this.d;
   }

   public Map<ajc, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
