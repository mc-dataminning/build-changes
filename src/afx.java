import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class afx implements yw<abl> {
   public static final yn<wa, afx> a = yw.a(afx::a, afx::new);
   private final boolean b;
   private final List<ai> c;
   private final Set<akv> d;
   private final Map<akv, ak> e;

   public afx(boolean $$0, Collection<ai> $$1, Set<akv> $$2, Map<akv, ak> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private afx(wa $$0) {
      this.b = $$0.readBoolean();
      this.c = ai.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vl::q);
      this.e = $$0.a(vl::q, ak::b);
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      ai.b.encode($$0, this.c);
      $$0.a(this.d, vl::a);
      $$0.a(this.e, vl::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yy<afx> a() {
      return age.bf;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public List<ai> b() {
      return this.c;
   }

   public Set<akv> e() {
      return this.d;
   }

   public Map<akv, ak> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
