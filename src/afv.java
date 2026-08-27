import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class afv implements ze<abq> {
   public static final yv<wi, afv> a = ze.a(afv::a, afv::new);
   private final boolean b;
   private final List<af> c;
   private final Set<akn> d;
   private final Map<akn, ah> e;

   public afv(boolean $$0, Collection<af> $$1, Set<akn> $$2, Map<akn, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private afv(wi $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vx::q);
      this.e = $$0.a(vx::q, ah::b);
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, vx::a);
      $$0.a(this.e, vx::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zg<afv> a() {
      return agc.ba;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<akn> e() {
      return this.d;
   }

   public Map<akn, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
