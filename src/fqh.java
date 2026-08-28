import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class fqh {
   private static final fqh a = new fqh(ImmutableList.of());
   private static final Comparator<ear.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<ear.a<?>> c;

   public fqh a(ear.a<?> $$0) {
      return new fqh(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public fqh a(fqh $$0) {
      return new fqh(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private fqh(List<ear.a<?>> $$0) {
      this.c = $$0;
   }

   public static fqh a() {
      return a;
   }

   public static fqh a(ear.a<?>... $$0) {
      return new fqh(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof fqh && this.c.equals(((fqh)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(ear.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
