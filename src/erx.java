import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class erx {
   private final ayu a;
   private final eul b;
   private final Optional<jn.a> c;
   private final Set<akq<?>> d;

   public erx(ayu $$0, eul $$1, jn.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public erx(ayu $$0, eul $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private erx(ayu $$0, eul $$1, Optional<jn.a> $$2, Set<akq<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public erx a(String $$0) {
      return new erx(this.a.a($$0), this.b, this.c, this.d);
   }

   public erx a(String $$0, akq<?> $$1) {
      Set<akq<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new erx(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(akq<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ers $$0) {
      this.b.a(this, $$0);
   }

   public jn.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public erx a(eul $$0) {
      return new erx(this.a, $$0, this.c, this.d);
   }

   public ayu c() {
      return this.a;
   }
}
