import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dzv {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final ebu c;
   private final dzo d;
   private final Set<dzm<?>> e;
   @Nullable
   private String f;

   public dzv(ebu $$0, dzo $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public dzv(Multimap<String, String> $$0, Supplier<String> $$1, ebu $$2, dzo $$3, Set<dzm<?>> $$4) {
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

   public dzv b(String $$0) {
      return new dzv(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public dzv a(String $$0, dzm<?> $$1) {
      ImmutableSet<dzm<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new dzv(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(dzm<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(dzl $$0) {
      this.c.a(this, $$0);
   }

   public dzo b() {
      return this.d;
   }

   public dzv a(ebu $$0) {
      return new dzv(this.a, this.b, $$0, this.d, this.e);
   }
}
