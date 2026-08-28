import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class esz {
   private final azi a;
   private final evn b;
   private final Optional<jo.a> c;
   private final Set<ala<?>> d;

   public esz(azi $$0, evn $$1, jo.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public esz(azi $$0, evn $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private esz(azi $$0, evn $$1, Optional<jo.a> $$2, Set<ala<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public esz a(String $$0) {
      return new esz(this.a.a($$0), this.b, this.c, this.d);
   }

   public esz a(String $$0, ala<?> $$1) {
      Set<ala<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new esz(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ala<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(esu $$0) {
      this.b.a(this, $$0);
   }

   public jo.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public esz a(evn $$0) {
      return new esz(this.a, $$0, this.c, this.d);
   }

   public azi c() {
      return this.a;
   }
}
