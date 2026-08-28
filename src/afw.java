import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class afw implements yv<abk> {
   public static final ym<vz, afw> a = yv.a(afw::a, afw::new);
   private final boolean b;
   private final List<ai> c;
   private final Set<aku> d;
   private final Map<aku, ak> e;

   public afw(boolean $$0, Collection<ai> $$1, Set<aku> $$2, Map<aku, ak> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private afw(vz $$0) {
      this.b = $$0.readBoolean();
      this.c = ai.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vl::q);
      this.e = $$0.a(vl::q, ak::b);
   }

   private void a(vz $$0) {
      $$0.a(this.b);
      ai.b.encode($$0, this.c);
      $$0.a(this.d, vl::a);
      $$0.a(this.e, vl::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yx<afw> a() {
      return agd.bf;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public List<ai> b() {
      return this.c;
   }

   public Set<aku> e() {
      return this.d;
   }

   public Map<aku, ak> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
