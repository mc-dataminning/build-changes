import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class ewn {
   private final bak a;
   private final ezb b;
   private final Optional<jr.a> c;
   private final Set<aly<?>> d;

   public ewn(bak $$0, ezb $$1, jr.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public ewn(bak $$0, ezb $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private ewn(bak $$0, ezb $$1, Optional<jr.a> $$2, Set<aly<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ewn a(String $$0) {
      return new ewn(this.a.a($$0), this.b, this.c, this.d);
   }

   public ewn a(String $$0, aly<?> $$1) {
      Set<aly<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new ewn(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(aly<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ewi $$0) {
      this.b.a(this, $$0);
   }

   public jr.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public ewn a(ezb $$0) {
      return new ewn(this.a, $$0, this.c, this.d);
   }

   public bak c() {
      return this.a;
   }
}
