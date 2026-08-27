import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ekh {
   private final awr a;
   private final emh b;
   private final ekc c;
   private final Set<eka<?>> d;

   public ekh(awr $$0, emh $$1, ekc $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private ekh(awr $$0, emh $$1, ekc $$2, Set<eka<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ekh a(String $$0) {
      return new ekh(this.a.a($$0), this.b, this.c, this.d);
   }

   public ekh a(String $$0, eka<?> $$1) {
      ImmutableSet<eka<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new ekh(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(eka<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ejz $$0) {
      this.b.a(this, $$0);
   }

   public ekc a() {
      return this.c;
   }

   public ekh a(emh $$0) {
      return new ekh(this.a, $$0, this.c, this.d);
   }
}
