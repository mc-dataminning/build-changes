import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agr implements zo<acf> {
   public static final ze<wp, agr> a = zo.a(agr::a, agr::new);
   private final boolean b;
   private final List<aj> c;
   private final Set<alr> d;
   private final Map<alr, al> e;
   private final boolean f;

   public agr(boolean $$0, Collection<aj> $$1, Set<alr> $$2, Map<alr, al> $$3, boolean $$4) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
      this.f = $$4;
   }

   private agr(wp $$0) {
      this.b = $$0.readBoolean();
      this.c = aj.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vy::q);
      this.e = $$0.a(vy::q, al::b);
      this.f = $$0.readBoolean();
   }

   private void a(wp $$0) {
      $$0.a(this.b);
      aj.b.encode($$0, this.c);
      $$0.a(this.d, vy::a);
      $$0.a(this.e, vy::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.f);
   }

   @Override
   public zq<agr> a() {
      return agy.bf;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public List<aj> b() {
      return this.c;
   }

   public Set<alr> e() {
      return this.d;
   }

   public Map<alr, al> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }

   public boolean h() {
      return this.f;
   }
}
