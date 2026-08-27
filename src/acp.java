import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class acp implements wu<yo> {
   private final boolean a;
   private final List<af> b;
   private final Set<agt> c;
   private final Map<agt, ah> d;

   public acp(boolean $$0, Collection<af> $$1, Set<agt> $$2, Map<agt, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public acp(ue $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, ue::t);
      this.d = $$0.a(ue::t, ah::b);
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, ue::a);
      $$0.a(this.d, ue::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<agt> d() {
      return this.c;
   }

   public Map<agt, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
