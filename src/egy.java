import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class egy {
   private final aun a;
   private final eiy b;
   private final egt c;
   private final Set<egr<?>> d;

   public egy(aun $$0, eiy $$1, egt $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private egy(aun $$0, eiy $$1, egt $$2, Set<egr<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public egy a(String $$0) {
      return new egy(this.a.a($$0), this.b, this.c, this.d);
   }

   public egy a(String $$0, egr<?> $$1) {
      ImmutableSet<egr<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new egy(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(egr<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(egq $$0) {
      this.b.a(this, $$0);
   }

   public egt a() {
      return this.c;
   }

   public egy a(eiy $$0) {
      return new egy(this.a, $$0, this.c, this.d);
   }
}
