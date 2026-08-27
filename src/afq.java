import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class afq implements zb<abm> {
   public static final ys<wf, afq> a = zb.a(afq::a, afq::new);
   private final boolean b;
   private final List<af> c;
   private final Set<akh> d;
   private final Map<akh, ah> e;

   public afq(boolean $$0, Collection<af> $$1, Set<akh> $$2, Map<akh, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private afq(wf $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vu::q);
      this.e = $$0.a(vu::q, ah::b);
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, vu::a);
      $$0.a(this.e, vu::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zd<afq> a() {
      return afx.ba;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<akh> e() {
      return this.d;
   }

   public Map<akh, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
