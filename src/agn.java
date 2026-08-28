import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agn implements zq<acf> {
   public static final zh<wu, agn> a = zq.a(agn::a, agn::new);
   private final boolean b;
   private final List<ah> c;
   private final Set<alj> d;
   private final Map<alj, aj> e;

   public agn(boolean $$0, Collection<ah> $$1, Set<alj> $$2, Map<alj, aj> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private agn(wu $$0) {
      this.b = $$0.readBoolean();
      this.c = ah.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, wg::q);
      this.e = $$0.a(wg::q, aj::b);
   }

   private void a(wu $$0) {
      $$0.a(this.b);
      ah.b.encode($$0, this.c);
      $$0.a(this.d, wg::a);
      $$0.a(this.e, wg::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zs<agn> a() {
      return agu.bb;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public List<ah> b() {
      return this.c;
   }

   public Set<alj> e() {
      return this.d;
   }

   public Map<alj, aj> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
