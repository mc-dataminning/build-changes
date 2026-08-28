import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class etn {
   private final azj a;
   private final ewb b;
   private final Optional<jo.a> c;
   private final Set<alb<?>> d;

   public etn(azj $$0, ewb $$1, jo.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public etn(azj $$0, ewb $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private etn(azj $$0, ewb $$1, Optional<jo.a> $$2, Set<alb<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public etn a(String $$0) {
      return new etn(this.a.a($$0), this.b, this.c, this.d);
   }

   public etn a(String $$0, alb<?> $$1) {
      Set<alb<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new etn(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(alb<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eti $$0) {
      this.b.a(this, $$0);
   }

   public jo.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public etn a(ewb $$0) {
      return new etn(this.a, $$0, this.c, this.d);
   }

   public azj c() {
      return this.a;
   }
}
