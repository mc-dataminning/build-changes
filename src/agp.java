import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agp implements zs<ach> {
   public static final zj<ww, agp> a = zs.a(agp::a, agp::new);
   private final boolean b;
   private final List<ah> c;
   private final Set<all> d;
   private final Map<all, aj> e;

   public agp(boolean $$0, Collection<ah> $$1, Set<all> $$2, Map<all, aj> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private agp(ww $$0) {
      this.b = $$0.readBoolean();
      this.c = ah.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, wi::q);
      this.e = $$0.a(wi::q, aj::b);
   }

   private void a(ww $$0) {
      $$0.a(this.b);
      ah.b.encode($$0, this.c);
      $$0.a(this.d, wi::a);
      $$0.a(this.e, wi::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zu<agp> a() {
      return agw.bb;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public List<ah> b() {
      return this.c;
   }

   public Set<all> e() {
      return this.d;
   }

   public Map<all, aj> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
