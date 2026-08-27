import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ehf {
   private final aut a;
   private final ejf b;
   private final eha c;
   private final Set<egy<?>> d;

   public ehf(aut $$0, ejf $$1, eha $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private ehf(aut $$0, ejf $$1, eha $$2, Set<egy<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ehf a(String $$0) {
      return new ehf(this.a.a($$0), this.b, this.c, this.d);
   }

   public ehf a(String $$0, egy<?> $$1) {
      ImmutableSet<egy<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new ehf(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(egy<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(egx $$0) {
      this.b.a(this, $$0);
   }

   public eha a() {
      return this.c;
   }

   public ehf a(ejf $$0) {
      return new ehf(this.a, $$0, this.c, this.d);
   }
}
