import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class age implements zd<abs> {
   public static final yu<wh, age> a = zd.a(age::a, age::new);
   private final boolean b;
   private final List<ai> c;
   private final Set<ale> d;
   private final Map<ale, ak> e;
   private final boolean f;

   public age(boolean $$0, Collection<ai> $$1, Set<ale> $$2, Map<ale, ak> $$3, boolean $$4) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
      this.f = $$4;
   }

   private age(wh $$0) {
      this.b = $$0.readBoolean();
      this.c = ai.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, vs::q);
      this.e = $$0.a(vs::q, ak::b);
      this.f = $$0.readBoolean();
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      ai.b.encode($$0, this.c);
      $$0.a(this.d, vs::a);
      $$0.a(this.e, vs::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.f);
   }

   @Override
   public zf<age> a() {
      return agl.bf;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public List<ai> b() {
      return this.c;
   }

   public Set<ale> e() {
      return this.d;
   }

   public Map<ale, ak> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }

   public boolean h() {
      return this.f;
   }
}
