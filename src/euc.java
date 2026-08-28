import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class euc {
   private final azp a;
   private final ewq b;
   private final Optional<jq.a> c;
   private final Set<alg<?>> d;

   public euc(azp $$0, ewq $$1, jq.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public euc(azp $$0, ewq $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private euc(azp $$0, ewq $$1, Optional<jq.a> $$2, Set<alg<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public euc a(String $$0) {
      return new euc(this.a.a($$0), this.b, this.c, this.d);
   }

   public euc a(String $$0, alg<?> $$1) {
      Set<alg<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new euc(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(alg<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(etx $$0) {
      this.b.a(this, $$0);
   }

   public jq.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public euc a(ewq $$0) {
      return new euc(this.a, $$0, this.c, this.d);
   }

   public azp c() {
      return this.a;
   }
}
