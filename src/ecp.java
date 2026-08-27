import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ecp {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final eep c;
   private final eck d;
   private final Set<eci<?>> e;
   @Nullable
   private String f;

   public ecp(eep $$0, eck $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public ecp(Multimap<String, String> $$0, Supplier<String> $$1, eep $$2, eck $$3, Set<eci<?>> $$4) {
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

   public ecp b(String $$0) {
      return new ecp(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public ecp a(String $$0, eci<?> $$1) {
      ImmutableSet<eci<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new ecp(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(eci<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(ech $$0) {
      this.c.a(this, $$0);
   }

   public eck b() {
      return this.d;
   }

   public ecp a(eep $$0) {
      return new ecp(this.a, this.b, $$0, this.d, this.e);
   }
}
