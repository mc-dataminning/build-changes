import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class ezz {
   private final azt a;
   private final bay b;
   private final Optional<jg.a> c;
   private final Set<alf<?>> d;

   public ezz(azt $$0, bay $$1, jg.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public ezz(azt $$0, bay $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private ezz(azt $$0, bay $$1, Optional<jg.a> $$2, Set<alf<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ezz a(String $$0) {
      return new ezz(this.a.a($$0), this.b, this.c, this.d);
   }

   public ezz a(String $$0, alf<?> $$1) {
      Set<alf<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new ezz(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(alf<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ezu $$0) {
      Set<bax<?>> $$1 = $$0.a();
      Set<bax<?>> $$2 = Sets.difference($$1, this.b.b());
      if (!$$2.isEmpty()) {
         this.a.b("Parameters " + $$2 + " are not provided in this context");
      }
   }

   public jg.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public ezz a(bay $$0) {
      return new ezz(this.a, $$0, this.c, this.d);
   }

   public azt c() {
      return this.a;
   }
}
