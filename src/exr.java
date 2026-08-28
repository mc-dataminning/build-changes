import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class exr {
   private final azq a;
   private final bau b;
   private final Optional<jt.a> c;
   private final Set<alc<?>> d;

   public exr(azq $$0, bau $$1, jt.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public exr(azq $$0, bau $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private exr(azq $$0, bau $$1, Optional<jt.a> $$2, Set<alc<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public exr a(String $$0) {
      return new exr(this.a.a($$0), this.b, this.c, this.d);
   }

   public exr a(String $$0, alc<?> $$1) {
      Set<alc<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new exr(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(alc<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(exm $$0) {
      Set<bat<?>> $$1 = $$0.a();
      Set<bat<?>> $$2 = Sets.difference($$1, this.b.b());
      if (!$$2.isEmpty()) {
         this.a.b("Parameters " + $$2 + " are not provided in this context");
      }
   }

   public jt.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public exr a(bau $$0) {
      return new exr(this.a, $$0, this.c, this.d);
   }

   public azq c() {
      return this.a;
   }
}
