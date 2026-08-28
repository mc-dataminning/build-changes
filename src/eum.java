import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class eum {
   private final azt a;
   private final exa b;
   private final Optional<jr.a> c;
   private final Set<alk<?>> d;

   public eum(azt $$0, exa $$1, jr.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public eum(azt $$0, exa $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private eum(azt $$0, exa $$1, Optional<jr.a> $$2, Set<alk<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eum a(String $$0) {
      return new eum(this.a.a($$0), this.b, this.c, this.d);
   }

   public eum a(String $$0, alk<?> $$1) {
      Set<alk<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eum(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(alk<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(euh $$0) {
      this.b.a(this, $$0);
   }

   public jr.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public eum a(exa $$0) {
      return new eum(this.a, $$0, this.c, this.d);
   }

   public azt c() {
      return this.a;
   }
}
