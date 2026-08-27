import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class egn {
   private final aud a;
   private final ein b;
   private final egi c;
   private final Set<egg<?>> d;

   public egn(aud $$0, ein $$1, egi $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private egn(aud $$0, ein $$1, egi $$2, Set<egg<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public egn a(String $$0) {
      return new egn(this.a.a($$0), this.b, this.c, this.d);
   }

   public egn a(String $$0, egg<?> $$1) {
      ImmutableSet<egg<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new egn(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(egg<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(egf $$0) {
      this.b.a(this, $$0);
   }

   public egi a() {
      return this.c;
   }

   public egn a(ein $$0) {
      return new egn(this.a, $$0, this.c, this.d);
   }
}
