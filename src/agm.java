import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agm implements zv<ach> {
   public static final zm<wz, agm> a = zv.a(agm::a, agm::new);
   private final boolean b;
   private final List<af> c;
   private final Set<ale> d;
   private final Map<ale, ah> e;

   public agm(boolean $$0, Collection<af> $$1, Set<ale> $$2, Map<ale, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private agm(wz $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, wl::q);
      this.e = $$0.a(wl::q, ah::b);
   }

   private void a(wz $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, wl::a);
      $$0.a(this.e, wl::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zx<agm> a() {
      return agt.ba;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<ale> e() {
      return this.d;
   }

   public Map<ale, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
