import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ecz {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final eez c;
   private final ecu d;
   private final Set<ecs<?>> e;
   @Nullable
   private String f;

   public ecz(eez $$0, ecu $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public ecz(Multimap<String, String> $$0, Supplier<String> $$1, eez $$2, ecu $$3, Set<ecs<?>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   private String c() {
      if (this.f == null) {
         this.f = this.b.get();
      }

      return this.f;
   }

   public void a(String $$0) {
      this.a.put(this.c(), $$0);
   }

   public ecz b(String $$0) {
      return new ecz(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public ecz a(String $$0, ecs<?> $$1) {
      ImmutableSet<ecs<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new ecz(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(ecs<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(ecr $$0) {
      this.c.a(this, $$0);
   }

   public ecu b() {
      return this.d;
   }

   public ecz a(eez $$0) {
      return new ecz(this.a, this.b, $$0, this.d, this.e);
   }
}
