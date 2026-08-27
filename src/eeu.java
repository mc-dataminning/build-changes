import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eeu {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final egu c;
   private final eep d;
   private final Set<een<?>> e;
   @Nullable
   private String f;

   public eeu(egu $$0, eep $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public eeu(Multimap<String, String> $$0, Supplier<String> $$1, egu $$2, eep $$3, Set<een<?>> $$4) {
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

   public eeu b(String $$0) {
      return new eeu(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public eeu a(String $$0, een<?> $$1) {
      ImmutableSet<een<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new eeu(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(een<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(eem $$0) {
      this.c.a(this, $$0);
   }

   public eep b() {
      return this.d;
   }

   public eeu a(egu $$0) {
      return new eeu(this.a, this.b, $$0, this.d, this.e);
   }
}
