import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class evv {
   private final aze a;
   private final bai b;
   private final Optional<js.a> c;
   private final Set<akt<?>> d;

   public evv(aze $$0, bai $$1, js.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public evv(aze $$0, bai $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private evv(aze $$0, bai $$1, Optional<js.a> $$2, Set<akt<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public evv a(String $$0) {
      return new evv(this.a.a($$0), this.b, this.c, this.d);
   }

   public evv a(String $$0, akt<?> $$1) {
      Set<akt<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new evv(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(akt<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(evq $$0) {
      Set<bah<?>> $$1 = $$0.a();
      Set<bah<?>> $$2 = Sets.difference($$1, this.b.b());
      if (!$$2.isEmpty()) {
         this.a.b("Parameters " + $$2 + " are not provided in this context");
      }
   }

   public js.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public evv a(bai $$0) {
      return new evv(this.a, $$0, this.c, this.d);
   }

   public aze c() {
      return this.a;
   }
}
