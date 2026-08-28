import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class afs implements zb<abn> {
   public static final ys<wf, afs> a = zb.a(afs::a, afs::new);
   private final boolean b;
   private final List<af> c;
   private final Set<akk> d;
   private final Map<akk, ah> e;

   public afs(boolean $$0, Collection<af> $$1, Set<akk> $$2, Map<akk, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private afs(wf $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vr::q);
      this.e = $$0.a(vr::q, ah::b);
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, vr::a);
      $$0.a(this.e, vr::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zd<afs> a() {
      return afz.ba;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<akk> e() {
      return this.d;
   }

   public Map<akk, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
