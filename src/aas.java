import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aas implements va<ws> {
   private final boolean a;
   private final List<af> b;
   private final Set<aeu> c;
   private final Map<aeu, ah> d;

   public aas(boolean $$0, Collection<af> $$1, Set<aeu> $$2, Map<aeu, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public aas(sl $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, sl::s);
      this.d = $$0.a(sl::s, ah::b);
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, sl::a);
      $$0.a(this.d, sl::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<aeu> d() {
      return this.c;
   }

   public Map<aeu, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
