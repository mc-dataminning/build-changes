import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eqn {
   private final aze a;
   private final etb b;
   private final jj.a c;
   private final Set<ald<?>> d;

   public eqn(aze $$0, etb $$1, jj.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eqn(aze $$0, etb $$1, jj.a $$2, Set<ald<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eqn a(String $$0) {
      return new eqn(this.a.a($$0), this.b, this.c, this.d);
   }

   public eqn a(String $$0, ald<?> $$1) {
      Set<ald<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eqn(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ald<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eqi $$0) {
      this.b.a(this, $$0);
   }

   public jj.a a() {
      return this.c;
   }

   public eqn a(etb $$0) {
      return new eqn(this.a, $$0, this.c, this.d);
   }
}
