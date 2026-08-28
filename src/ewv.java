import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class ewv {
   private final bak a;
   private final bbo b;
   private final Optional<jr.a> c;
   private final Set<aly<?>> d;

   public ewv(bak $$0, bbo $$1, jr.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public ewv(bak $$0, bbo $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private ewv(bak $$0, bbo $$1, Optional<jr.a> $$2, Set<aly<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ewv a(String $$0) {
      return new ewv(this.a.a($$0), this.b, this.c, this.d);
   }

   public ewv a(String $$0, aly<?> $$1) {
      Set<aly<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new ewv(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(aly<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ewq $$0) {
      Set<bbn<?>> $$1 = $$0.a();
      Set<bbn<?>> $$2 = Sets.difference($$1, this.b.b());
      if (!$$2.isEmpty()) {
         this.a.b("Parameters " + $$2 + " are not provided in this context");
      }
   }

   public jr.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public ewv a(bbo $$0) {
      return new ewv(this.a, $$0, this.c, this.d);
   }

   public bak c() {
      return this.a;
   }
}
