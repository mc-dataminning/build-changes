import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class equ {
   private final ayk a;
   private final eti b;
   private final jk.a c;
   private final Set<akj<?>> d;

   public equ(ayk $$0, eti $$1, jk.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private equ(ayk $$0, eti $$1, jk.a $$2, Set<akj<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public equ a(String $$0) {
      return new equ(this.a.a($$0), this.b, this.c, this.d);
   }

   public equ a(String $$0, akj<?> $$1) {
      Set<akj<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new equ(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(akj<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eqp $$0) {
      this.b.a(this, $$0);
   }

   public jk.a a() {
      return this.c;
   }

   public equ a(eti $$0) {
      return new equ(this.a, $$0, this.c, this.d);
   }

   public ayk b() {
      return this.a;
   }
}
