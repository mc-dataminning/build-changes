import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class fap {
   private final azx a;
   private final bbc b;
   private final Optional<jh.a> c;
   private final Set<alj<?>> d;

   public fap(azx $$0, bbc $$1, jh.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public fap(azx $$0, bbc $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private fap(azx $$0, bbc $$1, Optional<jh.a> $$2, Set<alj<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public fap a(String $$0) {
      return new fap(this.a.a($$0), this.b, this.c, this.d);
   }

   public fap a(String $$0, alj<?> $$1) {
      Set<alj<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new fap(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(alj<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(fak $$0) {
      Set<bbb<?>> $$1 = $$0.a();
      Set<bbb<?>> $$2 = Sets.difference($$1, this.b.b());
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

   public fap a(bbc $$0) {
      return new fap(this.a, $$0, this.c, this.d);
   }

   public azx c() {
      return this.a;
   }
}
