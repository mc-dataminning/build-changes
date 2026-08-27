import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class erv {
   private final ayr a;
   private final eue b;
   private final jb.a c;
   private final Set<aks<?>> d;

   public erv(ayr $$0, eue $$1, jb.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private erv(ayr $$0, eue $$1, jb.a $$2, Set<aks<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public erv a(String $$0) {
      return new erv(this.a.a($$0), this.b, this.c, this.d);
   }

   public erv a(String $$0, aks<?> $$1) {
      Set<aks<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new erv(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(aks<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(erq $$0) {
      this.b.a(this, $$0);
   }

   public jb.a a() {
      return this.c;
   }

   public erv a(eue $$0) {
      return new erv(this.a, $$0, this.c, this.d);
   }
}
