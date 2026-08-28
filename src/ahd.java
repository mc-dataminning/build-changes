import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ahd implements aac<acr> {
   public static final zt<xg, ahd> a = aac.a(ahd::a, ahd::new);
   private final boolean b;
   private final List<ah> c;
   private final Set<alz> d;
   private final Map<alz, aj> e;

   public ahd(boolean $$0, Collection<ah> $$1, Set<alz> $$2, Map<alz, aj> $$3) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
   }

   private ahd(xg $$0) {
      this.b = $$0.readBoolean();
      this.c = ah.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, ws::q);
      this.e = $$0.a(ws::q, aj::b);
   }

   private void a(xg $$0) {
      $$0.a(this.b);
      ah.b.encode($$0, this.c);
      $$0.a(this.d, ws::a);
      $$0.a(this.e, ws::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aae<ahd> a() {
      return ahk.bf;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public List<ah> b() {
      return this.c;
   }

   public Set<alz> e() {
      return this.d;
   }

   public Map<alz, aj> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }
}
