import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class eui {
   private final azq a;
   private final eww b;
   private final Optional<jr.a> c;
   private final Set<alh<?>> d;

   public eui(azq $$0, eww $$1, jr.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public eui(azq $$0, eww $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private eui(azq $$0, eww $$1, Optional<jr.a> $$2, Set<alh<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eui a(String $$0) {
      return new eui(this.a.a($$0), this.b, this.c, this.d);
   }

   public eui a(String $$0, alh<?> $$1) {
      Set<alh<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eui(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(alh<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eud $$0) {
      this.b.a(this, $$0);
   }

   public jr.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public eui a(eww $$0) {
      return new eui(this.a, $$0, this.c, this.d);
   }

   public azq c() {
      return this.a;
   }
}
