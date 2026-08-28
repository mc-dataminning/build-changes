import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agg implements zf<abu> {
   public static final yw<wj, agg> a = zf.a(agg::a, agg::new);
   private final boolean b;
   private final List<ai> c;
   private final Set<alg> d;
   private final Map<alg, ak> e;
   private final boolean f;

   public agg(boolean $$0, Collection<ai> $$1, Set<alg> $$2, Map<alg, ak> $$3, boolean $$4) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
      this.f = $$4;
   }

   private agg(wj $$0) {
      this.b = $$0.readBoolean();
      this.c = ai.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vu::q);
      this.e = $$0.a(vu::q, ak::b);
      this.f = $$0.readBoolean();
   }

   private void a(wj $$0) {
      $$0.a(this.b);
      ai.b.encode($$0, this.c);
      $$0.a(this.d, vu::a);
      $$0.a(this.e, vu::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.f);
   }

   @Override
   public zh<agg> a() {
      return agn.bf;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public List<ai> b() {
      return this.c;
   }

   public Set<alg> e() {
      return this.d;
   }

   public Map<alg, ak> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }

   public boolean h() {
      return this.f;
   }
}
