import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class afo implements yz<abk> {
   public static final yq<wd, afo> a = yz.a(afo::a, afo::new);
   private final boolean b;
   private final List<af> c;
   private final Set<akf> d;
   private final Map<akf, ah> e;

   public afo(boolean $$0, Collection<af> $$1, Set<akf> $$2, Map<akf, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private afo(wd $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vs::q);
      this.e = $$0.a(vs::q, ah::b);
   }

   private void a(wd $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, vs::a);
      $$0.a(this.e, vs::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zb<afo> a() {
      return afv.ba;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<akf> e() {
      return this.d;
   }

   public Map<akf, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
