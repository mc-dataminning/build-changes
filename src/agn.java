import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agn implements zw<aci> {
   public static final zn<xa, agn> a = zw.a(agn::a, agn::new);
   private final boolean b;
   private final List<af> c;
   private final Set<alf> d;
   private final Map<alf, ah> e;

   public agn(boolean $$0, Collection<af> $$1, Set<alf> $$2, Map<alf, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private agn(xa $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, wm::q);
      this.e = $$0.a(wm::q, ah::b);
   }

   private void a(xa $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, wm::a);
      $$0.a(this.e, wm::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zy<agn> a() {
      return agu.ba;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<alf> e() {
      return this.d;
   }

   public Map<alf, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
