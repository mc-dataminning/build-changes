import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ecu {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final eeu c;
   private final ecp d;
   private final Set<ecn<?>> e;
   @Nullable
   private String f;

   public ecu(eeu $$0, ecp $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public ecu(Multimap<String, String> $$0, Supplier<String> $$1, eeu $$2, ecp $$3, Set<ecn<?>> $$4) {
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

   public ecu b(String $$0) {
      return new ecu(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public ecu a(String $$0, ecn<?> $$1) {
      ImmutableSet<ecn<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new ecu(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(ecn<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(ecm $$0) {
      this.c.a(this, $$0);
   }

   public ecp b() {
      return this.d;
   }

   public ecu a(eeu $$0) {
      return new ecu(this.a, this.b, $$0, this.d, this.e);
   }
}
