import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class faz {
   private final bag a;
   private final bbl b;
   private final Optional<jh.a> c;
   private final Set<alq<?>> d;

   public faz(bag $$0, bbl $$1, jh.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public faz(bag $$0, bbl $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private faz(bag $$0, bbl $$1, Optional<jh.a> $$2, Set<alq<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public faz a(String $$0) {
      return new faz(this.a.a($$0), this.b, this.c, this.d);
   }

   public faz a(String $$0, alq<?> $$1) {
      Set<alq<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new faz(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(alq<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(fau $$0) {
      Set<bbk<?>> $$1 = $$0.a();
      Set<bbk<?>> $$2 = Sets.difference($$1, this.b.b());
      if (!$$2.isEmpty()) {
         this.a.b("Parameters " + $$2 + " are not provided in this context");
      }
   }

   public jh.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public faz a(bbl $$0) {
      return new faz(this.a, $$0, this.c, this.d);
   }

   public bag c() {
      return this.a;
   }
}
