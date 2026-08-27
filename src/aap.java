import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class aap implements ux<wp> {
   private final boolean a;
   private final Map<aer, ae.a> b;
   private final Set<aer> c;
   private final Map<aer, ag> d;

   public aap(boolean $$0, Collection<ae> $$1, Set<aer> $$2, Map<aer, ag> $$3) {
      this.a = $$0;
      Builder<aer, ae.a> $$4 = ImmutableMap.builder();

      for (ae $$5 : $$1) {
         $$4.put($$5.j(), $$5.a());
      }

      this.b = $$4.build();
      this.c = ImmutableSet.copyOf($$2);
      this.d = ImmutableMap.copyOf($$3);
   }

   public aap(si $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(si::s, ae.a::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, si::s);
      this.d = $$0.a(si::s, ag::b);
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b, si::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, si::a);
      $$0.a(this.d, si::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public Map<aer, ae.a> a() {
      return this.b;
   }

   public Set<aer> d() {
      return this.c;
   }

   public Map<aer, ag> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
