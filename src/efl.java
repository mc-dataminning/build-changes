import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class efl {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final ehl c;
   private final efg d;
   private final Set<efe<?>> e;
   @Nullable
   private String f;

   public efl(ehl $$0, efg $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public efl(Multimap<String, String> $$0, Supplier<String> $$1, ehl $$2, efg $$3, Set<efe<?>> $$4) {
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

   public efl b(String $$0) {
      return new efl(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public efl a(String $$0, efe<?> $$1) {
      ImmutableSet<efe<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new efl(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(efe<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(efd $$0) {
      this.c.a(this, $$0);
   }

   public efg b() {
      return this.d;
   }

   public efl a(ehl $$0) {
      return new efl(this.a, this.b, $$0, this.d, this.e);
   }
}
