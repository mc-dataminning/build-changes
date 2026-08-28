import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class eut {
   private final azs a;
   private final exh b;
   private final Optional<jr.a> c;
   private final Set<ali<?>> d;

   public eut(azs $$0, exh $$1, jr.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public eut(azs $$0, exh $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private eut(azs $$0, exh $$1, Optional<jr.a> $$2, Set<ali<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eut a(String $$0) {
      return new eut(this.a.a($$0), this.b, this.c, this.d);
   }

   public eut a(String $$0, ali<?> $$1) {
      Set<ali<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eut(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ali<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(euo $$0) {
      this.b.a(this, $$0);
   }

   public jr.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public eut a(exh $$0) {
      return new eut(this.a, $$0, this.c, this.d);
   }

   public azs c() {
      return this.a;
   }
}
