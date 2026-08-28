import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class ewo {
   private final baa a;
   private final bbe b;
   private final Optional<jr.a> c;
   private final Set<alo<?>> d;

   public ewo(baa $$0, bbe $$1, jr.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public ewo(baa $$0, bbe $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private ewo(baa $$0, bbe $$1, Optional<jr.a> $$2, Set<alo<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ewo a(String $$0) {
      return new ewo(this.a.a($$0), this.b, this.c, this.d);
   }

   public ewo a(String $$0, alo<?> $$1) {
      Set<alo<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new ewo(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(alo<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ewj $$0) {
      Set<bbd<?>> $$1 = $$0.a();
      Set<bbd<?>> $$2 = Sets.difference($$1, this.b.b());
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

   public ewo a(bbe $$0) {
      return new ewo(this.a, $$0, this.c, this.d);
   }

   public baa c() {
      return this.a;
   }
}
