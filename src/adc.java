import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class adc implements xf<za> {
   private final boolean a;
   private final List<af> b;
   private final Set<ahg> c;
   private final Map<ahg, ah> d;

   public adc(boolean $$0, Collection<af> $$1, Set<ahg> $$2, Map<ahg, ah> $$3) {
      this.a = $$0;
      this.b = List.copyOf($$1);
      this.c = Set.copyOf($$2);
      this.d = Map.copyOf($$3);
   }

   public adc(ui $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(af::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, ui::t);
      this.d = $$0.a(ui::t, ah::b);
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, ui::a);
      $$0.a(this.d, ui::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public List<af> a() {
      return this.b;
   }

   public Set<ahg> d() {
      return this.c;
   }

   public Map<ahg, ah> e() {
      return this.d;
   }

   public boolean f() {
      return this.a;
   }
}
