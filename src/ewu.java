import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class ewu {
   private final azf a;
   private final baj b;
   private final Optional<js.a> c;
   private final Set<akt<?>> d;

   public ewu(azf $$0, baj $$1, js.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public ewu(azf $$0, baj $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private ewu(azf $$0, baj $$1, Optional<js.a> $$2, Set<akt<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ewu a(String $$0) {
      return new ewu(this.a.a($$0), this.b, this.c, this.d);
   }

   public ewu a(String $$0, akt<?> $$1) {
      Set<akt<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new ewu(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(akt<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ewp $$0) {
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

   public ewu a(baj $$0) {
      return new ewu(this.a, $$0, this.c, this.d);
   }

   public azf c() {
      return this.a;
   }
}
