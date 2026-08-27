import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class aao implements uw<wo> {
   private final boolean a;
   private final Map<aep, ae.a> b;
   private final Set<aep> c;
   private final Map<aep, ag> d;

   public aao(boolean $$0, Collection<ae> $$1, Set<aep> $$2, Map<aep, ag> $$3) {
      this.a = $$0;
      Builder<aep, ae.a> $$4 = ImmutableMap.builder();

      for (ae $$5 : $$1) {
         $$4.put($$5.j(), $$5.a());
      }

      this.b = $$4.build();
      this.c = ImmutableSet.copyOf($$2);
      this.d = ImmutableMap.copyOf($$3);
   }

   public aao(sh $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(sh::s, ae.a::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, sh::s);
      this.d = $$0.a(sh::s, ag::b);
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sh::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, sh::a);
      $$0.a(this.d, sh::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public Map<aep, ae.a> a() {
      return this.b;
   }

   public Set<aep> d() {
      return this.c;
   }

   public Map<aep, ag> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
