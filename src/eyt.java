import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class eyt {
   private final azr a;
   private final baw b;
   private final Optional<jf.a> c;
   private final Set<ald<?>> d;

   public eyt(azr $$0, baw $$1, jf.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public eyt(azr $$0, baw $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private eyt(azr $$0, baw $$1, Optional<jf.a> $$2, Set<ald<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eyt a(String $$0) {
      return new eyt(this.a.a($$0), this.b, this.c, this.d);
   }

   public eyt a(String $$0, ald<?> $$1) {
      Set<ald<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eyt(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ald<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eyo $$0) {
      Set<bav<?>> $$1 = $$0.a();
      Set<bav<?>> $$2 = Sets.difference($$1, this.b.b());
      if (!$$2.isEmpty()) {
         this.a.b("Parameters " + $$2 + " are not provided in this context");
      }
   }

   public jf.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public eyt a(baw $$0) {
      return new eyt(this.a, $$0, this.c, this.d);
   }

   public azr c() {
      return this.a;
   }
}
