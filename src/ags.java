import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ags implements zr<acg> {
   public static final zi<wv, ags> a = zr.a(ags::a, ags::new);
   private final boolean b;
   private final List<ah> c;
   private final Set<alp> d;
   private final Map<alp, aj> e;

   public ags(boolean $$0, Collection<ah> $$1, Set<alp> $$2, Map<alp, aj> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private ags(wv $$0) {
      this.b = $$0.readBoolean();
      this.c = ah.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, wh::q);
      this.e = $$0.a(wh::q, aj::b);
   }

   private void a(wv $$0) {
      $$0.a(this.b);
      ah.b.encode($$0, this.c);
      $$0.a(this.d, wh::a);
      $$0.a(this.e, wh::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zt<ags> a() {
      return agz.bf;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public List<ah> b() {
      return this.c;
   }

   public Set<alp> e() {
      return this.d;
   }

   public Map<alp, aj> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
