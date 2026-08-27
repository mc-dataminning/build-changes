import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class enk {
   private final axp a;
   private final epm b;
   private final enf c;
   private final Set<end<?>> d;

   public enk(axp $$0, epm $$1, enf $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private enk(axp $$0, epm $$1, enf $$2, Set<end<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public enk a(String $$0) {
      return new enk(this.a.a($$0), this.b, this.c, this.d);
   }

   public enk a(String $$0, end<?> $$1) {
      ImmutableSet<end<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new enk(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(end<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(enc $$0) {
      this.b.a(this, $$0);
   }

   public enf a() {
      return this.c;
   }

   public enk a(epm $$0) {
      return new enk(this.a, $$0, this.c, this.d);
   }
}
