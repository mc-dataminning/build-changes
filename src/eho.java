import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eho {
   private final auu a;
   private final ejo b;
   private final ehj c;
   private final Set<ehh<?>> d;

   public eho(auu $$0, ejo $$1, ehj $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eho(auu $$0, ejo $$1, ehj $$2, Set<ehh<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eho a(String $$0) {
      return new eho(this.a.a($$0), this.b, this.c, this.d);
   }

   public eho a(String $$0, ehh<?> $$1) {
      ImmutableSet<ehh<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eho(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ehh<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ehg $$0) {
      this.b.a(this, $$0);
   }

   public ehj a() {
      return this.c;
   }

   public eho a(ejo $$0) {
      return new eho(this.a, $$0, this.c, this.d);
   }
}
