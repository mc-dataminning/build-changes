import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class etr {
   private final azl a;
   private final ewf b;
   private final Optional<jp.a> c;
   private final Set<ald<?>> d;

   public etr(azl $$0, ewf $$1, jp.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public etr(azl $$0, ewf $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private etr(azl $$0, ewf $$1, Optional<jp.a> $$2, Set<ald<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public etr a(String $$0) {
      return new etr(this.a.a($$0), this.b, this.c, this.d);
   }

   public etr a(String $$0, ald<?> $$1) {
      Set<ald<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new etr(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ald<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(etm $$0) {
      this.b.a(this, $$0);
   }

   public jp.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public etr a(ewf $$0) {
      return new etr(this.a, $$0, this.c, this.d);
   }

   public azl c() {
      return this.a;
   }
}
