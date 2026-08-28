import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eqp {
   private final azf a;
   private final etd b;
   private final jj.a c;
   private final Set<ale<?>> d;

   public eqp(azf $$0, etd $$1, jj.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eqp(azf $$0, etd $$1, jj.a $$2, Set<ale<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eqp a(String $$0) {
      return new eqp(this.a.a($$0), this.b, this.c, this.d);
   }

   public eqp a(String $$0, ale<?> $$1) {
      Set<ale<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eqp(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ale<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eqk $$0) {
      this.b.a(this, $$0);
   }

   public jj.a a() {
      return this.c;
   }

   public eqp a(etd $$0) {
      return new eqp(this.a, $$0, this.c, this.d);
   }
}
