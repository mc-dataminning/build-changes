import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class efg {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final ehg c;
   private final efb d;
   private final Set<eez<?>> e;
   @Nullable
   private String f;

   public efg(ehg $$0, efb $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public efg(Multimap<String, String> $$0, Supplier<String> $$1, ehg $$2, efb $$3, Set<eez<?>> $$4) {
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

   public efg b(String $$0) {
      return new efg(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public efg a(String $$0, eez<?> $$1) {
      ImmutableSet<eez<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new efg(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(eez<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(eey $$0) {
      this.c.a(this, $$0);
   }

   public efb b() {
      return this.d;
   }

   public efg a(ehg $$0) {
      return new efg(this.a, this.b, $$0, this.d, this.e);
   }
}
