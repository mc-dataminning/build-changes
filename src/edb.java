import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class edb {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final efb c;
   private final ecw d;
   private final Set<ecu<?>> e;
   @Nullable
   private String f;

   public edb(efb $$0, ecw $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public edb(Multimap<String, String> $$0, Supplier<String> $$1, efb $$2, ecw $$3, Set<ecu<?>> $$4) {
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

   public edb b(String $$0) {
      return new edb(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public edb a(String $$0, ecu<?> $$1) {
      ImmutableSet<ecu<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new edb(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(ecu<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(ect $$0) {
      this.c.a(this, $$0);
   }

   public ecw b() {
      return this.d;
   }

   public edb a(efb $$0) {
      return new edb(this.a, this.b, $$0, this.d, this.e);
   }
}
