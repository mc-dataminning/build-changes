import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class fan {
   private final azv a;
   private final bba b;
   private final Optional<jg.a> c;
   private final Set<alh<?>> d;

   public fan(azv $$0, bba $$1, jg.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public fan(azv $$0, bba $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private fan(azv $$0, bba $$1, Optional<jg.a> $$2, Set<alh<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public fan a(String $$0) {
      return new fan(this.a.a($$0), this.b, this.c, this.d);
   }

   public fan a(String $$0, alh<?> $$1) {
      Set<alh<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new fan(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(alh<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(fai $$0) {
      Set<baz<?>> $$1 = $$0.a();
      Set<baz<?>> $$2 = Sets.difference($$1, this.b.b());
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

   public fan a(bba $$0) {
      return new fan(this.a, $$0, this.c, this.d);
   }

   public azv c() {
      return this.a;
   }
}
