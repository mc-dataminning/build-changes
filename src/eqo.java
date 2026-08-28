import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eqo {
   private final azf a;
   private final etc b;
   private final jj.a c;
   private final Set<ale<?>> d;

   public eqo(azf $$0, etc $$1, jj.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eqo(azf $$0, etc $$1, jj.a $$2, Set<ale<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eqo a(String $$0) {
      return new eqo(this.a.a($$0), this.b, this.c, this.d);
   }

   public eqo a(String $$0, ale<?> $$1) {
      Set<ale<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eqo(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ale<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eqj $$0) {
      this.b.a(this, $$0);
   }

   public jj.a a() {
      return this.c;
   }

   public eqo a(etc $$0) {
      return new eqo(this.a, $$0, this.c, this.d);
   }
}
