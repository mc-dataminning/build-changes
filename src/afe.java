import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class afe implements yp<aba> {
   public static final yg<vt, afe> a = yp.a(afe::a, afe::new);
   private final boolean b;
   private final List<af> c;
   private final Set<ajv> d;
   private final Map<ajv, ah> e;

   public afe(boolean $$0, Collection<af> $$1, Set<ajv> $$2, Map<ajv, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private afe(vt $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vi::q);
      this.e = $$0.a(vi::q, ah::b);
   }

   private void a(vt $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, vi::a);
      $$0.a(this.e, vi::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yr<afe> a() {
      return afl.ba;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<ajv> e() {
      return this.d;
   }

   public Map<ajv, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
