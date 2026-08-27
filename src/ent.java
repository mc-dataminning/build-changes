import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ent {
   private final axr a;
   private final epv b;
   private final eno c;
   private final Set<enm<?>> d;

   public ent(axr $$0, epv $$1, eno $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private ent(axr $$0, epv $$1, eno $$2, Set<enm<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ent a(String $$0) {
      return new ent(this.a.a($$0), this.b, this.c, this.d);
   }

   public ent a(String $$0, enm<?> $$1) {
      ImmutableSet<enm<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new ent(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(enm<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(enl $$0) {
      this.b.a(this, $$0);
   }

   public eno a() {
      return this.c;
   }

   public ent a(epv $$0) {
      return new ent(this.a, $$0, this.c, this.d);
   }
}
