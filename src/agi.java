import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class agi implements zh<abw> {
   public static final yy<wl, agi> a = zh.a(agi::a, agi::new);
   private final boolean b;
   private final List<aj> c;
   private final Set<ali> d;
   private final Map<ali, al> e;
   private final boolean f;

   public agi(boolean $$0, Collection<aj> $$1, Set<ali> $$2, Map<ali, al> $$3, boolean $$4) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
      this.f = $$4;
   }

   private agi(wl $$0) {
      this.b = $$0.readBoolean();
      this.c = aj.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vw::q);
      this.e = $$0.a(vw::q, al::b);
      this.f = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      aj.b.encode($$0, this.c);
      $$0.a(this.d, vw::a);
      $$0.a(this.e, vw::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.f);
   }

   @Override
   public zj<agi> a() {
      return agp.bf;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public List<aj> b() {
      return this.c;
   }

   public Set<ali> e() {
      return this.d;
   }

   public Map<ali, al> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }

   public boolean h() {
      return this.f;
   }
}
