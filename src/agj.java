import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agj implements zs<ace> {
   public static final zj<ww, agj> a = zs.a(agj::a, agj::new);
   private final boolean b;
   private final List<af> c;
   private final Set<alb> d;
   private final Map<alb, ah> e;

   public agj(boolean $$0, Collection<af> $$1, Set<alb> $$2, Map<alb, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private agj(ww $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, wl::q);
      this.e = $$0.a(wl::q, ah::b);
   }

   private void a(ww $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, wl::a);
      $$0.a(this.e, wl::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zu<agj> a() {
      return agq.ba;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<alb> e() {
      return this.d;
   }

   public Map<alb, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
