import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ecq {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final eeq c;
   private final ecl d;
   private final Set<ecj<?>> e;
   @Nullable
   private String f;

   public ecq(eeq $$0, ecl $$1) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of());
   }

   public ecq(Multimap<String, String> $$0, Supplier<String> $$1, eeq $$2, ecl $$3, Set<ecj<?>> $$4) {
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

   public ecq b(String $$0) {
      return new ecq(this.a, () -> this.c() + $$0, this.c, this.d, this.e);
   }

   public ecq a(String $$0, ecj<?> $$1) {
      ImmutableSet<ecj<?>> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new ecq(this.a, () -> this.c() + $$0, this.c, this.d, $$2);
   }

   public boolean a(ecj<?> $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(eci $$0) {
      this.c.a(this, $$0);
   }

   public ecl b() {
      return this.d;
   }

   public ecq a(eeq $$0) {
      return new ecq(this.a, this.b, $$0, this.d, this.e);
   }
}
