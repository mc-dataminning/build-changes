import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aej implements xx<aag> {
   public static final xo<vb, aej> a = xx.a(aej::a, aej::new);
   private final boolean b;
   private final List<af> c;
   private final Set<aiy> d;
   private final Map<aiy, ah> e;

   public aej(boolean $$0, Collection<af> $$1, Set<aiy> $$2, Map<aiy, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private aej(vb $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, uq::s);
      this.e = $$0.a(uq::s, ah::b);
   }

   private void a(vb $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, uq::a);
      $$0.a(this.e, uq::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public xz<aej> a() {
      return aeq.aZ;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<aiy> e() {
      return this.d;
   }

   public Map<aiy, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
