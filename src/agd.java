import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agd implements zc<abr> {
   public static final yt<wg, agd> a = zc.a(agd::a, agd::new);
   private final boolean b;
   private final List<ai> c;
   private final Set<ald> d;
   private final Map<ald, ak> e;
   private final boolean f;

   public agd(boolean $$0, Collection<ai> $$1, Set<ald> $$2, Map<ald, ak> $$3, boolean $$4) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
      this.f = $$4;
   }

   private agd(wg $$0) {
      this.b = $$0.readBoolean();
      this.c = ai.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vr::q);
      this.e = $$0.a(vr::q, ak::b);
      this.f = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      ai.b.encode($$0, this.c);
      $$0.a(this.d, vr::a);
      $$0.a(this.e, vr::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.f);
   }

   @Override
   public ze<agd> a() {
      return agk.bf;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public List<ai> b() {
      return this.c;
   }

   public Set<ald> e() {
      return this.d;
   }

   public Map<ald, ak> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }

   public boolean h() {
      return this.f;
   }
}
