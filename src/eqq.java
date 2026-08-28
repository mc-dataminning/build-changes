import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eqq {
   private final azf a;
   private final ete b;
   private final jj.a c;
   private final Set<ale<?>> d;

   public eqq(azf $$0, ete $$1, jj.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eqq(azf $$0, ete $$1, jj.a $$2, Set<ale<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eqq a(String $$0) {
      return new eqq(this.a.a($$0), this.b, this.c, this.d);
   }

   public eqq a(String $$0, ale<?> $$1) {
      Set<ale<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eqq(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ale<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eql $$0) {
      this.b.a(this, $$0);
   }

   public jj.a a() {
      return this.c;
   }

   public eqq a(ete $$0) {
      return new eqq(this.a, $$0, this.c, this.d);
   }
}
