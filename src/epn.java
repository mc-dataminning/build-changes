import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class epn {
   private final ayk a;
   private final erx b;
   private final iy.a c;
   private final Set<akm<?>> d;

   public epn(ayk $$0, erx $$1, iy.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private epn(ayk $$0, erx $$1, iy.a $$2, Set<akm<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public epn a(String $$0) {
      return new epn(this.a.a($$0), this.b, this.c, this.d);
   }

   public epn a(String $$0, akm<?> $$1) {
      Set<akm<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new epn(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(akm<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(epi $$0) {
      this.b.a(this, $$0);
   }

   public iy.a a() {
      return this.c;
   }

   public epn a(erx $$0) {
      return new epn(this.a, $$0, this.c, this.d);
   }
}
