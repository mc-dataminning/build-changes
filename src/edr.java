import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class edr {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final efr c;
   private final edm d;
   private final Set<edk<?>> e;
   @Nullable
   private String f;

   public edr(efr $$0, edm $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public edr(Multimap<String, String> $$0, Supplier<String> $$1, efr $$2, edm $$3, Set<edk<?>> $$4) {
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

   public edr b(String $$0) {
      return new edr(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public edr a(String $$0, edk<?> $$1) {
      ImmutableSet<edk<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new edr(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(edk<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(edj $$0) {
      this.c.a(this, $$0);
   }

   public edm b() {
      return this.d;
   }

   public edr a(efr $$0) {
      return new edr(this.a, this.b, $$0, this.d, this.e);
   }
}
