import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agk implements zj<aby> {
   public static final za<wn, agk> a = zj.a(agk::a, agk::new);
   private final boolean b;
   private final List<aj> c;
   private final Set<alk> d;
   private final Map<alk, al> e;
   private final boolean f;

   public agk(boolean $$0, Collection<aj> $$1, Set<alk> $$2, Map<alk, al> $$3, boolean $$4) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
      this.f = $$4;
   }

   private agk(wn $$0) {
      this.b = $$0.readBoolean();
      this.c = aj.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vy::q);
      this.e = $$0.a(vy::q, al::b);
      this.f = $$0.readBoolean();
   }

   private void a(wn $$0) {
      $$0.a(this.b);
      aj.b.encode($$0, this.c);
      $$0.a(this.d, vy::a);
      $$0.a(this.e, vy::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.f);
   }

   @Override
   public zl<agk> a() {
      return agr.bf;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public List<aj> b() {
      return this.c;
   }

   public Set<alk> e() {
      return this.d;
   }

   public Map<alk, al> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }

   public boolean h() {
      return this.f;
   }
}
