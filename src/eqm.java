import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eqm {
   private final azd a;
   private final eta b;
   private final jj.a c;
   private final Set<ald<?>> d;

   public eqm(azd $$0, eta $$1, jj.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eqm(azd $$0, eta $$1, jj.a $$2, Set<ald<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eqm a(String $$0) {
      return new eqm(this.a.a($$0), this.b, this.c, this.d);
   }

   public eqm a(String $$0, ald<?> $$1) {
      Set<ald<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eqm(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ald<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eqh $$0) {
      this.b.a(this, $$0);
   }

   public jj.a a() {
      return this.c;
   }

   public eqm a(eta $$0) {
      return new eqm(this.a, $$0, this.c, this.d);
   }
}
