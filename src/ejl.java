import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ejl {
   private final awn a;
   private final ell b;
   private final ejg c;
   private final Set<eje<?>> d;

   public ejl(awn $$0, ell $$1, ejg $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private ejl(awn $$0, ell $$1, ejg $$2, Set<eje<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ejl a(String $$0) {
      return new ejl(this.a.a($$0), this.b, this.c, this.d);
   }

   public ejl a(String $$0, eje<?> $$1) {
      ImmutableSet<eje<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new ejl(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(eje<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ejd $$0) {
      this.b.a(this, $$0);
   }

   public ejg a() {
      return this.c;
   }

   public ejl a(ell $$0) {
      return new ejl(this.a, $$0, this.c, this.d);
   }
}
