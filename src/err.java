import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class err {
   private final ayt a;
   private final euf b;
   private final jn.a c;
   private final Set<akp<?>> d;

   public err(ayt $$0, euf $$1, jn.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private err(ayt $$0, euf $$1, jn.a $$2, Set<akp<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public err a(String $$0) {
      return new err(this.a.a($$0), this.b, this.c, this.d);
   }

   public err a(String $$0, akp<?> $$1) {
      Set<akp<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new err(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(akp<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(erm $$0) {
      this.b.a(this, $$0);
   }

   public jn.a a() {
      return this.c;
   }

   public err a(euf $$0) {
      return new err(this.a, $$0, this.c, this.d);
   }

   public ayt b() {
      return this.a;
   }
}
