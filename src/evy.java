import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class evy {
   private final azf a;
   private final baj b;
   private final Optional<js.a> c;
   private final Set<aku<?>> d;

   public evy(azf $$0, baj $$1, js.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public evy(azf $$0, baj $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private evy(azf $$0, baj $$1, Optional<js.a> $$2, Set<aku<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public evy a(String $$0) {
      return new evy(this.a.a($$0), this.b, this.c, this.d);
   }

   public evy a(String $$0, aku<?> $$1) {
      Set<aku<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new evy(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(aku<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(evt $$0) {
      Set<bai<?>> $$1 = $$0.a();
      Set<bai<?>> $$2 = Sets.difference($$1, this.b.b());
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

   public evy a(baj $$0) {
      return new evy(this.a, $$0, this.c, this.d);
   }

   public azf c() {
      return this.a;
   }
}
