import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eqj {
   private final aza a;
   private final esx b;
   private final jj.a c;
   private final Set<ala<?>> d;

   public eqj(aza $$0, esx $$1, jj.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eqj(aza $$0, esx $$1, jj.a $$2, Set<ala<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eqj a(String $$0) {
      return new eqj(this.a.a($$0), this.b, this.c, this.d);
   }

   public eqj a(String $$0, ala<?> $$1) {
      Set<ala<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eqj(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ala<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eqe $$0) {
      this.b.a(this, $$0);
   }

   public jj.a a() {
      return this.c;
   }

   public eqj a(esx $$0) {
      return new eqj(this.a, $$0, this.c, this.d);
   }
}
