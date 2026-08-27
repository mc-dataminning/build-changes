import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ehe {
   private final aus a;
   private final eje b;
   private final egz c;
   private final Set<egx<?>> d;

   public ehe(aus $$0, eje $$1, egz $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private ehe(aus $$0, eje $$1, egz $$2, Set<egx<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ehe a(String $$0) {
      return new ehe(this.a.a($$0), this.b, this.c, this.d);
   }

   public ehe a(String $$0, egx<?> $$1) {
      ImmutableSet<egx<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new ehe(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(egx<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(egw $$0) {
      this.b.a(this, $$0);
   }

   public egz a() {
      return this.c;
   }

   public ehe a(eje $$0) {
      return new ehe(this.a, $$0, this.c, this.d);
   }
}
