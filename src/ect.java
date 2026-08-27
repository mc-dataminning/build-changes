import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ect {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final eet c;
   private final eco d;
   private final Set<ecm<?>> e;
   @Nullable
   private String f;

   public ect(eet $$0, eco $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public ect(Multimap<String, String> $$0, Supplier<String> $$1, eet $$2, eco $$3, Set<ecm<?>> $$4) {
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

   public ect b(String $$0) {
      return new ect(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public ect a(String $$0, ecm<?> $$1) {
      ImmutableSet<ecm<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new ect(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(ecm<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(ecl $$0) {
      this.c.a(this, $$0);
   }

   public eco b() {
      return this.d;
   }

   public ect a(eet $$0) {
      return new ect(this.a, this.b, $$0, this.d, this.e);
   }
}
