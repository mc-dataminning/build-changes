import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class fni {
   private static final fni a = new fni(ImmutableList.of());
   private static final Comparator<dxz.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dxz.a<?>> c;

   public fni a(dxz.a<?> $$0) {
      return new fni(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public fni a(fni $$0) {
      return new fni(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private fni(List<dxz.a<?>> $$0) {
      this.c = $$0;
   }

   public static fni a() {
      return a;
   }

   public static fni a(dxz.a<?>... $$0) {
      return new fni(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof fni && this.c.equals(((fni)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dxz.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
