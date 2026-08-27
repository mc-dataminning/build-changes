import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eld {
   private final axb a;
   private final end b;
   private final eky c;
   private final Set<ekw<?>> d;

   public eld(axb $$0, end $$1, eky $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eld(axb $$0, end $$1, eky $$2, Set<ekw<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eld a(String $$0) {
      return new eld(this.a.a($$0), this.b, this.c, this.d);
   }

   public eld a(String $$0, ekw<?> $$1) {
      ImmutableSet<ekw<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eld(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(ekw<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ekv $$0) {
      this.b.a(this, $$0);
   }

   public eky a() {
      return this.c;
   }

   public eld a(end $$0) {
      return new eld(this.a, $$0, this.c, this.d);
   }
}
