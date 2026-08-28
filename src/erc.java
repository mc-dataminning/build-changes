import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class erc {
   private final aym a;
   private final etq b;
   private final jk.a c;
   private final Set<akj<?>> d;

   public erc(aym $$0, etq $$1, jk.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private erc(aym $$0, etq $$1, jk.a $$2, Set<akj<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public erc a(String $$0) {
      return new erc(this.a.a($$0), this.b, this.c, this.d);
   }

   public erc a(String $$0, akj<?> $$1) {
      Set<akj<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new erc(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(akj<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eqx $$0) {
      this.b.a(this, $$0);
   }

   public jk.a a() {
      return this.c;
   }

   public erc a(etq $$0) {
      return new erc(this.a, $$0, this.c, this.d);
   }

   public aym b() {
      return this.a;
   }
}
