import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class afc implements yn<aay> {
   public static final ye<vr, afc> a = yn.a(afc::a, afc::new);
   private final boolean b;
   private final List<af> c;
   private final Set<ajt> d;
   private final Map<ajt, ah> e;

   public afc(boolean $$0, Collection<af> $$1, Set<ajt> $$2, Map<ajt, ah> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private afc(vr $$0) {
      this.b = $$0.readBoolean();
      this.c = af.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vg::q);
      this.e = $$0.a(vg::q, ah::b);
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      af.b.encode($$0, this.c);
      $$0.a(this.d, vg::a);
      $$0.a(this.e, vg::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yp<afc> a() {
      return afj.ba;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public List<af> b() {
      return this.c;
   }

   public Set<ajt> e() {
      return this.d;
   }

   public Map<ajt, ah> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
